package com.afklm.cargo.cgocore.persistence.impl.reference.containers.base;

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

import com.afklm.cargo.cgocore.api.model.reference.containers.filters.UldTypeFilter;
import com.afklm.cargo.cgocore.api.model.reference.containers.sortings.UldTypeSorting;
import com.afklm.cargo.cgocore.model.reference.containers.UldType;
import com.afklm.cargo.cgocore.model.reference.containers.UldType_;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.containers.base.UldTypeBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UldTypeBaseDaoImpl extends BaseDaoImpl<UldType, Integer> implements UldTypeBaseDao {

/**
 * constructor
 */
public UldTypeBaseDaoImpl() {
super(UldType.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<UldType> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<UldType> criteria = builder.createQuery(UldType.class);

Root<UldType> root = criteria.from(UldType.class);

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(UldType_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(UldTypeFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<UldType> root = criteria.from(UldType.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(UldType_.code), filter.getCode());
addStringStartsWithRestriction(builder, predicates, root.get(UldType_.label), filter.getLabel());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * scroll filtered object list
 */
@Override
@SuppressWarnings("unchecked")
public List<UldType> scroll(UldTypeFilter filter, UldTypeSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<UldType> criteria = builder.createQuery(UldType.class);

Root<UldType> root = criteria.from(UldType.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(UldType_.code), filter.getCode());
addStringStartsWithRestriction(builder, predicates, root.get(UldType_.label), filter.getLabel());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(UldType_.code), sorting.getCodeOrderType());
addOrder(builder, orders, root.get(UldType_.label), sorting.getLabelOrderType());
addOrder(builder, orders, root.get(UldType_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<UldType> query = session.createQuery(criteria);
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
public UldType findOrNull(String code) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<UldType> criteria = builder.createQuery(UldType.class);

Root<UldType> root = criteria.from(UldType.class);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, root.get(UldType_.code), code);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public UldType find(String code) {
if (code == null) {
return null;
}
UldType uldType = findOrNull(code);
if (uldType == null) {
throw new ObjectNotFoundException("UldType.notFound");
} else {
return uldType;
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
UldType uldType = findOrNull(code);
return uldType != null;
}

}