package com.afklm.cargo.cgocore.components.processor.bookings.base;

import javax.inject.Inject;

import com.afklm.cargo.cgocore.model.bookings.Booking;
import com.afklm.cargo.cgocore.persistence.interfaces.bookings.BookingDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class BookingBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected BookingDao bookingDao;

/**
 * process save
 */
public Long save(Booking booking) {
return bookingDao.save(booking);
}

/**
 * process update
 */
public void update(Booking booking) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(Booking booking) {
bookingDao.delete(booking);
}

}
