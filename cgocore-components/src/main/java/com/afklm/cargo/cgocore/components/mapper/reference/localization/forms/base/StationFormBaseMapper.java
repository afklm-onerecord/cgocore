package com.afklm.cargo.cgocore.components.mapper.reference.localization.forms.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.localization.forms.StationForm;
import com.afklm.cargo.cgocore.model.reference.localization.Station;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.CountryDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class StationFormBaseMapper extends BasicMapperImpl<StationForm, Station> {

public StationFormBaseMapper() {
super(StationForm.class, Station.class);
}

/*
 * properties
 */
@Inject
protected CountryDao countryDao;

/**
 * mapping form from object
 */
@Override
public StationForm mapFrom(StationForm stationForm, Station station) {
stationForm = super.mapFrom(stationForm, station);
if (station.getCountry() != null) {
stationForm.setCountryIataCode(station.getCountry().getIataCode());
}
return stationForm;
}

/**
 * mapping view to object
 */
@Override
public Station mapTo(StationForm stationForm, Station station) {
station = super.mapTo(stationForm, station);
station.setCountry(countryDao.find(stationForm.getCountryIataCode()));
return station;
}

}
