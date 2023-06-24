package com.afklm.cargo.cgocore.persistence.impl.reference.commodities.base;

import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addEqualsRestriction;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addOrder;
import static org.sklsft.commons.model.patterns.JpaCriteriaUtils.addStringStartsWithRestriction;

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

import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.MetricFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.MetricSorting;
import com.afklm.cargo.cgocore.model.reference.commodities.Metric;
import com.afklm.cargo.cgocore.model.reference.commodities.Metric_;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.base.MetricBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class MetricBaseDaoImpl extends BaseDaoImpl<Metric, Integer> implements MetricBaseDao {

/**
 * constructor
 */
public MetricBaseDaoImpl() {
super(Metric.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<Metric> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Metric> criteria = builder.createQuery(Metric.class);

Root<Metric> root = criteria.from(Metric.class);

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(Metric_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(MetricFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<Metric> root = criteria.from(Metric.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(Metric_.code), filter.getCode());
addStringStartsWithRestriction(builder, predicates, root.get(Metric_.label), filter.getLabel());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * scroll filtered object list
 */
@Override
@SuppressWarnings("unchecked")
public List<Metric> scroll(MetricFilter filter, MetricSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Metric> criteria = builder.createQuery(Metric.class);

Root<Metric> root = criteria.from(Metric.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(Metric_.code), filter.getCode());
addStringStartsWithRestriction(builder, predicates, root.get(Metric_.label), filter.getLabel());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(Metric_.code), sorting.getCodeOrderType());
addOrder(builder, orders, root.get(Metric_.label), sorting.getLabelOrderType());
addOrder(builder, orders, root.get(Metric_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<Metric> query = session.createQuery(criteria);
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
public Metric findOrNull(String code) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Metric> criteria = builder.createQuery(Metric.class);

Root<Metric> root = criteria.from(Metric.class);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, root.get(Metric_.code), code);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public Metric find(String code) {
if (code == null) {
return null;
}
Metric metric = findOrNull(code);
if (metric == null) {
throw new ObjectNotFoundException("Metric.notFound");
} else {
return metric;
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
Metric metric = findOrNull(code);
return metric != null;
}

}