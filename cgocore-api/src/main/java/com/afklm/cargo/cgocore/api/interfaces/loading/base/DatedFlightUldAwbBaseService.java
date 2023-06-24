package com.afklm.cargo.cgocore.api.interfaces.loading.base;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;

import com.afklm.cargo.cgocore.api.model.loading.filters.DatedFlightUldAwbFilter;
import com.afklm.cargo.cgocore.api.model.loading.forms.DatedFlightUldAwbForm;
import com.afklm.cargo.cgocore.api.model.loading.sortings.DatedFlightUldAwbSorting;
import com.afklm.cargo.cgocore.api.model.loading.views.basic.DatedFlightUldAwbBasicView;
import com.afklm.cargo.cgocore.api.model.loading.views.full.DatedFlightUldAwbFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface DatedFlightUldAwbBaseService {

/**
 * load object list
 */
List<DatedFlightUldAwbBasicView> loadList();
public static final String GET_LIST_URL = "/dated-flight-uld-awb/list";

/**
 * load object list from datedFlightUld
 */
List<DatedFlightUldAwbBasicView> loadListFromDatedFlightUld (Integer datedFlightUldId);
public static final String GET_LIST_FROM_DATED_FLIGHT_ULD_URL = "/dated-flight-uld/{datedFlightUldId}/dated-flight-uld-awb/list";

/**
 * scroll object list
 */
ScrollView<DatedFlightUldAwbBasicView> scroll(ScrollForm<DatedFlightUldAwbFilter, DatedFlightUldAwbSorting> form);
public static final String SCROLL_URL = "/dated-flight-uld-awb/scroll";

/**
 * scroll object list from datedFlightUld
 */
ScrollView<DatedFlightUldAwbBasicView> scrollFromDatedFlightUld (Integer datedFlightUldId, ScrollForm<DatedFlightUldAwbFilter, DatedFlightUldAwbSorting> form);
public static final String SCROLL_FROM_DATED_FLIGHT_ULD_URL = "/dated-flight-uld/{datedFlightUldId}/dated-flight-uld-awb/scroll";

/**
 * load object
 */
DatedFlightUldAwbFullView load(Integer id);
public static final String GET_URL = "/dated-flight-uld-awb/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/dated-flight-uld-awb/find";
DatedFlightUldAwbFullView find(String datedFlightUldDatedFlightCompanyIataCode, String datedFlightUldDatedFlightFlightNumber, LocalDate datedFlightUldDatedFlightDepartureDate, String datedFlightUldUldTypeCode, String datedFlightUldUldCode, String datedFlightUldUldOwnerCode, String airWaybillAirWaybillNumber, Integer numberOfPieces, BigDecimal grossWeight);

/**
 * create object
 */
DatedFlightUldAwbFullView create();
public static final String GET_NEW_URL = "/dated-flight-uld-awb/new";

/**
 * save object
 */
Integer save(DatedFlightUldAwbForm datedFlightUldAwbForm);
public static final String SAVE_URL = "/dated-flight-uld-awb";

/**
 * update object
 */
void update(Integer id, DatedFlightUldAwbForm datedFlightUldAwbForm);
public static final String UPDATE_URL = "/dated-flight-uld-awb/{id}";

/**
 * delete object
 */
void delete(Integer id);
public static final String DELETE_URL = "/dated-flight-uld-awb/{id}";

/**
 * delete object list
 */
void deleteList(List<Integer> idList);
public static final String DELETE_LIST_URL = "/dated-flight-uld-awb/delete";

}
