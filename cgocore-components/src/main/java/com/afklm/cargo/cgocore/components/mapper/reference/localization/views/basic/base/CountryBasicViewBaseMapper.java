package com.afklm.cargo.cgocore.components.mapper.reference.localization.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.localization.views.basic.CountryBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.localization.CountryRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.localization.CountryStateManager;
import com.afklm.cargo.cgocore.model.reference.localization.Country;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class CountryBasicViewBaseMapper extends BasicMapperImpl<CountryBasicView, Country> {

public CountryBasicViewBaseMapper() {
super(CountryBasicView.class, Country.class);
}

/*
 * properties
 */

@Inject
protected CountryRightsManager countryRightsManager;
@Inject
protected CountryStateManager countryStateManager;

/**
 * mapping view from object
 */
@Override
public CountryBasicView mapFrom(CountryBasicView countryBasicView, Country country) {
countryBasicView = super.mapFrom(countryBasicView, country);
countryBasicView.setSelected(false);
countryBasicView.setCanDelete(countryRightsManager.canDelete(country) && countryStateManager.canDelete(country));
return countryBasicView;
}

/**
 * mapping view to object
 */
@Override
public Country mapTo(CountryBasicView countryBasicView, Country country) {
country = super.mapTo(countryBasicView, country);
return country;
}

}
