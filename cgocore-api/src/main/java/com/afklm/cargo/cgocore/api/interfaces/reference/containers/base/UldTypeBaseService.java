package com.afklm.cargo.cgocore.api.interfaces.reference.containers.base;

import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;

import com.afklm.cargo.cgocore.api.model.reference.containers.filters.UldTypeFilter;
import com.afklm.cargo.cgocore.api.model.reference.containers.forms.UldTypeForm;
import com.afklm.cargo.cgocore.api.model.reference.containers.sortings.UldTypeSorting;
import com.afklm.cargo.cgocore.api.model.reference.containers.views.basic.UldTypeBasicView;
import com.afklm.cargo.cgocore.api.model.reference.containers.views.full.UldTypeFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface UldTypeBaseService {

/**
 * get options
 */
List<SelectItem> getOptions();
public static final String GET_OPTIONS_URL = "/uld-type/options";

/**
 * load object list
 */
List<UldTypeBasicView> loadList();
public static final String GET_LIST_URL = "/uld-type/list";

/**
 * scroll object list
 */
ScrollView<UldTypeBasicView> scroll(ScrollForm<UldTypeFilter, UldTypeSorting> form);
public static final String SCROLL_URL = "/uld-type/scroll";

/**
 * load object
 */
UldTypeFullView load(Integer id);
public static final String GET_URL = "/uld-type/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/uld-type/find";
UldTypeFullView find(String code);

/**
 * create object
 */
UldTypeFullView create();
public static final String GET_NEW_URL = "/uld-type/new";

/**
 * save object
 */
Integer save(UldTypeForm uldTypeForm);
public static final String SAVE_URL = "/uld-type";

/**
 * update object
 */
void update(Integer id, UldTypeForm uldTypeForm);
public static final String UPDATE_URL = "/uld-type/{id}";

/**
 * delete object
 */
void delete(Integer id);
public static final String DELETE_URL = "/uld-type/{id}";

/**
 * delete object list
 */
void deleteList(List<Integer> idList);
public static final String DELETE_LIST_URL = "/uld-type/delete";

}
