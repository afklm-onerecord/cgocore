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

import com.afklm.cargo.cgocore.api.interfaces.reference.localization.CurrencyService;
import com.afklm.cargo.cgocore.api.model.reference.localization.filters.CurrencyFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.forms.CurrencyForm;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.CurrencySorting;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.basic.CurrencyBasicView;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.full.CurrencyFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class CurrencyBaseController {

/*
 * services injected by spring
 */
@Inject
protected CurrencyService currencyService;

/**
 * search options
 */
@RequestMapping(value = {CurrencyService.SEARCH_OPTIONS_URL }, method = RequestMethod.POST)
public @ResponseBody List<SelectItem> searchOptions(@RequestBody String arg) {
return currencyService.searchOptions(arg);
}

/**
 * load object list
 */
@RequestMapping(value = {CurrencyService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<CurrencyBasicView> loadList() {
return currencyService.loadList();
}

/**
 * scroll object list
 */
@RequestMapping(value = {CurrencyService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<CurrencyBasicView> scroll(@RequestBody ScrollForm<CurrencyFilter, CurrencySorting> form) {
return currencyService.scroll(form);
}

/**
 * load object
 */
@RequestMapping(value = {CurrencyService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody CurrencyFullView load(@PathVariable("id") Integer id) {
return currencyService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {CurrencyService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody CurrencyFullView find(@RequestParam("isoCode") String isoCode) {
return currencyService.find(isoCode);
}

/**
 * create object
 */
@RequestMapping(value = {CurrencyService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody CurrencyFullView create() {
return currencyService.create();
}

/**
 * save object
 */
@RequestMapping(value = {CurrencyService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Integer save(@Valid @RequestBody CurrencyForm form) {
return currencyService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {CurrencyService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Integer id, @Valid @RequestBody CurrencyForm form) {
currencyService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {CurrencyService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Integer id) {
currencyService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {CurrencyService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Integer> idList) {
currencyService.deleteList(idList);
}

}
