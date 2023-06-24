package com.afklm.cargo.cgocore.services.shipments.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.shipments.base.AirWaybillBaseService;
import com.afklm.cargo.cgocore.api.model.shipments.filters.AirWaybillFilter;
import com.afklm.cargo.cgocore.api.model.shipments.forms.AirWaybillForm;
import com.afklm.cargo.cgocore.api.model.shipments.sortings.AirWaybillSorting;
import com.afklm.cargo.cgocore.api.model.shipments.views.basic.AirWaybillBasicView;
import com.afklm.cargo.cgocore.api.model.shipments.views.full.AirWaybillFullView;
import com.afklm.cargo.cgocore.components.mapper.shipments.forms.AirWaybillFormMapper;
import com.afklm.cargo.cgocore.components.mapper.shipments.views.basic.AirWaybillBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.shipments.views.full.AirWaybillFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.shipments.AirWaybillProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.shipments.AirWaybillRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.shipments.AirWaybillStateManager;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;
import com.afklm.cargo.cgocore.persistence.interfaces.shipments.AirWaybillDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirWaybillBaseServiceImpl implements AirWaybillBaseService {

/*
 * properties injected by spring
 */
@Inject
protected AirWaybillDao airWaybillDao;
@Inject
protected AirWaybillFullViewMapper airWaybillFullViewMapper;
@Inject
protected AirWaybillBasicViewMapper airWaybillBasicViewMapper;
@Inject
protected AirWaybillFormMapper airWaybillFormMapper;
@Inject
protected AirWaybillStateManager airWaybillStateManager;
@Inject
protected AirWaybillRightsManager airWaybillRightsManager;
@Inject
protected AirWaybillProcessor airWaybillProcessor;

/**
 * search options
 */
@Override
@Transactional(readOnly=true)
public List<SelectItem> searchOptions(String arg) {
List<AirWaybill> airWaybillList = airWaybillDao.search(arg);
List<SelectItem> result = new ArrayList<>(airWaybillList.size());
for (AirWaybill airWaybill : airWaybillList) {
result.add(new SelectItem(airWaybill.getAirWaybillNumber(), airWaybill.getAirWaybillNumber()));
}
return result;
}

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<AirWaybillBasicView> loadList() {
airWaybillRightsManager.checkCanAccess();
List<AirWaybill> airWaybillList = airWaybillDao.loadListEagerly();
List<AirWaybillBasicView> result = new ArrayList<>(airWaybillList.size());
for (AirWaybill airWaybill : airWaybillList) {
result.add(this.airWaybillBasicViewMapper.mapFrom(new AirWaybillBasicView(),airWaybill));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<AirWaybillBasicView> scroll(ScrollForm<AirWaybillFilter, AirWaybillSorting> form) {
airWaybillRightsManager.checkCanAccess();
ScrollView<AirWaybillBasicView> result = new ScrollView<>();
result.setSize(airWaybillDao.count());
Long count = airWaybillDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<AirWaybill> list = airWaybillDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<AirWaybillBasicView> elements = new ArrayList<>(list.size());
for (AirWaybill airWaybill : list) {
elements.add(this.airWaybillBasicViewMapper.mapFrom(new AirWaybillBasicView(),airWaybill));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public AirWaybillFullView load(Long id) {
AirWaybill airWaybill = airWaybillDao.load(id);
airWaybillRightsManager.checkCanAccess(airWaybill);
return this.airWaybillFullViewMapper.mapFrom(new AirWaybillFullView(),airWaybill);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public AirWaybillFullView find(String airWaybillNumber) {
AirWaybill airWaybill = airWaybillDao.find(airWaybillNumber);
airWaybillRightsManager.checkCanAccess(airWaybill);
return this.airWaybillFullViewMapper.mapFrom(new AirWaybillFullView(), airWaybill);
}

/**
 * create object
 */
@Override
public AirWaybillFullView create() {
airWaybillRightsManager.checkCanCreate();
return new AirWaybillFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Long save(AirWaybillForm airWaybillForm) {
AirWaybill airWaybill = this.airWaybillFormMapper.mapTo(airWaybillForm, new AirWaybill());
airWaybillRightsManager.checkCanSave(airWaybill);
airWaybillStateManager.checkCanSave(airWaybill);
return airWaybillProcessor.save(airWaybill);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Long id, AirWaybillForm airWaybillForm) {
AirWaybill airWaybill = this.airWaybillDao.load(id);
airWaybillRightsManager.checkCanUpdate(airWaybill);
airWaybillStateManager.checkCanUpdate(airWaybill);
airWaybill = this.airWaybillFormMapper.mapTo(airWaybillForm, airWaybill);
airWaybillProcessor.update(airWaybill);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Long id) {
AirWaybill airWaybill = airWaybillDao.load(id);
airWaybillRightsManager.checkCanDelete(airWaybill);
airWaybillStateManager.checkCanDelete(airWaybill);
airWaybillProcessor.delete(airWaybill);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Long> idList) {
AirWaybill airWaybill;
if (idList != null){
for (Long id:idList){
airWaybill = airWaybillDao.load(id);
airWaybillRightsManager.checkCanDelete(airWaybill);
airWaybillStateManager.checkCanDelete(airWaybill);
airWaybillProcessor.delete(airWaybill);
}
}
}

}
