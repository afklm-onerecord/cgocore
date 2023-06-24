package com.afklm.cargo.cgocore.services.loading.base;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.loading.base.DatedFlightUldAwbBaseService;
import com.afklm.cargo.cgocore.api.model.loading.filters.DatedFlightUldAwbFilter;
import com.afklm.cargo.cgocore.api.model.loading.forms.DatedFlightUldAwbForm;
import com.afklm.cargo.cgocore.api.model.loading.sortings.DatedFlightUldAwbSorting;
import com.afklm.cargo.cgocore.api.model.loading.views.basic.DatedFlightUldAwbBasicView;
import com.afklm.cargo.cgocore.api.model.loading.views.full.DatedFlightUldAwbFullView;
import com.afklm.cargo.cgocore.components.mapper.loading.forms.DatedFlightUldAwbFormMapper;
import com.afklm.cargo.cgocore.components.mapper.loading.views.basic.DatedFlightUldAwbBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.loading.views.full.DatedFlightUldAwbFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.loading.DatedFlightUldAwbProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.loading.DatedFlightUldAwbRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.loading.DatedFlightUldAwbStateManager;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUldAwb;
import com.afklm.cargo.cgocore.persistence.interfaces.loading.DatedFlightUldAwbDao;
import com.afklm.cargo.cgocore.persistence.interfaces.loading.DatedFlightUldDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldAwbBaseServiceImpl implements DatedFlightUldAwbBaseService {

/*
 * properties injected by spring
 */
@Inject
protected DatedFlightUldAwbDao datedFlightUldAwbDao;
@Inject
protected DatedFlightUldDao datedFlightUldDao;
@Inject
protected DatedFlightUldAwbFullViewMapper datedFlightUldAwbFullViewMapper;
@Inject
protected DatedFlightUldAwbBasicViewMapper datedFlightUldAwbBasicViewMapper;
@Inject
protected DatedFlightUldAwbFormMapper datedFlightUldAwbFormMapper;
@Inject
protected DatedFlightUldAwbStateManager datedFlightUldAwbStateManager;
@Inject
protected DatedFlightUldAwbRightsManager datedFlightUldAwbRightsManager;
@Inject
protected DatedFlightUldAwbProcessor datedFlightUldAwbProcessor;

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<DatedFlightUldAwbBasicView> loadList() {
datedFlightUldAwbRightsManager.checkCanAccess();
List<DatedFlightUldAwb> datedFlightUldAwbList = datedFlightUldAwbDao.loadListEagerly();
List<DatedFlightUldAwbBasicView> result = new ArrayList<>(datedFlightUldAwbList.size());
for (DatedFlightUldAwb datedFlightUldAwb : datedFlightUldAwbList) {
result.add(this.datedFlightUldAwbBasicViewMapper.mapFrom(new DatedFlightUldAwbBasicView(),datedFlightUldAwb));
}
return result;
}

/**
 * load object list from datedFlightUld
 */
@Override
@Transactional(readOnly=true)
public List<DatedFlightUldAwbBasicView> loadListFromDatedFlightUld (Integer datedFlightUldId) {
datedFlightUldAwbRightsManager.checkCanAccess();
List<DatedFlightUldAwb> datedFlightUldAwbList = datedFlightUldAwbDao.loadListEagerlyFromDatedFlightUld(datedFlightUldId);
List<DatedFlightUldAwbBasicView> result = new ArrayList<>(datedFlightUldAwbList.size());
for (DatedFlightUldAwb datedFlightUldAwb : datedFlightUldAwbList) {
result.add(this.datedFlightUldAwbBasicViewMapper.mapFrom(new DatedFlightUldAwbBasicView(),datedFlightUldAwb));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<DatedFlightUldAwbBasicView> scroll(ScrollForm<DatedFlightUldAwbFilter, DatedFlightUldAwbSorting> form) {
datedFlightUldAwbRightsManager.checkCanAccess();
ScrollView<DatedFlightUldAwbBasicView> result = new ScrollView<>();
result.setSize(datedFlightUldAwbDao.count());
Long count = datedFlightUldAwbDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<DatedFlightUldAwb> list = datedFlightUldAwbDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<DatedFlightUldAwbBasicView> elements = new ArrayList<>(list.size());
for (DatedFlightUldAwb datedFlightUldAwb : list) {
elements.add(this.datedFlightUldAwbBasicViewMapper.mapFrom(new DatedFlightUldAwbBasicView(),datedFlightUldAwb));
}
result.setElements(elements);
return result;
}

/**
 * scroll object list from datedFlightUld
 */
@Override
@Transactional(readOnly=true)
public ScrollView<DatedFlightUldAwbBasicView> scrollFromDatedFlightUld (Integer datedFlightUldId, ScrollForm<DatedFlightUldAwbFilter, DatedFlightUldAwbSorting> form) {
datedFlightUldAwbRightsManager.checkCanAccess();
ScrollView<DatedFlightUldAwbBasicView> result = new ScrollView<>();
result.setSize(datedFlightUldAwbDao.countFromDatedFlightUld(datedFlightUldId));
Long count = datedFlightUldAwbDao.countFromDatedFlightUld(datedFlightUldId, form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<DatedFlightUldAwb> list = datedFlightUldAwbDao.scrollFromDatedFlightUld(datedFlightUldId, form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<DatedFlightUldAwbBasicView> elements = new ArrayList<>(list.size());
for (DatedFlightUldAwb datedFlightUldAwb : list) {
elements.add(this.datedFlightUldAwbBasicViewMapper.mapFrom(new DatedFlightUldAwbBasicView(),datedFlightUldAwb));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public DatedFlightUldAwbFullView load(Integer id) {
DatedFlightUldAwb datedFlightUldAwb = datedFlightUldAwbDao.load(id);
datedFlightUldAwbRightsManager.checkCanAccess(datedFlightUldAwb);
return this.datedFlightUldAwbFullViewMapper.mapFrom(new DatedFlightUldAwbFullView(),datedFlightUldAwb);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public DatedFlightUldAwbFullView find(String datedFlightUldDatedFlightCompanyIataCode, String datedFlightUldDatedFlightFlightNumber, LocalDate datedFlightUldDatedFlightDepartureDate, String datedFlightUldUldTypeCode, String datedFlightUldUldCode, String datedFlightUldUldOwnerCode, String airWaybillAirWaybillNumber, Integer numberOfPieces, BigDecimal grossWeight) {
DatedFlightUldAwb datedFlightUldAwb = datedFlightUldAwbDao.find(datedFlightUldDatedFlightCompanyIataCode, datedFlightUldDatedFlightFlightNumber, datedFlightUldDatedFlightDepartureDate, datedFlightUldUldTypeCode, datedFlightUldUldCode, datedFlightUldUldOwnerCode, airWaybillAirWaybillNumber, numberOfPieces, grossWeight);
datedFlightUldAwbRightsManager.checkCanAccess(datedFlightUldAwb);
return this.datedFlightUldAwbFullViewMapper.mapFrom(new DatedFlightUldAwbFullView(), datedFlightUldAwb);
}

/**
 * create object
 */
@Override
public DatedFlightUldAwbFullView create() {
datedFlightUldAwbRightsManager.checkCanCreate();
return new DatedFlightUldAwbFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Integer save(DatedFlightUldAwbForm datedFlightUldAwbForm) {
DatedFlightUldAwb datedFlightUldAwb = this.datedFlightUldAwbFormMapper.mapTo(datedFlightUldAwbForm, new DatedFlightUldAwb());
datedFlightUldAwbRightsManager.checkCanSave(datedFlightUldAwb);
datedFlightUldAwbStateManager.checkCanSave(datedFlightUldAwb);
return datedFlightUldAwbProcessor.save(datedFlightUldAwb);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Integer id, DatedFlightUldAwbForm datedFlightUldAwbForm) {
DatedFlightUldAwb datedFlightUldAwb = this.datedFlightUldAwbDao.load(id);
datedFlightUldAwbRightsManager.checkCanUpdate(datedFlightUldAwb);
datedFlightUldAwbStateManager.checkCanUpdate(datedFlightUldAwb);
datedFlightUldAwb = this.datedFlightUldAwbFormMapper.mapTo(datedFlightUldAwbForm, datedFlightUldAwb);
datedFlightUldAwbProcessor.update(datedFlightUldAwb);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Integer id) {
DatedFlightUldAwb datedFlightUldAwb = datedFlightUldAwbDao.load(id);
datedFlightUldAwbRightsManager.checkCanDelete(datedFlightUldAwb);
datedFlightUldAwbStateManager.checkCanDelete(datedFlightUldAwb);
datedFlightUldAwbProcessor.delete(datedFlightUldAwb);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Integer> idList) {
DatedFlightUldAwb datedFlightUldAwb;
if (idList != null){
for (Integer id:idList){
datedFlightUldAwb = datedFlightUldAwbDao.load(id);
datedFlightUldAwbRightsManager.checkCanDelete(datedFlightUldAwb);
datedFlightUldAwbStateManager.checkCanDelete(datedFlightUldAwb);
datedFlightUldAwbProcessor.delete(datedFlightUldAwb);
}
}
}

}
