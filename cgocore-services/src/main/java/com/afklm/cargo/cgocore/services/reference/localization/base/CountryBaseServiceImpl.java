package com.afklm.cargo.cgocore.services.reference.localization.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.reference.localization.base.CountryBaseService;
import com.afklm.cargo.cgocore.api.model.reference.localization.filters.CountryFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.forms.CountryForm;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.CountrySorting;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.basic.CountryBasicView;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.full.CountryFullView;
import com.afklm.cargo.cgocore.components.mapper.reference.localization.forms.CountryFormMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.localization.views.basic.CountryBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.localization.views.full.CountryFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.reference.localization.CountryProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.localization.CountryRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.localization.CountryStateManager;
import com.afklm.cargo.cgocore.model.reference.localization.Country;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.CountryDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class CountryBaseServiceImpl implements CountryBaseService {

/*
 * properties injected by spring
 */
@Inject
protected CountryDao countryDao;
@Inject
protected CountryFullViewMapper countryFullViewMapper;
@Inject
protected CountryBasicViewMapper countryBasicViewMapper;
@Inject
protected CountryFormMapper countryFormMapper;
@Inject
protected CountryStateManager countryStateManager;
@Inject
protected CountryRightsManager countryRightsManager;
@Inject
protected CountryProcessor countryProcessor;

/**
 * search options
 */
@Override
@Transactional(readOnly=true)
public List<SelectItem> searchOptions(String arg) {
List<Country> countryList = countryDao.search(arg);
List<SelectItem> result = new ArrayList<>(countryList.size());
for (Country country : countryList) {
result.add(new SelectItem(country.getIataCode(), country.getIataCode()));
}
return result;
}

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<CountryBasicView> loadList() {
countryRightsManager.checkCanAccess();
List<Country> countryList = countryDao.loadListEagerly();
List<CountryBasicView> result = new ArrayList<>(countryList.size());
for (Country country : countryList) {
result.add(this.countryBasicViewMapper.mapFrom(new CountryBasicView(),country));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<CountryBasicView> scroll(ScrollForm<CountryFilter, CountrySorting> form) {
countryRightsManager.checkCanAccess();
ScrollView<CountryBasicView> result = new ScrollView<>();
result.setSize(countryDao.count());
Long count = countryDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<Country> list = countryDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<CountryBasicView> elements = new ArrayList<>(list.size());
for (Country country : list) {
elements.add(this.countryBasicViewMapper.mapFrom(new CountryBasicView(),country));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public CountryFullView load(Integer id) {
Country country = countryDao.load(id);
countryRightsManager.checkCanAccess(country);
return this.countryFullViewMapper.mapFrom(new CountryFullView(),country);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public CountryFullView find(String iataCode) {
Country country = countryDao.find(iataCode);
countryRightsManager.checkCanAccess(country);
return this.countryFullViewMapper.mapFrom(new CountryFullView(), country);
}

/**
 * create object
 */
@Override
public CountryFullView create() {
countryRightsManager.checkCanCreate();
return new CountryFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Integer save(CountryForm countryForm) {
Country country = this.countryFormMapper.mapTo(countryForm, new Country());
countryRightsManager.checkCanSave(country);
countryStateManager.checkCanSave(country);
return countryProcessor.save(country);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Integer id, CountryForm countryForm) {
Country country = this.countryDao.load(id);
countryRightsManager.checkCanUpdate(country);
countryStateManager.checkCanUpdate(country);
country = this.countryFormMapper.mapTo(countryForm, country);
countryProcessor.update(country);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Integer id) {
Country country = countryDao.load(id);
countryRightsManager.checkCanDelete(country);
countryStateManager.checkCanDelete(country);
countryProcessor.delete(country);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Integer> idList) {
Country country;
if (idList != null){
for (Integer id:idList){
country = countryDao.load(id);
countryRightsManager.checkCanDelete(country);
countryStateManager.checkCanDelete(country);
countryProcessor.delete(country);
}
}
}

}
