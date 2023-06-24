package com.afklm.cargo.cgocore.persistence.impl.reference.airlines.base;

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

import com.afklm.cargo.cgocore.api.model.reference.airlines.filters.AirlineCompanyFilter;
import com.afklm.cargo.cgocore.api.model.reference.airlines.sortings.AirlineCompanySorting;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany_;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.airlines.base.AirlineCompanyBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirlineCompanyBaseDaoImpl extends BaseDaoImpl<AirlineCompany, Integer> implements AirlineCompanyBaseDao {

/**
 * constructor
 */
public AirlineCompanyBaseDaoImpl() {
super(AirlineCompany.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<AirlineCompany> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<AirlineCompany> criteria = builder.createQuery(AirlineCompany.class);

Root<AirlineCompany> root = criteria.from(AirlineCompany.class);

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(AirlineCompany_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(AirlineCompanyFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<AirlineCompany> root = criteria.from(AirlineCompany.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(AirlineCompany_.iataCode), filter.getIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(AirlineCompany_.label), filter.getLabel());
addStringStartsWithRestriction(builder, predicates, root.get(AirlineCompany_.prefix), filter.getPrefix());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * scroll filtered object list
 */
@Override
@SuppressWarnings("unchecked")
public List<AirlineCompany> scroll(AirlineCompanyFilter filter, AirlineCompanySorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<AirlineCompany> criteria = builder.createQuery(AirlineCompany.class);

Root<AirlineCompany> root = criteria.from(AirlineCompany.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(AirlineCompany_.iataCode), filter.getIataCode());
addStringStartsWithRestriction(builder, predicates, root.get(AirlineCompany_.label), filter.getLabel());
addStringStartsWithRestriction(builder, predicates, root.get(AirlineCompany_.prefix), filter.getPrefix());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(AirlineCompany_.iataCode), sorting.getIataCodeOrderType());
addOrder(builder, orders, root.get(AirlineCompany_.label), sorting.getLabelOrderType());
addOrder(builder, orders, root.get(AirlineCompany_.prefix), sorting.getPrefixOrderType());
addOrder(builder, orders, root.get(AirlineCompany_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<AirlineCompany> query = session.createQuery(criteria);
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
public AirlineCompany findOrNull(String iataCode) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<AirlineCompany> criteria = builder.createQuery(AirlineCompany.class);

Root<AirlineCompany> root = criteria.from(AirlineCompany.class);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, root.get(AirlineCompany_.iataCode), iataCode);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public AirlineCompany find(String iataCode) {
if (iataCode == null) {
return null;
}
AirlineCompany airlineCompany = findOrNull(iataCode);
if (airlineCompany == null) {
throw new ObjectNotFoundException("AirlineCompany.notFound");
} else {
return airlineCompany;
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
AirlineCompany airlineCompany = findOrNull(iataCode);
return airlineCompany != null;
}

/**
 * search
 */
@Override
public List<AirlineCompany> search(String arg) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<AirlineCompany> criteria = builder.createQuery(AirlineCompany.class);

Root<AirlineCompany> root = criteria.from(AirlineCompany.class);

Predicate predicate = getStringStartsWithRestriction(builder, root.get(AirlineCompany_.iataCode), arg);
if (predicate!=null){
criteria.where(predicate);
}

criteria.select(root);

Query<AirlineCompany> query = session.createQuery(criteria);
query.setMaxResults(20);
return query.getResultList();
}

}