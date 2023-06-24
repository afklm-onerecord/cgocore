package com.afklm.cargo.cgocore.api.interfaces.schedule.base;

import java.time.LocalDate;
import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;

import com.afklm.cargo.cgocore.api.model.schedule.filters.DatedFlightFilter;
import com.afklm.cargo.cgocore.api.model.schedule.forms.DatedFlightForm;
import com.afklm.cargo.cgocore.api.model.schedule.sortings.DatedFlightSorting;
import com.afklm.cargo.cgocore.api.model.schedule.views.basic.DatedFlightBasicView;
import com.afklm.cargo.cgocore.api.model.schedule.views.full.DatedFlightFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface DatedFlightBaseService {

/**
 * load object list
 */
List<DatedFlightBasicView> loadList();
public static final String GET_LIST_URL = "/dated-flight/list";

/**
 * scroll object list
 */
ScrollView<DatedFlightBasicView> scroll(ScrollForm<DatedFlightFilter, DatedFlightSorting> form);
public static final String SCROLL_URL = "/dated-flight/scroll";

/**
 * load object
 */
DatedFlightFullView load(Integer id);
public static final String GET_URL = "/dated-flight/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/dated-flight/find";
DatedFlightFullView find(String companyIataCode, String flightNumber, LocalDate departureDate);

/**
 * create object
 */
DatedFlightFullView create();
public static final String GET_NEW_URL = "/dated-flight/new";

/**
 * save object
 */
Integer save(DatedFlightForm datedFlightForm);
public static final String SAVE_URL = "/dated-flight";

/**
 * update object
 */
void update(Integer id, DatedFlightForm datedFlightForm);
public static final String UPDATE_URL = "/dated-flight/{id}";

/**
 * delete object
 */
void delete(Integer id);
public static final String DELETE_URL = "/dated-flight/{id}";

/**
 * delete object list
 */
void deleteList(List<Integer> idList);
public static final String DELETE_LIST_URL = "/dated-flight/delete";

}
