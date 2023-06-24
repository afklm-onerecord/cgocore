package com.afklm.cargo.cgocore.rest.controller.shipments.base;

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

import com.afklm.cargo.cgocore.api.interfaces.shipments.AirWaybillService;
import com.afklm.cargo.cgocore.api.model.shipments.filters.AirWaybillFilter;
import com.afklm.cargo.cgocore.api.model.shipments.forms.AirWaybillForm;
import com.afklm.cargo.cgocore.api.model.shipments.sortings.AirWaybillSorting;
import com.afklm.cargo.cgocore.api.model.shipments.views.basic.AirWaybillBasicView;
import com.afklm.cargo.cgocore.api.model.shipments.views.full.AirWaybillFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirWaybillBaseController {

/*
 * services injected by spring
 */
@Inject
protected AirWaybillService airWaybillService;

/**
 * search options
 */
@RequestMapping(value = {AirWaybillService.SEARCH_OPTIONS_URL }, method = RequestMethod.POST)
public @ResponseBody List<SelectItem> searchOptions(@RequestBody String arg) {
return airWaybillService.searchOptions(arg);
}

/**
 * load object list
 */
@RequestMapping(value = {AirWaybillService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<AirWaybillBasicView> loadList() {
return airWaybillService.loadList();
}

/**
 * scroll object list
 */
@RequestMapping(value = {AirWaybillService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<AirWaybillBasicView> scroll(@RequestBody ScrollForm<AirWaybillFilter, AirWaybillSorting> form) {
return airWaybillService.scroll(form);
}

/**
 * load object
 */
@RequestMapping(value = {AirWaybillService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody AirWaybillFullView load(@PathVariable("id") Long id) {
return airWaybillService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {AirWaybillService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody AirWaybillFullView find(@RequestParam("airWaybillNumber") String airWaybillNumber) {
return airWaybillService.find(airWaybillNumber);
}

/**
 * create object
 */
@RequestMapping(value = {AirWaybillService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody AirWaybillFullView create() {
return airWaybillService.create();
}

/**
 * save object
 */
@RequestMapping(value = {AirWaybillService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Long save(@Valid @RequestBody AirWaybillForm form) {
return airWaybillService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {AirWaybillService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Long id, @Valid @RequestBody AirWaybillForm form) {
airWaybillService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {AirWaybillService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Long id) {
airWaybillService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {AirWaybillService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Long> idList) {
airWaybillService.deleteList(idList);
}

}
