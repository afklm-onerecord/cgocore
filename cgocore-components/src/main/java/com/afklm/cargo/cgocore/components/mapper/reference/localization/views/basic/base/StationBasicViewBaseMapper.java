package com.afklm.cargo.cgocore.components.mapper.reference.localization.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.localization.views.basic.StationBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.localization.StationRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.localization.StationStateManager;
import com.afklm.cargo.cgocore.model.reference.localization.Station;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.CountryDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class StationBasicViewBaseMapper extends BasicMapperImpl<StationBasicView, Station> {

public StationBasicViewBaseMapper() {
super(StationBasicView.class, Station.class);
}

/*
 * properties
 */
@Inject
protected CountryDao countryDao;

@Inject
protected StationRightsManager stationRightsManager;
@Inject
protected StationStateManager stationStateManager;

/**
 * mapping view from object
 */
@Override
public StationBasicView mapFrom(StationBasicView stationBasicView, Station station) {
stationBasicView = super.mapFrom(stationBasicView, station);
stationBasicView.setSelected(false);
stationBasicView.setCanDelete(stationRightsManager.canDelete(station) && stationStateManager.canDelete(station));
if (station.getCountry() != null) {
stationBasicView.setCountryIataCode(station.getCountry().getIataCode());
}
return stationBasicView;
}

/**
 * mapping view to object
 */
@Override
public Station mapTo(StationBasicView stationBasicView, Station station) {
station = super.mapTo(stationBasicView, station);
station.setCountry(countryDao.find(stationBasicView.getCountryIataCode()));
return station;
}

}
