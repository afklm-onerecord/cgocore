package com.afklm.cargo.cgocore.components.processor.bookings.base;

import javax.inject.Inject;

import com.afklm.cargo.cgocore.model.bookings.DatedFlightBooking;
import com.afklm.cargo.cgocore.persistence.interfaces.bookings.DatedFlightBookingDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBookingBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected DatedFlightBookingDao datedFlightBookingDao;

/**
 * process save
 */
public Integer save(DatedFlightBooking datedFlightBooking) {
return datedFlightBookingDao.save(datedFlightBooking);
}

/**
 * process update
 */
public void update(DatedFlightBooking datedFlightBooking) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(DatedFlightBooking datedFlightBooking) {
datedFlightBookingDao.delete(datedFlightBooking);
}

}
