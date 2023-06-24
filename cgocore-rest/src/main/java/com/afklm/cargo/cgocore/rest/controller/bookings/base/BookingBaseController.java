package com.afklm.cargo.cgocore.rest.controller.bookings.base;

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

import com.afklm.cargo.cgocore.api.interfaces.bookings.BookingService;
import com.afklm.cargo.cgocore.api.model.bookings.filters.BookingFilter;
import com.afklm.cargo.cgocore.api.model.bookings.forms.BookingForm;
import com.afklm.cargo.cgocore.api.model.bookings.sortings.BookingSorting;
import com.afklm.cargo.cgocore.api.model.bookings.views.basic.BookingBasicView;
import com.afklm.cargo.cgocore.api.model.bookings.views.full.BookingFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class BookingBaseController {

/*
 * services injected by spring
 */
@Inject
protected BookingService bookingService;

/**
 * load object list
 */
@RequestMapping(value = {BookingService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<BookingBasicView> loadList() {
return bookingService.loadList();
}

/**
 * scroll object list
 */
@RequestMapping(value = {BookingService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<BookingBasicView> scroll(@RequestBody ScrollForm<BookingFilter, BookingSorting> form) {
return bookingService.scroll(form);
}

/**
 * load object
 */
@RequestMapping(value = {BookingService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody BookingFullView load(@PathVariable("id") Long id) {
return bookingService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {BookingService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody BookingFullView find(@RequestParam("airWaybillAirWaybillNumber") String airWaybillAirWaybillNumber) {
return bookingService.find(airWaybillAirWaybillNumber);
}

/**
 * create object
 */
@RequestMapping(value = {BookingService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody BookingFullView create() {
return bookingService.create();
}

/**
 * save object
 */
@RequestMapping(value = {BookingService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Long save(@Valid @RequestBody BookingForm form) {
return bookingService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {BookingService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Long id, @Valid @RequestBody BookingForm form) {
bookingService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {BookingService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Long id) {
bookingService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {BookingService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Long> idList) {
bookingService.deleteList(idList);
}

}
