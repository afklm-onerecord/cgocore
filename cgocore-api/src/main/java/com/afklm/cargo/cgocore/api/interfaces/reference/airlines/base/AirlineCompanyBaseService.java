package com.afklm.cargo.cgocore.api.interfaces.reference.airlines.base;

import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;

import com.afklm.cargo.cgocore.api.model.reference.airlines.filters.AirlineCompanyFilter;
import com.afklm.cargo.cgocore.api.model.reference.airlines.forms.AirlineCompanyForm;
import com.afklm.cargo.cgocore.api.model.reference.airlines.sortings.AirlineCompanySorting;
import com.afklm.cargo.cgocore.api.model.reference.airlines.views.basic.AirlineCompanyBasicView;
import com.afklm.cargo.cgocore.api.model.reference.airlines.views.full.AirlineCompanyFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface AirlineCompanyBaseService {

/**
 * search options
 */
List<SelectItem> searchOptions(String arg);
public static final String SEARCH_OPTIONS_URL = "/airline-company/options/search";

/**
 * load object list
 */
List<AirlineCompanyBasicView> loadList();
public static final String GET_LIST_URL = "/airline-company/list";

/**
 * scroll object list
 */
ScrollView<AirlineCompanyBasicView> scroll(ScrollForm<AirlineCompanyFilter, AirlineCompanySorting> form);
public static final String SCROLL_URL = "/airline-company/scroll";

/**
 * load object
 */
AirlineCompanyFullView load(Integer id);
public static final String GET_URL = "/airline-company/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/airline-company/find";
AirlineCompanyFullView find(String iataCode);

/**
 * create object
 */
AirlineCompanyFullView create();
public static final String GET_NEW_URL = "/airline-company/new";

/**
 * save object
 */
Integer save(AirlineCompanyForm airlineCompanyForm);
public static final String SAVE_URL = "/airline-company";

/**
 * update object
 */
void update(Integer id, AirlineCompanyForm airlineCompanyForm);
public static final String UPDATE_URL = "/airline-company/{id}";

/**
 * delete object
 */
void delete(Integer id);
public static final String DELETE_URL = "/airline-company/{id}";

/**
 * delete object list
 */
void deleteList(List<Integer> idList);
public static final String DELETE_LIST_URL = "/airline-company/delete";

}
