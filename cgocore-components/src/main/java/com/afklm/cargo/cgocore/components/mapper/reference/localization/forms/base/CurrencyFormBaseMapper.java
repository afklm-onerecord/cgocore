package com.afklm.cargo.cgocore.components.mapper.reference.localization.forms.base;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.localization.forms.CurrencyForm;
import com.afklm.cargo.cgocore.model.reference.localization.Currency;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class CurrencyFormBaseMapper extends BasicMapperImpl<CurrencyForm, Currency> {

public CurrencyFormBaseMapper() {
super(CurrencyForm.class, Currency.class);
}

/*
 * properties
 */

/**
 * mapping form from object
 */
@Override
public CurrencyForm mapFrom(CurrencyForm currencyForm, Currency currency) {
currencyForm = super.mapFrom(currencyForm, currency);
return currencyForm;
}

/**
 * mapping view to object
 */
@Override
public Currency mapTo(CurrencyForm currencyForm, Currency currency) {
currency = super.mapTo(currencyForm, currency);
return currency;
}

}
