package com.afklm.cargo.cgocore.components.mapper.shipments.forms.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.shipments.forms.AirWaybillForm;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.StationDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirWaybillFormBaseMapper extends BasicMapperImpl<AirWaybillForm, AirWaybill> {

public AirWaybillFormBaseMapper() {
super(AirWaybillForm.class, AirWaybill.class);
}

/*
 * properties
 */
@Inject
protected StationDao stationDao;
@Inject
protected UnitOfMeasureDao unitOfMeasureDao;

/**
 * mapping form from object
 */
@Override
public AirWaybillForm mapFrom(AirWaybillForm airWaybillForm, AirWaybill airWaybill) {
airWaybillForm = super.mapFrom(airWaybillForm, airWaybill);
if (airWaybill.getOrigin() != null) {
airWaybillForm.setOriginIataCode(airWaybill.getOrigin().getIataCode());
}
if (airWaybill.getDestination() != null) {
airWaybillForm.setDestinationIataCode(airWaybill.getDestination().getIataCode());
}
if (airWaybill.getGrossWeightUnitOfMeasure() != null) {
airWaybillForm.setGrossWeightUnitOfMeasureCode(airWaybill.getGrossWeightUnitOfMeasure().getCode());
}
if (airWaybill.getGrossVolumeUnitOfMeasure() != null) {
airWaybillForm.setGrossVolumeUnitOfMeasureCode(airWaybill.getGrossVolumeUnitOfMeasure().getCode());
}
return airWaybillForm;
}

/**
 * mapping view to object
 */
@Override
public AirWaybill mapTo(AirWaybillForm airWaybillForm, AirWaybill airWaybill) {
airWaybill = super.mapTo(airWaybillForm, airWaybill);
airWaybill.setOrigin(stationDao.find(airWaybillForm.getOriginIataCode()));
airWaybill.setDestination(stationDao.find(airWaybillForm.getDestinationIataCode()));
airWaybill.setGrossWeightUnitOfMeasure(unitOfMeasureDao.find(airWaybillForm.getGrossWeightUnitOfMeasureCode()));
airWaybill.setGrossVolumeUnitOfMeasure(unitOfMeasureDao.find(airWaybillForm.getGrossVolumeUnitOfMeasureCode()));
return airWaybill;
}

}
