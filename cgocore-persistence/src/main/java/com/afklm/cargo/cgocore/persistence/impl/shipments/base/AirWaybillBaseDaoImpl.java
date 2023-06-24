package com.afklm.cargo.cgocore.persistence.impl.shipments.base;

import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addBetweenRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addEqualsRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addOrder;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addStringStartsWithRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.getStringStartsWithRestriction;

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

import com.afklm.cargo.cgocore.api.model.shipments.filters.AirWaybillFilter;
import com.afklm.cargo.cgocore.api.model.shipments.sortings.AirWaybillSorting;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure_;
import com.afklm.cargo.cgocore.model.reference.localization.Station;
import com.afklm.cargo.cgocore.model.reference.localization.Station_;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill_;
import com.afklm.cargo.cgocore.persistence.interfaces.shipments.base.AirWaybillBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirWaybillBaseDaoImpl extends BaseDaoImpl<AirWaybill, Long> implements AirWaybillBaseDao {

/**
 * constructor
 */
public AirWaybillBaseDaoImpl() {
super(AirWaybill.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<AirWaybill> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<AirWaybill> criteria = builder.createQuery(AirWaybill.class);

Root<AirWaybill> root = criteria.from(AirWaybill.class);
Fetch<AirWaybill, Station> originFetch = root.fetch(AirWaybill_.origin, JoinType.LEFT);
Join<AirWaybill, Station> origin = (Join<AirWaybill, Station>)originFetch;
Fetch<AirWaybill, Station> destinationFetch = root.fetch(AirWaybill_.destination, JoinType.LEFT);
Join<AirWaybill, Station> destination = (Join<AirWaybill, Station>)destinationFetch;
Fetch<AirWaybill, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(AirWaybill_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<AirWaybill, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<AirWaybill, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<AirWaybill, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(AirWaybill_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<AirWaybill, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<AirWaybill, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(AirWaybill_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(AirWaybillFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<AirWaybill> root = criteria.from(AirWaybill.class);
Join<AirWaybill, Station> origin = root.join(AirWaybill_.origin, JoinType.LEFT);
Join<AirWaybill, Station> destination = root.join(AirWaybill_.destination, JoinType.LEFT);
Join<AirWaybill, UnitOfMeasure> grossWeightUnitOfMeasure = root.join(AirWaybill_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<AirWaybill, UnitOfMeasure> grossVolumeUnitOfMeasure = root.join(AirWaybill_.grossVolumeUnitOfMeasure, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(AirWaybill_.airWaybillNumber), filter.getAirWaybillNumber());
addStringStartsWithRestriction(builder, predicates, root.get(AirWaybill_.forwarderName), filter.getForwarderName());
addStringStartsWithRestriction(builder, predicates, origin.get(Station_.iataCode), filter.getOriginIataCode());
addStringStartsWithRestriction(builder, predicates, destination.get(Station_.iataCode), filter.getDestinationIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(AirWaybill_.goddsDescription), filter.getGoddsDescription());
addStringStartsWithRestriction(builder, predicates, root.get(AirWaybill_.hsCode), filter.getHsCode());
addBetweenRestriction(builder, predicates, root.get(AirWaybill_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(AirWaybill_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addBetweenRestriction(builder, predicates, root.get(AirWaybill_.chargeableWeight), filter.getChargeableWeightMinValue(), filter.getChargeableWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(AirWaybill_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
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
public List<AirWaybill> scroll(AirWaybillFilter filter, AirWaybillSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<AirWaybill> criteria = builder.createQuery(AirWaybill.class);

Root<AirWaybill> root = criteria.from(AirWaybill.class);
Fetch<AirWaybill, Station> originFetch = root.fetch(AirWaybill_.origin, JoinType.LEFT);
Join<AirWaybill, Station> origin = (Join<AirWaybill, Station>)originFetch;
Fetch<AirWaybill, Station> destinationFetch = root.fetch(AirWaybill_.destination, JoinType.LEFT);
Join<AirWaybill, Station> destination = (Join<AirWaybill, Station>)destinationFetch;
Fetch<AirWaybill, UnitOfMeasure> grossWeightUnitOfMeasureFetch = root.fetch(AirWaybill_.grossWeightUnitOfMeasure, JoinType.LEFT);
Join<AirWaybill, UnitOfMeasure> grossWeightUnitOfMeasure = (Join<AirWaybill, UnitOfMeasure>)grossWeightUnitOfMeasureFetch;
Fetch<AirWaybill, UnitOfMeasure> grossVolumeUnitOfMeasureFetch = root.fetch(AirWaybill_.grossVolumeUnitOfMeasure, JoinType.LEFT);
Join<AirWaybill, UnitOfMeasure> grossVolumeUnitOfMeasure = (Join<AirWaybill, UnitOfMeasure>)grossVolumeUnitOfMeasureFetch;

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(AirWaybill_.airWaybillNumber), filter.getAirWaybillNumber());
addStringStartsWithRestriction(builder, predicates, root.get(AirWaybill_.forwarderName), filter.getForwarderName());
addStringStartsWithRestriction(builder, predicates, origin.get(Station_.iataCode), filter.getOriginIataCode());
addStringStartsWithRestriction(builder, predicates, destination.get(Station_.iataCode), filter.getDestinationIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(AirWaybill_.goddsDescription), filter.getGoddsDescription());
addStringStartsWithRestriction(builder, predicates, root.get(AirWaybill_.hsCode), filter.getHsCode());
addBetweenRestriction(builder, predicates, root.get(AirWaybill_.numberOfPieces), filter.getNumberOfPiecesMinValue(), filter.getNumberOfPiecesMaxValue());
addBetweenRestriction(builder, predicates, root.get(AirWaybill_.grossWeight), filter.getGrossWeightMinValue(), filter.getGrossWeightMaxValue());
addBetweenRestriction(builder, predicates, root.get(AirWaybill_.chargeableWeight), filter.getChargeableWeightMinValue(), filter.getChargeableWeightMaxValue());
addStringStartsWithRestriction(builder, predicates, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossWeightUnitOfMeasureCode());
addBetweenRestriction(builder, predicates, root.get(AirWaybill_.grossVolume), filter.getGrossVolumeMinValue(), filter.getGrossVolumeMaxValue());
addStringStartsWithRestriction(builder, predicates, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), filter.getGrossVolumeUnitOfMeasureCode());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(AirWaybill_.airWaybillNumber), sorting.getAirWaybillNumberOrderType());
addOrder(builder, orders, root.get(AirWaybill_.forwarderName), sorting.getForwarderNameOrderType());
addOrder(builder, orders, origin.get(Station_.iataCode), sorting.getOriginIataCodeOrderType());
addOrder(builder, orders, destination.get(Station_.iataCode), sorting.getDestinationIataCodeOrderType());
addOrder(builder, orders, root.get(AirWaybill_.goddsDescription), sorting.getGoddsDescriptionOrderType());
addOrder(builder, orders, root.get(AirWaybill_.hsCode), sorting.getHsCodeOrderType());
addOrder(builder, orders, root.get(AirWaybill_.numberOfPieces), sorting.getNumberOfPiecesOrderType());
addOrder(builder, orders, root.get(AirWaybill_.grossWeight), sorting.getGrossWeightOrderType());
addOrder(builder, orders, root.get(AirWaybill_.chargeableWeight), sorting.getChargeableWeightOrderType());
addOrder(builder, orders, grossWeightUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossWeightUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(AirWaybill_.grossVolume), sorting.getGrossVolumeOrderType());
addOrder(builder, orders, grossVolumeUnitOfMeasure.get(UnitOfMeasure_.code), sorting.getGrossVolumeUnitOfMeasureCodeOrderType());
addOrder(builder, orders, root.get(AirWaybill_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<AirWaybill> query = session.createQuery(criteria);
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
public AirWaybill findOrNull(String airWaybillNumber) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<AirWaybill> criteria = builder.createQuery(AirWaybill.class);

Root<AirWaybill> root = criteria.from(AirWaybill.class);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, root.get(AirWaybill_.airWaybillNumber), airWaybillNumber);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public AirWaybill find(String airWaybillNumber) {
if (airWaybillNumber == null) {
return null;
}
AirWaybill airWaybill = findOrNull(airWaybillNumber);
if (airWaybill == null) {
throw new ObjectNotFoundException("AirWaybill.notFound");
} else {
return airWaybill;
}
}

/**
 * exists object
 */
@Override
public boolean exists(String airWaybillNumber) {
if (airWaybillNumber == null) {
return false;
}
AirWaybill airWaybill = findOrNull(airWaybillNumber);
return airWaybill != null;
}

/**
 * search
 */
@Override
public List<AirWaybill> search(String arg) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<AirWaybill> criteria = builder.createQuery(AirWaybill.class);

Root<AirWaybill> root = criteria.from(AirWaybill.class);

Predicate predicate = getStringStartsWithRestriction(builder, root.get(AirWaybill_.airWaybillNumber), arg);
if (predicate!=null){
criteria.where(predicate);
}

criteria.select(root);

Query<AirWaybill> query = session.createQuery(criteria);
query.setMaxResults(20);
return query.getResultList();
}

}