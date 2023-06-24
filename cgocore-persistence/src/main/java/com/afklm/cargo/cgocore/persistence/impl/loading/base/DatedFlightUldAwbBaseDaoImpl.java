package com.afklm.cargo.cgocore.persistence.impl.loading.base;

import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addBetweenRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addEqualsRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addOrder;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addStringStartsWithRestriction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Fetch;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.sklsft.commons.api.exception.repository.ObjectNotFoundException;
import org.sklsft.commons.api.model.OrderType;
import org.sklsft.commons.model.patterns.BaseDaoImpl;

import com.afklm.cargo.cgocore.api.model.loading.filters.DatedFlightUldAwbFilter;
import com.afklm.cargo.cgocore.api.model.loading.sortings.DatedFlightUldAwbSorting;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUldAwb;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUldAwb_;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld_;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany_;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure_;
import com.afklm.cargo.cgocore.model.reference.containers.UldType;
import com.afklm.cargo.cgocore.model.reference.containers.UldType_;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight_;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill_;
import com.afklm.cargo.cgocore.persistence.interfaces.loading.base.DatedFlightUldAwbBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldAwbBaseDaoImpl extends BaseDaoImpl<DatedFlightUldAwb, Integer> implements DatedFlightUldAwbBaseDao {

/**
 * constructor
 */
public DatedFlightUldAwbBaseDaoImpl() {
super(DatedFlightUldAwb.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<DatedFlightUldAwb> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightUldAwb> criteria = builder.createQuery(DatedFlightUldAwb.class);

Root<DatedFlightUldAwb> root = criteria.from(DatedFlightUldAwb.class);
Fetch<DatedFlightUldAwb, DatedFlightUld> datedFlightUldFetch = root.fetch(DatedFlightUldAwb_.datedFlightUld, JoinType.LEFT);
Join<DatedFlightUldAwb, DatedFlightUld> datedFlightUld = (Join<DatedFlightUldAwb, DatedFlightUld>)datedFlightUldFetch;
Fetch<DatedFlightUld, DatedFlight> datedFlightUldDatedFlightFetch = datedFlightUld.fetch(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlightUld, DatedFlight> datedFlightUldDatedFlight = (Join<DatedFlightUld, DatedFlight>)datedFlightUldDatedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightUldDatedFlightCompanyFetch = datedFlightUldDatedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightUldDatedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightUldDatedFlightCompanyFetch;
Fetch<DatedFlightUld, UldType> datedFlightUldUldTypeFetch = datedFlightUld.fetch(DatedFlightUld_.uldType, JoinType.LEFT);
Join<DatedFlightUld, UldType> datedFlightUldUldType = (Join<DatedFlightUld, UldType>)datedFlightUldUldTypeFetch;
Fetch<DatedFlightUldAwb, AirWaybill> airWaybillFetch = root.fetch(DatedFlightUldAwb_.airWaybill, JoinType.LEFT);
Join<DatedFlightUldAwb, AirWaybill> airWaybill = (Join<DatedFlightUldAwb, AirWaybill>)airWaybillFetch;
Fetch<DatedFlightUldAwb, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightUldAwb_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUldAwb, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightUldAwb, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<DatedFlightUldAwb, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(DatedFlightUldAwb_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUldAwb, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<DatedFlightUldAwb, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(DatedFlightUldAwb_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * load object list from datedFlightUld
 */
@Override
public List<DatedFlightUldAwb> loadListFromDatedFlightUld(Integer datedFlightUldId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightUldAwb> criteria = builder.createQuery(DatedFlightUldAwb.class);

Root<DatedFlightUldAwb> root = criteria.from(DatedFlightUldAwb.class);
Join<DatedFlightUldAwb, DatedFlightUld> datedFlightUld = root.join(DatedFlightUldAwb_.datedFlightUld, JoinType.LEFT);

if (datedFlightUldId == null){
criteria.where(builder.isNull(datedFlightUld.get(DatedFlightUld_.id)));
} else {
criteria.where(builder.equal(datedFlightUld.get(DatedFlightUld_.id), datedFlightUldId));
}

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(DatedFlightUldAwb_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * load object list eagerly from datedFlightUld
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<DatedFlightUldAwb> loadListEagerlyFromDatedFlightUld(Integer datedFlightUldId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightUldAwb> criteria = builder.createQuery(DatedFlightUldAwb.class);

Root<DatedFlightUldAwb> root = criteria.from(DatedFlightUldAwb.class);
Fetch<DatedFlightUldAwb, DatedFlightUld> datedFlightUldFetch = root.fetch(DatedFlightUldAwb_.datedFlightUld, JoinType.LEFT);
Join<DatedFlightUldAwb, DatedFlightUld> datedFlightUld = (Join<DatedFlightUldAwb, DatedFlightUld>)datedFlightUldFetch;
Fetch<DatedFlightUld, DatedFlight> datedFlightUldDatedFlightFetch = datedFlightUld.fetch(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlightUld, DatedFlight> datedFlightUldDatedFlight = (Join<DatedFlightUld, DatedFlight>)datedFlightUldDatedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightUldDatedFlightCompanyFetch = datedFlightUldDatedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightUldDatedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightUldDatedFlightCompanyFetch;
Fetch<DatedFlightUld, UldType> datedFlightUldUldTypeFetch = datedFlightUld.fetch(DatedFlightUld_.uldType, JoinType.LEFT);
Join<DatedFlightUld, UldType> datedFlightUldUldType = (Join<DatedFlightUld, UldType>)datedFlightUldUldTypeFetch;
Fetch<DatedFlightUldAwb, AirWaybill> airWaybillFetch = root.fetch(DatedFlightUldAwb_.airWaybill, JoinType.LEFT);
Join<DatedFlightUldAwb, AirWaybill> airWaybill = (Join<DatedFlightUldAwb, AirWaybill>)airWaybillFetch;
Fetch<DatedFlightUldAwb, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightUldAwb_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUldAwb, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightUldAwb, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<DatedFlightUldAwb, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(DatedFlightUldAwb_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUldAwb, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<DatedFlightUldAwb, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

if (datedFlightUldId == null){
criteria.where(builder.isNull(datedFlightUld.get(DatedFlightUld_.id)));
} else {
criteria.where(builder.equal(datedFlightUld.get(DatedFlightUld_.id), datedFlightUldId));
}

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(DatedFlightUldAwb_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(DatedFlightUldAwbFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<DatedFlightUldAwb> root = criteria.from(DatedFlightUldAwb.class);
Join<DatedFlightUldAwb, DatedFlightUld> datedFlightUld = root.join(DatedFlightUldAwb_.datedFlightUld, JoinType.LEFT);
Join<DatedFlightUld, DatedFlight> datedFlightUldDatedFlight = datedFlightUld.join(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightUldDatedFlightCompany = datedFlightUldDatedFlight.join(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlightUld, UldType> datedFlightUldUldType = datedFlightUld.join(DatedFlightUld_.uldType, JoinType.LEFT);
Join<DatedFlightUldAwb, AirWaybill> airWaybill = root.join(DatedFlightUldAwb_.airWaybill, JoinType.LEFT);
Join<DatedFlightUldAwb, UnitOfMeasure> grossWeightUnitOfMeasure = root.join(DatedFlightUldAwb_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUldAwb, UnitOfMeasure> grossVolumeUnitOfMeasure = root.join(DatedFlightUldAwb_.grossVolumeUnitOfMeasure, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightUldDatedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightUldDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlightUldDatedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightUldDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlightUldDatedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightUldDatedFlightDepartureDateMinValue(), filter.getDatedFlightUldDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, datedFlightUldUldType.get(UldType_.code), filter.getDatedFlightUldUldTypeCode());
addStringStartsWithRestriction(builder, predicates, datedFlightUld.get(DatedFlightUld_.uldCode), filter.getDatedFlightUldUldCode());
addStringStartsWithRestriction(builder, predicates, datedFlightUld.get(DatedFlightUld_.uldOwnerCode), filter.getDatedFlightUldUldOwnerCode());
addStringStartsWithRestriction(builder, predicates, airWaybill.get(AirWaybill_.airWaybillNumber), filter.getAirWaybillAirWaybillNumber());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUldAwb_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUldAwb_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUldAwb_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
addStringStartsWithRestriction(builder, predicates, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossVolumeUnitOfMeasureCode());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * count object list from datedFlightUld
 */
public Long countFromDatedFlightUld(Integer datedFlightUldId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<DatedFlightUldAwb> root = criteria.from(DatedFlightUldAwb.class);
Join<DatedFlightUldAwb, DatedFlightUld> datedFlightUld = root.join(DatedFlightUldAwb_.datedFlightUld, JoinType.LEFT);

if (datedFlightUldId == null){
criteria.where(builder.isNull(datedFlightUld.get(DatedFlightUld_.id)));
} else {
criteria.where(builder.equal(datedFlightUld.get(DatedFlightUld_.id), datedFlightUldId));
}

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * count filtered object list from datedFlightUld
 */
public Long countFromDatedFlightUld(Integer datedFlightUldId, DatedFlightUldAwbFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<DatedFlightUldAwb> root = criteria.from(DatedFlightUldAwb.class);
Join<DatedFlightUldAwb, DatedFlightUld> datedFlightUld = root.join(DatedFlightUldAwb_.datedFlightUld, JoinType.LEFT);
Join<DatedFlightUld, DatedFlight> datedFlightUldDatedFlight = datedFlightUld.join(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightUldDatedFlightCompany = datedFlightUldDatedFlight.join(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlightUld, UldType> datedFlightUldUldType = datedFlightUld.join(DatedFlightUld_.uldType, JoinType.LEFT);
Join<DatedFlightUldAwb, AirWaybill> airWaybill = root.join(DatedFlightUldAwb_.airWaybill, JoinType.LEFT);
Join<DatedFlightUldAwb, UnitOfMeasure> grossWeightUnitOfMeasure = root.join(DatedFlightUldAwb_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUldAwb, UnitOfMeasure> grossVolumeUnitOfMeasure = root.join(DatedFlightUldAwb_.grossVolumeUnitOfMeasure, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightUldDatedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightUldDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlightUldDatedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightUldDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlightUldDatedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightUldDatedFlightDepartureDateMinValue(), filter.getDatedFlightUldDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, datedFlightUldUldType.get(UldType_.code), filter.getDatedFlightUldUldTypeCode());
addStringStartsWithRestriction(builder, predicates, datedFlightUld.get(DatedFlightUld_.uldCode), filter.getDatedFlightUldUldCode());
addStringStartsWithRestriction(builder, predicates, datedFlightUld.get(DatedFlightUld_.uldOwnerCode), filter.getDatedFlightUldUldOwnerCode());
addStringStartsWithRestriction(builder, predicates, airWaybill.get(AirWaybill_.airWaybillNumber), filter.getAirWaybillAirWaybillNumber());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUldAwb_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUldAwb_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUldAwb_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
addStringStartsWithRestriction(builder, predicates, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossVolumeUnitOfMeasureCode());
if (datedFlightUldId == null){
predicates.add(builder.isNull(datedFlightUld.get(DatedFlightUld_.id)));
} else {
predicates.add(builder.equal(datedFlightUld.get(DatedFlightUld_.id), datedFlightUldId));
}

criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * scroll filtered object list
 */
@Override
@SuppressWarnings("unchecked")
public List<DatedFlightUldAwb> scroll(DatedFlightUldAwbFilter filter, DatedFlightUldAwbSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightUldAwb> criteria = builder.createQuery(DatedFlightUldAwb.class);

Root<DatedFlightUldAwb> root = criteria.from(DatedFlightUldAwb.class);
Fetch<DatedFlightUldAwb, DatedFlightUld> datedFlightUldFetch = root.fetch(DatedFlightUldAwb_.datedFlightUld, JoinType.LEFT);
Join<DatedFlightUldAwb, DatedFlightUld> datedFlightUld = (Join<DatedFlightUldAwb, DatedFlightUld>)datedFlightUldFetch;
Fetch<DatedFlightUld, DatedFlight> datedFlightUldDatedFlightFetch = datedFlightUld.fetch(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlightUld, DatedFlight> datedFlightUldDatedFlight = (Join<DatedFlightUld, DatedFlight>)datedFlightUldDatedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightUldDatedFlightCompanyFetch = datedFlightUldDatedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightUldDatedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightUldDatedFlightCompanyFetch;
Fetch<DatedFlightUld, UldType> datedFlightUldUldTypeFetch = datedFlightUld.fetch(DatedFlightUld_.uldType, JoinType.LEFT);
Join<DatedFlightUld, UldType> datedFlightUldUldType = (Join<DatedFlightUld, UldType>)datedFlightUldUldTypeFetch;
Fetch<DatedFlightUldAwb, AirWaybill> airWaybillFetch = root.fetch(DatedFlightUldAwb_.airWaybill, JoinType.LEFT);
Join<DatedFlightUldAwb, AirWaybill> airWaybill = (Join<DatedFlightUldAwb, AirWaybill>)airWaybillFetch;
Fetch<DatedFlightUldAwb, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightUldAwb_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUldAwb, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightUldAwb, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<DatedFlightUldAwb, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(DatedFlightUldAwb_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUldAwb, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<DatedFlightUldAwb, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightUldDatedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightUldDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlightUldDatedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightUldDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlightUldDatedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightUldDatedFlightDepartureDateMinValue(), filter.getDatedFlightUldDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, datedFlightUldUldType.get(UldType_.code), filter.getDatedFlightUldUldTypeCode());
addStringStartsWithRestriction(builder, predicates, datedFlightUld.get(DatedFlightUld_.uldCode), filter.getDatedFlightUldUldCode());
addStringStartsWithRestriction(builder, predicates, datedFlightUld.get(DatedFlightUld_.uldOwnerCode), filter.getDatedFlightUldUldOwnerCode());
addStringStartsWithRestriction(builder, predicates, airWaybill.get(AirWaybill_.airWaybillNumber), filter.getAirWaybillAirWaybillNumber());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUldAwb_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUldAwb_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUldAwb_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
addStringStartsWithRestriction(builder, predicates, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossVolumeUnitOfMeasureCode());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, datedFlightUldDatedFlightCompany.get(AirlineCompany_.iataCode), sorting.getDatedFlightUldDatedFlightCompanyIataCodeOrderType());
addOrder(builder, orders, datedFlightUldDatedFlight.get(DatedFlight_.flightNumber), sorting.getDatedFlightUldDatedFlightFlightNumberOrderType());
addOrder(builder, orders, datedFlightUldDatedFlight.get(DatedFlight_.departureDate), sorting.getDatedFlightUldDatedFlightDepartureDateOrderType());
addOrder(builder, orders, datedFlightUldUldType.get(UldType_.code), sorting.getDatedFlightUldUldTypeCodeOrderType());
addOrder(builder, orders, datedFlightUld.get(DatedFlightUld_.uldCode), sorting.getDatedFlightUldUldCodeOrderType());
addOrder(builder, orders, datedFlightUld.get(DatedFlightUld_.uldOwnerCode), sorting.getDatedFlightUldUldOwnerCodeOrderType());
addOrder(builder, orders, airWaybill.get(AirWaybill_.airWaybillNumber), sorting.getAirWaybillAirWaybillNumberOrderType());
addOrder(builder, orders, root.get(DatedFlightUldAwb_.numberOfPieces), sorting.getNumberOfPiecesOrderType());
addOrder(builder, orders, root.get(DatedFlightUldAwb_.grossWeight), sorting.getGrossWeightOrderType());
addOrder(builder, orders, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossWeightUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightUldAwb_.grossVolume), sorting.getGrossVolumeOrderType());
addOrder(builder, orders, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossVolumeUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightUldAwb_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<DatedFlightUldAwb> query = session.createQuery(criteria);
if (firstResult != null){
query.setFirstResult(firstResult.intValue());
}
if (maxResults != null){
query.setMaxResults(maxResults.intValue());
}
return query.getResultList();
}

/**
 * scroll filtered object list from datedFlightUld
 */
@Override
@SuppressWarnings("unchecked")
public List<DatedFlightUldAwb> scrollFromDatedFlightUld(Integer datedFlightUldId, DatedFlightUldAwbFilter filter, DatedFlightUldAwbSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightUldAwb> criteria = builder.createQuery(DatedFlightUldAwb.class);

Root<DatedFlightUldAwb> root = criteria.from(DatedFlightUldAwb.class);
Fetch<DatedFlightUldAwb, DatedFlightUld> datedFlightUldFetch = root.fetch(DatedFlightUldAwb_.datedFlightUld, JoinType.LEFT);
Join<DatedFlightUldAwb, DatedFlightUld> datedFlightUld = (Join<DatedFlightUldAwb, DatedFlightUld>)datedFlightUldFetch;
Fetch<DatedFlightUld, DatedFlight> datedFlightUldDatedFlightFetch = datedFlightUld.fetch(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlightUld, DatedFlight> datedFlightUldDatedFlight = (Join<DatedFlightUld, DatedFlight>)datedFlightUldDatedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightUldDatedFlightCompanyFetch = datedFlightUldDatedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightUldDatedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightUldDatedFlightCompanyFetch;
Fetch<DatedFlightUld, UldType> datedFlightUldUldTypeFetch = datedFlightUld.fetch(DatedFlightUld_.uldType, JoinType.LEFT);
Join<DatedFlightUld, UldType> datedFlightUldUldType = (Join<DatedFlightUld, UldType>)datedFlightUldUldTypeFetch;
Fetch<DatedFlightUldAwb, AirWaybill> airWaybillFetch = root.fetch(DatedFlightUldAwb_.airWaybill, JoinType.LEFT);
Join<DatedFlightUldAwb, AirWaybill> airWaybill = (Join<DatedFlightUldAwb, AirWaybill>)airWaybillFetch;
Fetch<DatedFlightUldAwb, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightUldAwb_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUldAwb, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightUldAwb, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<DatedFlightUldAwb, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(DatedFlightUldAwb_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUldAwb, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<DatedFlightUldAwb, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightUldDatedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightUldDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlightUldDatedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightUldDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlightUldDatedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightUldDatedFlightDepartureDateMinValue(), filter.getDatedFlightUldDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, datedFlightUldUldType.get(UldType_.code), filter.getDatedFlightUldUldTypeCode());
addStringStartsWithRestriction(builder, predicates, datedFlightUld.get(DatedFlightUld_.uldCode), filter.getDatedFlightUldUldCode());
addStringStartsWithRestriction(builder, predicates, datedFlightUld.get(DatedFlightUld_.uldOwnerCode), filter.getDatedFlightUldUldOwnerCode());
addStringStartsWithRestriction(builder, predicates, airWaybill.get(AirWaybill_.airWaybillNumber), filter.getAirWaybillAirWaybillNumber());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUldAwb_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUldAwb_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUldAwb_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
addStringStartsWithRestriction(builder, predicates, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossVolumeUnitOfMeasureCode());
if (datedFlightUldId == null){
predicates.add(builder.isNull(datedFlightUld.get(DatedFlightUld_.id)));
} else {
predicates.add(builder.equal(datedFlightUld.get(DatedFlightUld_.id), datedFlightUldId));
}
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, datedFlightUldDatedFlightCompany.get(AirlineCompany_.iataCode), sorting.getDatedFlightUldDatedFlightCompanyIataCodeOrderType());
addOrder(builder, orders, datedFlightUldDatedFlight.get(DatedFlight_.flightNumber), sorting.getDatedFlightUldDatedFlightFlightNumberOrderType());
addOrder(builder, orders, datedFlightUldDatedFlight.get(DatedFlight_.departureDate), sorting.getDatedFlightUldDatedFlightDepartureDateOrderType());
addOrder(builder, orders, datedFlightUldUldType.get(UldType_.code), sorting.getDatedFlightUldUldTypeCodeOrderType());
addOrder(builder, orders, datedFlightUld.get(DatedFlightUld_.uldCode), sorting.getDatedFlightUldUldCodeOrderType());
addOrder(builder, orders, datedFlightUld.get(DatedFlightUld_.uldOwnerCode), sorting.getDatedFlightUldUldOwnerCodeOrderType());
addOrder(builder, orders, airWaybill.get(AirWaybill_.airWaybillNumber), sorting.getAirWaybillAirWaybillNumberOrderType());
addOrder(builder, orders, root.get(DatedFlightUldAwb_.numberOfPieces), sorting.getNumberOfPiecesOrderType());
addOrder(builder, orders, root.get(DatedFlightUldAwb_.grossWeight), sorting.getGrossWeightOrderType());
addOrder(builder, orders, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossWeightUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightUldAwb_.grossVolume), sorting.getGrossVolumeOrderType());
addOrder(builder, orders, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossVolumeUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightUldAwb_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<DatedFlightUldAwb> query = session.createQuery(criteria);
if (firstResult != null){
query.setFirstResult(firstResult.intValue());
}
if (maxResults != null){
query.setMaxResults(maxResults.intValue());
}
return query.getResultList();
}

/**
 * find object or null
 */
@Override
public DatedFlightUldAwb findOrNull(String datedFlightUldDatedFlightCompanyIataCode, String datedFlightUldDatedFlightFlightNumber, LocalDate datedFlightUldDatedFlightDepartureDate, String datedFlightUldUldTypeCode, String datedFlightUldUldCode, String datedFlightUldUldOwnerCode, String airWaybillAirWaybillNumber, Integer numberOfPieces, BigDecimal grossWeight) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightUldAwb> criteria = builder.createQuery(DatedFlightUldAwb.class);

Root<DatedFlightUldAwb> root = criteria.from(DatedFlightUldAwb.class);
Join<DatedFlightUldAwb, DatedFlightUld> datedFlightUld = root.join(DatedFlightUldAwb_.datedFlightUld, JoinType.LEFT);
Join<DatedFlightUld, DatedFlight> datedFlightUldDatedFlight = datedFlightUld.join(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightUldDatedFlightCompany = datedFlightUldDatedFlight.join(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlightUld, UldType> datedFlightUldUldType = datedFlightUld.join(DatedFlightUld_.uldType, JoinType.LEFT);
Join<DatedFlightUldAwb, AirWaybill> airWaybill = root.join(DatedFlightUldAwb_.airWaybill, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, datedFlightUldDatedFlightCompany.get(AirlineCompany_.iataCode), datedFlightUldDatedFlightCompanyIataCode);
addEqualsRestriction(builder, predicates, datedFlightUldDatedFlight.get(DatedFlight_.flightNumber), datedFlightUldDatedFlightFlightNumber);
addEqualsRestriction(builder, predicates, datedFlightUldDatedFlight.get(DatedFlight_.departureDate), datedFlightUldDatedFlightDepartureDate);
addEqualsRestriction(builder, predicates, datedFlightUldUldType.get(UldType_.code), datedFlightUldUldTypeCode);
addEqualsRestriction(builder, predicates, datedFlightUld.get(DatedFlightUld_.uldCode), datedFlightUldUldCode);
addEqualsRestriction(builder, predicates, datedFlightUld.get(DatedFlightUld_.uldOwnerCode), datedFlightUldUldOwnerCode);
addEqualsRestriction(builder, predicates, airWaybill.get(AirWaybill_.airWaybillNumber), airWaybillAirWaybillNumber);
addEqualsRestriction(builder, predicates, root.get(DatedFlightUldAwb_.numberOfPieces), numberOfPieces);
addEqualsRestriction(builder, predicates, root.get(DatedFlightUldAwb_.grossWeight), grossWeight);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public DatedFlightUldAwb find(String datedFlightUldDatedFlightCompanyIataCode, String datedFlightUldDatedFlightFlightNumber, LocalDate datedFlightUldDatedFlightDepartureDate, String datedFlightUldUldTypeCode, String datedFlightUldUldCode, String datedFlightUldUldOwnerCode, String airWaybillAirWaybillNumber, Integer numberOfPieces, BigDecimal grossWeight) {
if (datedFlightUldDatedFlightCompanyIataCode == null && datedFlightUldDatedFlightFlightNumber == null && datedFlightUldDatedFlightDepartureDate == null && datedFlightUldUldTypeCode == null && datedFlightUldUldCode == null && datedFlightUldUldOwnerCode == null && airWaybillAirWaybillNumber == null && numberOfPieces == null && grossWeight == null) {
return null;
}
DatedFlightUldAwb datedFlightUldAwb = findOrNull(datedFlightUldDatedFlightCompanyIataCode, datedFlightUldDatedFlightFlightNumber, datedFlightUldDatedFlightDepartureDate, datedFlightUldUldTypeCode, datedFlightUldUldCode, datedFlightUldUldOwnerCode, airWaybillAirWaybillNumber, numberOfPieces, grossWeight);
if (datedFlightUldAwb == null) {
throw new ObjectNotFoundException("DatedFlightUldAwb.notFound");
} else {
return datedFlightUldAwb;
}
}

/**
 * exists object
 */
@Override
public boolean exists(String datedFlightUldDatedFlightCompanyIataCode, String datedFlightUldDatedFlightFlightNumber, LocalDate datedFlightUldDatedFlightDepartureDate, String datedFlightUldUldTypeCode, String datedFlightUldUldCode, String datedFlightUldUldOwnerCode, String airWaybillAirWaybillNumber, Integer numberOfPieces, BigDecimal grossWeight) {
if (datedFlightUldDatedFlightCompanyIataCode == null && datedFlightUldDatedFlightFlightNumber == null && datedFlightUldDatedFlightDepartureDate == null && datedFlightUldUldTypeCode == null && datedFlightUldUldCode == null && datedFlightUldUldOwnerCode == null && airWaybillAirWaybillNumber == null && numberOfPieces == null && grossWeight == null) {
return false;
}
DatedFlightUldAwb datedFlightUldAwb = findOrNull(datedFlightUldDatedFlightCompanyIataCode, datedFlightUldDatedFlightFlightNumber, datedFlightUldDatedFlightDepartureDate, datedFlightUldUldTypeCode, datedFlightUldUldCode, datedFlightUldUldOwnerCode, airWaybillAirWaybillNumber, numberOfPieces, grossWeight);
return datedFlightUldAwb != null;
}

}