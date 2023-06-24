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

import com.afklm.cargo.cgocore.api.model.reference.commodities.filters.SpecialHandlingCodeFilter;
import com.afklm.cargo.cgocore.api.model.reference.commodities.sortings.SpecialHandlingCodeSorting;
import com.afklm.cargo.cgocore.model.reference.commodities.SpecialHandlingCode;
import com.afklm.cargo.cgocore.model.reference.commodities.SpecialHandlingCode_;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.base.SpecialHandlingCodeBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class SpecialHandlingCodeBaseDaoImpl extends BaseDaoImpl<SpecialHandlingCode, Integer> implements SpecialHandlingCodeBaseDao {

/**
 * constructor
 */
public SpecialHandlingCodeBaseDaoImpl() {
super(SpecialHandlingCode.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<SpecialHandlingCode> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<SpecialHandlingCode> criteria = builder.createQuery(SpecialHandlingCode.class);

Root<SpecialHandlingCode> root = criteria.from(SpecialHandlingCode.class);

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(SpecialHandlingCode_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(SpecialHandlingCodeFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<SpecialHandlingCode> root = criteria.from(SpecialHandlingCode.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(SpecialHandlingCode_.code), filter.getCode());
addStringStartsWithRestriction(builder, predicates, root.get(SpecialHandlingCode_.label), filter.getLabel());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * scroll filtered object list
 */
@Override
@SuppressWarnings("unchecked")
public List<SpecialHandlingCode> scroll(SpecialHandlingCodeFilter filter, SpecialHandlingCodeSorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<SpecialHandlingCode> criteria = builder.createQuery(SpecialHandlingCode.class);

Root<SpecialHandlingCode> root = criteria.from(SpecialHandlingCode.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(SpecialHandlingCode_.code), filter.getCode());
addStringStartsWithRestriction(builder, predicates, root.get(SpecialHandlingCode_.label), filter.getLabel());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(SpecialHandlingCode_.code), sorting.getCodeOrderType());
addOrder(builder, orders, root.get(SpecialHandlingCode_.label), sorting.getLabelOrderType());
addOrder(builder, orders, root.get(SpecialHandlingCode_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<SpecialHandlingCode> query = session.createQuery(criteria);
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
public SpecialHandlingCode findOrNull(String code) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<SpecialHandlingCode> criteria = builder.createQuery(SpecialHandlingCode.class);

Root<SpecialHandlingCode> root = criteria.from(SpecialHandlingCode.class);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, root.get(SpecialHandlingCode_.code), code);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public SpecialHandlingCode find(String code) {
if (code == null) {
return null;
}
SpecialHandlingCode specialHandlingCode = findOrNull(code);
if (specialHandlingCode == null) {
throw new ObjectNotFoundException("SpecialHandlingCode.notFound");
} else {
return specialHandlingCode;
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
SpecialHandlingCode specialHandlingCode = findOrNull(code);
return specialHandlingCode != null;
}

}