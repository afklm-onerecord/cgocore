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

import com.afklm.cargo.cgocore.api.model.reference.localization.filters.CurrencyFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.CurrencySorting;
import com.afklm.cargo.cgocore.model.reference.localization.Currency;
import com.afklm.cargo.cgocore.model.reference.localization.Currency_;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.base.CurrencyBaseDao;

/**
 * auto generated base dao class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class CurrencyBaseDaoImpl extends BaseDaoImpl<Currency, Integer> implements CurrencyBaseDao {

/**
 * constructor
 */
public CurrencyBaseDaoImpl() {
super(Currency.class);
}
/**
 * load object list eagerly
 */
@Override
@SuppressWarnings({"unused","unchecked"})
public List<Currency> loadListEagerly() {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Currency> criteria = builder.createQuery(Currency.class);

Root<Currency> root = criteria.from(Currency.class);

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(Currency_.id), OrderType.DESC);
criteria.orderBy(orders);

return session.createQuery(criteria).getResultList();
}

/**
 * count filtered object list
 */
@Override
public Long count(CurrencyFilter filter) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Long> criteria = builder.createQuery(Long.class);

Root<Currency> root = criteria.from(Currency.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(Currency_.isoCode), filter.getIsoCode());
addStringStartsWithRestriction(builder, predicates, root.get(Currency_.label), filter.getLabel());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(builder.count(root));
return session.createQuery(criteria).getSingleResult();
}

/**
 * scroll filtered object list
 */
@Override
@SuppressWarnings("unchecked")
public List<Currency> scroll(CurrencyFilter filter, CurrencySorting sorting, Long firstResult, Long maxResults) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Currency> criteria = builder.createQuery(Currency.class);

Root<Currency> root = criteria.from(Currency.class);

List<Predicate> predicates = new ArrayList<>();
addStringStartsWithRestriction(builder, predicates, root.get(Currency_.isoCode), filter.getIsoCode());
addStringStartsWithRestriction(builder, predicates, root.get(Currency_.label), filter.getLabel());
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);
List<Order> orders = new ArrayList<>();
addOrder(builder, orders, root.get(Currency_.isoCode), sorting.getIsoCodeOrderType());
addOrder(builder, orders, root.get(Currency_.label), sorting.getLabelOrderType());
addOrder(builder, orders, root.get(Currency_.id), OrderType.DESC);
criteria.orderBy(orders);

Query<Currency> query = session.createQuery(criteria);
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
public Currency findOrNull(String isoCode) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Currency> criteria = builder.createQuery(Currency.class);

Root<Currency> root = criteria.from(Currency.class);

List<Predicate> predicates = new ArrayList<>();
addEqualsRestriction(builder, predicates, root.get(Currency_.isoCode), isoCode);
criteria.where(predicates.toArray(new Predicate[predicates.size()]));

criteria.select(root);

return session.createQuery(criteria).uniqueResult();
}

/**
 * find object
 */
@Override
public Currency find(String isoCode) {
if (isoCode == null) {
return null;
}
Currency currency = findOrNull(isoCode);
if (currency == null) {
throw new ObjectNotFoundException("Currency.notFound");
} else {
return currency;
}
}

/**
 * exists object
 */
@Override
public boolean exists(String isoCode) {
if (isoCode == null) {
return false;
}
Currency currency = findOrNull(isoCode);
return currency != null;
}

/**
 * search
 */
@Override
public List<Currency> search(String arg) {
Session session = this.sessionFactory.getCurrentSession();
CriteriaBuilder builder = session.getCriteriaBuilder();
CriteriaQuery<Currency> criteria = builder.createQuery(Currency.class);

Root<Currency> root = criteria.from(Currency.class);

Predicate predicate = getStringStartsWithRestriction(builder, root.get(Currency_.isoCode), arg);
if (predicate!=null){
criteria.where(predicate);
}

criteria.select(root);

Query<Currency> query = session.createQuery(criteria);
query.setMaxResults(20);
return query.getResultList();
}

}