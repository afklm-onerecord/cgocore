package com.afklm.cargo.cgocore.rest.controller.schedule.base;

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

import com.afklm.cargo.cgocore.api.interfaces.schedule.DatedFlightService;
import com.afklm.cargo.cgocore.api.model.schedule.filters.DatedFlightFilter;
import com.afklm.cargo.cgocore.api.model.schedule.forms.DatedFlightForm;
import com.afklm.cargo.cgocore.api.model.schedule.sortings.DatedFlightSorting;
import com.afklm.cargo.cgocore.api.model.schedule.views.basic.DatedFlightBasicView;
import com.afklm.cargo.cgocore.api.model.schedule.views.full.DatedFlightFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBaseController {

/*
 * services injected by spring
 */
@Inject
protected DatedFlightService datedFlightService;

/**
 * load object list
 */
@RequestMapping(value = {DatedFlightService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<DatedFlightBasicView> loadList() {
return datedFlightService.loadList();
}

/**
 * scroll object list
 */
@RequestMapping(value = {DatedFlightService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<DatedFlightBasicView> scroll(@RequestBody ScrollForm<DatedFlightFilter, DatedFlightSorting> form) {
return datedFlightService.scroll(form);
}

/**
 * load object
 */
@RequestMapping(value = {DatedFlightService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody DatedFlightFullView load(@PathVariable("id") Integer id) {
return datedFlightService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {DatedFlightService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody DatedFlightFullView find(@RequestParam("companyIataCode") String companyIataCode, @RequestParam("flightNumber") String flightNumber, @RequestParam("departureDate") LocalDate departureDate) {
return datedFlightService.find(companyIataCode, flightNumber, departureDate);
}

/**
 * create object
 */
@RequestMapping(value = {DatedFlightService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody DatedFlightFullView create() {
return datedFlightService.create();
}

/**
 * save object
 */
@RequestMapping(value = {DatedFlightService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Integer save(@Valid @RequestBody DatedFlightForm form) {
return datedFlightService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {DatedFlightService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Integer id, @Valid @RequestBody DatedFlightForm form) {
datedFlightService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {DatedFlightService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Integer id) {
datedFlightService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {DatedFlightService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Integer> idList) {
datedFlightService.deleteList(idList);
}

}
