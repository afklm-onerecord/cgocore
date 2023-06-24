package com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.base;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.reference.localization.filters.StationFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.StationSorting;
import com.afklm.cargo.cgocore.model.reference.localization.Station;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface StationBaseDao extends BaseDao<Station, Integer> {

/**
 * load object list from country
 */
List<Station> loadListFromCountry(Integer countryId);

/**
 * load object list eagerly from country
 */
List<Station> loadListEagerlyFromCountry(Integer countryId);

/**
 * count filtered object list
 */
Long count(StationFilter filter);

/**
 * count object list from country
 */
Long countFromCountry(Integer countryId);

/**
 * count filtered object list from country
 */
Long countFromCountry(Integer countryId, StationFilter filter);

/**
 * scroll filtered object list
 */
List<Station> scroll(StationFilter filter, StationSorting sorting, Long firstResult, Long maxResults);

/**
 * scroll filtered object from country
 */
List<Station> scrollFromCountry(Integer countryId, StationFilter filter, StationSorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String iataCode);

/**
 * find object or null
 */
Station findOrNull(String iataCode);

/**
 * find object
 */
Station find(String iataCode);

/**
 * search
 */
List<Station> search(String arg);

}
