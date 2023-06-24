package com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.base;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.SpecialHandlingCodeFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.SpecialHandlingCodeSorting;
import com.afklm.cargo.cgocore.model.reference.commodities.SpecialHandlingCode;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface SpecialHandlingCodeBaseDao extends BaseDao<SpecialHandlingCode, Integer> {

/**
 * count filtered object list
 */
Long count(SpecialHandlingCodeFilter filter);

/**
 * scroll filtered object list
 */
List<SpecialHandlingCode> scroll(SpecialHandlingCodeFilter filter, SpecialHandlingCodeSorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String code);

/**
 * find object or null
 */
SpecialHandlingCode findOrNull(String code);

/**
 * find object
 */
SpecialHandlingCode find(String code);

}
