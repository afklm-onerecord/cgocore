package com.afklm.cargo.cgocore.components.mapper.shipments.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.shipments.views.basic.AirWaybillBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.shipments.AirWaybillRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.shipments.AirWaybillStateManager;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.StationDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirWaybillBasicViewBaseMapper extends BasicMapperImpl<AirWaybillBasicView, AirWaybill> {

public AirWaybillBasicViewBaseMapper() {
super(AirWaybillBasicView.class, AirWaybill.class);
}

/*
 * properties
 */
@Inject
protected StationDao stationDao;
@Inject
protected UnitOfMeasureDao unitOfMeasureDao;

@Inject
protected AirWaybillRightsManager airWaybillRightsManager;
@Inject
protected AirWaybillStateManager airWaybillStateManager;

/**
 * mapping view from object
 */
@Override
public AirWaybillBasicView mapFrom(AirWaybillBasicView airWaybillBasicView, AirWaybill airWaybill) {
airWaybillBasicView = super.mapFrom(airWaybillBasicView, airWaybill);
airWaybillBasicView.setSelected(false);
airWaybillBasicView.setCanDelete(airWaybillRightsManager.canDelete(airWaybill) && airWaybillStateManager.canDelete(airWaybill));
if (airWaybill.getOrigin() != null) {
airWaybillBasicView.setOriginIataCode(airWaybill.getOrigin().getIataCode());
}
if (airWaybill.getDestination() != null) {
airWaybillBasicView.setDestinationIataCode(airWaybill.getDestination().getIataCode());
}
if (airWaybill.getGrossWeightUnitOfMeasure() != null) {
airWaybillBasicView.setGrossWeightUnitOfMeasureCode(airWaybill.getGrossWeightUnitOfMeasure().getCode());
}
if (airWaybill.getGrossVolumeUnitOfMeasure() != null) {
airWaybillBasicView.setGrossVolumeUnitOfMeasureCode(airWaybill.getGrossVolumeUnitOfMeasure().getCode());
}
return airWaybillBasicView;
}

/**
 * mapping view to object
 */
@Override
public AirWaybill mapTo(AirWaybillBasicView airWaybillBasicView, AirWaybill airWaybill) {
airWaybill = super.mapTo(airWaybillBasicView, airWaybill);
airWaybill.setOrigin(stationDao.find(airWaybillBasicView.getOriginIataCode()));
airWaybill.setDestination(stationDao.find(airWaybillBasicView.getDestinationIataCode()));
airWaybill.setGrossWeightUnitOfMeasure(unitOfMeasureDao.find(airWaybillBasicView.getGrossWeightUnitOfMeasureCode()));
airWaybill.setGrossVolumeUnitOfMeasure(unitOfMeasureDao.find(airWaybillBasicView.getGrossVolumeUnitOfMeasureCode()));
return airWaybill;
}

}
