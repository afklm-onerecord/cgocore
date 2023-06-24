package com.afklm.cargo.cgocore.services.reference.airlines.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.reference.airlines.base.AirlineCompanyBaseService;
import com.afklm.cargo.cgocore.api.model.reference.airlines.filters.AirlineCompanyFilter;
import com.afklm.cargo.cgocore.api.model.reference.airlines.forms.AirlineCompanyForm;
import com.afklm.cargo.cgocore.api.model.reference.airlines.sortings.AirlineCompanySorting;
import com.afklm.cargo.cgocore.api.model.reference.airlines.views.basic.AirlineCompanyBasicView;
import com.afklm.cargo.cgocore.api.model.reference.airlines.views.full.AirlineCompanyFullView;
import com.afklm.cargo.cgocore.components.mapper.reference.airlines.forms.AirlineCompanyFormMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.airlines.views.basic.AirlineCompanyBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.airlines.views.full.AirlineCompanyFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.reference.airlines.AirlineCompanyProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.airlines.AirlineCompanyRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.airlines.AirlineCompanyStateManager;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.airlines.AirlineCompanyDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirlineCompanyBaseServiceImpl implements AirlineCompanyBaseService {

/*
 * properties injected by spring
 */
@Inject
protected AirlineCompanyDao airlineCompanyDao;
@Inject
protected AirlineCompanyFullViewMapper airlineCompanyFullViewMapper;
@Inject
protected AirlineCompanyBasicViewMapper airlineCompanyBasicViewMapper;
@Inject
protected AirlineCompanyFormMapper airlineCompanyFormMapper;
@Inject
protected AirlineCompanyStateManager airlineCompanyStateManager;
@Inject
protected AirlineCompanyRightsManager airlineCompanyRightsManager;
@Inject
protected AirlineCompanyProcessor airlineCompanyProcessor;

/**
 * search options
 */
@Override
@Transactional(readOnly=true)
public List<SelectItem> searchOptions(String arg) {
List<AirlineCompany> airlineCompanyList = airlineCompanyDao.search(arg);
List<SelectItem> result = new ArrayList<>(airlineCompanyList.size());
for (AirlineCompany airlineCompany : airlineCompanyList) {
result.add(new SelectItem(airlineCompany.getIataCode(), airlineCompany.getIataCode()));
}
return result;
}

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<AirlineCompanyBasicView> loadList() {
airlineCompanyRightsManager.checkCanAccess();
List<AirlineCompany> airlineCompanyList = airlineCompanyDao.loadListEagerly();
List<AirlineCompanyBasicView> result = new ArrayList<>(airlineCompanyList.size());
for (AirlineCompany airlineCompany : airlineCompanyList) {
result.add(this.airlineCompanyBasicViewMapper.mapFrom(new AirlineCompanyBasicView(),airlineCompany));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<AirlineCompanyBasicView> scroll(ScrollForm<AirlineCompanyFilter, AirlineCompanySorting> form) {
airlineCompanyRightsManager.checkCanAccess();
ScrollView<AirlineCompanyBasicView> result = new ScrollView<>();
result.setSize(airlineCompanyDao.count());
Long count = airlineCompanyDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<AirlineCompany> list = airlineCompanyDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<AirlineCompanyBasicView> elements = new ArrayList<>(list.size());
for (AirlineCompany airlineCompany : list) {
elements.add(this.airlineCompanyBasicViewMapper.mapFrom(new AirlineCompanyBasicView(),airlineCompany));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public AirlineCompanyFullView load(Integer id) {
AirlineCompany airlineCompany = airlineCompanyDao.load(id);
airlineCompanyRightsManager.checkCanAccess(airlineCompany);
return this.airlineCompanyFullViewMapper.mapFrom(new AirlineCompanyFullView(),airlineCompany);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public AirlineCompanyFullView find(String iataCode) {
AirlineCompany airlineCompany = airlineCompanyDao.find(iataCode);
airlineCompanyRightsManager.checkCanAccess(airlineCompany);
return this.airlineCompanyFullViewMapper.mapFrom(new AirlineCompanyFullView(), airlineCompany);
}

/**
 * create object
 */
@Override
public AirlineCompanyFullView create() {
airlineCompanyRightsManager.checkCanCreate();
return new AirlineCompanyFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Integer save(AirlineCompanyForm airlineCompanyForm) {
AirlineCompany airlineCompany = this.airlineCompanyFormMapper.mapTo(airlineCompanyForm, new AirlineCompany());
airlineCompanyRightsManager.checkCanSave(airlineCompany);
airlineCompanyStateManager.checkCanSave(airlineCompany);
return airlineCompanyProcessor.save(airlineCompany);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Integer id, AirlineCompanyForm airlineCompanyForm) {
AirlineCompany airlineCompany = this.airlineCompanyDao.load(id);
airlineCompanyRightsManager.checkCanUpdate(airlineCompany);
airlineCompanyStateManager.checkCanUpdate(airlineCompany);
airlineCompany = this.airlineCompanyFormMapper.mapTo(airlineCompanyForm, airlineCompany);
airlineCompanyProcessor.update(airlineCompany);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Integer id) {
AirlineCompany airlineCompany = airlineCompanyDao.load(id);
airlineCompanyRightsManager.checkCanDelete(airlineCompany);
airlineCompanyStateManager.checkCanDelete(airlineCompany);
airlineCompanyProcessor.delete(airlineCompany);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Integer> idList) {
AirlineCompany airlineCompany;
if (idList != null){
for (Integer id:idList){
airlineCompany = airlineCompanyDao.load(id);
airlineCompanyRightsManager.checkCanDelete(airlineCompany);
airlineCompanyStateManager.checkCanDelete(airlineCompany);
airlineCompanyProcessor.delete(airlineCompany);
}
}
}

}
