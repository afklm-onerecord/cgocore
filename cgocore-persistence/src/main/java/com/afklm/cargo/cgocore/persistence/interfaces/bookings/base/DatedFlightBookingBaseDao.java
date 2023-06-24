package com.afklm.cargo.cgocore.persistence.interfaces.bookings.base;
import java.time.LocalDate;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.bookings.filters.DatedFlightBookingFilter;
import com.afklm.cargo.cgocore.api.model.bookings.sortings.DatedFlightBookingSorting;
import com.afklm.cargo.cgocore.model.bookings.DatedFlightBooking;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface DatedFlightBookingBaseDao extends BaseDao<DatedFlightBooking, Integer> {

/**
 * load object list from datedFlight
 */
List<DatedFlightBooking> loadListFromDatedFlight(Integer datedFlightId);

/**
 * load object list eagerly from datedFlight
 */
List<DatedFlightBooking> loadListEagerlyFromDatedFlight(Integer datedFlightId);

/**
 * load object list from booking
 */
List<DatedFlightBooking> loadListFromBooking(Long bookingId);

/**
 * load object list eagerly from booking
 */
List<DatedFlightBooking> loadListEagerlyFromBooking(Long bookingId);

/**
 * count filtered object list
 */
Long count(DatedFlightBookingFilter filter);

/**
 * count object list from datedFlight
 */
Long countFromDatedFlight(Integer datedFlightId);

/**
 * count filtered object list from datedFlight
 */
Long countFromDatedFlight(Integer datedFlightId, DatedFlightBookingFilter filter);

/**
 * count object list from booking
 */
Long countFromBooking(Long bookingId);

/**
 * count filtered object list from booking
 */
Long countFromBooking(Long bookingId, DatedFlightBookingFilter filter);

/**
 * scroll filtered object list
 */
List<DatedFlightBooking> scroll(DatedFlightBookingFilter filter, DatedFlightBookingSorting sorting, Long firstResult, Long maxResults);

/**
 * scroll filtered object from datedFlight
 */
List<DatedFlightBooking> scrollFromDatedFlight(Integer datedFlightId, DatedFlightBookingFilter filter, DatedFlightBookingSorting sorting, Long firstResult, Long maxResults);

/**
 * scroll filtered object from booking
 */
List<DatedFlightBooking> scrollFromBooking(Long bookingId, DatedFlightBookingFilter filter, DatedFlightBookingSorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String bookingAirWaybillAirWaybillNumber);

/**
 * find object or null
 */
DatedFlightBooking findOrNull(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String bookingAirWaybillAirWaybillNumber);

/**
 * find object
 */
DatedFlightBooking find(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String bookingAirWaybillAirWaybillNumber);

}
