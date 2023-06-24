package com.afklm.cargo.cgocore.components.processor.reference.localization.base;

import javax.inject.Inject;

import com.afklm.cargo.cgocore.model.reference.localization.Currency;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.CurrencyDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class CurrencyBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected CurrencyDao currencyDao;

/**
 * process save
 */
public Integer save(Currency currency) {
return currencyDao.save(currency);
}

/**
 * process update
 */
public void update(Currency currency) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(Currency currency) {
currencyDao.delete(currency);
}

}
