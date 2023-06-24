package com.afklm.cargo.cgocore.components.mapper.reference.airlines.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.airlines.views.basic.AirlineCompanyBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.airlines.AirlineCompanyRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.airlines.AirlineCompanyStateManager;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirlineCompanyBasicViewBaseMapper extends BasicMapperImpl<AirlineCompanyBasicView, AirlineCompany> {

public AirlineCompanyBasicViewBaseMapper() {
super(AirlineCompanyBasicView.class, AirlineCompany.class);
}

/*
 * properties
 */

@Inject
protected AirlineCompanyRightsManager airlineCompanyRightsManager;
@Inject
protected AirlineCompanyStateManager airlineCompanyStateManager;

/**
 * mapping view from object
 */
@Override
public AirlineCompanyBasicView mapFrom(AirlineCompanyBasicView airlineCompanyBasicView, AirlineCompany airlineCompany) {
airlineCompanyBasicView = super.mapFrom(airlineCompanyBasicView, airlineCompany);
airlineCompanyBasicView.setSelected(false);
airlineCompanyBasicView.setCanDelete(airlineCompanyRightsManager.canDelete(airlineCompany) && airlineCompanyStateManager.canDelete(airlineCompany));
return airlineCompanyBasicView;
}

/**
 * mapping view to object
 */
@Override
public AirlineCompany mapTo(AirlineCompanyBasicView airlineCompanyBasicView, AirlineCompany airlineCompany) {
airlineCompany = super.mapTo(airlineCompanyBasicView, airlineCompany);
return airlineCompany;
}

}
