package com.afklm.cargo.cgocore.api.interfaces.loading.base;

import java.time.LocalDate;
import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;

import com.afklm.cargo.cgocore.api.model.loading.filters.DatedFlightUldFilter;
import com.afklm.cargo.cgocore.api.model.loading.forms.DatedFlightUldForm;
import com.afklm.cargo.cgocore.api.model.loading.sortings.DatedFlightUldSorting;
import com.afklm.cargo.cgocore.api.model.loading.views.basic.DatedFlightUldBasicView;
import com.afklm.cargo.cgocore.api.model.loading.views.full.DatedFlightUldFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface DatedFlightUldBaseService {

/**
 * load object list
 */
List<DatedFlightUldBasicView> loadList();
public static final String GET_LIST_URL = "/dated-flight-uld/list";

/**
 * load object list from datedFlight
 */
List<DatedFlightUldBasicView> loadListFromDatedFlight (Integer datedFlightId);
public static final String GET_LIST_FROM_DATED_FLIGHT_URL = "/dated-flight/{datedFlightId}/dated-flight-uld/list";

/**
 * scroll object list
 */
ScrollView<DatedFlightUldBasicView> scroll(ScrollForm<DatedFlightUldFilter, DatedFlightUldSorting> form);
public static final String SCROLL_URL = "/dated-flight-uld/scroll";

/**
 * scroll object list from datedFlight
 */
ScrollView<DatedFlightUldBasicView> scrollFromDatedFlight (Integer datedFlightId, ScrollForm<DatedFlightUldFilter, DatedFlightUldSorting> form);
public static final String SCROLL_FROM_DATED_FLIGHT_URL = "/dated-flight/{datedFlightId}/dated-flight-uld/scroll";

/**
 * load object
 */
DatedFlightUldFullView load(Integer id);
public static final String GET_URL = "/dated-flight-uld/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/dated-flight-uld/find";
DatedFlightUldFullView find(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String uldTypeCode, String uldCode, String uldOwnerCode);

/**
 * create object
 */
DatedFlightUldFullView create();
public static final String GET_NEW_URL = "/dated-flight-uld/new";

/**
 * save object
 */
Integer save(DatedFlightUldForm datedFlightUldForm);
public static final String SAVE_URL = "/dated-flight-uld";

/**
 * update object
 */
void update(Integer id, DatedFlightUldForm datedFlightUldForm);
public static final String UPDATE_URL = "/dated-flight-uld/{id}";

/**
 * delete object
 */
void delete(Integer id);
public static final String DELETE_URL = "/dated-flight-uld/{id}";

/**
 * delete object list
 */
void deleteList(List<Integer> idList);
public static final String DELETE_LIST_URL = "/dated-flight-uld/delete";

}
