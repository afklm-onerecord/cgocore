package com.afklm.cargo.cgocore.api.interfaces.reference.localization.base;

import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;

import com.afklm.cargo.cgocore.api.model.reference.localization.filters.CountryFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.forms.CountryForm;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.CountrySorting;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.basic.CountryBasicView;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.full.CountryFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface CountryBaseService {

/**
 * search options
 */
List<SelectItem> searchOptions(String arg);
public static final String SEARCH_OPTIONS_URL = "/country/options/search";

/**
 * load object list
 */
List<CountryBasicView> loadList();
public static final String GET_LIST_URL = "/country/list";

/**
 * scroll object list
 */
ScrollView<CountryBasicView> scroll(ScrollForm<CountryFilter, CountrySorting> form);
public static final String SCROLL_URL = "/country/scroll";

/**
 * load object
 */
CountryFullView load(Integer id);
public static final String GET_URL = "/country/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/country/find";
CountryFullView find(String iataCode);

/**
 * create object
 */
CountryFullView create();
public static final String GET_NEW_URL = "/country/new";

/**
 * save object
 */
Integer save(CountryForm countryForm);
public static final String SAVE_URL = "/country";

/**
 * update object
 */
void update(Integer id, CountryForm countryForm);
public static final String UPDATE_URL = "/country/{id}";

/**
 * delete object
 */
void delete(Integer id);
public static final String DELETE_URL = "/country/{id}";

/**
 * delete object list
 */
void deleteList(List<Integer> idList);
public static final String DELETE_LIST_URL = "/country/delete";

}
