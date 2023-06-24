package com.afklm.cargo.cgocore.persistence.interfaces.schedule.base;
import java.time.LocalDate;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.schedule.filters.DatedFlightFilter;
import com.afklm.cargo.cgocore.api.model.schedule.sortings.DatedFlightSorting;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface DatedFlightBaseDao extends BaseDao<DatedFlight, Integer> {

/**
 * count filtered object list
 */
Long count(DatedFlightFilter filter);

/**
 * scroll filtered object list
 */
List<DatedFlight> scroll(DatedFlightFilter filter, DatedFlightSorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String companyIataCode, String flightNumber, LocalDate departureDate);

/**
 * find object or null
 */
DatedFlight findOrNull(String companyIataCode, String flightNumber, LocalDate departureDate);

/**
 * find object
 */
DatedFlight find(String companyIataCode, String flightNumber, LocalDate departureDate);

}
