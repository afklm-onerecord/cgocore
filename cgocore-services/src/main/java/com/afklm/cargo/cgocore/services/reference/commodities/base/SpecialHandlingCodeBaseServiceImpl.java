package com.afklm.cargo.cgocore.services.reference.commodities.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.reference.commodities.base.SpecialHandlingCodeBaseService;
import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.SpecialHandlingCodeFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.SpecialHandlingCodeForm;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.SpecialHandlingCodeSorting;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.basic.SpecialHandlingCodeBasicView;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.full.SpecialHandlingCodeFullView;
import com.afklm.cargo.cgocore.components.mapper.reference.commodities.forms.SpecialHandlingCodeFormMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.commodities.views.basic.SpecialHandlingCodeBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.commodities.views.full.SpecialHandlingCodeFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.reference.commodities.SpecialHandlingCodeProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.commodities.SpecialHandlingCodeRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.commodities.SpecialHandlingCodeStateManager;
import com.afklm.cargo.cgocore.model.reference.commodities.SpecialHandlingCode;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.SpecialHandlingCodeDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class SpecialHandlingCodeBaseServiceImpl implements SpecialHandlingCodeBaseService {

/*
 * properties injected by spring
 */
@Inject
protected SpecialHandlingCodeDao specialHandlingCodeDao;
@Inject
protected SpecialHandlingCodeFullViewMapper specialHandlingCodeFullViewMapper;
@Inject
protected SpecialHandlingCodeBasicViewMapper specialHandlingCodeBasicViewMapper;
@Inject
protected SpecialHandlingCodeFormMapper specialHandlingCodeFormMapper;
@Inject
protected SpecialHandlingCodeStateManager specialHandlingCodeStateManager;
@Inject
protected SpecialHandlingCodeRightsManager specialHandlingCodeRightsManager;
@Inject
protected SpecialHandlingCodeProcessor specialHandlingCodeProcessor;

/**
 * get options
 */
@Override
@Transactional(readOnly=true)
public List<SelectItem> getOptions() {
List<SpecialHandlingCode> specialHandlingCodeList = specialHandlingCodeDao.loadList();
List<SelectItem> result = new ArrayList<>(specialHandlingCodeList.size());
for (SpecialHandlingCode specialHandlingCode : specialHandlingCodeList) {
result.add(new SelectItem(specialHandlingCode.getCode(), specialHandlingCode.getCode()));
}
return result;
}

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<SpecialHandlingCodeBasicView> loadList() {
specialHandlingCodeRightsManager.checkCanAccess();
List<SpecialHandlingCode> specialHandlingCodeList = specialHandlingCodeDao.loadListEagerly();
List<SpecialHandlingCodeBasicView> result = new ArrayList<>(specialHandlingCodeList.size());
for (SpecialHandlingCode specialHandlingCode : specialHandlingCodeList) {
result.add(this.specialHandlingCodeBasicViewMapper.mapFrom(new SpecialHandlingCodeBasicView(),specialHandlingCode));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<SpecialHandlingCodeBasicView> scroll(ScrollForm<SpecialHandlingCodeFilter, SpecialHandlingCodeSorting> form) {
specialHandlingCodeRightsManager.checkCanAccess();
ScrollView<SpecialHandlingCodeBasicView> result = new ScrollView<>();
result.setSize(specialHandlingCodeDao.count());
Long count = specialHandlingCodeDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<SpecialHandlingCode> list = specialHandlingCodeDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<SpecialHandlingCodeBasicView> elements = new ArrayList<>(list.size());
for (SpecialHandlingCode specialHandlingCode : list) {
elements.add(this.specialHandlingCodeBasicViewMapper.mapFrom(new SpecialHandlingCodeBasicView(),specialHandlingCode));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public SpecialHandlingCodeFullView load(Integer id) {
SpecialHandlingCode specialHandlingCode = specialHandlingCodeDao.load(id);
specialHandlingCodeRightsManager.checkCanAccess(specialHandlingCode);
return this.specialHandlingCodeFullViewMapper.mapFrom(new SpecialHandlingCodeFullView(),specialHandlingCode);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public SpecialHandlingCodeFullView find(String code) {
SpecialHandlingCode specialHandlingCode = specialHandlingCodeDao.find(code);
specialHandlingCodeRightsManager.checkCanAccess(specialHandlingCode);
return this.specialHandlingCodeFullViewMapper.mapFrom(new SpecialHandlingCodeFullView(), specialHandlingCode);
}

/**
 * create object
 */
@Override
public SpecialHandlingCodeFullView create() {
specialHandlingCodeRightsManager.checkCanCreate();
return new SpecialHandlingCodeFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Integer save(SpecialHandlingCodeForm specialHandlingCodeForm) {
SpecialHandlingCode specialHandlingCode = this.specialHandlingCodeFormMapper.mapTo(specialHandlingCodeForm, new SpecialHandlingCode());
specialHandlingCodeRightsManager.checkCanSave(specialHandlingCode);
specialHandlingCodeStateManager.checkCanSave(specialHandlingCode);
return specialHandlingCodeProcessor.save(specialHandlingCode);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Integer id, SpecialHandlingCodeForm specialHandlingCodeForm) {
SpecialHandlingCode specialHandlingCode = this.specialHandlingCodeDao.load(id);
specialHandlingCodeRightsManager.checkCanUpdate(specialHandlingCode);
specialHandlingCodeStateManager.checkCanUpdate(specialHandlingCode);
specialHandlingCode = this.specialHandlingCodeFormMapper.mapTo(specialHandlingCodeForm, specialHandlingCode);
specialHandlingCodeProcessor.update(specialHandlingCode);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Integer id) {
SpecialHandlingCode specialHandlingCode = specialHandlingCodeDao.load(id);
specialHandlingCodeRightsManager.checkCanDelete(specialHandlingCode);
specialHandlingCodeStateManager.checkCanDelete(specialHandlingCode);
specialHandlingCodeProcessor.delete(specialHandlingCode);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Integer> idList) {
SpecialHandlingCode specialHandlingCode;
if (idList != null){
for (Integer id:idList){
specialHandlingCode = specialHandlingCodeDao.load(id);
specialHandlingCodeRightsManager.checkCanDelete(specialHandlingCode);
specialHandlingCodeStateManager.checkCanDelete(specialHandlingCode);
specialHandlingCodeProcessor.delete(specialHandlingCode);
}
}
}

}
