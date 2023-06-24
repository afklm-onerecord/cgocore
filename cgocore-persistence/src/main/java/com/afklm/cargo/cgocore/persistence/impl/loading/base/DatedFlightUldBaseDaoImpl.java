package com.afklm.cargo.cgocore.persistence.impl.loading.base;

import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addBetweenRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addEqualsRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addOrder;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addStringStartsWithRestriction;

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

import com.afklm.cargo.cgocore.api.model.loading.filters.DatedFlightUldFilter;
import com.afklm.cargo.cgocore.api.model.loading.sortings.DatedFlightUldSorting;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld_;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany_;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure_;
import com.afklm.cargo.cgocore.model.reference.containers.UldType;
import com.afklm.cargo.cgocore.model.reference.containers.UldType_;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight_;
import com.afklm.cargo.cgocore.persistence.interfaces.loading.base.DatedFlightUldBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldBaseDaoImpl extends BaseDaoImpl<DatedFlightUld, Integer> implements DatedFlightUldBaseDao {

/**
 * constructor
 */
public DatedFlightUldBaseDaoImpl() {
super(DatedFlightUld.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<DatedFlightUld> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightUld> criteria = builder.createQuery(DatedFlightUld.class);

Root<DatedFlightUld> root = criteria.from(DatedFlightUld.class);
Fetch<DatedFlightUld, DatedFlight> datedFlightFetch = root.fetch(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlightUld, DatedFlight> datedFlight = (Join<DatedFlightUld, DatedFlight>)datedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightCompanyFetch = datedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightCompanyFetch;
Fetch<DatedFlightUld, UldType> uldTypeFetch = root.fetch(DatedFlightUld_.uldType, JoinType.LEFT);
Join<DatedFlightUld, UldType> uldType = (Join<DatedFlightUld, UldType>)uldTypeFetch;
Fetch<DatedFlightUld, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightUld_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUld, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightUld, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(DatedFlightUld_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * load object list from datedFlight
 */
@Override
public List<DatedFlightUld> loadListFromDatedFlight(Integer datedFlightId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightUld> criteria = builder.createQuery(DatedFlightUld.class);

Root<DatedFlightUld> root = criteria.from(DatedFlightUld.class);
Join<DatedFlightUld, DatedFlight> datedFlight = root.join(DatedFlightUld_.datedFlight, JoinType.LEFT);

if (datedFlightId == null){
criteria.where(builder.isNull(datedFlight.get(DatedFlight_.id)));
} else {
criteria.where(builder.equal(datedFlight.get(DatedFlight_.id), datedFlightId));
}

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(DatedFlightUld_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * load object list eagerly from datedFlight
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<DatedFlightUld> loadListEagerlyFromDatedFlight(Integer datedFlightId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightUld> criteria = builder.createQuery(DatedFlightUld.class);

Root<DatedFlightUld> root = criteria.from(DatedFlightUld.class);
Fetch<DatedFlightUld, DatedFlight> datedFlightFetch = root.fetch(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlightUld, DatedFlight> datedFlight = (Join<DatedFlightUld, DatedFlight>)datedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightCompanyFetch = datedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightCompanyFetch;
Fetch<DatedFlightUld, UldType> uldTypeFetch = root.fetch(DatedFlightUld_.uldType, JoinType.LEFT);
Join<DatedFlightUld, UldType> uldType = (Join<DatedFlightUld, UldType>)uldTypeFetch;
Fetch<DatedFlightUld, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightUld_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUld, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightUld, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;

if (datedFlightId == null){
criteria.where(builder.isNull(datedFlight.get(DatedFlight_.id)));
} else {
criteria.where(builder.equal(datedFlight.get(DatedFlight_.id), datedFlightId));
}

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(DatedFlightUld_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(DatedFlightUldFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<DatedFlightUld> root = criteria.from(DatedFlightUld.class);
Join<DatedFlightUld, DatedFlight> datedFlight = root.join(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = datedFlight.join(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlightUld, UldType> uldType = root.join(DatedFlightUld_.uldType, JoinType.LEFT);
Join<DatedFlightUld, UnitOfMeasure> grossWeightUnitOfMeasure = root.join(DatedFlightUld_.grossWeightUnitOfMeasure, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightDepartureDateMinValue(), filter.getDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, uldType.get(UldType_.code), filter.getUldTypeCode());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlightUld_.uldCode), filter.getUldCode());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlightUld_.uldOwnerCode), filter.getUldOwnerCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUld_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * count object list from datedFlight
 */
public Long countFromDatedFlight(Integer datedFlightId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<DatedFlightUld> root = criteria.from(DatedFlightUld.class);
Join<DatedFlightUld, DatedFlight> datedFlight = root.join(DatedFlightUld_.datedFlight, JoinType.LEFT);

if (datedFlightId == null){
criteria.where(builder.isNull(datedFlight.get(DatedFlight_.id)));
} else {
criteria.where(builder.equal(datedFlight.get(DatedFlight_.id), datedFlightId));
}

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * count filtered object list from datedFlight
 */
public Long countFromDatedFlight(Integer datedFlightId, DatedFlightUldFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<DatedFlightUld> root = criteria.from(DatedFlightUld.class);
Join<DatedFlightUld, DatedFlight> datedFlight = root.join(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = datedFlight.join(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlightUld, UldType> uldType = root.join(DatedFlightUld_.uldType, JoinType.LEFT);
Join<DatedFlightUld, UnitOfMeasure> grossWeightUnitOfMeasure = root.join(DatedFlightUld_.grossWeightUnitOfMeasure, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightDepartureDateMinValue(), filter.getDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, uldType.get(UldType_.code), filter.getUldTypeCode());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlightUld_.uldCode), filter.getUldCode());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlightUld_.uldOwnerCode), filter.getUldOwnerCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUld_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
if (datedFlightId == null){
predicates.add(builder.isNull(datedFlight.get(DatedFlight_.id)));
} else {
predicates.add(builder.equal(datedFlight.get(DatedFlight_.id), datedFlightId));
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
public List<DatedFlightUld> scroll(DatedFlightUldFilter filter, DatedFlightUldSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightUld> criteria = builder.createQuery(DatedFlightUld.class);

Root<DatedFlightUld> root = criteria.from(DatedFlightUld.class);
Fetch<DatedFlightUld, DatedFlight> datedFlightFetch = root.fetch(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlightUld, DatedFlight> datedFlight = (Join<DatedFlightUld, DatedFlight>)datedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightCompanyFetch = datedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightCompanyFetch;
Fetch<DatedFlightUld, UldType> uldTypeFetch = root.fetch(DatedFlightUld_.uldType, JoinType.LEFT);
Join<DatedFlightUld, UldType> uldType = (Join<DatedFlightUld, UldType>)uldTypeFetch;
Fetch<DatedFlightUld, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightUld_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUld, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightUld, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightDepartureDateMinValue(), filter.getDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, uldType.get(UldType_.code), filter.getUldTypeCode());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlightUld_.uldCode), filter.getUldCode());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlightUld_.uldOwnerCode), filter.getUldOwnerCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUld_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, datedFlightCompany.get(AirlineCompany_.iataCode), sorting.getDatedFlightCompanyIataCodeOrderType());
addOrder(builder, orders, datedFlight.get(DatedFlight_.flightNumber), sorting.getDatedFlightFlightNumberOrderType());
addOrder(builder, orders, datedFlight.get(DatedFlight_.departureDate), sorting.getDatedFlightDepartureDateOrderType());
addOrder(builder, orders, uldType.get(UldType_.code), sorting.getUldTypeCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightUld_.uldCode), sorting.getUldCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightUld_.uldOwnerCode), sorting.getUldOwnerCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightUld_.grossWeight), sorting.getGrossWeightOrderType());
addOrder(builder, orders, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossWeightUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightUld_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<DatedFlightUld> query = session.createQuery(criteria);
if (firstResult != null){
query.setFirstResult(firstResult.intValue());
}
if (maxResults != null){
query.setMaxResults(maxResults.intValue());
}
return query.getResultList();
}

/**
 * scroll filtered object list from datedFlight
 */
@Override
@SuppressWarnings("unchecked")
public List<DatedFlightUld> scrollFromDatedFlight(Integer datedFlightId, DatedFlightUldFilter filter, DatedFlightUldSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightUld> criteria = builder.createQuery(DatedFlightUld.class);

Root<DatedFlightUld> root = criteria.from(DatedFlightUld.class);
Fetch<DatedFlightUld, DatedFlight> datedFlightFetch = root.fetch(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlightUld, DatedFlight> datedFlight = (Join<DatedFlightUld, DatedFlight>)datedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightCompanyFetch = datedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightCompanyFetch;
Fetch<DatedFlightUld, UldType> uldTypeFetch = root.fetch(DatedFlightUld_.uldType, JoinType.LEFT);
Join<DatedFlightUld, UldType> uldType = (Join<DatedFlightUld, UldType>)uldTypeFetch;
Fetch<DatedFlightUld, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightUld_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightUld, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightUld, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightDepartureDateMinValue(), filter.getDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, uldType.get(UldType_.code), filter.getUldTypeCode());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlightUld_.uldCode), filter.getUldCode());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlightUld_.uldOwnerCode), filter.getUldOwnerCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightUld_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
if (datedFlightId == null){
predicates.add(builder.isNull(datedFlight.get(DatedFlight_.id)));
} else {
predicates.add(builder.equal(datedFlight.get(DatedFlight_.id), datedFlightId));
}
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, datedFlightCompany.get(AirlineCompany_.iataCode), sorting.getDatedFlightCompanyIataCodeOrderType());
addOrder(builder, orders, datedFlight.get(DatedFlight_.flightNumber), sorting.getDatedFlightFlightNumberOrderType());
addOrder(builder, orders, datedFlight.get(DatedFlight_.departureDate), sorting.getDatedFlightDepartureDateOrderType());
addOrder(builder, orders, uldType.get(UldType_.code), sorting.getUldTypeCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightUld_.uldCode), sorting.getUldCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightUld_.uldOwnerCode), sorting.getUldOwnerCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightUld_.grossWeight), sorting.getGrossWeightOrderType());
addOrder(builder, orders, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossWeightUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightUld_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<DatedFlightUld> query = session.createQuery(criteria);
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
public DatedFlightUld findOrNull(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String uldTypeCode, String uldCode, String uldOwnerCode) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightUld> criteria = builder.createQuery(DatedFlightUld.class);

Root<DatedFlightUld> root = criteria.from(DatedFlightUld.class);
Join<DatedFlightUld, DatedFlight> datedFlight = root.join(DatedFlightUld_.datedFlight, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = datedFlight.join(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlightUld, UldType> uldType = root.join(DatedFlightUld_.uldType, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, datedFlightCompany.get(AirlineCompany_.iataCode), datedFlightCompanyIataCode);
addEqualsRestriction(builder, predicates, datedFlight.get(DatedFlight_.flightNumber), datedFlightFlightNumber);
addEqualsRestriction(builder, predicates, datedFlight.get(DatedFlight_.departureDate), datedFlightDepartureDate);
addEqualsRestriction(builder, predicates, uldType.get(UldType_.code), uldTypeCode);
addEqualsRestriction(builder, predicates, root.get(DatedFlightUld_.uldCode), uldCode);
addEqualsRestriction(builder, predicates, root.get(DatedFlightUld_.uldOwnerCode), uldOwnerCode);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public DatedFlightUld find(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String uldTypeCode, String uldCode, String uldOwnerCode) {
if (datedFlightCompanyIataCode == null && datedFlightFlightNumber == null && datedFlightDepartureDate == null && uldTypeCode == null && uldCode == null && uldOwnerCode == null) {
return null;
}
DatedFlightUld datedFlightUld = findOrNull(datedFlightCompanyIataCode, datedFlightFlightNumber, datedFlightDepartureDate, uldTypeCode, uldCode, uldOwnerCode);
if (datedFlightUld == null) {
throw new ObjectNotFoundException("DatedFlightUld.notFound");
} else {
return datedFlightUld;
}
}

/**
 * exists object
 */
@Override
public boolean exists(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String uldTypeCode, String uldCode, String uldOwnerCode) {
if (datedFlightCompanyIataCode == null && datedFlightFlightNumber == null && datedFlightDepartureDate == null && uldTypeCode == null && uldCode == null && uldOwnerCode == null) {
return false;
}
DatedFlightUld datedFlightUld = findOrNull(datedFlightCompanyIataCode, datedFlightFlightNumber, datedFlightDepartureDate, uldTypeCode, uldCode, uldOwnerCode);
return datedFlightUld != null;
}

}