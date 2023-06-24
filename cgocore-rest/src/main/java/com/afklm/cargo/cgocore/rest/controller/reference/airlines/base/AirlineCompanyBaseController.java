package com.afklm.cargo.cgocore.rest.controller.reference.airlines.base;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.afklm.cargo.cgocore.api.interfaces.reference.airlines.AirlineCompanyService;
import com.afklm.cargo.cgocore.api.model.reference.airlines.filters.AirlineCompanyFilter;
import com.afklm.cargo.cgocore.api.model.reference.airlines.forms.AirlineCompanyForm;
import com.afklm.cargo.cgocore.api.model.reference.airlines.sortings.AirlineCompanySorting;
import com.afklm.cargo.cgocore.api.model.reference.airlines.views.basic.AirlineCompanyBasicView;
import com.afklm.cargo.cgocore.api.model.reference.airlines.views.full.AirlineCompanyFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirlineCompanyBaseController {

/*
 * services injected by spring
 */
@Inject
protected AirlineCompanyService airlineCompanyService;

/**
 * search options
 */
@RequestMapping(value = {AirlineCompanyService.SEARCH_OPTIONS_URL }, method = RequestMethod.POST)
public @ResponseBody List<SelectItem> searchOptions(@RequestBody String arg) {
return airlineCompanyService.searchOptions(arg);
}

/**
 * load object list
 */
@RequestMapping(value = {AirlineCompanyService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<AirlineCompanyBasicView> loadList() {
return airlineCompanyService.loadList();
}

/**
 * scroll object list
 */
@RequestMapping(value = {AirlineCompanyService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<AirlineCompanyBasicView> scroll(@RequestBody ScrollForm<AirlineCompanyFilter, AirlineCompanySorting> form) {
return airlineCompanyService.scroll(form);
}

/**
 * load object
 */
@RequestMapping(value = {AirlineCompanyService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody AirlineCompanyFullView load(@PathVariable("id") Integer id) {
return airlineCompanyService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {AirlineCompanyService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody AirlineCompanyFullView find(@RequestParam("iataCode") String iataCode) {
return airlineCompanyService.find(iataCode);
}

/**
 * create object
 */
@RequestMapping(value = {AirlineCompanyService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody AirlineCompanyFullView create() {
return airlineCompanyService.create();
}

/**
 * save object
 */
@RequestMapping(value = {AirlineCompanyService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Integer save(@Valid @RequestBody AirlineCompanyForm form) {
return airlineCompanyService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {AirlineCompanyService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Integer id, @Valid @RequestBody AirlineCompanyForm form) {
airlineCompanyService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {AirlineCompanyService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Integer id) {
airlineCompanyService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {AirlineCompanyService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Integer> idList) {
airlineCompanyService.deleteList(idList);
}

}
