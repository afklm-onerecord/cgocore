package com.afklm.cargo.cgocore.components.mapper.schedule.forms.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.schedule.forms.DatedFlightForm;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.airlines.AirlineCompanyDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.StationDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightFormBaseMapper extends BasicMapperImpl<DatedFlightForm, DatedFlight> {

public DatedFlightFormBaseMapper() {
super(DatedFlightForm.class, DatedFlight.class);
}

/*
 * properties
 */
@Inject
protected AirlineCompanyDao airlineCompanyDao;
@Inject
protected StationDao stationDao;

/**
 * mapping form from object
 */
@Override
public DatedFlightForm mapFrom(DatedFlightForm datedFlightForm, DatedFlight datedFlight) {
datedFlightForm = super.mapFrom(datedFlightForm, datedFlight);
datedFlightForm.setCompanyIataCode(datedFlight.getCompany().getIataCode());
if (datedFlight.getOrigin() != null) {
datedFlightForm.setOriginIataCode(datedFlight.getOrigin().getIataCode());
}
if (datedFlight.getDestination() != null) {
datedFlightForm.setDestinationIataCode(datedFlight.getDestination().getIataCode());
}
return datedFlightForm;
}

/**
 * mapping view to object
 */
@Override
public DatedFlight mapTo(DatedFlightForm datedFlightForm, DatedFlight datedFlight) {
datedFlight = super.mapTo(datedFlightForm, datedFlight);
datedFlight.setCompany(airlineCompanyDao.find(datedFlightForm.getCompanyIataCode()));
datedFlight.setOrigin(stationDao.find(datedFlightForm.getOriginIataCode()));
datedFlight.setDestination(stationDao.find(datedFlightForm.getDestinationIataCode()));
return datedFlight;
}

}
