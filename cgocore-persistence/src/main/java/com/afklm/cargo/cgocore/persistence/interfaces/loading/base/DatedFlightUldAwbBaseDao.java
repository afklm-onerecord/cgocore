package com.afklm.cargo.cgocore.persistence.interfaces.loading.base;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.loading.filters.DatedFlightUldAwbFilter;
import com.afklm.cargo.cgocore.api.model.loading.sortings.DatedFlightUldAwbSorting;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUldAwb;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface DatedFlightUldAwbBaseDao extends BaseDao<DatedFlightUldAwb, Integer> {

/**
 * load object list from datedFlightUld
 */
List<DatedFlightUldAwb> loadListFromDatedFlightUld(Integer datedFlightUldId);

/**
 * load object list eagerly from datedFlightUld
 */
List<DatedFlightUldAwb> loadListEagerlyFromDatedFlightUld(Integer datedFlightUldId);

/**
 * count filtered object list
 */
Long count(DatedFlightUldAwbFilter filter);

/**
 * count object list from datedFlightUld
 */
Long countFromDatedFlightUld(Integer datedFlightUldId);

/**
 * count filtered object list from datedFlightUld
 */
Long countFromDatedFlightUld(Integer datedFlightUldId, DatedFlightUldAwbFilter filter);

/**
 * scroll filtered object list
 */
List<DatedFlightUldAwb> scroll(DatedFlightUldAwbFilter filter, DatedFlightUldAwbSorting sorting, Long firstResult, Long maxResults);

/**
 * scroll filtered object from datedFlightUld
 */
List<DatedFlightUldAwb> scrollFromDatedFlightUld(Integer datedFlightUldId, DatedFlightUldAwbFilter filter, DatedFlightUldAwbSorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String datedFlightUldDatedFlightCompanyIataCode, String datedFlightUldDatedFlightFlightNumber, LocalDate datedFlightUldDatedFlightDepartureDate, String datedFlightUldUldTypeCode, String datedFlightUldUldCode, String datedFlightUldUldOwnerCode, String airWaybillAirWaybillNumber, Integer numberOfPieces, BigDecimal grossWeight);

/**
 * find object or null
 */
DatedFlightUldAwb findOrNull(String datedFlightUldDatedFlightCompanyIataCode, String datedFlightUldDatedFlightFlightNumber, LocalDate datedFlightUldDatedFlightDepartureDate, String datedFlightUldUldTypeCode, String datedFlightUldUldCode, String datedFlightUldUldOwnerCode, String airWaybillAirWaybillNumber, Integer numberOfPieces, BigDecimal grossWeight);

/**
 * find object
 */
DatedFlightUldAwb find(String datedFlightUldDatedFlightCompanyIataCode, String datedFlightUldDatedFlightFlightNumber, LocalDate datedFlightUldDatedFlightDepartureDate, String datedFlightUldUldTypeCode, String datedFlightUldUldCode, String datedFlightUldUldOwnerCode, String airWaybillAirWaybillNumber, Integer numberOfPieces, BigDecimal grossWeight);

}
