package com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.base;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.MetricFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.MetricSorting;
import com.afklm.cargo.cgocore.model.reference.commodities.Metric;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface MetricBaseDao extends BaseDao<Metric, Integer> {

/**
 * count filtered object list
 */
Long count(MetricFilter filter);

/**
 * scroll filtered object list
 */
List<Metric> scroll(MetricFilter filter, MetricSorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String code);

/**
 * find object or null
 */
Metric findOrNull(String code);

/**
 * find object
 */
Metric find(String code);

}
