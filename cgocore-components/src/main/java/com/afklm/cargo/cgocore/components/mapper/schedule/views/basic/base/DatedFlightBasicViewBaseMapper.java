package com.afklm.cargo.cgocore.components.mapper.schedule.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.schedule.views.basic.DatedFlightBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.schedule.DatedFlightRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.schedule.DatedFlightStateManager;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.airlines.AirlineCompanyDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.StationDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBasicViewBaseMapper extends BasicMapperImpl<DatedFlightBasicView, DatedFlight> {

public DatedFlightBasicViewBaseMapper() {
super(DatedFlightBasicView.class, DatedFlight.class);
}

/*
 * properties
 */
@Inject
protected AirlineCompanyDao airlineCompanyDao;
@Inject
protected StationDao stationDao;

@Inject
protected DatedFlightRightsManager datedFlightRightsManager;
@Inject
protected DatedFlightStateManager datedFlightStateManager;

/**
 * mapping view from object
 */
@Override
public DatedFlightBasicView mapFrom(DatedFlightBasicView datedFlightBasicView, DatedFlight datedFlight) {
datedFlightBasicView = super.mapFrom(datedFlightBasicView, datedFlight);
datedFlightBasicView.setSelected(false);
datedFlightBasicView.setCanDelete(datedFlightRightsManager.canDelete(datedFlight) && datedFlightStateManager.canDelete(datedFlight));
datedFlightBasicView.setCompanyIataCode(datedFlight.getCompany().getIataCode());
if (datedFlight.getOrigin() != null) {
datedFlightBasicView.setOriginIataCode(datedFlight.getOrigin().getIataCode());
}
if (datedFlight.getDestination() != null) {
datedFlightBasicView.setDestinationIataCode(datedFlight.getDestination().getIataCode());
}
return datedFlightBasicView;
}

/**
 * mapping view to object
 */
@Override
public DatedFlight mapTo(DatedFlightBasicView datedFlightBasicView, DatedFlight datedFlight) {
datedFlight = super.mapTo(datedFlightBasicView, datedFlight);
datedFlight.setCompany(airlineCompanyDao.find(datedFlightBasicView.getCompanyIataCode()));
datedFlight.setOrigin(stationDao.find(datedFlightBasicView.getOriginIataCode()));
datedFlight.setDestination(stationDao.find(datedFlightBasicView.getDestinationIataCode()));
return datedFlight;
}

}
