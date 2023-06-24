package com.afklm.cargo.cgocore.components.mapper.reference.airlines.forms.base;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.airlines.forms.AirlineCompanyForm;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirlineCompanyFormBaseMapper extends BasicMapperImpl<AirlineCompanyForm, AirlineCompany> {

public AirlineCompanyFormBaseMapper() {
super(AirlineCompanyForm.class, AirlineCompany.class);
}

/*
 * properties
 */

/**
 * mapping form from object
 */
@Override
public AirlineCompanyForm mapFrom(AirlineCompanyForm airlineCompanyForm, AirlineCompany airlineCompany) {
airlineCompanyForm = super.mapFrom(airlineCompanyForm, airlineCompany);
return airlineCompanyForm;
}

/**
 * mapping view to object
 */
@Override
public AirlineCompany mapTo(AirlineCompanyForm airlineCompanyForm, AirlineCompany airlineCompany) {
airlineCompany = super.mapTo(airlineCompanyForm, airlineCompany);
return airlineCompany;
}

}
