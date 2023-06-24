package com.afklm.cargo.cgocore.components.mapper.reference.localization.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.localization.views.basic.CurrencyBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.localization.CurrencyRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.localization.CurrencyStateManager;
import com.afklm.cargo.cgocore.model.reference.localization.Currency;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class CurrencyBasicViewBaseMapper extends BasicMapperImpl<CurrencyBasicView, Currency> {

public CurrencyBasicViewBaseMapper() {
super(CurrencyBasicView.class, Currency.class);
}

/*
 * properties
 */

@Inject
protected CurrencyRightsManager currencyRightsManager;
@Inject
protected CurrencyStateManager currencyStateManager;

/**
 * mapping view from object
 */
@Override
public CurrencyBasicView mapFrom(CurrencyBasicView currencyBasicView, Currency currency) {
currencyBasicView = super.mapFrom(currencyBasicView, currency);
currencyBasicView.setSelected(false);
currencyBasicView.setCanDelete(currencyRightsManager.canDelete(currency) && currencyStateManager.canDelete(currency));
return currencyBasicView;
}

/**
 * mapping view to object
 */
@Override
public Currency mapTo(CurrencyBasicView currencyBasicView, Currency currency) {
currency = super.mapTo(currencyBasicView, currency);
return currency;
}

}
