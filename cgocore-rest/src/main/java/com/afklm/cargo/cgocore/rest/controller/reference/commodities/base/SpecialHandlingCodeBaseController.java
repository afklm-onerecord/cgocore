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

import com.afklm.cargo.cgocore.api.interfaces.reference.commodities.SpecialHandlingCodeService;
import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.SpecialHandlingCodeFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.SpecialHandlingCodeForm;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.SpecialHandlingCodeSorting;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.basic.SpecialHandlingCodeBasicView;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.full.SpecialHandlingCodeFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class SpecialHandlingCodeBaseController {

/*
 * services injected by spring
 */
@Inject
protected SpecialHandlingCodeService specialHandlingCodeService;

/**
 * get options
 */
@RequestMapping(value = {SpecialHandlingCodeService.GET_OPTIONS_URL}, method = RequestMethod.GET)
public @ResponseBody List<SelectItem> getOptions() {
return specialHandlingCodeService.getOptions();
}

/**
 * load object list
 */
@RequestMapping(value = {SpecialHandlingCodeService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<SpecialHandlingCodeBasicView> loadList() {
return specialHandlingCodeService.loadList();
}

/**
 * scroll object list
 */
@RequestMapping(value = {SpecialHandlingCodeService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<SpecialHandlingCodeBasicView> scroll(@RequestBody ScrollForm<SpecialHandlingCodeFilter, SpecialHandlingCodeSorting> form) {
return specialHandlingCodeService.scroll(form);
}

/**
 * load object
 */
@RequestMapping(value = {SpecialHandlingCodeService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody SpecialHandlingCodeFullView load(@PathVariable("id") Integer id) {
return specialHandlingCodeService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {SpecialHandlingCodeService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody SpecialHandlingCodeFullView find(@RequestParam("code") String code) {
return specialHandlingCodeService.find(code);
}

/**
 * create object
 */
@RequestMapping(value = {SpecialHandlingCodeService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody SpecialHandlingCodeFullView create() {
return specialHandlingCodeService.create();
}

/**
 * save object
 */
@RequestMapping(value = {SpecialHandlingCodeService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Integer save(@Valid @RequestBody SpecialHandlingCodeForm form) {
return specialHandlingCodeService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {SpecialHandlingCodeService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Integer id, @Valid @RequestBody SpecialHandlingCodeForm form) {
specialHandlingCodeService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {SpecialHandlingCodeService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Integer id) {
specialHandlingCodeService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {SpecialHandlingCodeService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Integer> idList) {
specialHandlingCodeService.deleteList(idList);
}

}
