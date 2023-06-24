package com.afklm.cargo.cgocore.persistence.interfaces.loading.base;
import java.time.LocalDate;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.loading.filters.DatedFlightUldFilter;
import com.afklm.cargo.cgocore.api.model.loading.sortings.DatedFlightUldSorting;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface DatedFlightUldBaseDao extends BaseDao<DatedFlightUld, Integer> {

/**
 * load object list from datedFlight
 */
List<DatedFlightUld> loadListFromDatedFlight(Integer datedFlightId);

/**
 * load object list eagerly from datedFlight
 */
List<DatedFlightUld> loadListEagerlyFromDatedFlight(Integer datedFlightId);

/**
 * count filtered object list
 */
Long count(DatedFlightUldFilter filter);

/**
 * count object list from datedFlight
 */
Long countFromDatedFlight(Integer datedFlightId);

/**
 * count filtered object list from datedFlight
 */
Long countFromDatedFlight(Integer datedFlightId, DatedFlightUldFilter filter);

/**
 * scroll filtered object list
 */
List<DatedFlightUld> scroll(DatedFlightUldFilter filter, DatedFlightUldSorting sorting, Long firstResult, Long maxResults);

/**
 * scroll filtered object from datedFlight
 */
List<DatedFlightUld> scrollFromDatedFlight(Integer datedFlightId, DatedFlightUldFilter filter, DatedFlightUldSorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String uldTypeCode, String uldCode, String uldOwnerCode);

/**
 * find object or null
 */
DatedFlightUld findOrNull(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String uldTypeCode, String uldCode, String uldOwnerCode);

/**
 * find object
 */
DatedFlightUld find(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String uldTypeCode, String uldCode, String uldOwnerCode);

}
