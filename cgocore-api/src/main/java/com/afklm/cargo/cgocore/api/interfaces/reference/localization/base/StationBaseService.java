package com.afklm.cargo.cgocore.api.interfaces.reference.localization.base;

import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;

import com.afklm.cargo.cgocore.api.model.reference.localization.filters.StationFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.forms.StationForm;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.StationSorting;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.basic.StationBasicView;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.full.StationFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface StationBaseService {

/**
 * search options
 */
List<SelectItem> searchOptions(String arg);
public static final String SEARCH_OPTIONS_URL = "/station/options/search";

/**
 * load object list
 */
List<StationBasicView> loadList();
public static final String GET_LIST_URL = "/station/list";

/**
 * load object list from country
 */
List<StationBasicView> loadListFromCountry (Integer countryId);
public static final String GET_LIST_FROM_COUNTRY_URL = "/country/{countryId}/station/list";

/**
 * scroll object list
 */
ScrollView<StationBasicView> scroll(ScrollForm<StationFilter, StationSorting> form);
public static final String SCROLL_URL = "/station/scroll";

/**
 * scroll object list from country
 */
ScrollView<StationBasicView> scrollFromCountry (Integer countryId, ScrollForm<StationFilter, StationSorting> form);
public static final String SCROLL_FROM_COUNTRY_URL = "/country/{countryId}/station/scroll";

/**
 * load object
 */
StationFullView load(Integer id);
public static final String GET_URL = "/station/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/station/find";
StationFullView find(String iataCode);

/**
 * create object
 */
StationFullView create();
public static final String GET_NEW_URL = "/station/new";

/**
 * save object
 */
Integer save(StationForm stationForm);
public static final String SAVE_URL = "/station";

/**
 * update object
 */
void update(Integer id, StationForm stationForm);
public static final String UPDATE_URL = "/station/{id}";

/**
 * delete object
 */
void delete(Integer id);
public static final String DELETE_URL = "/station/{id}";

/**
 * delete object list
 */
void deleteList(List<Integer> idList);
public static final String DELETE_LIST_URL = "/station/delete";

}
