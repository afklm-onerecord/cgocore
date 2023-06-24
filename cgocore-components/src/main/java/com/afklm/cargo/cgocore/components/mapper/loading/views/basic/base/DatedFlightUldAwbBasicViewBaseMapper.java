package com.afklm.cargo.cgocore.components.mapper.loading.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.loading.views.basic.DatedFlightUldAwbBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.loading.DatedFlightUldAwbRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.loading.DatedFlightUldAwbStateManager;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUldAwb;
import com.afklm.cargo.cgocore.persistence.interfaces.loading.DatedFlightUldDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;
import com.afklm.cargo.cgocore.persistence.interfaces.shipments.AirWaybillDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldAwbBasicViewBaseMapper extends BasicMapperImpl<DatedFlightUldAwbBasicView, DatedFlightUldAwb> {

public DatedFlightUldAwbBasicViewBaseMapper() {
super(DatedFlightUldAwbBasicView.class, DatedFlightUldAwb.class);
}

/*
 * properties
 */
@Inject
protected DatedFlightUldDao datedFlightUldDao;
@Inject
protected AirWaybillDao airWaybillDao;
@Inject
protected UnitOfMeasureDao unitOfMeasureDao;

@Inject
protected DatedFlightUldAwbRightsManager datedFlightUldAwbRightsManager;
@Inject
protected DatedFlightUldAwbStateManager datedFlightUldAwbStateManager;

/**
 * mapping view from object
 */
@Override
public DatedFlightUldAwbBasicView mapFrom(DatedFlightUldAwbBasicView datedFlightUldAwbBasicView, DatedFlightUldAwb datedFlightUldAwb) {
datedFlightUldAwbBasicView = super.mapFrom(datedFlightUldAwbBasicView, datedFlightUldAwb);
datedFlightUldAwbBasicView.setSelected(false);
datedFlightUldAwbBasicView.setCanDelete(datedFlightUldAwbRightsManager.canDelete(datedFlightUldAwb) && datedFlightUldAwbStateManager.canDelete(datedFlightUldAwb));
datedFlightUldAwbBasicView.setDatedFlightUldDatedFlightCompanyIataCode(datedFlightUldAwb.getDatedFlightUld().getDatedFlight().getCompany().getIataCode());
datedFlightUldAwbBasicView.setDatedFlightUldDatedFlightFlightNumber(datedFlightUldAwb.getDatedFlightUld().getDatedFlight().getFlightNumber());
datedFlightUldAwbBasicView.setDatedFlightUldDatedFlightDepartureDate(datedFlightUldAwb.getDatedFlightUld().getDatedFlight().getDepartureDate());
datedFlightUldAwbBasicView.setDatedFlightUldUldTypeCode(datedFlightUldAwb.getDatedFlightUld().getUldType().getCode());
datedFlightUldAwbBasicView.setDatedFlightUldUldCode(datedFlightUldAwb.getDatedFlightUld().getUldCode());
datedFlightUldAwbBasicView.setDatedFlightUldUldOwnerCode(datedFlightUldAwb.getDatedFlightUld().getUldOwnerCode());
datedFlightUldAwbBasicView.setAirWaybillAirWaybillNumber(datedFlightUldAwb.getAirWaybill().getAirWaybillNumber());
if (datedFlightUldAwb.getGrossWeightUnitOfMeasure() != null) {
datedFlightUldAwbBasicView.setGrossWeightUnitOfMeasureCode(datedFlightUldAwb.getGrossWeightUnitOfMeasure().getCode());
}
if (datedFlightUldAwb.getGrossVolumeUnitOfMeasure() != null) {
datedFlightUldAwbBasicView.setGrossVolumeUnitOfMeasureCode(datedFlightUldAwb.getGrossVolumeUnitOfMeasure().getCode());
}
return datedFlightUldAwbBasicView;
}

/**
 * mapping view to object
 */
@Override
public DatedFlightUldAwb mapTo(DatedFlightUldAwbBasicView datedFlightUldAwbBasicView, DatedFlightUldAwb datedFlightUldAwb) {
datedFlightUldAwb = super.mapTo(datedFlightUldAwbBasicView, datedFlightUldAwb);
datedFlightUldAwb.setDatedFlightUld(datedFlightUldDao.find(datedFlightUldAwbBasicView.getDatedFlightUldDatedFlightCompanyIataCode(), datedFlightUldAwbBasicView.getDatedFlightUldDatedFlightFlightNumber(), datedFlightUldAwbBasicView.getDatedFlightUldDatedFlightDepartureDate(), datedFlightUldAwbBasicView.getDatedFlightUldUldTypeCode(), datedFlightUldAwbBasicView.getDatedFlightUldUldCode(), datedFlightUldAwbBasicView.getDatedFlightUldUldOwnerCode()));
datedFlightUldAwb.setAirWaybill(airWaybillDao.find(datedFlightUldAwbBasicView.getAirWaybillAirWaybillNumber()));
datedFlightUldAwb.setGrossWeightUnitOfMeasure(unitOfMeasureDao.find(datedFlightUldAwbBasicView.getGrossWeightUnitOfMeasureCode()));
datedFlightUldAwb.setGrossVolumeUnitOfMeasure(unitOfMeasureDao.find(datedFlightUldAwbBasicView.getGrossVolumeUnitOfMeasureCode()));
return datedFlightUldAwb;
}

}
