package com.afklm.cargo.cgocore.persistence.interfaces.bookings.base;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.bookings.filters.BookingFilter;
import com.afklm.cargo.cgocore.api.model.bookings.sortings.BookingSorting;
import com.afklm.cargo.cgocore.model.bookings.Booking;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface BookingBaseDao extends BaseDao<Booking, Long> {

/**
 * count filtered object list
 */
Long count(BookingFilter filter);

/**
 * scroll filtered object list
 */
List<Booking> scroll(BookingFilter filter, BookingSorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String airWaybillAirWaybillNumber);

/**
 * find object or null
 */
Booking findOrNull(String airWaybillAirWaybillNumber);

/**
 * find object
 */
Booking find(String airWaybillAirWaybillNumber);

}
