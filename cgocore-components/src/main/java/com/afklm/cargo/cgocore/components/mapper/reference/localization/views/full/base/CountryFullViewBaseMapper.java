package com.afklm.cargo.cgocore.components.mapper.reference.localization.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.reference.localization.forms.CountryForm;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.full.CountryFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.localization.CountryRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.localization.CountryStateManager;
import com.afklm.cargo.cgocore.model.reference.localization.Country;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class CountryFullViewBaseMapper extends FullViewMapper<CountryFullView, Integer, CountryForm, Country> {

@Inject
protected CountryRightsManager countryRightsManager;
@Inject
protected CountryStateManager countryStateManager;

public CountryFullViewBaseMapper() {
super(CountryFullView.class, Country.class);
}

@Override
public CountryFullView mapFrom(CountryFullView countryFullView, Country country) {
countryFullView = super.mapFrom(countryFullView, country);
countryFullView.setCanUpdate(countryRightsManager.canUpdate(country) && countryStateManager.canUpdate(country));
countryFullView.setCanDelete(countryRightsManager.canDelete(country) && countryStateManager.canDelete(country));
return countryFullView;
}

}
