package com.afklm.cargo.cgocore.persistence.interfaces.reference.containers.base;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.reference.containers.filters.UldTypeFilter;
import com.afklm.cargo.cgocore.api.model.reference.containers.sortings.UldTypeSorting;
import com.afklm.cargo.cgocore.model.reference.containers.UldType;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface UldTypeBaseDao extends BaseDao<UldType, Integer> {

/**
 * count filtered object list
 */
Long count(UldTypeFilter filter);

/**
 * scroll filtered object list
 */
List<UldType> scroll(UldTypeFilter filter, UldTypeSorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String code);

/**
 * find object or null
 */
UldType findOrNull(String code);

/**
 * find object
 */
UldType find(String code);

}
