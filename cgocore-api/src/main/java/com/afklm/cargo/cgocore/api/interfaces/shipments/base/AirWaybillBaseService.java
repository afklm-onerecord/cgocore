package com.afklm.cargo.cgocore.api.interfaces.shipments.base;

import java.util.List;

import org.sklsft.commons.api.model.ScrollForm;
import org.sklsft.commons.api.model.ScrollView;
import org.sklsft.commons.api.model.SelectItem;

import com.afklm.cargo.cgocore.api.model.shipments.filters.AirWaybillFilter;
import com.afklm.cargo.cgocore.api.model.shipments.forms.AirWaybillForm;
import com.afklm.cargo.cgocore.api.model.shipments.sortings.AirWaybillSorting;
import com.afklm.cargo.cgocore.api.model.shipments.views.basic.AirWaybillBasicView;
import com.afklm.cargo.cgocore.api.model.shipments.views.full.AirWaybillFullView;

/**
 * auto generated base service interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface AirWaybillBaseService {

/**
 * search options
 */
List<SelectItem> searchOptions(String arg);
public static final String SEARCH_OPTIONS_URL = "/air-waybill/options/search";

/**
 * load object list
 */
List<AirWaybillBasicView> loadList();
public static final String GET_LIST_URL = "/air-waybill/list";

/**
 * scroll object list
 */
ScrollView<AirWaybillBasicView> scroll(ScrollForm<AirWaybillFilter, AirWaybillSorting> form);
public static final String SCROLL_URL = "/air-waybill/scroll";

/**
 * load object
 */
AirWaybillFullView load(Long id);
public static final String GET_URL = "/air-waybill/{id}";

/**
 * find object
 */
public static final String FIND_URL = "/air-waybill/find";
AirWaybillFullView find(String airWaybillNumber);

/**
 * create object
 */
AirWaybillFullView create();
public static final String GET_NEW_URL = "/air-waybill/new";

/**
 * save object
 */
Long save(AirWaybillForm airWaybillForm);
public static final String SAVE_URL = "/air-waybill";

/**
 * update object
 */
void update(Long id, AirWaybillForm airWaybillForm);
public static final String UPDATE_URL = "/air-waybill/{id}";

/**
 * delete object
 */
void delete(Long id);
public static final String DELETE_URL = "/air-waybill/{id}";

/**
 * delete object list
 */
void deleteList(List<Long> idList);
public static final String DELETE_LIST_URL = "/air-waybill/delete";

}
