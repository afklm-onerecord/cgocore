package com.afklm.cargo.cgocore.components.mapper.reference.airlines.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.reference.airlines.forms.AirlineCompanyForm;
import com.afklm.cargo.cgocore.api.model.reference.airlines.views.full.AirlineCompanyFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.airlines.AirlineCompanyRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.airlines.AirlineCompanyStateManager;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class AirlineCompanyFullViewBaseMapper extends FullViewMapper<AirlineCompanyFullView, Integer, AirlineCompanyForm, AirlineCompany> {

@Inject
protected AirlineCompanyRightsManager airlineCompanyRightsManager;
@Inject
protected AirlineCompanyStateManager airlineCompanyStateManager;

public AirlineCompanyFullViewBaseMapper() {
super(AirlineCompanyFullView.class, AirlineCompany.class);
}

@Override
public AirlineCompanyFullView mapFrom(AirlineCompanyFullView airlineCompanyFullView, AirlineCompany airlineCompany) {
airlineCompanyFullView = super.mapFrom(airlineCompanyFullView, airlineCompany);
airlineCompanyFullView.setCanUpdate(airlineCompanyRightsManager.canUpdate(airlineCompany) && airlineCompanyStateManager.canUpdate(airlineCompany));
airlineCompanyFullView.setCanDelete(airlineCompanyRightsManager.canDelete(airlineCompany) && airlineCompanyStateManager.canDelete(airlineCompany));
return airlineCompanyFullView;
}

}
