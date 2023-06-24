package com.afklm.cargo.cgocore.api.interfaces.bookings.base;

import java.time.LocalDate;
import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;

import com.afklm.cargo.cgocore.api.model.bookings.filters.DatedFlightBookingFilter;
import com.afklm.cargo.cgocore.api.model.bookings.forms.DatedFlightBookingForm;
import com.afklm.cargo.cgocore.api.model.bookings.sortings.DatedFlightBookingSorting;
import com.afklm.cargo.cgocore.api.model.bookings.views.basic.DatedFlightBookingBasicView;
import com.afklm.cargo.cgocore.api.model.bookings.views.full.DatedFlightBookingFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface DatedFlightBookingBaseService {

/**
 * load object list
 */
List<DatedFlightBookingBasicView> loadList();
public static final String GET_LIST_URL = "/dated-flight-booking/list";

/**
 * load object list from datedFlight
 */
List<DatedFlightBookingBasicView> loadListFromDatedFlight (Integer datedFlightId);
public static final String GET_LIST_FROM_DATED_FLIGHT_URL = "/dated-flight/{datedFlightId}/dated-flight-booking/list";

/**
 * load object list from booking
 */
List<DatedFlightBookingBasicView> loadListFromBooking (Long bookingId);
public static final String GET_LIST_FROM_BOOKING_URL = "/booking/{bookingId}/dated-flight-booking/list";

/**
 * scroll object list
 */
ScrollView<DatedFlightBookingBasicView> scroll(ScrollForm<DatedFlightBookingFilter, DatedFlightBookingSorting> form);
public static final String SCROLL_URL = "/dated-flight-booking/scroll";

/**
 * scroll object list from datedFlight
 */
ScrollView<DatedFlightBookingBasicView> scrollFromDatedFlight (Integer datedFlightId, ScrollForm<DatedFlightBookingFilter, DatedFlightBookingSorting> form);
public static final String SCROLL_FROM_DATED_FLIGHT_URL = "/dated-flight/{datedFlightId}/dated-flight-booking/scroll";

/**
 * scroll object list from booking
 */
ScrollView<DatedFlightBookingBasicView> scrollFromBooking (Long bookingId, ScrollForm<DatedFlightBookingFilter, DatedFlightBookingSorting> form);
public static final String SCROLL_FROM_BOOKING_URL = "/booking/{bookingId}/dated-flight-booking/scroll";

/**
 * load object
 */
DatedFlightBookingFullView load(Integer id);
public static final String GET_URL = "/dated-flight-booking/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/dated-flight-booking/find";
DatedFlightBookingFullView find(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String bookingAirWaybillAirWaybillNumber);

/**
 * create object
 */
DatedFlightBookingFullView create();
public static final String GET_NEW_URL = "/dated-flight-booking/new";

/**
 * save object
 */
Integer save(DatedFlightBookingForm datedFlightBookingForm);
public static final String SAVE_URL = "/dated-flight-booking";

/**
 * update object
 */
void update(Integer id, DatedFlightBookingForm datedFlightBookingForm);
public static final String UPDATE_URL = "/dated-flight-booking/{id}";

/**
 * delete object
 */
void delete(Integer id);
public static final String DELETE_URL = "/dated-flight-booking/{id}";

/**
 * delete object list
 */
void deleteList(List<Integer> idList);
public static final String DELETE_LIST_URL = "/dated-flight-booking/delete";

}
