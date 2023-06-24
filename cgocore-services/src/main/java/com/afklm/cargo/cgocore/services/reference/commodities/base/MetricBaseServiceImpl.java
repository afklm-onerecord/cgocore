package com.afklm.cargo.cgocore.services.reference.commodities.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.reference.commodities.base.MetricBaseService;
import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.MetricFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.MetricForm;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.MetricSorting;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.basic.MetricBasicView;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.full.MetricFullView;
import com.afklm.cargo.cgocore.components.mapper.reference.commodities.forms.MetricFormMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.commodities.views.basic.MetricBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.commodities.views.full.MetricFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.reference.commodities.MetricProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.commodities.MetricRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.commodities.MetricStateManager;
import com.afklm.cargo.cgocore.model.reference.commodities.Metric;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.MetricDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class MetricBaseServiceImpl implements MetricBaseService {

/*
 * properties injected by spring
 */
@Inject
protected MetricDao metricDao;
@Inject
protected MetricFullViewMapper metricFullViewMapper;
@Inject
protected MetricBasicViewMapper metricBasicViewMapper;
@Inject
protected MetricFormMapper metricFormMapper;
@Inject
protected MetricStateManager metricStateManager;
@Inject
protected MetricRightsManager metricRightsManager;
@Inject
protected MetricProcessor metricProcessor;

/**
 * get options
 */
@Override
@Transactional(readOnly=true)
public List<SelectItem> getOptions() {
List<Metric> metricList = metricDao.loadList();
List<SelectItem> result = new ArrayList<>(metricList.size());
for (Metric metric : metricList) {
result.add(new SelectItem(metric.getCode(), metric.getCode()));
}
return result;
}

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<MetricBasicView> loadList() {
metricRightsManager.checkCanAccess();
List<Metric> metricList = metricDao.loadListEagerly();
List<MetricBasicView> result = new ArrayList<>(metricList.size());
for (Metric metric : metricList) {
result.add(this.metricBasicViewMapper.mapFrom(new MetricBasicView(),metric));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<MetricBasicView> scroll(ScrollForm<MetricFilter, MetricSorting> form) {
metricRightsManager.checkCanAccess();
ScrollView<MetricBasicView> result = new ScrollView<>();
result.setSize(metricDao.count());
Long count = metricDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<Metric> list = metricDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<MetricBasicView> elements = new ArrayList<>(list.size());
for (Metric metric : list) {
elements.add(this.metricBasicViewMapper.mapFrom(new MetricBasicView(),metric));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public MetricFullView load(Integer id) {
Metric metric = metricDao.load(id);
metricRightsManager.checkCanAccess(metric);
return this.metricFullViewMapper.mapFrom(new MetricFullView(),metric);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public MetricFullView find(String code) {
Metric metric = metricDao.find(code);
metricRightsManager.checkCanAccess(metric);
return this.metricFullViewMapper.mapFrom(new MetricFullView(), metric);
}

/**
 * create object
 */
@Override
public MetricFullView create() {
metricRightsManager.checkCanCreate();
return new MetricFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Integer save(MetricForm metricForm) {
Metric metric = this.metricFormMapper.mapTo(metricForm, new Metric());
metricRightsManager.checkCanSave(metric);
metricStateManager.checkCanSave(metric);
return metricProcessor.save(metric);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Integer id, MetricForm metricForm) {
Metric metric = this.metricDao.load(id);
metricRightsManager.checkCanUpdate(metric);
metricStateManager.checkCanUpdate(metric);
metric = this.metricFormMapper.mapTo(metricForm, metric);
metricProcessor.update(metric);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Integer id) {
Metric metric = metricDao.load(id);
metricRightsManager.checkCanDelete(metric);
metricStateManager.checkCanDelete(metric);
metricProcessor.delete(metric);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Integer> idList) {
Metric metric;
if (idList != null){
for (Integer id:idList){
metric = metricDao.load(id);
metricRightsManager.checkCanDelete(metric);
metricStateManager.checkCanDelete(metric);
metricProcessor.delete(metric);
}
}
}

}
