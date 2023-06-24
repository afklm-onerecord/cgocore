package com.afklm.cargo.cgocore.services.reference.containers.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.reference.containers.base.UldTypeBaseService;
import com.afklm.cargo.cgocore.api.model.reference.containers.filters.UldTypeFilter;
import com.afklm.cargo.cgocore.api.model.reference.containers.forms.UldTypeForm;
import com.afklm.cargo.cgocore.api.model.reference.containers.sortings.UldTypeSorting;
import com.afklm.cargo.cgocore.api.model.reference.containers.views.basic.UldTypeBasicView;
import com.afklm.cargo.cgocore.api.model.reference.containers.views.full.UldTypeFullView;
import com.afklm.cargo.cgocore.components.mapper.reference.containers.forms.UldTypeFormMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.containers.views.basic.UldTypeBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.reference.containers.views.full.UldTypeFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.reference.containers.UldTypeProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.containers.UldTypeRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.containers.UldTypeStateManager;
import com.afklm.cargo.cgocore.model.reference.containers.UldType;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.containers.UldTypeDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UldTypeBaseServiceImpl implements UldTypeBaseService {

/*
 * properties injected by spring
 */
@Inject
protected UldTypeDao uldTypeDao;
@Inject
protected UldTypeFullViewMapper uldTypeFullViewMapper;
@Inject
protected UldTypeBasicViewMapper uldTypeBasicViewMapper;
@Inject
protected UldTypeFormMapper uldTypeFormMapper;
@Inject
protected UldTypeStateManager uldTypeStateManager;
@Inject
protected UldTypeRightsManager uldTypeRightsManager;
@Inject
protected UldTypeProcessor uldTypeProcessor;

/**
 * get options
 */
@Override
@Transactional(readOnly=true)
public List<SelectItem> getOptions() {
List<UldType> uldTypeList = uldTypeDao.loadList();
List<SelectItem> result = new ArrayList<>(uldTypeList.size());
for (UldType uldType : uldTypeList) {
result.add(new SelectItem(uldType.getCode(), uldType.getCode()));
}
return result;
}

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<UldTypeBasicView> loadList() {
uldTypeRightsManager.checkCanAccess();
List<UldType> uldTypeList = uldTypeDao.loadListEagerly();
List<UldTypeBasicView> result = new ArrayList<>(uldTypeList.size());
for (UldType uldType : uldTypeList) {
result.add(this.uldTypeBasicViewMapper.mapFrom(new UldTypeBasicView(),uldType));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<UldTypeBasicView> scroll(ScrollForm<UldTypeFilter, UldTypeSorting> form) {
uldTypeRightsManager.checkCanAccess();
ScrollView<UldTypeBasicView> result = new ScrollView<>();
result.setSize(uldTypeDao.count());
Long count = uldTypeDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<UldType> list = uldTypeDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<UldTypeBasicView> elements = new ArrayList<>(list.size());
for (UldType uldType : list) {
elements.add(this.uldTypeBasicViewMapper.mapFrom(new UldTypeBasicView(),uldType));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public UldTypeFullView load(Integer id) {
UldType uldType = uldTypeDao.load(id);
uldTypeRightsManager.checkCanAccess(uldType);
return this.uldTypeFullViewMapper.mapFrom(new UldTypeFullView(),uldType);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public UldTypeFullView find(String code) {
UldType uldType = uldTypeDao.find(code);
uldTypeRightsManager.checkCanAccess(uldType);
return this.uldTypeFullViewMapper.mapFrom(new UldTypeFullView(), uldType);
}

/**
 * create object
 */
@Override
public UldTypeFullView create() {
uldTypeRightsManager.checkCanCreate();
return new UldTypeFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Integer save(UldTypeForm uldTypeForm) {
UldType uldType = this.uldTypeFormMapper.mapTo(uldTypeForm, new UldType());
uldTypeRightsManager.checkCanSave(uldType);
uldTypeStateManager.checkCanSave(uldType);
return uldTypeProcessor.save(uldType);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Integer id, UldTypeForm uldTypeForm) {
UldType uldType = this.uldTypeDao.load(id);
uldTypeRightsManager.checkCanUpdate(uldType);
uldTypeStateManager.checkCanUpdate(uldType);
uldType = this.uldTypeFormMapper.mapTo(uldTypeForm, uldType);
uldTypeProcessor.update(uldType);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Integer id) {
UldType uldType = uldTypeDao.load(id);
uldTypeRightsManager.checkCanDelete(uldType);
uldTypeStateManager.checkCanDelete(uldType);
uldTypeProcessor.delete(uldType);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Integer> idList) {
UldType uldType;
if (idList != null){
for (Integer id:idList){
uldType = uldTypeDao.load(id);
uldTypeRightsManager.checkCanDelete(uldType);
uldTypeStateManager.checkCanDelete(uldType);
uldTypeProcessor.delete(uldType);
}
}
}

}
