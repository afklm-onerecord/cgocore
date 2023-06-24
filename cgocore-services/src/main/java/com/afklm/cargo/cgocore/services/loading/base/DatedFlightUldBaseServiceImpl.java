package com.afklm.cargo.cgocore.services.loading.base;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.loading.base.DatedFlightUldBaseService;
import com.afklm.cargo.cgocore.api.model.loading.filters.DatedFlightUldFilter;
import com.afklm.cargo.cgocore.api.model.loading.forms.DatedFlightUldForm;
import com.afklm.cargo.cgocore.api.model.loading.sortings.DatedFlightUldSorting;
import com.afklm.cargo.cgocore.api.model.loading.views.basic.DatedFlightUldBasicView;
import com.afklm.cargo.cgocore.api.model.loading.views.full.DatedFlightUldFullView;
import com.afklm.cargo.cgocore.components.mapper.loading.forms.DatedFlightUldFormMapper;
import com.afklm.cargo.cgocore.components.mapper.loading.views.basic.DatedFlightUldBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.loading.views.full.DatedFlightUldFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.loading.DatedFlightUldProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.loading.DatedFlightUldRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.loading.DatedFlightUldStateManager;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;
import com.afklm.cargo.cgocore.persistence.interfaces.loading.DatedFlightUldDao;
import com.afklm.cargo.cgocore.persistence.interfaces.schedule.DatedFlightDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldBaseServiceImpl implements DatedFlightUldBaseService {

/*
 * properties injected by spring
 */
@Inject
protected DatedFlightUldDao datedFlightUldDao;
@Inject
protected DatedFlightDao datedFlightDao;
@Inject
protected DatedFlightUldFullViewMapper datedFlightUldFullViewMapper;
@Inject
protected DatedFlightUldBasicViewMapper datedFlightUldBasicViewMapper;
@Inject
protected DatedFlightUldFormMapper datedFlightUldFormMapper;
@Inject
protected DatedFlightUldStateManager datedFlightUldStateManager;
@Inject
protected DatedFlightUldRightsManager datedFlightUldRightsManager;
@Inject
protected DatedFlightUldProcessor datedFlightUldProcessor;

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<DatedFlightUldBasicView> loadList() {
datedFlightUldRightsManager.checkCanAccess();
List<DatedFlightUld> datedFlightUldList = datedFlightUldDao.loadListEagerly();
List<DatedFlightUldBasicView> result = new ArrayList<>(datedFlightUldList.size());
for (DatedFlightUld datedFlightUld : datedFlightUldList) {
result.add(this.datedFlightUldBasicViewMapper.mapFrom(new DatedFlightUldBasicView(),datedFlightUld));
}
return result;
}

/**
 * load object list from datedFlight
 */
@Override
@Transactional(readOnly=true)
public List<DatedFlightUldBasicView> loadListFromDatedFlight (Integer datedFlightId) {
datedFlightUldRightsManager.checkCanAccess();
List<DatedFlightUld> datedFlightUldList = datedFlightUldDao.loadListEagerlyFromDatedFlight(datedFlightId);
List<DatedFlightUldBasicView> result = new ArrayList<>(datedFlightUldList.size());
for (DatedFlightUld datedFlightUld : datedFlightUldList) {
result.add(this.datedFlightUldBasicViewMapper.mapFrom(new DatedFlightUldBasicView(),datedFlightUld));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<DatedFlightUldBasicView> scroll(ScrollForm<DatedFlightUldFilter, DatedFlightUldSorting> form) {
datedFlightUldRightsManager.checkCanAccess();
ScrollView<DatedFlightUldBasicView> result = new ScrollView<>();
result.setSize(datedFlightUldDao.count());
Long count = datedFlightUldDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<DatedFlightUld> list = datedFlightUldDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<DatedFlightUldBasicView> elements = new ArrayList<>(list.size());
for (DatedFlightUld datedFlightUld : list) {
elements.add(this.datedFlightUldBasicViewMapper.mapFrom(new DatedFlightUldBasicView(),datedFlightUld));
}
result.setElements(elements);
return result;
}

/**
 * scroll object list from datedFlight
 */
@Override
@Transactional(readOnly=true)
public ScrollView<DatedFlightUldBasicView> scrollFromDatedFlight (Integer datedFlightId, ScrollForm<DatedFlightUldFilter, DatedFlightUldSorting> form) {
datedFlightUldRightsManager.checkCanAccess();
ScrollView<DatedFlightUldBasicView> result = new ScrollView<>();
result.setSize(datedFlightUldDao.countFromDatedFlight(datedFlightId));
Long count = datedFlightUldDao.countFromDatedFlight(datedFlightId, form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<DatedFlightUld> list = datedFlightUldDao.scrollFromDatedFlight(datedFlightId, form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<DatedFlightUldBasicView> elements = new ArrayList<>(list.size());
for (DatedFlightUld datedFlightUld : list) {
elements.add(this.datedFlightUldBasicViewMapper.mapFrom(new DatedFlightUldBasicView(),datedFlightUld));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public DatedFlightUldFullView load(Integer id) {
DatedFlightUld datedFlightUld = datedFlightUldDao.load(id);
datedFlightUldRightsManager.checkCanAccess(datedFlightUld);
return this.datedFlightUldFullViewMapper.mapFrom(new DatedFlightUldFullView(),datedFlightUld);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public DatedFlightUldFullView find(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String uldTypeCode, String uldCode, String uldOwnerCode) {
DatedFlightUld datedFlightUld = datedFlightUldDao.find(datedFlightCompanyIataCode, datedFlightFlightNumber, datedFlightDepartureDate, uldTypeCode, uldCode, uldOwnerCode);
datedFlightUldRightsManager.checkCanAccess(datedFlightUld);
return this.datedFlightUldFullViewMapper.mapFrom(new DatedFlightUldFullView(), datedFlightUld);
}

/**
 * create object
 */
@Override
public DatedFlightUldFullView create() {
datedFlightUldRightsManager.checkCanCreate();
return new DatedFlightUldFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Integer save(DatedFlightUldForm datedFlightUldForm) {
DatedFlightUld datedFlightUld = this.datedFlightUldFormMapper.mapTo(datedFlightUldForm, new DatedFlightUld());
datedFlightUldRightsManager.checkCanSave(datedFlightUld);
datedFlightUldStateManager.checkCanSave(datedFlightUld);
return datedFlightUldProcessor.save(datedFlightUld);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Integer id, DatedFlightUldForm datedFlightUldForm) {
DatedFlightUld datedFlightUld = this.datedFlightUldDao.load(id);
datedFlightUldRightsManager.checkCanUpdate(datedFlightUld);
datedFlightUldStateManager.checkCanUpdate(datedFlightUld);
datedFlightUld = this.datedFlightUldFormMapper.mapTo(datedFlightUldForm, datedFlightUld);
datedFlightUldProcessor.update(datedFlightUld);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Integer id) {
DatedFlightUld datedFlightUld = datedFlightUldDao.load(id);
datedFlightUldRightsManager.checkCanDelete(datedFlightUld);
datedFlightUldStateManager.checkCanDelete(datedFlightUld);
datedFlightUldProcessor.delete(datedFlightUld);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Integer> idList) {
DatedFlightUld datedFlightUld;
if (idList != null){
for (Integer id:idList){
datedFlightUld = datedFlightUldDao.load(id);
datedFlightUldRightsManager.checkCanDelete(datedFlightUld);
datedFlightUldStateManager.checkCanDelete(datedFlightUld);
datedFlightUldProcessor.delete(datedFlightUld);
}
}
}

}
