package com.afklm.cargo.cgocore.api.interfaces.reference.commodities.base;

import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;

import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.UnitOfMeasureFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.UnitOfMeasureForm;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.UnitOfMeasureSorting;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.basic.UnitOfMeasureBasicView;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.full.UnitOfMeasureFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface UnitOfMeasureBaseService {

/**
 * get options
 */
List<SelectItem> getOptions();
public static final String GET_OPTIONS_URL = "/unit-of-measure/options";

/**
 * load object list
 */
List<UnitOfMeasureBasicView> loadList();
public static final String GET_LIST_URL = "/unit-of-measure/list";

/**
 * scroll object list
 */
ScrollView<UnitOfMeasureBasicView> scroll(ScrollForm<UnitOfMeasureFilter, UnitOfMeasureSorting> form);
public static final String SCROLL_URL = "/unit-of-measure/scroll";

/**
 * load object
 */
UnitOfMeasureFullView load(Integer id);
public static final String GET_URL = "/unit-of-measure/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/unit-of-measure/find";
UnitOfMeasureFullView find(String code);

/**
 * create object
 */
UnitOfMeasureFullView create();
public static final String GET_NEW_URL = "/unit-of-measure/new";

/**
 * save object
 */
Integer save(UnitOfMeasureForm unitOfMeasureForm);
public static final String SAVE_URL = "/unit-of-measure";

/**
 * update object
 */
void update(Integer id, UnitOfMeasureForm unitOfMeasureForm);
public static final String UPDATE_URL = "/unit-of-measure/{id}";

/**
 * delete object
 */
void delete(Integer id);
public static final String DELETE_URL = "/unit-of-measure/{id}";

/**
 * delete object list
 */
void deleteList(List<Integer> idList);
public static final String DELETE_LIST_URL = "/unit-of-measure/delete";

}
