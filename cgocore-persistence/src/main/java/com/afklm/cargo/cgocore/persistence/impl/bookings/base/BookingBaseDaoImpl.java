package com.afklm.cargo.cgocore.persistence.impl.bookings.base;

import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addBetweenRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addEqualsRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addOrder;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addStringStartsWithRestriction;

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

import com.afklm.cargo.cgocore.api.model.bookings.filters.BookingFilter;
import com.afklm.cargo.cgocore.api.model.bookings.sortings.BookingSorting;
import com.afklm.cargo.cgocore.model.bookings.Booking;
import com.afklm.cargo.cgocore.model.bookings.Booking_;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure_;
import com.afklm.cargo.cgocore.model.reference.localization.Station;
import com.afklm.cargo.cgocore.model.reference.localization.Station_;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill_;
import com.afklm.cargo.cgocore.persistence.interfaces.bookings.base.BookingBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class BookingBaseDaoImpl extends BaseDaoImpl<Booking, Long> implements BookingBaseDao {

/**
 * constructor
 */
public BookingBaseDaoImpl() {
super(Booking.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<Booking> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Booking> criteria = builder.createQuery(Booking.class);

Root<Booking> root = criteria.from(Booking.class);
Fetch<Booking, AirWaybill> airWaybillFetch = root.fetch(Booking_.airWaybill, JoinType.LEFT);
Join<Booking, AirWaybill> airWaybill = (Join<Booking, AirWaybill>)airWaybillFetch;
Fetch<Booking, Station> originFetch = root.fetch(Booking_.origin, JoinType.LEFT);
Join<Booking, Station> origin = (Join<Booking, Station>)originFetch;
Fetch<Booking, Station> destinationFetch = root.fetch(Booking_.destination, JoinType.LEFT);
Join<Booking, Station> destination = (Join<Booking, Station>)destinationFetch;
Fetch<Booking, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(Booking_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<Booking, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<Booking, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<Booking, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(Booking_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<Booking, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<Booking, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(Booking_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(BookingFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<Booking> root = criteria.from(Booking.class);
Join<Booking, AirWaybill> airWaybill = root.join(Booking_.airWaybill, JoinType.LEFT);
Join<Booking, Station> origin = root.join(Booking_.origin, JoinType.LEFT);
Join<Booking, Station> destination = root.join(Booking_.destination, JoinType.LEFT);
Join<Booking, UnitOfMeasure> grossWeightUnitOfMeasure = root.join(Booking_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<Booking, UnitOfMeasure> grossVolumeUnitOfMeasure = root.join(Booking_.grossVolumeUnitOfMeasure, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, airWaybill.get(AirWaybill_.airWaybillNumber), filter.getAirWaybillAirWaybillNumber());
addStringStartsWithRestriction(builder, predicates, origin.get(Station_.iataCode), filter.getOriginIataCode());
addStringStartsWithRestriction(builder, predicates, destination.get(Station_.iataCode), filter.getDestinationIataCode());
addBetweenRestriction(builder, predicates, root.get(Booking_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(Booking_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(Booking_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
addStringStartsWithRestriction(builder, predicates, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossVolumeUnitOfMeasureCode());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * scroll filtered object list
 */
@Override
@SuppressWarnings("unchecked")
public List<Booking> scroll(BookingFilter filter, BookingSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Booking> criteria = builder.createQuery(Booking.class);

Root<Booking> root = criteria.from(Booking.class);
Fetch<Booking, AirWaybill> airWaybillFetch = root.fetch(Booking_.airWaybill, JoinType.LEFT);
Join<Booking, AirWaybill> airWaybill = (Join<Booking, AirWaybill>)airWaybillFetch;
Fetch<Booking, Station> originFetch = root.fetch(Booking_.origin, JoinType.LEFT);
Join<Booking, Station> origin = (Join<Booking, Station>)originFetch;
Fetch<Booking, Station> destinationFetch = root.fetch(Booking_.destination, JoinType.LEFT);
Join<Booking, Station> destination = (Join<Booking, Station>)destinationFetch;
Fetch<Booking, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(Booking_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<Booking, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<Booking, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<Booking, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(Booking_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<Booking, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<Booking, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, airWaybill.get(AirWaybill_.airWaybillNumber), filter.getAirWaybillAirWaybillNumber());
addStringStartsWithRestriction(builder, predicates, origin.get(Station_.iataCode), filter.getOriginIataCode());
addStringStartsWithRestriction(builder, predicates, destination.get(Station_.iataCode), filter.getDestinationIataCode());
addBetweenRestriction(builder, predicates, root.get(Booking_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(Booking_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(Booking_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
addStringStartsWithRestriction(builder, predicates, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossVolumeUnitOfMeasureCode());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, airWaybill.get(AirWaybill_.airWaybillNumber), sorting.getAirWaybillAirWaybillNumberOrderType());
addOrder(builder, orders, origin.get(Station_.iataCode), sorting.getOriginIataCodeOrderType());
addOrder(builder, orders, destination.get(Station_.iataCode), sorting.getDestinationIataCodeOrderType());
addOrder(builder, orders, root.get(Booking_.numberOfPieces), sorting.getNumberOfPiecesOrderType());
addOrder(builder, orders, root.get(Booking_.grossWeight), sorting.getGrossWeightOrderType());
addOrder(builder, orders, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossWeightUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(Booking_.grossVolume), sorting.getGrossVolumeOrderType());
addOrder(builder, orders, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossVolumeUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(Booking_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<Booking> query = session.createQuery(criteria);
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
public Booking findOrNull(String airWaybillAirWaybillNumber) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Booking> criteria = builder.createQuery(Booking.class);

Root<Booking> root = criteria.from(Booking.class);
Join<Booking, AirWaybill> airWaybill = root.join(Booking_.airWaybill, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, airWaybill.get(AirWaybill_.airWaybillNumber), airWaybillAirWaybillNumber);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public Booking find(String airWaybillAirWaybillNumber) {
if (airWaybillAirWaybillNumber == null) {
return null;
}
Booking booking = findOrNull(airWaybillAirWaybillNumber);
if (booking == null) {
throw new ObjectNotFoundException("Booking.notFound");
} else {
return booking;
}
}

/**
 * exists object
 */
@Override
public boolean exists(String airWaybillAirWaybillNumber) {
if (airWaybillAirWaybillNumber == null) {
return false;
}
Booking booking = findOrNull(airWaybillAirWaybillNumber);
return booking != null;
}

}