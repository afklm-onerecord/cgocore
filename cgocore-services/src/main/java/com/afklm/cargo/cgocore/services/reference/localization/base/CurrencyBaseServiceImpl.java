package com.afklm.cargo.cgocore.services.reference.localization.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.reference.localization.base.CurrencyBaseService;
import com.afklm.cargo.cgocore.api.model.reference.localization.filters.CurrencyFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.forms.CurrencyForm;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.CurrencySorting;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.basic.CurrencyBasicView;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.full.CurrencyFullView;
import com.afklm.cargo.cgocore.components.mapper.reference.localization.forms.CurrencyFormMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.localization.views.basic.CurrencyBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.localization.views.full.CurrencyFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.reference.localization.CurrencyProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.localization.CurrencyRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.localization.CurrencyStateManager;
import com.afklm.cargo.cgocore.model.reference.localization.Currency;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.CurrencyDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class CurrencyBaseServiceImpl implements CurrencyBaseService {

/*
 * properties injected by spring
 */
@Inject
protected CurrencyDao currencyDao;
@Inject
protected CurrencyFullViewMapper currencyFullViewMapper;
@Inject
protected CurrencyBasicViewMapper currencyBasicViewMapper;
@Inject
protected CurrencyFormMapper currencyFormMapper;
@Inject
protected CurrencyStateManager currencyStateManager;
@Inject
protected CurrencyRightsManager currencyRightsManager;
@Inject
protected CurrencyProcessor currencyProcessor;

/**
 * search options
 */
@Override
@Transactional(readOnly=true)
public List<SelectItem> searchOptions(String arg) {
List<Currency> currencyList = currencyDao.search(arg);
List<SelectItem> result = new ArrayList<>(currencyList.size());
for (Currency currency : currencyList) {
result.add(new SelectItem(currency.getIsoCode(), currency.getIsoCode()));
}
return result;
}

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<CurrencyBasicView> loadList() {
currencyRightsManager.checkCanAccess();
List<Currency> currencyList = currencyDao.loadListEagerly();
List<CurrencyBasicView> result = new ArrayList<>(currencyList.size());
for (Currency currency : currencyList) {
result.add(this.currencyBasicViewMapper.mapFrom(new CurrencyBasicView(),currency));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<CurrencyBasicView> scroll(ScrollForm<CurrencyFilter, CurrencySorting> form) {
currencyRightsManager.checkCanAccess();
ScrollView<CurrencyBasicView> result = new ScrollView<>();
result.setSize(currencyDao.count());
Long count = currencyDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<Currency> list = currencyDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<CurrencyBasicView> elements = new ArrayList<>(list.size());
for (Currency currency : list) {
elements.add(this.currencyBasicViewMapper.mapFrom(new CurrencyBasicView(),currency));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public CurrencyFullView load(Integer id) {
Currency currency = currencyDao.load(id);
currencyRightsManager.checkCanAccess(currency);
return this.currencyFullViewMapper.mapFrom(new CurrencyFullView(),currency);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public CurrencyFullView find(String isoCode) {
Currency currency = currencyDao.find(isoCode);
currencyRightsManager.checkCanAccess(currency);
return this.currencyFullViewMapper.mapFrom(new CurrencyFullView(), currency);
}

/**
 * create object
 */
@Override
public CurrencyFullView create() {
currencyRightsManager.checkCanCreate();
return new CurrencyFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Integer save(CurrencyForm currencyForm) {
Currency currency = this.currencyFormMapper.mapTo(currencyForm, new Currency());
currencyRightsManager.checkCanSave(currency);
currencyStateManager.checkCanSave(currency);
return currencyProcessor.save(currency);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Integer id, CurrencyForm currencyForm) {
Currency currency = this.currencyDao.load(id);
currencyRightsManager.checkCanUpdate(currency);
currencyStateManager.checkCanUpdate(currency);
currency = this.currencyFormMapper.mapTo(currencyForm, currency);
currencyProcessor.update(currency);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Integer id) {
Currency currency = currencyDao.load(id);
currencyRightsManager.checkCanDelete(currency);
currencyStateManager.checkCanDelete(currency);
currencyProcessor.delete(currency);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Integer> idList) {
Currency currency;
if (idList != null){
for (Integer id:idList){
currency = currencyDao.load(id);
currencyRightsManager.checkCanDelete(currency);
currencyStateManager.checkCanDelete(currency);
currencyProcessor.delete(currency);
}
}
}

}
