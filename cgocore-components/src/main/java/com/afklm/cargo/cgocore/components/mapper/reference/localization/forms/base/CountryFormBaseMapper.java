package com.afklm.cargo.cgocore.components.mapper.reference.localization.forms.base;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.localization.forms.CountryForm;
import com.afklm.cargo.cgocore.model.reference.localization.Country;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class CountryFormBaseMapper extends BasicMapperImpl<CountryForm, Country> {

public CountryFormBaseMapper() {
super(CountryForm.class, Country.class);
}

/*
 * properties
 */

/**
 * mapping form from object
 */
@Override
public CountryForm mapFrom(CountryForm countryForm, Country country) {
countryForm = super.mapFrom(countryForm, country);
return countryForm;
}

/**
 * mapping view to object
 */
@Override
public Country mapTo(CountryForm countryForm, Country country) {
country = super.mapTo(countryForm, country);
return country;
}

}
