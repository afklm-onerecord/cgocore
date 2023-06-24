package com.afklm.cargo.cgocore.persistence.impl.bookings.base;

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

import com.afklm.cargo.cgocore.api.model.bookings.filters.DatedFlightBookingFilter;
import com.afklm.cargo.cgocore.api.model.bookings.sortings.DatedFlightBookingSorting;
import com.afklm.cargo.cgocore.model.bookings.Booking;
import com.afklm.cargo.cgocore.model.bookings.Booking_;
import com.afklm.cargo.cgocore.model.bookings.DatedFlightBooking;
import com.afklm.cargo.cgocore.model.bookings.DatedFlightBooking_;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany_;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure_;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight_;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill_;
import com.afklm.cargo.cgocore.persistence.interfaces.bookings.base.DatedFlightBookingBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBookingBaseDaoImpl extends BaseDaoImpl<DatedFlightBooking, Integer> implements DatedFlightBookingBaseDao {

/**
 * constructor
 */
public DatedFlightBookingBaseDaoImpl() {
super(DatedFlightBooking.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<DatedFlightBooking> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightBooking> criteria = builder.createQuery(DatedFlightBooking.class);

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Fetch<DatedFlightBooking, DatedFlight> datedFlightFetch = root.fetch(DatedFlightBooking_.datedFlight, JoinType.LEFT);
Join<DatedFlightBooking, DatedFlight> datedFlight = (Join<DatedFlightBooking, DatedFlight>)datedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightCompanyFetch = datedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightCompanyFetch;
Fetch<DatedFlightBooking, Booking> bookingFetch = root.fetch(DatedFlightBooking_.booking, JoinType.LEFT);
Join<DatedFlightBooking, Booking> booking = (Join<DatedFlightBooking, Booking>)bookingFetch;
Fetch<Booking, AirWaybill> bookingAirWaybillFetch = booking.fetch(Booking_.airWaybill, JoinType.LEFT);
Join<Booking, AirWaybill> bookingAirWaybill = (Join<Booking, AirWaybill>)bookingAirWaybillFetch;
Fetch<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightBooking_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightBooking, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(DatedFlightBooking_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<DatedFlightBooking, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(DatedFlightBooking_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * load object list from datedFlight
 */
@Override
public List<DatedFlightBooking> loadListFromDatedFlight(Integer datedFlightId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightBooking> criteria = builder.createQuery(DatedFlightBooking.class);

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Join<DatedFlightBooking, DatedFlight> datedFlight = root.join(DatedFlightBooking_.datedFlight, JoinType.LEFT);

if (datedFlightId == null){
criteria.where(builder.isNull(datedFlight.get(DatedFlight_.id)));
} else {
criteria.where(builder.equal(datedFlight.get(DatedFlight_.id), datedFlightId));
}

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(DatedFlightBooking_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * load object list eagerly from datedFlight
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<DatedFlightBooking> loadListEagerlyFromDatedFlight(Integer datedFlightId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightBooking> criteria = builder.createQuery(DatedFlightBooking.class);

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Fetch<DatedFlightBooking, DatedFlight> datedFlightFetch = root.fetch(DatedFlightBooking_.datedFlight, JoinType.LEFT);
Join<DatedFlightBooking, DatedFlight> datedFlight = (Join<DatedFlightBooking, DatedFlight>)datedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightCompanyFetch = datedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightCompanyFetch;
Fetch<DatedFlightBooking, Booking> bookingFetch = root.fetch(DatedFlightBooking_.booking, JoinType.LEFT);
Join<DatedFlightBooking, Booking> booking = (Join<DatedFlightBooking, Booking>)bookingFetch;
Fetch<Booking, AirWaybill> bookingAirWaybillFetch = booking.fetch(Booking_.airWaybill, JoinType.LEFT);
Join<Booking, AirWaybill> bookingAirWaybill = (Join<Booking, AirWaybill>)bookingAirWaybillFetch;
Fetch<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightBooking_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightBooking, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(DatedFlightBooking_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<DatedFlightBooking, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

if (datedFlightId == null){
criteria.where(builder.isNull(datedFlight.get(DatedFlight_.id)));
} else {
criteria.where(builder.equal(datedFlight.get(DatedFlight_.id), datedFlightId));
}

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(DatedFlightBooking_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * load object list from booking
 */
@Override
public List<DatedFlightBooking> loadListFromBooking(Long bookingId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightBooking> criteria = builder.createQuery(DatedFlightBooking.class);

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Join<DatedFlightBooking, Booking> booking = root.join(DatedFlightBooking_.booking, JoinType.LEFT);

if (bookingId == null){
criteria.where(builder.isNull(booking.get(Booking_.id)));
} else {
criteria.where(builder.equal(booking.get(Booking_.id), bookingId));
}

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(DatedFlightBooking_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * load object list eagerly from booking
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<DatedFlightBooking> loadListEagerlyFromBooking(Long bookingId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightBooking> criteria = builder.createQuery(DatedFlightBooking.class);

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Fetch<DatedFlightBooking, DatedFlight> datedFlightFetch = root.fetch(DatedFlightBooking_.datedFlight, JoinType.LEFT);
Join<DatedFlightBooking, DatedFlight> datedFlight = (Join<DatedFlightBooking, DatedFlight>)datedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightCompanyFetch = datedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightCompanyFetch;
Fetch<DatedFlightBooking, Booking> bookingFetch = root.fetch(DatedFlightBooking_.booking, JoinType.LEFT);
Join<DatedFlightBooking, Booking> booking = (Join<DatedFlightBooking, Booking>)bookingFetch;
Fetch<Booking, AirWaybill> bookingAirWaybillFetch = booking.fetch(Booking_.airWaybill, JoinType.LEFT);
Join<Booking, AirWaybill> bookingAirWaybill = (Join<Booking, AirWaybill>)bookingAirWaybillFetch;
Fetch<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightBooking_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightBooking, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(DatedFlightBooking_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<DatedFlightBooking, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

if (bookingId == null){
criteria.where(builder.isNull(booking.get(Booking_.id)));
} else {
criteria.where(builder.equal(booking.get(Booking_.id), bookingId));
}

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(DatedFlightBooking_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(DatedFlightBookingFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Join<DatedFlightBooking, DatedFlight> datedFlight = root.join(DatedFlightBooking_.datedFlight, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = datedFlight.join(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlightBooking, Booking> booking = root.join(DatedFlightBooking_.booking, JoinType.LEFT);
Join<Booking, AirWaybill> bookingAirWaybill = booking.join(Booking_.airWaybill, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasure = root.join(DatedFlightBooking_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasure = root.join(DatedFlightBooking_.grossVolumeUnitOfMeasure, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightDepartureDateMinValue(), filter.getDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, bookingAirWaybill.get(AirWaybill_.airWaybillNumber), filter.getBookingAirWaybillAirWaybillNumber());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
addStringStartsWithRestriction(builder, predicates, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossVolumeUnitOfMeasureCode());
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

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Join<DatedFlightBooking, DatedFlight> datedFlight = root.join(DatedFlightBooking_.datedFlight, JoinType.LEFT);

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
public Long countFromDatedFlight(Integer datedFlightId, DatedFlightBookingFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Join<DatedFlightBooking, DatedFlight> datedFlight = root.join(DatedFlightBooking_.datedFlight, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = datedFlight.join(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlightBooking, Booking> booking = root.join(DatedFlightBooking_.booking, JoinType.LEFT);
Join<Booking, AirWaybill> bookingAirWaybill = booking.join(Booking_.airWaybill, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasure = root.join(DatedFlightBooking_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasure = root.join(DatedFlightBooking_.grossVolumeUnitOfMeasure, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightDepartureDateMinValue(), filter.getDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, bookingAirWaybill.get(AirWaybill_.airWaybillNumber), filter.getBookingAirWaybillAirWaybillNumber());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
addStringStartsWithRestriction(builder, predicates, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossVolumeUnitOfMeasureCode());
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
 * count object list from booking
 */
public Long countFromBooking(Long bookingId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Join<DatedFlightBooking, Booking> booking = root.join(DatedFlightBooking_.booking, JoinType.LEFT);

if (bookingId == null){
criteria.where(builder.isNull(booking.get(Booking_.id)));
} else {
criteria.where(builder.equal(booking.get(Booking_.id), bookingId));
}

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * count filtered object list from booking
 */
public Long countFromBooking(Long bookingId, DatedFlightBookingFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Join<DatedFlightBooking, DatedFlight> datedFlight = root.join(DatedFlightBooking_.datedFlight, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = datedFlight.join(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlightBooking, Booking> booking = root.join(DatedFlightBooking_.booking, JoinType.LEFT);
Join<Booking, AirWaybill> bookingAirWaybill = booking.join(Booking_.airWaybill, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasure = root.join(DatedFlightBooking_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasure = root.join(DatedFlightBooking_.grossVolumeUnitOfMeasure, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightDepartureDateMinValue(), filter.getDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, bookingAirWaybill.get(AirWaybill_.airWaybillNumber), filter.getBookingAirWaybillAirWaybillNumber());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
addStringStartsWithRestriction(builder, predicates, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossVolumeUnitOfMeasureCode());
if (bookingId == null){
predicates.add(builder.isNull(booking.get(Booking_.id)));
} else {
predicates.add(builder.equal(booking.get(Booking_.id), bookingId));
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
public List<DatedFlightBooking> scroll(DatedFlightBookingFilter filter, DatedFlightBookingSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightBooking> criteria = builder.createQuery(DatedFlightBooking.class);

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Fetch<DatedFlightBooking, DatedFlight> datedFlightFetch = root.fetch(DatedFlightBooking_.datedFlight, JoinType.LEFT);
Join<DatedFlightBooking, DatedFlight> datedFlight = (Join<DatedFlightBooking, DatedFlight>)datedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightCompanyFetch = datedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightCompanyFetch;
Fetch<DatedFlightBooking, Booking> bookingFetch = root.fetch(DatedFlightBooking_.booking, JoinType.LEFT);
Join<DatedFlightBooking, Booking> booking = (Join<DatedFlightBooking, Booking>)bookingFetch;
Fetch<Booking, AirWaybill> bookingAirWaybillFetch = booking.fetch(Booking_.airWaybill, JoinType.LEFT);
Join<Booking, AirWaybill> bookingAirWaybill = (Join<Booking, AirWaybill>)bookingAirWaybillFetch;
Fetch<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightBooking_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightBooking, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(DatedFlightBooking_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<DatedFlightBooking, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightDepartureDateMinValue(), filter.getDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, bookingAirWaybill.get(AirWaybill_.airWaybillNumber), filter.getBookingAirWaybillAirWaybillNumber());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
addStringStartsWithRestriction(builder, predicates, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossVolumeUnitOfMeasureCode());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, datedFlightCompany.get(AirlineCompany_.iataCode), sorting.getDatedFlightCompanyIataCodeOrderType());
addOrder(builder, orders, datedFlight.get(DatedFlight_.flightNumber), sorting.getDatedFlightFlightNumberOrderType());
addOrder(builder, orders, datedFlight.get(DatedFlight_.departureDate), sorting.getDatedFlightDepartureDateOrderType());
addOrder(builder, orders, bookingAirWaybill.get(AirWaybill_.airWaybillNumber), sorting.getBookingAirWaybillAirWaybillNumberOrderType());
addOrder(builder, orders, root.get(DatedFlightBooking_.numberOfPieces), sorting.getNumberOfPiecesOrderType());
addOrder(builder, orders, root.get(DatedFlightBooking_.grossWeight), sorting.getGrossWeightOrderType());
addOrder(builder, orders, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossWeightUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightBooking_.grossVolume), sorting.getGrossVolumeOrderType());
addOrder(builder, orders, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossVolumeUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightBooking_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<DatedFlightBooking> query = session.createQuery(criteria);
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
public List<DatedFlightBooking> scrollFromDatedFlight(Integer datedFlightId, DatedFlightBookingFilter filter, DatedFlightBookingSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightBooking> criteria = builder.createQuery(DatedFlightBooking.class);

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Fetch<DatedFlightBooking, DatedFlight> datedFlightFetch = root.fetch(DatedFlightBooking_.datedFlight, JoinType.LEFT);
Join<DatedFlightBooking, DatedFlight> datedFlight = (Join<DatedFlightBooking, DatedFlight>)datedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightCompanyFetch = datedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightCompanyFetch;
Fetch<DatedFlightBooking, Booking> bookingFetch = root.fetch(DatedFlightBooking_.booking, JoinType.LEFT);
Join<DatedFlightBooking, Booking> booking = (Join<DatedFlightBooking, Booking>)bookingFetch;
Fetch<Booking, AirWaybill> bookingAirWaybillFetch = booking.fetch(Booking_.airWaybill, JoinType.LEFT);
Join<Booking, AirWaybill> bookingAirWaybill = (Join<Booking, AirWaybill>)bookingAirWaybillFetch;
Fetch<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightBooking_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightBooking, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(DatedFlightBooking_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<DatedFlightBooking, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightDepartureDateMinValue(), filter.getDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, bookingAirWaybill.get(AirWaybill_.airWaybillNumber), filter.getBookingAirWaybillAirWaybillNumber());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
addStringStartsWithRestriction(builder, predicates, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossVolumeUnitOfMeasureCode());
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
addOrder(builder, orders, bookingAirWaybill.get(AirWaybill_.airWaybillNumber), sorting.getBookingAirWaybillAirWaybillNumberOrderType());
addOrder(builder, orders, root.get(DatedFlightBooking_.numberOfPieces), sorting.getNumberOfPiecesOrderType());
addOrder(builder, orders, root.get(DatedFlightBooking_.grossWeight), sorting.getGrossWeightOrderType());
addOrder(builder, orders, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossWeightUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightBooking_.grossVolume), sorting.getGrossVolumeOrderType());
addOrder(builder, orders, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossVolumeUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightBooking_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<DatedFlightBooking> query = session.createQuery(criteria);
if (firstResult != null){
query.setFirstResult(firstResult.intValue());
}
if (maxResults != null){
query.setMaxResults(maxResults.intValue());
}
return query.getResultList();
}

/**
 * scroll filtered object list from booking
 */
@Override
@SuppressWarnings("unchecked")
public List<DatedFlightBooking> scrollFromBooking(Long bookingId, DatedFlightBookingFilter filter, DatedFlightBookingSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightBooking> criteria = builder.createQuery(DatedFlightBooking.class);

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Fetch<DatedFlightBooking, DatedFlight> datedFlightFetch = root.fetch(DatedFlightBooking_.datedFlight, JoinType.LEFT);
Join<DatedFlightBooking, DatedFlight> datedFlight = (Join<DatedFlightBooking, DatedFlight>)datedFlightFetch;
Fetch<DatedFlight, AirlineCompany> datedFlightCompanyFetch = datedFlight.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = (Join<DatedFlight, AirlineCompany>)datedFlightCompanyFetch;
Fetch<DatedFlightBooking, Booking> bookingFetch = root.fetch(DatedFlightBooking_.booking, JoinType.LEFT);
Join<DatedFlightBooking, Booking> booking = (Join<DatedFlightBooking, Booking>)bookingFetch;
Fetch<Booking, AirWaybill> bookingAirWaybillFetch = booking.fetch(Booking_.airWaybill, JoinType.LEFT);
Join<Booking, AirWaybill> bookingAirWaybill = (Join<Booking, AirWaybill>)bookingAirWaybillFetch;
Fetch<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(DatedFlightBooking_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<DatedFlightBooking, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(DatedFlightBooking_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<DatedFlightBooking, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, datedFlightCompany.get(AirlineCompany_.iataCode), filter.getDatedFlightCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, datedFlight.get(DatedFlight_.flightNumber), filter.getDatedFlightFlightNumber());
addBetweenRestriction(builder, predicates, datedFlight.get(DatedFlight_.departureDate), filter.getDatedFlightDepartureDateMinValue(), filter.getDatedFlightDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, bookingAirWaybill.get(AirWaybill_.airWaybillNumber), filter.getBookingAirWaybillAirWaybillNumber());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlightBooking_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
addStringStartsWithRestriction(builder, predicates, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossVolumeUnitOfMeasureCode());
if (bookingId == null){
predicates.add(builder.isNull(booking.get(Booking_.id)));
} else {
predicates.add(builder.equal(booking.get(Booking_.id), bookingId));
}
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, datedFlightCompany.get(AirlineCompany_.iataCode), sorting.getDatedFlightCompanyIataCodeOrderType());
addOrder(builder, orders, datedFlight.get(DatedFlight_.flightNumber), sorting.getDatedFlightFlightNumberOrderType());
addOrder(builder, orders, datedFlight.get(DatedFlight_.departureDate), sorting.getDatedFlightDepartureDateOrderType());
addOrder(builder, orders, bookingAirWaybill.get(AirWaybill_.airWaybillNumber), sorting.getBookingAirWaybillAirWaybillNumberOrderType());
addOrder(builder, orders, root.get(DatedFlightBooking_.numberOfPieces), sorting.getNumberOfPiecesOrderType());
addOrder(builder, orders, root.get(DatedFlightBooking_.grossWeight), sorting.getGrossWeightOrderType());
addOrder(builder, orders, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossWeightUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightBooking_.grossVolume), sorting.getGrossVolumeOrderType());
addOrder(builder, orders, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossVolumeUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(DatedFlightBooking_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<DatedFlightBooking> query = session.createQuery(criteria);
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
public DatedFlightBooking findOrNull(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String bookingAirWaybillAirWaybillNumber) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlightBooking> criteria = builder.createQuery(DatedFlightBooking.class);

Root<DatedFlightBooking> root = criteria.from(DatedFlightBooking.class);
Join<DatedFlightBooking, DatedFlight> datedFlight = root.join(DatedFlightBooking_.datedFlight, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> datedFlightCompany = datedFlight.join(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlightBooking, Booking> booking = root.join(DatedFlightBooking_.booking, JoinType.LEFT);
Join<Booking, AirWaybill> bookingAirWaybill = booking.join(Booking_.airWaybill, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, datedFlightCompany.get(AirlineCompany_.iataCode), datedFlightCompanyIataCode);
addEqualsRestriction(builder, predicates, datedFlight.get(DatedFlight_.flightNumber), datedFlightFlightNumber);
addEqualsRestriction(builder, predicates, datedFlight.get(DatedFlight_.departureDate), datedFlightDepartureDate);
addEqualsRestriction(builder, predicates, bookingAirWaybill.get(AirWaybill_.airWaybillNumber), bookingAirWaybillAirWaybillNumber);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public DatedFlightBooking find(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String bookingAirWaybillAirWaybillNumber) {
if (datedFlightCompanyIataCode == null && datedFlightFlightNumber == null && datedFlightDepartureDate == null && bookingAirWaybillAirWaybillNumber == null) {
return null;
}
DatedFlightBooking datedFlightBooking = findOrNull(datedFlightCompanyIataCode, datedFlightFlightNumber, datedFlightDepartureDate, bookingAirWaybillAirWaybillNumber);
if (datedFlightBooking == null) {
throw new ObjectNotFoundException("DatedFlightBooking.notFound");
} else {
return datedFlightBooking;
}
}

/**
 * exists object
 */
@Override
public boolean exists(String datedFlightCompanyIataCode, String datedFlightFlightNumber, LocalDate datedFlightDepartureDate, String bookingAirWaybillAirWaybillNumber) {
if (datedFlightCompanyIataCode == null && datedFlightFlightNumber == null && datedFlightDepartureDate == null && bookingAirWaybillAirWaybillNumber == null) {
return false;
}
DatedFlightBooking datedFlightBooking = findOrNull(datedFlightCompanyIataCode, datedFlightFlightNumber, datedFlightDepartureDate, bookingAirWaybillAirWaybillNumber);
return datedFlightBooking != null;
}

}