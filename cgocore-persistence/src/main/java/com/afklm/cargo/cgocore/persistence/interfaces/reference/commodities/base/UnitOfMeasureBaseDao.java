package com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.base;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.UnitOfMeasureFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.UnitOfMeasureSorting;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface UnitOfMeasureBaseDao extends BaseDao<UnitOfMeasure, Integer> {

/**
 * count filtered object list
 */
Long count(UnitOfMeasureFilter filter);

/**
 * scroll filtered object list
 */
List<UnitOfMeasure> scroll(UnitOfMeasureFilter filter, UnitOfMeasureSorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String code);

/**
 * find object or null
 */
UnitOfMeasure findOrNull(String code);

/**
 * find object
 */
UnitOfMeasure find(String code);

}
