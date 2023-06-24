package com.afklm.cargo.cgocore.services.reference.localization.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.reference.localization.base.StationBaseService;
import com.afklm.cargo.cgocore.api.model.reference.localization.filters.StationFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.forms.StationForm;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.StationSorting;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.basic.StationBasicView;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.full.StationFullView;
import com.afklm.cargo.cgocore.components.mapper.reference.localization.forms.StationFormMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.localization.views.basic.StationBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.localization.views.full.StationFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.reference.localization.StationProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.localization.StationRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.localization.StationStateManager;
import com.afklm.cargo.cgocore.model.reference.localization.Station;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.CountryDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.StationDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class StationBaseServiceImpl implements StationBaseService {

/*
 * properties injected by spring
 */
@Inject
protected StationDao stationDao;
@Inject
protected CountryDao countryDao;
@Inject
protected StationFullViewMapper stationFullViewMapper;
@Inject
protected StationBasicViewMapper stationBasicViewMapper;
@Inject
protected StationFormMapper stationFormMapper;
@Inject
protected StationStateManager stationStateManager;
@Inject
protected StationRightsManager stationRightsManager;
@Inject
protected StationProcessor stationProcessor;

/**
 * search options
 */
@Override
@Transactional(readOnly=true)
public List<SelectItem> searchOptions(String arg) {
List<Station> stationList = stationDao.search(arg);
List<SelectItem> result = new ArrayList<>(stationList.size());
for (Station station : stationList) {
result.add(new SelectItem(station.getIataCode(), station.getIataCode()));
}
return result;
}

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<StationBasicView> loadList() {
stationRightsManager.checkCanAccess();
List<Station> stationList = stationDao.loadListEagerly();
List<StationBasicView> result = new ArrayList<>(stationList.size());
for (Station station : stationList) {
result.add(this.stationBasicViewMapper.mapFrom(new StationBasicView(),station));
}
return result;
}

/**
 * load object list from country
 */
@Override
@Transactional(readOnly=true)
public List<StationBasicView> loadListFromCountry (Integer countryId) {
stationRightsManager.checkCanAccess();
List<Station> stationList = stationDao.loadListEagerlyFromCountry(countryId);
List<StationBasicView> result = new ArrayList<>(stationList.size());
for (Station station : stationList) {
result.add(this.stationBasicViewMapper.mapFrom(new StationBasicView(),station));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<StationBasicView> scroll(ScrollForm<StationFilter, StationSorting> form) {
stationRightsManager.checkCanAccess();
ScrollView<StationBasicView> result = new ScrollView<>();
result.setSize(stationDao.count());
Long count = stationDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<Station> list = stationDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<StationBasicView> elements = new ArrayList<>(list.size());
for (Station station : list) {
elements.add(this.stationBasicViewMapper.mapFrom(new StationBasicView(),station));
}
result.setElements(elements);
return result;
}

/**
 * scroll object list from country
 */
@Override
@Transactional(readOnly=true)
public ScrollView<StationBasicView> scrollFromCountry (Integer countryId, ScrollForm<StationFilter, StationSorting> form) {
stationRightsManager.checkCanAccess();
ScrollView<StationBasicView> result = new ScrollView<>();
result.setSize(stationDao.countFromCountry(countryId));
Long count = stationDao.countFromCountry(countryId, form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<Station> list = stationDao.scrollFromCountry(countryId, form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<StationBasicView> elements = new ArrayList<>(list.size());
for (Station station : list) {
elements.add(this.stationBasicViewMapper.mapFrom(new StationBasicView(),station));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public StationFullView load(Integer id) {
Station station = stationDao.load(id);
stationRightsManager.checkCanAccess(station);
return this.stationFullViewMapper.mapFrom(new StationFullView(),station);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public StationFullView find(String iataCode) {
Station station = stationDao.find(iataCode);
stationRightsManager.checkCanAccess(station);
return this.stationFullViewMapper.mapFrom(new StationFullView(), station);
}

/**
 * create object
 */
@Override
public StationFullView create() {
stationRightsManager.checkCanCreate();
return new StationFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Integer save(StationForm stationForm) {
Station station = this.stationFormMapper.mapTo(stationForm, new Station());
stationRightsManager.checkCanSave(station);
stationStateManager.checkCanSave(station);
return stationProcessor.save(station);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Integer id, StationForm stationForm) {
Station station = this.stationDao.load(id);
stationRightsManager.checkCanUpdate(station);
stationStateManager.checkCanUpdate(station);
station = this.stationFormMapper.mapTo(stationForm, station);
stationProcessor.update(station);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Integer id) {
Station station = stationDao.load(id);
stationRightsManager.checkCanDelete(station);
stationStateManager.checkCanDelete(station);
stationProcessor.delete(station);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Integer> idList) {
Station station;
if (idList != null){
for (Integer id:idList){
station = stationDao.load(id);
stationRightsManager.checkCanDelete(station);
stationStateManager.checkCanDelete(station);
stationProcessor.delete(station);
}
}
}

}
