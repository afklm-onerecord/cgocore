package com.afklm.cargo.cgocore.persistence.impl.reference.localization.base;

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

import com.afklm.cargo.cgocore.api.model.reference.localization.filters.StationFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.StationSorting;
import com.afklm.cargo.cgocore.model.reference.localization.Country;
import com.afklm.cargo.cgocore.model.reference.localization.Country_;
import com.afklm.cargo.cgocore.model.reference.localization.Station;
import com.afklm.cargo.cgocore.model.reference.localization.Station_;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.base.StationBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class StationBaseDaoImpl extends BaseDaoImpl<Station, Integer> implements StationBaseDao {

/**
 * constructor
 */
public StationBaseDaoImpl() {
super(Station.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<Station> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Station> criteria = builder.createQuery(Station.class);

Root<Station> root = criteria.from(Station.class);
Fetch<Station, Country> countryFetch = root.fetch(Station_.country, JoinType.LEFT);
Join<Station, Country> country = (Join<Station, Country>)countryFetch;

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(Station_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * load object list from country
 */
@Override
public List<Station> loadListFromCountry(Integer countryId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Station> criteria = builder.createQuery(Station.class);

Root<Station> root = criteria.from(Station.class);
Join<Station, Country> country = root.join(Station_.country, JoinType.LEFT);

if (countryId == null){
criteria.where(builder.isNull(country.get(Country_.id)));
} else {
criteria.where(builder.equal(country.get(Country_.id), countryId));
}

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(Station_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * load object list eagerly from country
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<Station> loadListEagerlyFromCountry(Integer countryId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Station> criteria = builder.createQuery(Station.class);

Root<Station> root = criteria.from(Station.class);
Fetch<Station, Country> countryFetch = root.fetch(Station_.country, JoinType.LEFT);
Join<Station, Country> country = (Join<Station, Country>)countryFetch;

if (countryId == null){
criteria.where(builder.isNull(country.get(Country_.id)));
} else {
criteria.where(builder.equal(country.get(Country_.id), countryId));
}

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(Station_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(StationFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<Station> root = criteria.from(Station.class);
Join<Station, Country> country = root.join(Station_.country, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(Station_.iataCode), filter.getIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(Station_.label), filter.getLabel());
addStringStartsWithRestriction(builder, predicates, country.get(Country_.iataCode), filter.getCountryIataCode());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * count object list from country
 */
public Long countFromCountry(Integer countryId) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<Station> root = criteria.from(Station.class);
Join<Station, Country> country = root.join(Station_.country, JoinType.LEFT);

if (countryId == null){
criteria.where(builder.isNull(country.get(Country_.id)));
} else {
criteria.where(builder.equal(country.get(Country_.id), countryId));
}

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * count filtered object list from country
 */
public Long countFromCountry(Integer countryId, StationFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<Station> root = criteria.from(Station.class);
Join<Station, Country> country = root.join(Station_.country, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(Station_.iataCode), filter.getIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(Station_.label), filter.getLabel());
addStringStartsWithRestriction(builder, predicates, country.get(Country_.iataCode), filter.getCountryIataCode());
if (countryId == null){
predicates.add(builder.isNull(country.get(Country_.id)));
} else {
predicates.add(builder.equal(country.get(Country_.id), countryId));
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
public List<Station> scroll(StationFilter filter, StationSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Station> criteria = builder.createQuery(Station.class);

Root<Station> root = criteria.from(Station.class);
Fetch<Station, Country> countryFetch = root.fetch(Station_.country, JoinType.LEFT);
Join<Station, Country> country = (Join<Station, Country>)countryFetch;

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(Station_.iataCode), filter.getIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(Station_.label), filter.getLabel());
addStringStartsWithRestriction(builder, predicates, country.get(Country_.iataCode), filter.getCountryIataCode());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(Station_.iataCode), sorting.getIataCodeOrderType());
addOrder(builder, orders, root.get(Station_.label), sorting.getLabelOrderType());
addOrder(builder, orders, country.get(Country_.iataCode), sorting.getCountryIataCodeOrderType());
addOrder(builder, orders, root.get(Station_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<Station> query = session.createQuery(criteria);
if (firstResult != null){
query.setFirstResult(firstResult.intValue());
}
if (maxResults != null){
query.setMaxResults(maxResults.intValue());
}
return query.getResultList();
}

/**
 * scroll filtered object list from country
 */
@Override
@SuppressWarnings("unchecked")
public List<Station> scrollFromCountry(Integer countryId, StationFilter filter, StationSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Station> criteria = builder.createQuery(Station.class);

Root<Station> root = criteria.from(Station.class);
Fetch<Station, Country> countryFetch = root.fetch(Station_.country, JoinType.LEFT);
Join<Station, Country> country = (Join<Station, Country>)countryFetch;

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(Station_.iataCode), filter.getIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(Station_.label), filter.getLabel());
addStringStartsWithRestriction(builder, predicates, country.get(Country_.iataCode), filter.getCountryIataCode());
if (countryId == null){
predicates.add(builder.isNull(country.get(Country_.id)));
} else {
predicates.add(builder.equal(country.get(Country_.id), countryId));
}
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(Station_.iataCode), sorting.getIataCodeOrderType());
addOrder(builder, orders, root.get(Station_.label), sorting.getLabelOrderType());
addOrder(builder, orders, country.get(Country_.iataCode), sorting.getCountryIataCodeOrderType());
addOrder(builder, orders, root.get(Station_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<Station> query = session.createQuery(criteria);
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
public Station findOrNull(String iataCode) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Station> criteria = builder.createQuery(Station.class);

Root<Station> root = criteria.from(Station.class);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, root.get(Station_.iataCode), iataCode);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public Station find(String iataCode) {
if (iataCode == null) {
return null;
}
Station station = findOrNull(iataCode);
if (station == null) {
throw new ObjectNotFoundException("Station.notFound");
} else {
return station;
}
}

/**
 * exists object
 */
@Override
public boolean exists(String iataCode) {
if (iataCode == null) {
return false;
}
Station station = findOrNull(iataCode);
return station != null;
}

/**
 * search
 */
@Override
public List<Station> search(String arg) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Station> criteria = builder.createQuery(Station.class);

Root<Station> root = criteria.from(Station.class);

Predicate predicate = getStringStartsWithRestriction(builder, root.get(Station_.iataCode), arg);
if (predicate!=null){
criteria.where(predicate);
}

criteria.select(root);

Query<Station> query = session.createQuery(criteria);
query.setMaxResults(20);
return query.getResultList();
}

}