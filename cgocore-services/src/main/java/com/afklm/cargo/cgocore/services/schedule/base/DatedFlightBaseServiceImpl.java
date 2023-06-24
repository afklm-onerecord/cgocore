package com.afklm.cargo.cgocore.services.schedule.base;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.schedule.base.DatedFlightBaseService;
import com.afklm.cargo.cgocore.api.model.schedule.filters.DatedFlightFilter;
import com.afklm.cargo.cgocore.api.model.schedule.forms.DatedFlightForm;
import com.afklm.cargo.cgocore.api.model.schedule.sortings.DatedFlightSorting;
import com.afklm.cargo.cgocore.api.model.schedule.views.basic.DatedFlightBasicView;
import com.afklm.cargo.cgocore.api.model.schedule.views.full.DatedFlightFullView;
import com.afklm.cargo.cgocore.components.mapper.schedule.forms.DatedFlightFormMapper;
import com.afklm.cargo.cgocore.components.mapper.schedule.views.basic.DatedFlightBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.schedule.views.full.DatedFlightFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.schedule.DatedFlightProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.schedule.DatedFlightRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.schedule.DatedFlightStateManager;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight;
import com.afklm.cargo.cgocore.persistence.interfaces.schedule.DatedFlightDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBaseServiceImpl implements DatedFlightBaseService {

/*
 * properties injected by spring
 */
@Inject
protected DatedFlightDao datedFlightDao;
@Inject
protected DatedFlightFullViewMapper datedFlightFullViewMapper;
@Inject
protected DatedFlightBasicViewMapper datedFlightBasicViewMapper;
@Inject
protected DatedFlightFormMapper datedFlightFormMapper;
@Inject
protected DatedFlightStateManager datedFlightStateManager;
@Inject
protected DatedFlightRightsManager datedFlightRightsManager;
@Inject
protected DatedFlightProcessor datedFlightProcessor;

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<DatedFlightBasicView> loadList() {
datedFlightRightsManager.checkCanAccess();
List<DatedFlight> datedFlightList = datedFlightDao.loadListEagerly();
List<DatedFlightBasicView> result = new ArrayList<>(datedFlightList.size());
for (DatedFlight datedFlight : datedFlightList) {
result.add(this.datedFlightBasicViewMapper.mapFrom(new DatedFlightBasicView(),datedFlight));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<DatedFlightBasicView> scroll(ScrollForm<DatedFlightFilter, DatedFlightSorting> form) {
datedFlightRightsManager.checkCanAccess();
ScrollView<DatedFlightBasicView> result = new ScrollView<>();
result.setSize(datedFlightDao.count());
Long count = datedFlightDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<DatedFlight> list = datedFlightDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<DatedFlightBasicView> elements = new ArrayList<>(list.size());
for (DatedFlight datedFlight : list) {
elements.add(this.datedFlightBasicViewMapper.mapFrom(new DatedFlightBasicView(),datedFlight));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public DatedFlightFullView load(Integer id) {
DatedFlight datedFlight = datedFlightDao.load(id);
datedFlightRightsManager.checkCanAccess(datedFlight);
return this.datedFlightFullViewMapper.mapFrom(new DatedFlightFullView(),datedFlight);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public DatedFlightFullView find(String companyIataCode, String flightNumber, LocalDate departureDate) {
DatedFlight datedFlight = datedFlightDao.find(companyIataCode, flightNumber, departureDate);
datedFlightRightsManager.checkCanAccess(datedFlight);
return this.datedFlightFullViewMapper.mapFrom(new DatedFlightFullView(), datedFlight);
}

/**
 * create object
 */
@Override
public DatedFlightFullView create() {
datedFlightRightsManager.checkCanCreate();
return new DatedFlightFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Integer save(DatedFlightForm datedFlightForm) {
DatedFlight datedFlight = this.datedFlightFormMapper.mapTo(datedFlightForm, new DatedFlight());
datedFlightRightsManager.checkCanSave(datedFlight);
datedFlightStateManager.checkCanSave(datedFlight);
return datedFlightProcessor.save(datedFlight);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Integer id, DatedFlightForm datedFlightForm) {
DatedFlight datedFlight = this.datedFlightDao.load(id);
datedFlightRightsManager.checkCanUpdate(datedFlight);
datedFlightStateManager.checkCanUpdate(datedFlight);
datedFlight = this.datedFlightFormMapper.mapTo(datedFlightForm, datedFlight);
datedFlightProcessor.update(datedFlight);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Integer id) {
DatedFlight datedFlight = datedFlightDao.load(id);
datedFlightRightsManager.checkCanDelete(datedFlight);
datedFlightStateManager.checkCanDelete(datedFlight);
datedFlightProcessor.delete(datedFlight);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Integer> idList) {
DatedFlight datedFlight;
if (idList != null){
for (Integer id:idList){
datedFlight = datedFlightDao.load(id);
datedFlightRightsManager.checkCanDelete(datedFlight);
datedFlightStateManager.checkCanDelete(datedFlight);
datedFlightProcessor.delete(datedFlight);
}
}
}

}
