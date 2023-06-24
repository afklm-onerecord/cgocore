package com.afklm.cargo.cgocore.components.mapper.reference.localization.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.reference.localization.forms.CurrencyForm;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.full.CurrencyFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.localization.CurrencyRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.localization.CurrencyStateManager;
import com.afklm.cargo.cgocore.model.reference.localization.Currency;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class CurrencyFullViewBaseMapper extends FullViewMapper<CurrencyFullView, Integer, CurrencyForm, Currency> {

@Inject
protected CurrencyRightsManager currencyRightsManager;
@Inject
protected CurrencyStateManager currencyStateManager;

public CurrencyFullViewBaseMapper() {
super(CurrencyFullView.class, Currency.class);
}

@Override
public CurrencyFullView mapFrom(CurrencyFullView currencyFullView, Currency currency) {
currencyFullView = super.mapFrom(currencyFullView, currency);
currencyFullView.setCanUpdate(currencyRightsManager.canUpdate(currency) && currencyStateManager.canUpdate(currency));
currencyFullView.setCanDelete(currencyRightsManager.canDelete(currency) && currencyStateManager.canDelete(currency));
return currencyFullView;
}

}
