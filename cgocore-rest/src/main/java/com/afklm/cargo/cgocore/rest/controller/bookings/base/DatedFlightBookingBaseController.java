package com.afklm.cargo.cgocore.rest.controller.bookings.base;

import java.time.LocalDate;
import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.afklm.cargo.cgocore.api.interfaces.bookings.DatedFlightBookingService;
import com.afklm.cargo.cgocore.api.model.bookings.filters.DatedFlightBookingFilter;
import com.afklm.cargo.cgocore.api.model.bookings.forms.DatedFlightBookingForm;
import com.afklm.cargo.cgocore.api.model.bookings.sortings.DatedFlightBookingSorting;
import com.afklm.cargo.cgocore.api.model.bookings.views.basic.DatedFlightBookingBasicView;
import com.afklm.cargo.cgocore.api.model.bookings.views.full.DatedFlightBookingFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBookingBaseController {

/*
 * services injected by spring
 */
@Inject
protected DatedFlightBookingService datedFlightBookingService;

/**
 * load object list
 */
@RequestMapping(value = {DatedFlightBookingService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<DatedFlightBookingBasicView> loadList() {
return datedFlightBookingService.loadList();
}

/**
 * load object list from datedFlight
 */
@RequestMapping(value = {DatedFlightBookingService.GET_LIST_FROM_DATED_FLIGHT_URL}, method = RequestMethod.GET)
public @ResponseBody List<DatedFlightBookingBasicView> loadListFromDatedFlight (@PathVariable("datedFlightId") Integer datedFlightId) {
return datedFlightBookingService.loadListFromDatedFlight(datedFlightId);
}
/**
 * load object list from booking
 */
@RequestMapping(value = {DatedFlightBookingService.GET_LIST_FROM_BOOKING_URL}, method = RequestMethod.GET)
public @ResponseBody List<DatedFlightBookingBasicView> loadListFromBooking (@PathVariable("bookingId") Long bookingId) {
return datedFlightBookingService.loadListFromBooking(bookingId);
}
/**
 * scroll object list
 */
@RequestMapping(value = {DatedFlightBookingService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<DatedFlightBookingBasicView> scroll(@RequestBody ScrollForm<DatedFlightBookingFilter, DatedFlightBookingSorting> form) {
return datedFlightBookingService.scroll(form);
}

/**
 * scroll object list from datedFlight
 */
@RequestMapping(value = {DatedFlightBookingService.SCROLL_FROM_DATED_FLIGHT_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<DatedFlightBookingBasicView> scrollFromDatedFlight (@PathVariable("datedFlightId") Integer datedFlightId, @RequestBody ScrollForm<DatedFlightBookingFilter, DatedFlightBookingSorting> form) {
return datedFlightBookingService.scrollFromDatedFlight(datedFlightId, form);
}
/**
 * scroll object list from booking
 */
@RequestMapping(value = {DatedFlightBookingService.SCROLL_FROM_BOOKING_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<DatedFlightBookingBasicView> scrollFromBooking (@PathVariable("bookingId") Long bookingId, @RequestBody ScrollForm<DatedFlightBookingFilter, DatedFlightBookingSorting> form) {
return datedFlightBookingService.scrollFromBooking(bookingId, form);
}
/**
 * load object
 */
@RequestMapping(value = {DatedFlightBookingService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody DatedFlightBookingFullView load(@PathVariable("id") Integer id) {
return datedFlightBookingService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {DatedFlightBookingService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody DatedFlightBookingFullView find(@RequestParam("datedFlightCompanyIataCode") String datedFlightCompanyIataCode, @RequestParam("datedFlightFlightNumber") String datedFlightFlightNumber, @RequestParam("datedFlightDepartureDate") LocalDate datedFlightDepartureDate, @RequestParam("bookingAirWaybillAirWaybillNumber") String bookingAirWaybillAirWaybillNumber) {
return datedFlightBookingService.find(datedFlightCompanyIataCode, datedFlightFlightNumber, datedFlightDepartureDate, bookingAirWaybillAirWaybillNumber);
}

/**
 * create object
 */
@RequestMapping(value = {DatedFlightBookingService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody DatedFlightBookingFullView create() {
return datedFlightBookingService.create();
}

/**
 * save object
 */
@RequestMapping(value = {DatedFlightBookingService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Integer save(@Valid @RequestBody DatedFlightBookingForm form) {
return datedFlightBookingService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {DatedFlightBookingService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Integer id, @Valid @RequestBody DatedFlightBookingForm form) {
datedFlightBookingService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {DatedFlightBookingService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Integer id) {
datedFlightBookingService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {DatedFlightBookingService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Integer> idList) {
datedFlightBookingService.deleteList(idList);
}

}
