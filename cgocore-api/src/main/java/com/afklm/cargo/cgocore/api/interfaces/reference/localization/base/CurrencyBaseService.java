package com.afklm.cargo.cgocore.api.interfaces.reference.localization.base;

import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;

import com.afklm.cargo.cgocore.api.model.reference.localization.filters.CurrencyFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.forms.CurrencyForm;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.CurrencySorting;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.basic.CurrencyBasicView;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.full.CurrencyFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface CurrencyBaseService {

/**
 * search options
 */
List<SelectItem> searchOptions(String arg);
public static final String SEARCH_OPTIONS_URL = "/currency/options/search";

/**
 * load object list
 */
List<CurrencyBasicView> loadList();
public static final String GET_LIST_URL = "/currency/list";

/**
 * scroll object list
 */
ScrollView<CurrencyBasicView> scroll(ScrollForm<CurrencyFilter, CurrencySorting> form);
public static final String SCROLL_URL = "/currency/scroll";

/**
 * load object
 */
CurrencyFullView load(Integer id);
public static final String GET_URL = "/currency/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/currency/find";
CurrencyFullView find(String isoCode);

/**
 * create object
 */
CurrencyFullView create();
public static final String GET_NEW_URL = "/currency/new";

/**
 * save object
 */
Integer save(CurrencyForm currencyForm);
public static final String SAVE_URL = "/currency";

/**
 * update object
 */
void update(Integer id, CurrencyForm currencyForm);
public static final String UPDATE_URL = "/currency/{id}";

/**
 * delete object
 */
void delete(Integer id);
public static final String DELETE_URL = "/currency/{id}";

/**
 * delete object list
 */
void deleteList(List<Integer> idList);
public static final String DELETE_LIST_URL = "/currency/delete";

}
