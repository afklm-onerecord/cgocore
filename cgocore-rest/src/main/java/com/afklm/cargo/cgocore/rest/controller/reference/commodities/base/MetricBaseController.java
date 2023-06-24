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

import com.afklm.cargo.cgocore.api.interfaces.reference.commodities.MetricService;
import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.MetricFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.MetricForm;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.MetricSorting;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.basic.MetricBasicView;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.full.MetricFullView;

/**
 * auto generated base rest controller file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class MetricBaseController {

/*
 * services injected by spring
 */
@Inject
protected MetricService metricService;

/**
 * get options
 */
@RequestMapping(value = {MetricService.GET_OPTIONS_URL}, method = RequestMethod.GET)
public @ResponseBody List<SelectItem> getOptions() {
return metricService.getOptions();
}

/**
 * load object list
 */
@RequestMapping(value = {MetricService.GET_LIST_URL}, method = RequestMethod.GET)
public @ResponseBody List<MetricBasicView> loadList() {
return metricService.loadList();
}

/**
 * scroll object list
 */
@RequestMapping(value = {MetricService.SCROLL_URL}, method = RequestMethod.POST)
public @ResponseBody ScrollView<MetricBasicView> scroll(@RequestBody ScrollForm<MetricFilter, MetricSorting> form) {
return metricService.scroll(form);
}

/**
 * load object
 */
@RequestMapping(value = {MetricService.GET_URL}, method = RequestMethod.GET)
public @ResponseBody MetricFullView load(@PathVariable("id") Integer id) {
return metricService.load(id);
}
/**
 * find object
 */
@RequestMapping(value = {MetricService.FIND_URL}, method = RequestMethod.GET)
public @ResponseBody MetricFullView find(@RequestParam("code") String code) {
return metricService.find(code);
}

/**
 * create object
 */
@RequestMapping(value = {MetricService.GET_NEW_URL}, method = RequestMethod.GET)
public @ResponseBody MetricFullView create() {
return metricService.create();
}

/**
 * save object
 */
@RequestMapping(value = {MetricService.SAVE_URL}, method = RequestMethod.POST)
public @ResponseBody Integer save(@Valid @RequestBody MetricForm form) {
return metricService.save(form);
}

/**
 * update object
 */
@RequestMapping(value = {MetricService.UPDATE_URL}, method = RequestMethod.PUT)
public @ResponseBody void update(@PathVariable("id") Integer id, @Valid @RequestBody MetricForm form) {
metricService.update(id, form);
}

/**
 * delete object
 */
@RequestMapping(value = {MetricService.DELETE_URL}, method = RequestMethod.DELETE)
public @ResponseBody void delete(@PathVariable("id") Integer id) {
metricService.delete(id);
}

/**
 * delete object list
 */
@RequestMapping(value = {MetricService.DELETE_LIST_URL}, method = RequestMethod.POST)
public @ResponseBody void deleteList(@RequestBody List<Integer> idList) {
metricService.deleteList(idList);
}

}
