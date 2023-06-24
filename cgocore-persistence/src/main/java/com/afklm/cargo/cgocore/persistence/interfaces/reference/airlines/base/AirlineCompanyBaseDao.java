package com.afklm.cargo.cgocore.persistence.interfaces.reference.airlines.base;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.reference.airlines.filters.AirlineCompanyFilter;
import com.afklm.cargo.cgocore.api.model.reference.airlines.sortings.AirlineCompanySorting;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface AirlineCompanyBaseDao extends BaseDao<AirlineCompany, Integer> {

/**
 * count filtered object list
 */
Long count(AirlineCompanyFilter filter);

/**
 * scroll filtered object list
 */
List<AirlineCompany> scroll(AirlineCompanyFilter filter, AirlineCompanySorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String iataCode);

/**
 * find object or null
 */
AirlineCompany findOrNull(String iataCode);

/**
 * find object
 */
AirlineCompany find(String iataCode);

/**
 * search
 */
List<AirlineCompany> search(String arg);

}
