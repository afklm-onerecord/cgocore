package com.afklm.cargo.cgocore.persistence.impl.reference.commodities.base;

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

import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.UnitOfMeasureFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.UnitOfMeasureSorting;
import com.afklm.cargo.cgocore.model.reference.commodities.Metric;
import com.afklm.cargo.cgocore.model.reference.commodities.Metric_;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure_;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.base.UnitOfMeasureBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UnitOfMeasureBaseDaoImpl extends BaseDaoImpl<UnitOfMeasure, Integer> implements UnitOfMeasureBaseDao {

/**
 * constructor
 */
public UnitOfMeasureBaseDaoImpl() {
super(UnitOfMeasure.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<UnitOfMeasure> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<UnitOfMeasure> criteria = builder.createQuery(UnitOfMeasure.class);

Root<UnitOfMeasure> root = criteria.from(UnitOfMeasure.class);
Fetch<UnitOfMeasure, Metric> metricFetch = root.fetch(UnitOfMeasure_.metric, JoinType.LEFT);
Join<UnitOfMeasure, Metric> metric = (Join<UnitOfMeasure, Metric>)metricFetch;

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(UnitOfMeasure_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(UnitOfMeasureFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<UnitOfMeasure> root = criteria.from(UnitOfMeasure.class);
Join<UnitOfMeasure, Metric> metric = root.join(UnitOfMeasure_.metric, JoinType.LEFT);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(UnitOfMeasure_.code), filter.getCode());
addStringStartsWithRestriction(builder, predicates, root.get(UnitOfMeasure_.label), filter.getLabel());
addStringStartsWithRestriction(builder, predicates, metric.get(Metric_.code), filter.getMetricCode());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * scroll filtered object list
 */
@Override
@SuppressWarnings("unchecked")
public List<UnitOfMeasure> scroll(UnitOfMeasureFilter filter, UnitOfMeasureSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<UnitOfMeasure> criteria = builder.createQuery(UnitOfMeasure.class);

Root<UnitOfMeasure> root = criteria.from(UnitOfMeasure.class);
Fetch<UnitOfMeasure, Metric> metricFetch = root.fetch(UnitOfMeasure_.metric, JoinType.LEFT);
Join<UnitOfMeasure, Metric> metric = (Join<UnitOfMeasure, Metric>)metricFetch;

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(UnitOfMeasure_.code), filter.getCode());
addStringStartsWithRestriction(builder, predicates, root.get(UnitOfMeasure_.label), filter.getLabel());
addStringStartsWithRestriction(builder, predicates, metric.get(Metric_.code), filter.getMetricCode());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(UnitOfMeasure_.code), sorting.getCodeOrderType());
addOrder(builder, orders, root.get(UnitOfMeasure_.label), sorting.getLabelOrderType());
addOrder(builder, orders, metric.get(Metric_.code), sorting.getMetricCodeOrderType());
addOrder(builder, orders, root.get(UnitOfMeasure_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<UnitOfMeasure> query = session.createQuery(criteria);
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
public UnitOfMeasure findOrNull(String code) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<UnitOfMeasure> criteria = builder.createQuery(UnitOfMeasure.class);

Root<UnitOfMeasure> root = criteria.from(UnitOfMeasure.class);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, root.get(UnitOfMeasure_.code), code);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public UnitOfMeasure find(String code) {
if (code == null) {
return null;
}
UnitOfMeasure unitOfMeasure = findOrNull(code);
if (unitOfMeasure == null) {
throw new ObjectNotFoundException("UnitOfMeasure.notFound");
} else {
return unitOfMeasure;
}
}

/**
 * exists object
 */
@Override
public boolean exists(String code) {
if (code == null) {
return false;
}
UnitOfMeasure unitOfMeasure = findOrNull(code);
return unitOfMeasure != null;
}

}