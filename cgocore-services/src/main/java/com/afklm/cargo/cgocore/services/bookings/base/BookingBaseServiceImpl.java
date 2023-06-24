package com.afklm.cargo.cgocore.services.bookings.base;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.bookings.base.BookingBaseService;
import com.afklm.cargo.cgocore.api.model.bookings.filters.BookingFilter;
import com.afklm.cargo.cgocore.api.model.bookings.forms.BookingForm;
import com.afklm.cargo.cgocore.api.model.bookings.sortings.BookingSorting;
import com.afklm.cargo.cgocore.api.model.bookings.views.basic.BookingBasicView;
import com.afklm.cargo.cgocore.api.model.bookings.views.full.BookingFullView;
import com.afklm.cargo.cgocore.components.mapper.bookings.forms.BookingFormMapper;
import com.afklm.cargo.cgocore.components.mapper.bookings.views.basic.BookingBasicViewMapper;
import com.afklm.cargo.cgocore.components.mapper.bookings.views.full.BookingFullViewMapper;
import com.afklm.cargo.cgocore.components.processor.bookings.BookingProcessor;
import com.afklm.cargo.cgocore.components.rightsmanager.bookings.BookingRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.bookings.BookingStateManager;
import com.afklm.cargo.cgocore.model.bookings.Booking;
import com.afklm.cargo.cgocore.persistence.interfaces.bookings.BookingDao;

/**
 * auto generated base service class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class BookingBaseServiceImpl implements BookingBaseService {

/*
 * properties injected by spring
 */
@Inject
protected BookingDao bookingDao;
@Inject
protected BookingFullViewMapper bookingFullViewMapper;
@Inject
protected BookingBasicViewMapper bookingBasicViewMapper;
@Inject
protected BookingFormMapper bookingFormMapper;
@Inject
protected BookingStateManager bookingStateManager;
@Inject
protected BookingRightsManager bookingRightsManager;
@Inject
protected BookingProcessor bookingProcessor;

/**
 * load object list
 */
@Override
@Transactional(readOnly=true)
public List<BookingBasicView> loadList() {
bookingRightsManager.checkCanAccess();
List<Booking> bookingList = bookingDao.loadListEagerly();
List<BookingBasicView> result = new ArrayList<>(bookingList.size());
for (Booking booking : bookingList) {
result.add(this.bookingBasicViewMapper.mapFrom(new BookingBasicView(),booking));
}
return result;
}

/**
 * scroll object list
 */
@Override
@Transactional(readOnly=true)
public ScrollView<BookingBasicView> scroll(ScrollForm<BookingFilter, BookingSorting> form) {
bookingRightsManager.checkCanAccess();
ScrollView<BookingBasicView> result = new ScrollView<>();
result.setSize(bookingDao.count());
Long count = bookingDao.count(form.getFilter());
result.setCount(count);
result.setNumberOfPages(count/form.getElementsPerPage() + ((count%form.getElementsPerPage()) > 0L?1L:0L));
result.setCurrentPage(Math.max(1L, Math.min(form.getPage()!=null?form.getPage():1L, result.getNumberOfPages())));
List<Booking> list = bookingDao.scroll(form.getFilter(), form.getSorting(),(result.getCurrentPage()-1)*form.getElementsPerPage(), form.getElementsPerPage());
List<BookingBasicView> elements = new ArrayList<>(list.size());
for (Booking booking : list) {
elements.add(this.bookingBasicViewMapper.mapFrom(new BookingBasicView(),booking));
}
result.setElements(elements);
return result;
}

/**
 * load object
 */
@Override
@Transactional(readOnly=true)
public BookingFullView load(Long id) {
Booking booking = bookingDao.load(id);
bookingRightsManager.checkCanAccess(booking);
return this.bookingFullViewMapper.mapFrom(new BookingFullView(),booking);
}

/**
 * find object
 */
@Override
@Transactional(readOnly=true)
public BookingFullView find(String airWaybillAirWaybillNumber) {
Booking booking = bookingDao.find(airWaybillAirWaybillNumber);
bookingRightsManager.checkCanAccess(booking);
return this.bookingFullViewMapper.mapFrom(new BookingFullView(), booking);
}

/**
 * create object
 */
@Override
public BookingFullView create() {
bookingRightsManager.checkCanCreate();
return new BookingFullView();
}

/**
 * save object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public Long save(BookingForm bookingForm) {
Booking booking = this.bookingFormMapper.mapTo(bookingForm, new Booking());
bookingRightsManager.checkCanSave(booking);
bookingStateManager.checkCanSave(booking);
return bookingProcessor.save(booking);
}

/**
 * update object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void update(Long id, BookingForm bookingForm) {
Booking booking = this.bookingDao.load(id);
bookingRightsManager.checkCanUpdate(booking);
bookingStateManager.checkCanUpdate(booking);
booking = this.bookingFormMapper.mapTo(bookingForm, booking);
bookingProcessor.update(booking);
}

/**
 * delete object
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void delete(Long id) {
Booking booking = bookingDao.load(id);
bookingRightsManager.checkCanDelete(booking);
bookingStateManager.checkCanDelete(booking);
bookingProcessor.delete(booking);
}

/**
 * delete object list
 */
@Override
@Transactional(rollbackFor=Exception.class)
public void deleteList(List<Long> idList) {
Booking booking;
if (idList != null){
for (Long id:idList){
booking = bookingDao.load(id);
bookingRightsManager.checkCanDelete(booking);
bookingStateManager.checkCanDelete(booking);
bookingProcessor.delete(booking);
}
}
}

}
