package com.afklm.cargo.cgocore.api.interfaces.bookings.base;

import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;

import com.afklm.cargo.cgocore.api.model.bookings.filters.BookingFilter;
import com.afklm.cargo.cgocore.api.model.bookings.forms.BookingForm;
import com.afklm.cargo.cgocore.api.model.bookings.sortings.BookingSorting;
import com.afklm.cargo.cgocore.api.model.bookings.views.basic.BookingBasicView;
import com.afklm.cargo.cgocore.api.model.bookings.views.full.BookingFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface BookingBaseService {

/**
 * load object list
 */
List<BookingBasicView> loadList();
public static final String GET_LIST_URL = "/booking/list";

/**
 * scroll object list
 */
ScrollView<BookingBasicView> scroll(ScrollForm<BookingFilter, BookingSorting> form);
public static final String SCROLL_URL = "/booking/scroll";

/**
 * load object
 */
BookingFullView load(Long id);
public static final String GET_URL = "/booking/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/booking/find";
BookingFullView find(String airWaybillAirWaybillNumber);

/**
 * create object
 */
BookingFullView create();
public static final String GET_NEW_URL = "/booking/new";

/**
 * save object
 */
Long save(BookingForm bookingForm);
public static final String SAVE_URL = "/booking";

/**
 * update object
 */
void update(Long id, BookingForm bookingForm);
public static final String UPDATE_URL = "/booking/{id}";

/**
 * delete object
 */
void delete(Long id);
public static final String DELETE_URL = "/booking/{id}";

/**
 * delete object list
 */
void deleteList(List<Long> idList);
public static final String DELETE_LIST_URL = "/booking/delete";

}
