package com.afklm.cargo.cgocore.persistence.impl.schedule.base;

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

import com.afklm.cargo.cgocore.api.model.schedule.filters.DatedFlightFilter;
import com.afklm.cargo.cgocore.api.model.schedule.sortings.DatedFlightSorting;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany_;
import com.afklm.cargo.cgocore.model.reference.localization.Station;
import com.afklm.cargo.cgocore.model.reference.localization.Station_;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight_;
import com.afklm.cargo.cgocore.persistence.interfaces.schedule.base.DatedFlightBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBaseDaoImpl extends BaseDaoImpl<DatedFlight, Integer> implements DatedFlightBaseDao {

/**
 * constructor
 */
public DatedFlightBaseDaoImpl() {
super(DatedFlight.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<DatedFlight> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlight> criteria = builder.createQuery(DatedFlight.class);

Root<DatedFlight> root = criteria.from(DatedFlight.class);
Fetch<DatedFlight, AirlineCompany> companyFetch = root.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> company = (Join<DatedFlight, AirlineCompany>)companyFetch;
Fetch<DatedFlight, Station> originFetch = root.fetch(DatedFlight_.origin, JoinType.LEFT);
Join<DatedFlight, Station> origin = (Join<DatedFlight, Station>)originFetch;
Fetch<DatedFlight, Station> destinationFetch = root.fetch(DatedFlight_.destination, JoinType.LEFT);
Join<DatedFlight, Station> destination = (Join<DatedFlight, Station>)destinationFetch;

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(DatedFlight_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(DatedFlightFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<DatedFlight> root = criteria.from(DatedFlight.class);
Join<DatedFlight, AirlineCompany> company = root.join(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, Station> origin = root.join(DatedFlight_.origin, JoinType.LEFT);
Join<DatedFlight, Station> destination = root.join(DatedFlight_.destination, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, company.get(AirlineCompany_.iataCode), filter.getCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlight_.flightNumber), filter.getFlightNumber());
addBetweenRestriction(builder, predicates, root.get(DatedFlight_.departureDate), filter.getDepartureDateMinValue(), filter.getDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, origin.get(Station_.iataCode), filter.getOriginIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlight_.departureTime), filter.getDepartureTime());
addStringStartsWithRestriction(builder, predicates, destination.get(Station_.iataCode), filter.getDestinationIataCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlight_.arrivalDate), filter.getArrivalDateMinValue(), filter.getArrivalDateMaxValue());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlight_.arrivalTime), filter.getArrivalTime());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * scroll filtered object list
 */
@Override
@SuppressWarnings("unchecked")
public List<DatedFlight> scroll(DatedFlightFilter filter, DatedFlightSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlight> criteria = builder.createQuery(DatedFlight.class);

Root<DatedFlight> root = criteria.from(DatedFlight.class);
Fetch<DatedFlight, AirlineCompany> companyFetch = root.fetch(DatedFlight_.company, JoinType.LEFT);
Join<DatedFlight, AirlineCompany> company = (Join<DatedFlight, AirlineCompany>)companyFetch;
Fetch<DatedFlight, Station> originFetch = root.fetch(DatedFlight_.origin, JoinType.LEFT);
Join<DatedFlight, Station> origin = (Join<DatedFlight, Station>)originFetch;
Fetch<DatedFlight, Station> destinationFetch = root.fetch(DatedFlight_.destination, JoinType.LEFT);
Join<DatedFlight, Station> destination = (Join<DatedFlight, Station>)destinationFetch;

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, company.get(AirlineCompany_.iataCode), filter.getCompanyIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlight_.flightNumber), filter.getFlightNumber());
addBetweenRestriction(builder, predicates, root.get(DatedFlight_.departureDate), filter.getDepartureDateMinValue(), filter.getDepartureDateMaxValue());
addStringStartsWithRestriction(builder, predicates, origin.get(Station_.iataCode), filter.getOriginIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlight_.departureTime), filter.getDepartureTime());
addStringStartsWithRestriction(builder, predicates, destination.get(Station_.iataCode), filter.getDestinationIataCode());
addBetweenRestriction(builder, predicates, root.get(DatedFlight_.arrivalDate), filter.getArrivalDateMinValue(), filter.getArrivalDateMaxValue());
addStringStartsWithRestriction(builder, predicates, root.get(DatedFlight_.arrivalTime), filter.getArrivalTime());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, company.get(AirlineCompany_.iataCode), sorting.getCompanyIataCodeOrderType());
addOrder(builder, orders, root.get(DatedFlight_.flightNumber), sorting.getFlightNumberOrderType());
addOrder(builder, orders, root.get(DatedFlight_.departureDate), sorting.getDepartureDateOrderType());
addOrder(builder, orders, origin.get(Station_.iataCode), sorting.getOriginIataCodeOrderType());
addOrder(builder, orders, root.get(DatedFlight_.departureTime), sorting.getDepartureTimeOrderType());
addOrder(builder, orders, destination.get(Station_.iataCode), sorting.getDestinationIataCodeOrderType());
addOrder(builder, orders, root.get(DatedFlight_.arrivalDate), sorting.getArrivalDateOrderType());
addOrder(builder, orders, root.get(DatedFlight_.arrivalTime), sorting.getArrivalTimeOrderType());
addOrder(builder, orders, root.get(DatedFlight_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<DatedFlight> query = session.createQuery(criteria);
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
public DatedFlight findOrNull(String companyIataCode, String flightNumber, LocalDate departureDate) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<DatedFlight> criteria = builder.createQuery(DatedFlight.class);

Root<DatedFlight> root = criteria.from(DatedFlight.class);
Join<DatedFlight, AirlineCompany> company = root.join(DatedFlight_.company, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, company.get(AirlineCompany_.iataCode), companyIataCode);
addEqualsRestriction(builder, predicates, root.get(DatedFlight_.flightNumber), flightNumber);
addEqualsRestriction(builder, predicates, root.get(DatedFlight_.departureDate), departureDate);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public DatedFlight find(String companyIataCode, String flightNumber, LocalDate departureDate) {
if (companyIataCode == null && flightNumber == null && departureDate == null) {
return null;
}
DatedFlight datedFlight = findOrNull(companyIataCode, flightNumber, departureDate);
if (datedFlight == null) {
throw new ObjectNotFoundException("DatedFlight.notFound");
} else {
return datedFlight;
}
}

/**
 * exists object
 */
@Override
public boolean exists(String companyIataCode, String flightNumber, LocalDate departureDate) {
if (companyIataCode == null && flightNumber == null && departureDate == null) {
return false;
}
DatedFlight datedFlight = findOrNull(companyIataCode, flightNumber, departureDate);
return datedFlight != null;
}

}