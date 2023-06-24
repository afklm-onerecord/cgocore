package com.afklm.cargo.cgocore.services.reference.commodities.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.reference.commodities.base.UnitOfMeasureBaseService;
import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.UnitOfMeasureFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.UnitOfMeasureForm;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.UnitOfMeasureSorting;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.basic.UnitOfMeasureBasicView;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.full.UnitOfMeasureFullView;
import com.afklm.cargo.cgocore.components.mapper.reference.commodities.forms.UnitOfMeasureFormMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.commodities.views.basic.UnitOfMeasureBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.commodities.views.full.UnitOfMeasureFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.reference.commodities.UnitOfMeasureProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.commodities.UnitOfMeasureRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.commodities.UnitOfMeasureStateManager;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UnitOfMeasureBaseServiceImpl implements UnitOfMeasureBaseService {

/*
 * properties injected by spring
 */
@Inject
protected UnitOfMeasureDao unitOfMeasureDao;
@Inject
protected UnitOfMeasureFullViewMapper unitOfMeasureFullViewMapper;
@Inject
protected UnitOfMeasureBasicViewMapper unitOfMeasureBasicViewMapper;
@Inject
protected UnitOfMeasureFormMapper unitOfMeasureFormMapper;
@Inject
protected UnitOfMeasureStateManager unitOfMeasureStateManager;
@Inject
protected UnitOfMeasureRightsManager unitOfMeasureRightsManager;
@Inject
protected UnitOfMeasureProcessor unitOfMeasureProcessor;

/**
 * get options
 */
@Override
@Transactional(readOnly=true)
public List<SelectItem> getOptions() {
List<UnitOfMeasure> unitOfMeasureList = unitOfMeasureDao.loadList();
List<SelectItem> result = new ArrayList<>(unitOfMeasureList.size());
for (UnitOfMeasure unitOfMeasure : unitOfMeasureList) {
result.add(new SelectItem(unitOfMeasure.getCode(), unitOfMeasure.getCode()));
}
return result;
}

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<UnitOfMeasureBasicView> loadList() {
unitOfMeasureRightsManager.checkCanAccess();
List<UnitOfMeasure> unitOfMeasureList = unitOfMeasureDao.loadListEagerly();
List<UnitOfMeasureBasicView> result = new ArrayList<>(unitOfMeasureList.size());
for (UnitOfMeasure unitOfMeasure : unitOfMeasureList) {
result.add(this.unitOfMeasureBasicViewMapper.mapFrom(new UnitOfMeasureBasicView(),unitOfMeasure));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<UnitOfMeasureBasicView> scroll(ScrollForm<UnitOfMeasureFilter, UnitOfMeasureSorting> form) {
unitOfMeasureRightsManager.checkCanAccess();
ScrollView<UnitOfMeasureBasicView> result = new ScrollView<>();
result.setSize(unitOfMeasureDao.count());
Long count = unitOfMeasureDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<UnitOfMeasure> list = unitOfMeasureDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<UnitOfMeasureBasicView> elements = new ArrayList<>(list.size());
for (UnitOfMeasure unitOfMeasure : list) {
elements.add(this.unitOfMeasureBasicViewMapper.mapFrom(new UnitOfMeasureBasicView(),unitOfMeasure));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public UnitOfMeasureFullView load(Integer id) {
UnitOfMeasure unitOfMeasure = unitOfMeasureDao.load(id);
unitOfMeasureRightsManager.checkCanAccess(unitOfMeasure);
return this.unitOfMeasureFullViewMapper.mapFrom(new UnitOfMeasureFullView(),unitOfMeasure);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public UnitOfMeasureFullView find(String code) {
UnitOfMeasure unitOfMeasure = unitOfMeasureDao.find(code);
unitOfMeasureRightsManager.checkCanAccess(unitOfMeasure);
return this.unitOfMeasureFullViewMapper.mapFrom(new UnitOfMeasureFullView(), unitOfMeasure);
}

/**
 * create object
 */
@Override
public UnitOfMeasureFullView create() {
unitOfMeasureRightsManager.checkCanCreate();
return new UnitOfMeasureFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Integer save(UnitOfMeasureForm unitOfMeasureForm) {
UnitOfMeasure unitOfMeasure = this.unitOfMeasureFormMapper.mapTo(unitOfMeasureForm, new UnitOfMeasure());
unitOfMeasureRightsManager.checkCanSave(unitOfMeasure);
unitOfMeasureStateManager.checkCanSave(unitOfMeasure);
return unitOfMeasureProcessor.save(unitOfMeasure);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Integer id, UnitOfMeasureForm unitOfMeasureForm) {
UnitOfMeasure unitOfMeasure = this.unitOfMeasureDao.load(id);
unitOfMeasureRightsManager.checkCanUpdate(unitOfMeasure);
unitOfMeasureStateManager.checkCanUpdate(unitOfMeasure);
unitOfMeasure = this.unitOfMeasureFormMapper.mapTo(unitOfMeasureForm, unitOfMeasure);
unitOfMeasureProcessor.update(unitOfMeasure);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Integer id) {
UnitOfMeasure unitOfMeasure = unitOfMeasureDao.load(id);
unitOfMeasureRightsManager.checkCanDelete(unitOfMeasure);
unitOfMeasureStateManager.checkCanDelete(unitOfMeasure);
unitOfMeasureProcessor.delete(unitOfMeasure);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Integer> idList) {
UnitOfMeasure unitOfMeasure;
if (idList != null){
for (Integer id:idList){
unitOfMeasure = unitOfMeasureDao.load(id);
unitOfMeasureRightsManager.checkCanDelete(unitOfMeasure);
unitOfMeasureStateManager.checkCanDelete(unitOfMeasure);
unitOfMeasureProcessor.delete(unitOfMeasure);
}
}
}

}
