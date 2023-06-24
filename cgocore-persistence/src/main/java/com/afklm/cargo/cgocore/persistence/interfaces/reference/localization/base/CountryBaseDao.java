package com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.base;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.reference.localization.filters.CountryFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.CountrySorting;
import com.afklm.cargo.cgocore.model.reference.localization.Country;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface CountryBaseDao extends BaseDao<Country, Integer> {

/**
 * count filtered object list
 */
Long count(CountryFilter filter);

/**
 * scroll filtered object list
 */
List<Country> scroll(CountryFilter filter, CountrySorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String iataCode);

/**
 * find object or null
 */
Country findOrNull(String iataCode);

/**
 * find object
 */
Country find(String iataCode);

/**
 * search
 */
List<Country> search(String arg);

}
