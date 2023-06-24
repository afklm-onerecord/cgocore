package com.afklm.cargo.cgocore.persistence.interfaces.shipments.base;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.shipments.filters.AirWaybillFilter;
import com.afklm.cargo.cgocore.api.model.shipments.sortings.AirWaybillSorting;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface AirWaybillBaseDao extends BaseDao<AirWaybill, Long> {

/**
 * count filtered object list
 */
Long count(AirWaybillFilter filter);

/**
 * scroll filtered object list
 */
List<AirWaybill> scroll(AirWaybillFilter filter, AirWaybillSorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String airWaybillNumber);

/**
 * find object or null
 */
AirWaybill findOrNull(String airWaybillNumber);

/**
 * find object
 */
AirWaybill find(String airWaybillNumber);

/**
 * search
 */
List<AirWaybill> search(String arg);

}
