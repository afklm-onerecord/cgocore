package com.afklm.cargo.cgocore.rest.controller.reference.localization.base;

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

import com.afklm.cargo.cgocore.api.interfaces.reference.localization.StationService;
import com.afklm.cargo.cgocore.api.model.reference.localization.filters.StationFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.forms.StationForm;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.StationSorting;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.basic.StationBasicView;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.full.StationFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class StationBaseController {

/*
 * services injected by spring
 */
@Inject
protected StationService stationService;

/**
 * search options
 */
@RequestMapping(value = {StationService.SEARCH_OPTIONS_URL }, method = RequestMethod.POST)
public @ResponseBody List<SelectItem> searchOptions(@RequestBody String arg) {
return stationService.searchOptions(arg);
}

/**
 * load object list
 */
@RequestMapping(value = {StationService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<StationBasicView> loadList() {
return stationService.loadList();
}

/**
 * load object list from country
 */
@RequestMapping(value = {StationService.GET_LIST_FROM_COUNTRY_URL}, method = RequestMethod.GET)
public @ResponseBody List<StationBasicView> loadListFromCountry (@PathVariable("countryId") Integer countryId) {
return stationService.loadListFromCountry(countryId);
}
/**
 * scroll object list
 */
@RequestMapping(value = {StationService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<StationBasicView> scroll(@RequestBody ScrollForm<StationFilter, StationSorting> form) {
return stationService.scroll(form);
}

/**
 * scroll object list from country
 */
@RequestMapping(value = {StationService.SCROLL_FROM_COUNTRY_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<StationBasicView> scrollFromCountry (@PathVariable("countryId") Integer countryId, @RequestBody ScrollForm<StationFilter, StationSorting> form) {
return stationService.scrollFromCountry(countryId, form);
}
/**
 * load object
 */
@RequestMapping(value = {StationService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody StationFullView load(@PathVariable("id") Integer id) {
return stationService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {StationService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody StationFullView find(@RequestParam("iataCode") String iataCode) {
return stationService.find(iataCode);
}

/**
 * create object
 */
@RequestMapping(value = {StationService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody StationFullView create() {
return stationService.create();
}

/**
 * save object
 */
@RequestMapping(value = {StationService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Integer save(@Valid @RequestBody StationForm form) {
return stationService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {StationService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Integer id, @Valid @RequestBody StationForm form) {
stationService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {StationService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Integer id) {
stationService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {StationService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Integer> idList) {
stationService.deleteList(idList);
}

}
