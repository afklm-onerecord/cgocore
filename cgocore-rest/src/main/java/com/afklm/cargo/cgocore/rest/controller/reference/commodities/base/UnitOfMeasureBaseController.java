package com.afklm.cargo.cgocore.rest.controller.reference.commodities.base;

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

import com.afklm.cargo.cgocore.api.interfaces.reference.commodities.UnitOfMeasureService;
import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.UnitOfMeasureFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.UnitOfMeasureForm;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.UnitOfMeasureSorting;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.basic.UnitOfMeasureBasicView;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.full.UnitOfMeasureFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UnitOfMeasureBaseController {

/*
 * services injected by spring
 */
@Inject
protected UnitOfMeasureService unitOfMeasureService;

/**
 * get options
 */
@RequestMapping(value = {UnitOfMeasureService.GET_OPTIONS_URL}, method = RequestMethod.GET)
public @ResponseBody List<SelectItem> getOptions() {
return unitOfMeasureService.getOptions();
}

/**
 * load object list
 */
@RequestMapping(value = {UnitOfMeasureService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<UnitOfMeasureBasicView> loadList() {
return unitOfMeasureService.loadList();
}

/**
 * scroll object list
 */
@RequestMapping(value = {UnitOfMeasureService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<UnitOfMeasureBasicView> scroll(@RequestBody ScrollForm<UnitOfMeasureFilter, UnitOfMeasureSorting> form) {
return unitOfMeasureService.scroll(form);
}

/**
 * load object
 */
@RequestMapping(value = {UnitOfMeasureService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody UnitOfMeasureFullView load(@PathVariable("id") Integer id) {
return unitOfMeasureService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {UnitOfMeasureService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody UnitOfMeasureFullView find(@RequestParam("code") String code) {
return unitOfMeasureService.find(code);
}

/**
 * create object
 */
@RequestMapping(value = {UnitOfMeasureService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody UnitOfMeasureFullView create() {
return unitOfMeasureService.create();
}

/**
 * save object
 */
@RequestMapping(value = {UnitOfMeasureService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Integer save(@Valid @RequestBody UnitOfMeasureForm form) {
return unitOfMeasureService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {UnitOfMeasureService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Integer id, @Valid @RequestBody UnitOfMeasureForm form) {
unitOfMeasureService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {UnitOfMeasureService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Integer id) {
unitOfMeasureService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {UnitOfMeasureService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Integer> idList) {
unitOfMeasureService.deleteList(idList);
}

}
