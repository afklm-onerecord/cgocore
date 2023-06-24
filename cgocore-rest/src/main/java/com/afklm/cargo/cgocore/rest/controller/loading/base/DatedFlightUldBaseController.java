package com.afklm.cargo.cgocore.rest.controller.loading.base;

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

import com.afklm.cargo.cgocore.api.interfaces.loading.DatedFlightUldService;
import com.afklm.cargo.cgocore.api.model.loading.filters.DatedFlightUldFilter;
import com.afklm.cargo.cgocore.api.model.loading.forms.DatedFlightUldForm;
import com.afklm.cargo.cgocore.api.model.loading.sortings.DatedFlightUldSorting;
import com.afklm.cargo.cgocore.api.model.loading.views.basic.DatedFlightUldBasicView;
import com.afklm.cargo.cgocore.api.model.loading.views.full.DatedFlightUldFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldBaseController {

/*
 * services injected by spring
 */
@Inject
protected DatedFlightUldService datedFlightUldService;

/**
 * load object list
 */
@RequestMapping(value = {DatedFlightUldService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<DatedFlightUldBasicView> loadList() {
return datedFlightUldService.loadList();
}

/**
 * load object list from datedFlight
 */
@RequestMapping(value = {DatedFlightUldService.GET_LIST_FROM_DATED_FLIGHT_URL}, method = RequestMethod.GET)
public @ResponseBody List<DatedFlightUldBasicView> loadListFromDatedFlight (@PathVariable("datedFlightId") Integer datedFlightId) {
return datedFlightUldService.loadListFromDatedFlight(datedFlightId);
}
/**
 * scroll object list
 */
@RequestMapping(value = {DatedFlightUldService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<DatedFlightUldBasicView> scroll(@RequestBody ScrollForm<DatedFlightUldFilter, DatedFlightUldSorting> form) {
return datedFlightUldService.scroll(form);
}

/**
 * scroll object list from datedFlight
 */
@RequestMapping(value = {DatedFlightUldService.SCROLL_FROM_DATED_FLIGHT_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<DatedFlightUldBasicView> scrollFromDatedFlight (@PathVariable("datedFlightId") Integer datedFlightId, @RequestBody ScrollForm<DatedFlightUldFilter, DatedFlightUldSorting> form) {
return datedFlightUldService.scrollFromDatedFlight(datedFlightId, form);
}
/**
 * load object
 */
@RequestMapping(value = {DatedFlightUldService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody DatedFlightUldFullView load(@PathVariable("id") Integer id) {
return datedFlightUldService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {DatedFlightUldService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody DatedFlightUldFullView find(@RequestParam("datedFlightCompanyIataCode") String datedFlightCompanyIataCode, @RequestParam("datedFlightFlightNumber") String datedFlightFlightNumber, @RequestParam("datedFlightDepartureDate") LocalDate datedFlightDepartureDate, @RequestParam("uldTypeCode") String uldTypeCode, @RequestParam("uldCode") String uldCode, @RequestParam("uldOwnerCode") String uldOwnerCode) {
return datedFlightUldService.find(datedFlightCompanyIataCode, datedFlightFlightNumber, datedFlightDepartureDate, uldTypeCode, uldCode, uldOwnerCode);
}

/**
 * create object
 */
@RequestMapping(value = {DatedFlightUldService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody DatedFlightUldFullView create() {
return datedFlightUldService.create();
}

/**
 * save object
 */
@RequestMapping(value = {DatedFlightUldService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Integer save(@Valid @RequestBody DatedFlightUldForm form) {
return datedFlightUldService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {DatedFlightUldService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Integer id, @Valid @RequestBody DatedFlightUldForm form) {
datedFlightUldService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {DatedFlightUldService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Integer id) {
datedFlightUldService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {DatedFlightUldService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Integer> idList) {
datedFlightUldService.deleteList(idList);
}

}
