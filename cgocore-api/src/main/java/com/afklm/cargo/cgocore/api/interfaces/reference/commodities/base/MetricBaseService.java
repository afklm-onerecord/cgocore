package com.afklm.cargo.cgocore.api.interfaces.reference.commodities.base;

import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;

import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.MetricFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.MetricForm;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.MetricSorting;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.basic.MetricBasicView;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.full.MetricFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface MetricBaseService {

/**
 * get options
 */
List<SelectItem> getOptions();
public static final String GET_OPTIONS_URL = "/metric/options";

/**
 * load object list
 */
List<MetricBasicView> loadList();
public static final String GET_LIST_URL = "/metric/list";

/**
 * scroll object list
 */
ScrollView<MetricBasicView> scroll(ScrollForm<MetricFilter, MetricSorting> form);
public static final String SCROLL_URL = "/metric/scroll";

/**
 * load object
 */
MetricFullView load(Integer id);
public static final String GET_URL = "/metric/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/metric/find";
MetricFullView find(String code);

/**
 * create object
 */
MetricFullView create();
public static final String GET_NEW_URL = "/metric/new";

/**
 * save object
 */
Integer save(MetricForm metricForm);
public static final String SAVE_URL = "/metric";

/**
 * update object
 */
void update(Integer id, MetricForm metricForm);
public static final String UPDATE_URL = "/metric/{id}";

/**
 * delete object
 */
void delete(Integer id);
public static final String DELETE_URL = "/metric/{id}";

/**
 * delete object list
 */
void deleteList(List<Integer> idList);
public static final String DELETE_LIST_URL = "/metric/delete";

}
