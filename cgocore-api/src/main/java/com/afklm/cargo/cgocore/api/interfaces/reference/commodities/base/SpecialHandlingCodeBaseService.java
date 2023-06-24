package com.afklm.cargo.cgocore.api.interfaces.reference.commodities.base;

import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;

import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.SpecialHandlingCodeFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.SpecialHandlingCodeForm;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.SpecialHandlingCodeSorting;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.basic.SpecialHandlingCodeBasicView;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.full.SpecialHandlingCodeFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface SpecialHandlingCodeBaseService {

/**
 * get options
 */
List<SelectItem> getOptions();
public static final String GET_OPTIONS_URL = "/special-handling-code/options";

/**
 * load object list
 */
List<SpecialHandlingCodeBasicView> loadList();
public static final String GET_LIST_URL = "/special-handling-code/list";

/**
 * scroll object list
 */
ScrollView<SpecialHandlingCodeBasicView> scroll(ScrollForm<SpecialHandlingCodeFilter, SpecialHandlingCodeSorting> form);
public static final String SCROLL_URL = "/special-handling-code/scroll";

/**
 * load object
 */
SpecialHandlingCodeFullView load(Integer id);
public static final String GET_URL = "/special-handling-code/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/special-handling-code/find";
SpecialHandlingCodeFullView find(String code);

/**
 * create object
 */
SpecialHandlingCodeFullView create();
public static final String GET_NEW_URL = "/special-handling-code/new";

/**
 * save object
 */
Integer save(SpecialHandlingCodeForm specialHandlingCodeForm);
public static final String SAVE_URL = "/special-handling-code";

/**
 * update object
 */
void update(Integer id, SpecialHandlingCodeForm specialHandlingCodeForm);
public static final String UPDATE_URL = "/special-handling-code/{id}";

/**
 * delete object
 */
void delete(Integer id);
public static final String DELETE_URL = "/special-handling-code/{id}";

/**
 * delete object list
 */
void deleteList(List<Integer> idList);
public static final String DELETE_LIST_URL = "/special-handling-code/delete";

}
