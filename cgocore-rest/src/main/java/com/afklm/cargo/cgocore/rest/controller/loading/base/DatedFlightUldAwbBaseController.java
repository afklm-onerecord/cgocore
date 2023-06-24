package com.afklm.cargo.cgocore.rest.controller.loading.base;

import java.math.BigDecimal;
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

import com.afklm.cargo.cgocore.api.interfaces.loading.DatedFlightUldAwbService;
import com.afklm.cargo.cgocore.api.model.loading.filters.DatedFlightUldAwbFilter;
import com.afklm.cargo.cgocore.api.model.loading.forms.DatedFlightUldAwbForm;
import com.afklm.cargo.cgocore.api.model.loading.sortings.DatedFlightUldAwbSorting;
import com.afklm.cargo.cgocore.api.model.loading.views.basic.DatedFlightUldAwbBasicView;
import com.afklm.cargo.cgocore.api.model.loading.views.full.DatedFlightUldAwbFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldAwbBaseController {

/*
 * services injected by spring
 */
@Inject
protected DatedFlightUldAwbService datedFlightUldAwbService;

/**
 * load object list
 */
@RequestMapping(value = {DatedFlightUldAwbService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<DatedFlightUldAwbBasicView> loadList() {
return datedFlightUldAwbService.loadList();
}

/**
 * load object list from datedFlightUld
 */
@RequestMapping(value = {DatedFlightUldAwbService.GET_LIST_FROM_DATED_FLIGHT_ULD_URL}, method = RequestMethod.GET)
public @ResponseBody List<DatedFlightUldAwbBasicView> loadListFromDatedFlightUld (@PathVariable("datedFlightUldId") Integer datedFlightUldId) {
return datedFlightUldAwbService.loadListFromDatedFlightUld(datedFlightUldId);
}
/**
 * scroll object list
 */
@RequestMapping(value = {DatedFlightUldAwbService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<DatedFlightUldAwbBasicView> scroll(@RequestBody ScrollForm<DatedFlightUldAwbFilter, DatedFlightUldAwbSorting> form) {
return datedFlightUldAwbService.scroll(form);
}

/**
 * scroll object list from datedFlightUld
 */
@RequestMapping(value = {DatedFlightUldAwbService.SCROLL_FROM_DATED_FLIGHT_ULD_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<DatedFlightUldAwbBasicView> scrollFromDatedFlightUld (@PathVariable("datedFlightUldId") Integer datedFlightUldId, @RequestBody ScrollForm<DatedFlightUldAwbFilter, DatedFlightUldAwbSorting> form) {
return datedFlightUldAwbService.scrollFromDatedFlightUld(datedFlightUldId, form);
}
/**
 * load object
 */
@RequestMapping(value = {DatedFlightUldAwbService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody DatedFlightUldAwbFullView load(@PathVariable("id") Integer id) {
return datedFlightUldAwbService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {DatedFlightUldAwbService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody DatedFlightUldAwbFullView find(@RequestParam("datedFlightUldDatedFlightCompanyIataCode") String datedFlightUldDatedFlightCompanyIataCode, @RequestParam("datedFlightUldDatedFlightFlightNumber") String datedFlightUldDatedFlightFlightNumber, @RequestParam("datedFlightUldDatedFlightDepartureDate") LocalDate datedFlightUldDatedFlightDepartureDate, @RequestParam("datedFlightUldUldTypeCode") String datedFlightUldUldTypeCode, @RequestParam("datedFlightUldUldCode") String datedFlightUldUldCode, @RequestParam("datedFlightUldUldOwnerCode") String datedFlightUldUldOwnerCode, @RequestParam("airWaybillAirWaybillNumber") String airWaybillAirWaybillNumber, @RequestParam("numberOfPieces") Integer numberOfPieces, @RequestParam("grossWeight") BigDecimal grossWeight) {
return datedFlightUldAwbService.find(datedFlightUldDatedFlightCompanyIataCode, datedFlightUldDatedFlightFlightNumber, datedFlightUldDatedFlightDepartureDate, datedFlightUldUldTypeCode, datedFlightUldUldCode, datedFlightUldUldOwnerCode, airWaybillAirWaybillNumber, numberOfPieces, grossWeight);
}

/**
 * create object
 */
@RequestMapping(value = {DatedFlightUldAwbService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody DatedFlightUldAwbFullView create() {
return datedFlightUldAwbService.create();
}

/**
 * save object
 */
@RequestMapping(value = {DatedFlightUldAwbService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Integer save(@Valid @RequestBody DatedFlightUldAwbForm form) {
return datedFlightUldAwbService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {DatedFlightUldAwbService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Integer id, @Valid @RequestBody DatedFlightUldAwbForm form) {
datedFlightUldAwbService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {DatedFlightUldAwbService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Integer id) {
datedFlightUldAwbService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {DatedFlightUldAwbService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Integer> idList) {
datedFlightUldAwbService.deleteList(idList);
}

}
