package com.afklm.cargo.cgocore.rest.controller.reference.containers.base;

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

import com.afklm.cargo.cgocore.api.interfaces.reference.containers.UldTypeService;
import com.afklm.cargo.cgocore.api.model.reference.containers.filters.UldTypeFilter;
import com.afklm.cargo.cgocore.api.model.reference.containers.forms.UldTypeForm;
import com.afklm.cargo.cgocore.api.model.reference.containers.sortings.UldTypeSorting;
import com.afklm.cargo.cgocore.api.model.reference.containers.views.basic.UldTypeBasicView;
import com.afklm.cargo.cgocore.api.model.reference.containers.views.full.UldTypeFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UldTypeBaseController {

/*
 * services injected by spring
 */
@Inject
protected UldTypeService uldTypeService;

/**
 * get options
 */
@RequestMapping(value = {UldTypeService.GET_OPTIONS_URL}, method = RequestMethod.GET)
public @ResponseBody List<SelectItem> getOptions() {
return uldTypeService.getOptions();
}

/**
 * load object list
 */
@RequestMapping(value = {UldTypeService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<UldTypeBasicView> loadList() {
return uldTypeService.loadList();
}

/**
 * scroll object list
 */
@RequestMapping(value = {UldTypeService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<UldTypeBasicView> scroll(@RequestBody ScrollForm<UldTypeFilter, UldTypeSorting> form) {
return uldTypeService.scroll(form);
}

/**
 * load object
 */
@RequestMapping(value = {UldTypeService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody UldTypeFullView load(@PathVariable("id") Integer id) {
return uldTypeService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {UldTypeService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody UldTypeFullView find(@RequestParam("code") String code) {
return uldTypeService.find(code);
}

/**
 * create object
 */
@RequestMapping(value = {UldTypeService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody UldTypeFullView create() {
return uldTypeService.create();
}

/**
 * save object
 */
@RequestMapping(value = {UldTypeService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Integer save(@Valid @RequestBody UldTypeForm form) {
return uldTypeService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {UldTypeService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Integer id, @Valid @RequestBody UldTypeForm form) {
uldTypeService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {UldTypeService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Integer id) {
uldTypeService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {UldTypeService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Integer> idList) {
uldTypeService.deleteList(idList);
}

}
