package com.afklm.cargo.cgocore.services.bookings.base;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.bookings.base.DatedFlightBookingBaseService;
import com.afklm.cargo.cgocore.api.model.bookings.filters.DatedFlightBookingFilter;
import com.afklm.cargo.cgocore.api.model.bookings.forms.DatedFlightBookingForm;
import com.afklm.cargo.cgocore.api.model.bookings.sortings.DatedFlightBookingSorting;
import com.afklm.cargo.cgocore.api.model.bookings.views.basic.DatedFlightBookingBasicView;
import com.afklm.cargo.cgocore.api.model.bookings.views.full.DatedFlightBookingFullView;
import com.afklm.cargo.cgocore.components.mapper.bookings.forms.DatedFlightBookingFormMapper;
import com.afklm.cargo.cgocore.components.mapper.bookings.views.basic.DatedFlightBookingBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.bookings.views.full.DatedFlightBookingFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.bookings.DatedFlightBookingProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.bookings.DatedFlightBookingRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.bookings.DatedFlightBookingStateManager;
import com.afklm.cargo.cgocore.model.bookings.DatedFlightBooking;
import com.afklm.cargo.cgocore.persistence.interfaces.bookings.BookingDao;
import com.afklm.cargo.cgocore.persistence.interfaces.bookings.DatedFlightBookingDao;
import com.afklm.cargo.cgocore.persistence.interfaces.schedule.DatedFlightDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBookingBaseServiceImpl implements DatedFlightBookingBaseService {

/*
 * properties injected by spring
 */
@Inject
protected DatedFlightBookingDao datedFlightBookingDao;
@Inject
protected DatedFlightDao datedFlightDao;
@Inject
protected BookingDao bookingDao;
@Inject
protected DatedFlightBookingFullViewMapper datedFlightBookingFullViewMapper;
@Inject
protected DatedFlightBookingBasicViewMapper datedFlightBookingBasicViewMapper;
@Inject
protected DatedFlightBookingFormMapper datedFlightBookingFormMapper;
@Inject
protected DatedFlightBookingStateManager datedFlightBookingStateManager;
@Inject
protected DatedFlightBookingRightsManager datedFlightBookingRightsManager;
@Inject
protected DatedFlightBookingProcessor datedFlightBookingProcessor;

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<DatedFlightBookingBasicView> loadList() {
datedFlightBookingRightsManager.checkCanAccess();
List<DatedFlightBooking> datedFlightBookingList = datedFlightBookingDao.loadListEagerly();
List<DatedFlightBookingBasicView> result = new ArrayList<>(datedFlightBookingList.size());
for (DatedFlightBooking datedFlightBooking : datedFlightBookingList) {
result.add(this.datedFlightBookingBasicViewMapper.mapFrom(new DatedFlightBookingBasicView(),datedFlightBooking));
}
return result;
}

/**
 * load object list from datedFlight
 */
@Override
@Transactional(readOnly=true)
public List<DatedFlightBookingBasicView> loadListFromDatedFlight (Integer datedFlightId) {
datedFlightBookingRightsManager.checkCanAccess();
List<DatedFlightBooking> datedFlightBookingList = datedFlightBookingDao.loadListEagerlyFromDatedFlight(datedFlightId);
List<DatedFlightBookingBasicView> result = new ArrayList<>(datedFlightBookingList.size());
for (DatedFlightBooking datedFlightBooking : datedFlightBookingList) {
result.add(this.datedFlightBookingBasicViewMapper.mapFrom(new DatedFlightBookingBasicView(),datedFlightBooking));
}
return result;
}

/**
 * load object list from booking
 */
@Override
@Transactional(readOnly=true)
public List<DatedFlightBookingBasicView> loadListFromBooking (Long bookingId) {
datedFlightBookingRightsManager.checkCanAccess();
List<DatedFlightBooking> datedFlightBookingList = datedFlightBookingDao.loadListEagerlyFromBooking(bookingId);
List<DatedFlightBookingBasicView> result = new ArrayList<>(datedFlightBookingList.size());
for (DatedFlightBooking datedFlightBooking : datedFlightBookingList) {
result.add(this.datedFlightBookingBasicViewMapper.mapFrom(new DatedFlightBookingBasicView(),datedFlightBooking));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<DatedFlightBookingBasicView> scroll(ScrollForm<DatedFlightBookingFilter, DatedFlightBookingSorting> form) {
datedFlightBookingRightsManager.checkCanAccess();
ScrollView<DatedFlightBookingBasicView> result = new ScrollView<>();
result.setSize(datedFlightBookingDao.count());
Long count = datedFlightBookingDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<DatedFlightBooking> list = datedFlightBookingDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<DatedFlightBookingBasicView> elements = new ArrayList<>(list.size());
for (DatedFlightBooking datedFlightBooking : list) {
elements.add(this.datedFlightBookingBasicViewMapper.mapFrom(new DatedFlightBookingBasicView(),datedFlightBooking));
}
result.setElements(elements);
return result;
}

/**
 * scroll object list from datedFlight
 */
@Override
@Transactional(readOnly=true)
public ScrollView<DatedFlightBookingBasicView> scrollFromDatedFlight (Integer datedFlightId, ScrollForm<DatedFlightBookingFilter, DatedFlightBookingSorting> form) {
datedFlightBookingRightsManager.checkCanAccess();
ScrollView<DatedFlightBookingBasicView> result = new ScrollView<>();
result.setSize(datedFlightBookingDao.countFromDatedFlight(datedFlightId));
Long count = datedFlightBookingDao.countFromDatedFlight(datedFlightId, form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<DatedFlightBooking> list = datedFlightBookingDao.scrollFromDatedFlight(datedFlightId, form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<DatedFlightBookingBasicView> elements = new ArrayList<>(list.size());
for (DatedFlightBooking datedFlightBooking : list) {
elements.add(this.datedFlightBookingBasicViewMapper.mapFrom(new DatedFlightBookingBasicView(),datedFlightBooking));
}
result.setElements(elements);
return result;
}

/**
 * scroll object list from booking
 */
@Override
@Transactional(readOnly=true)
public ScrollView<DatedFlightBookingBasicView> scrollFromBooking (Long bookingId, ScrollForm<DatedFlightBookingFilter, DatedFlightBookingSorting> form) {
datedFlightBookingRightsManager.checkCanAccess();
ScrollView<DatedFlightBookingBasicView> result = new ScrollView<>();
result.setSize(datedFlightBookingDao.countFromBooking(bookingId));
Long count = datedFlightBookingDao.countFromBooking(bookingId, form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<DatedFlightBooking> list = datedFlightBookingDao.scrollFromBooking(bookingId, form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<DatedFlightBookingBasicView> elements = new ArrayList<>(list.size());
for (DatedFlightBooking datedFlightBooking : list) {
elements.add(this.datedFlightBookingBasicViewMapper.mapFrom(new DatedFlightBookingBasicView(),datedFlightBooking));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public DatedFlightBookingFullView load(Integer id) {
DatedFlightBooking datedFlightBooking = datedFlightBookingDao.load(id);
datedFlightBookingRightsManager.checkCanAccess(datedFlightBooking);
return this.datedFlightBookingFullViewMapper.mapFrom(new DatedFlightBookingFullView(),datedFlightBooking);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public DatedFlightBookingFullView find(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String bookingAirWaybillAirWaybillNumber) {
DatedFlightBooking datedFlightBooking = datedFlightBookingDao.find(datedFlightCompanyIataCode, datedFlightFlightNumber, datedFlightDepartureDate, bookingAirWaybillAirWaybillNumber);
datedFlightBookingRightsManager.checkCanAccess(datedFlightBooking);
return this.datedFlightBookingFullViewMapper.mapFrom(new DatedFlightBookingFullView(), datedFlightBooking);
}

/**
 * create object
 */
@Override
public DatedFlightBookingFullView create() {
datedFlightBookingRightsManager.checkCanCreate();
return new DatedFlightBookingFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Integer save(DatedFlightBookingForm datedFlightBookingForm) {
DatedFlightBooking datedFlightBooking = this.datedFlightBookingFormMapper.mapTo(datedFlightBookingForm, new DatedFlightBooking());
datedFlightBookingRightsManager.checkCanSave(datedFlightBooking);
datedFlightBookingStateManager.checkCanSave(datedFlightBooking);
return datedFlightBookingProcessor.save(datedFlightBooking);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Integer id, DatedFlightBookingForm datedFlightBookingForm) {
DatedFlightBooking datedFlightBooking = this.datedFlightBookingDao.load(id);
datedFlightBookingRightsManager.checkCanUpdate(datedFlightBooking);
datedFlightBookingStateManager.checkCanUpdate(datedFlightBooking);
datedFlightBooking = this.datedFlightBookingFormMapper.mapTo(datedFlightBookingForm, datedFlightBooking);
datedFlightBookingProcessor.update(datedFlightBooking);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Integer id) {
DatedFlightBooking datedFlightBooking = datedFlightBookingDao.load(id);
datedFlightBookingRightsManager.checkCanDelete(datedFlightBooking);
datedFlightBookingStateManager.checkCanDelete(datedFlightBooking);
datedFlightBookingProcessor.delete(datedFlightBooking);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Integer> idList) {
DatedFlightBooking datedFlightBooking;
if (idList != null){
for (Integer id:idList){
datedFlightBooking = datedFlightBookingDao.load(id);
datedFlightBookingRightsManager.checkCanDelete(datedFlightBooking);
datedFlightBookingStateManager.checkCanDelete(datedFlightBooking);
datedFlightBookingProcessor.delete(datedFlightBooking);
}
}
}

}
