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

import com.afklm.cargo.cgocore.api.interfaces.reference.localization.CountryService;
import com.afklm.cargo.cgocore.api.model.reference.localization.filters.CountryFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.forms.CountryForm;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.CountrySorting;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.basic.CountryBasicView;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.full.CountryFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class CountryBaseController {

/*
 * services injected by spring
 */
@Inject
protected CountryService countryService;

/**
 * search options
 */
@RequestMapping(value = {CountryService.SEARCH_OPTIONS_URL }, method = RequestMethod.POST)
public @ResponseBody List<SelectItem> searchOptions(@RequestBody String arg) {
return countryService.searchOptions(arg);
}

/**
 * load object list
 */
@RequestMapping(value = {CountryService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<CountryBasicView> loadList() {
return countryService.loadList();
}

/**
 * scroll object list
 */
@RequestMapping(value = {CountryService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<CountryBasicView> scroll(@RequestBody ScrollForm<CountryFilter, CountrySorting> form) {
return countryService.scroll(form);
}

/**
 * load object
 */
@RequestMapping(value = {CountryService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody CountryFullView load(@PathVariable("id") Integer id) {
return countryService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {CountryService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody CountryFullView find(@RequestParam("iataCode") String iataCode) {
return countryService.find(iataCode);
}

/**
 * create object
 */
@RequestMapping(value = {CountryService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody CountryFullView create() {
return countryService.create();
}

/**
 * save object
 */
@RequestMapping(value = {CountryService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Integer save(@Valid @RequestBody CountryForm form) {
return countryService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {CountryService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Integer id, @Valid @RequestBody CountryForm form) {
countryService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {CountryService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Integer id) {
countryService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {CountryService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Integer> idList) {
countryService.deleteList(idList);
}

}
