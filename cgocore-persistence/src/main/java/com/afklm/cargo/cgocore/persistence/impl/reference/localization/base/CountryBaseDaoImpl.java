package com.afklm.cargo.cgocore.persistence.impl.reference.localization.base;

import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addEqualsRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addOrder;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addStringStartsWithRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.getStringStartsWithRestriction;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.sklsft.commons.api.exception.repository.ObjectNotFoundException;
import org.sklsft.commons.api.model.OrderType;
import org.sklsft.commons.model.patterns.BaseDaoImpl;

import com.afklm.cargo.cgocore.api.model.reference.localization.filters.CountryFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.CountrySorting;
import com.afklm.cargo.cgocore.model.reference.localization.Country;
import com.afklm.cargo.cgocore.model.reference.localization.Country_;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.base.CountryBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class CountryBaseDaoImpl extends BaseDaoImpl<Country, Integer> implements CountryBaseDao {

/**
 * constructor
 */
public CountryBaseDaoImpl() {
super(Country.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<Country> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Country> criteria = builder.createQuery(Country.class);

Root<Country> root = criteria.from(Country.class);

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(Country_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(CountryFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<Country> root = criteria.from(Country.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(Country_.iataCode), filter.getIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(Country_.label), filter.getLabel());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * scroll filtered object list
 */
@Override
@SuppressWarnings("unchecked")
public List<Country> scroll(CountryFilter filter, CountrySorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Country> criteria = builder.createQuery(Country.class);

Root<Country> root = criteria.from(Country.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(Country_.iataCode), filter.getIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(Country_.label), filter.getLabel());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(Country_.iataCode), sorting.getIataCodeOrderType());
addOrder(builder, orders, root.get(Country_.label), sorting.getLabelOrderType());
addOrder(builder, orders, root.get(Country_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<Country> query = session.createQuery(criteria);
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
public Country findOrNull(String iataCode) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Country> criteria = builder.createQuery(Country.class);

Root<Country> root = criteria.from(Country.class);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, root.get(Country_.iataCode), iataCode);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public Country find(String iataCode) {
if (iataCode == null) {
return null;
}
Country country = findOrNull(iataCode);
if (country == null) {
throw new ObjectNotFoundException("Country.notFound");
} else {
return country;
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
Country country = findOrNull(iataCode);
return country != null;
}

/**
 * search
 */
@Override
public List<Country> search(String arg) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Country> criteria = builder.createQuery(Country.class);

Root<Country> root = criteria.from(Country.class);

Predicate predicate = getStringStartsWithRestriction(builder, root.get(Country_.iataCode), arg);
if (predicate!=null){
criteria.where(predicate);
}

criteria.select(root);

Query<Country> query = session.createQuery(criteria);
query.setMaxResults(20);
return query.getResultList();
}

}