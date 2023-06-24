package com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.base;
import java.util.List;

import org.sklsft.commons.model.patterns.BaseDao;

import com.afklm.cargo.cgocore.api.model.reference.localization.filters.CurrencyFilter;
import com.afklm.cargo.cgocore.api.model.reference.localization.sortings.CurrencySorting;
import com.afklm.cargo.cgocore.model.reference.localization.Currency;
/**
 * auto generated base dao interface file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public interface CurrencyBaseDao extends BaseDao<Currency, Integer> {

/**
 * count filtered object list
 */
Long count(CurrencyFilter filter);

/**
 * scroll filtered object list
 */
List<Currency> scroll(CurrencyFilter filter, CurrencySorting sorting, Long firstResult, Long maxResults);

/**
 * exists object
 */
boolean exists(String isoCode);

/**
 * find object or null
 */
Currency findOrNull(String isoCode);

/**
 * find object
 */
Currency find(String isoCode);

/**
 * search
 */
List<Currency> search(String arg);

}
