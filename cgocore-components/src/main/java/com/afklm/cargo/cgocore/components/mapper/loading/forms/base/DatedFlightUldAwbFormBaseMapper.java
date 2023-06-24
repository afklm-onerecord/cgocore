package com.afklm.cargo.cgocore.components.mapper.loading.forms.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.loading.forms.DatedFlightUldAwbForm;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUldAwb;
import com.afklm.cargo.cgocore.persistence.interfaces.loading.DatedFlightUldDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;
import com.afklm.cargo.cgocore.persistence.interfaces.shipments.AirWaybillDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldAwbFormBaseMapper extends BasicMapperImpl<DatedFlightUldAwbForm, DatedFlightUldAwb> {

public DatedFlightUldAwbFormBaseMapper() {
super(DatedFlightUldAwbForm.class, DatedFlightUldAwb.class);
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

/**
 * mapping form from object
 */
@Override
public DatedFlightUldAwbForm mapFrom(DatedFlightUldAwbForm datedFlightUldAwbForm, DatedFlightUldAwb datedFlightUldAwb) {
datedFlightUldAwbForm = super.mapFrom(datedFlightUldAwbForm, datedFlightUldAwb);
datedFlightUldAwbForm.setDatedFlightUldDatedFlightCompanyIataCode(datedFlightUldAwb.getDatedFlightUld().getDatedFlight().getCompany().getIataCode());
datedFlightUldAwbForm.setDatedFlightUldDatedFlightFlightNumber(datedFlightUldAwb.getDatedFlightUld().getDatedFlight().getFlightNumber());
datedFlightUldAwbForm.setDatedFlightUldDatedFlightDepartureDate(datedFlightUldAwb.getDatedFlightUld().getDatedFlight().getDepartureDate());
datedFlightUldAwbForm.setDatedFlightUldUldTypeCode(datedFlightUldAwb.getDatedFlightUld().getUldType().getCode());
datedFlightUldAwbForm.setDatedFlightUldUldCode(datedFlightUldAwb.getDatedFlightUld().getUldCode());
datedFlightUldAwbForm.setDatedFlightUldUldOwnerCode(datedFlightUldAwb.getDatedFlightUld().getUldOwnerCode());
datedFlightUldAwbForm.setAirWaybillAirWaybillNumber(datedFlightUldAwb.getAirWaybill().getAirWaybillNumber());
if (datedFlightUldAwb.getGrossWeightUnitOfMeasure() != null) {
datedFlightUldAwbForm.setGrossWeightUnitOfMeasureCode(datedFlightUldAwb.getGrossWeightUnitOfMeasure().getCode());
}
if (datedFlightUldAwb.getGrossVolumeUnitOfMeasure() != null) {
datedFlightUldAwbForm.setGrossVolumeUnitOfMeasureCode(datedFlightUldAwb.getGrossVolumeUnitOfMeasure().getCode());
}
return datedFlightUldAwbForm;
}

/**
 * mapping view to object
 */
@Override
public DatedFlightUldAwb mapTo(DatedFlightUldAwbForm datedFlightUldAwbForm, DatedFlightUldAwb datedFlightUldAwb) {
datedFlightUldAwb = super.mapTo(datedFlightUldAwbForm, datedFlightUldAwb);
datedFlightUldAwb.setDatedFlightUld(datedFlightUldDao.find(datedFlightUldAwbForm.getDatedFlightUldDatedFlightCompanyIataCode(), datedFlightUldAwbForm.getDatedFlightUldDatedFlightFlightNumber(), datedFlightUldAwbForm.getDatedFlightUldDatedFlightDepartureDate(), datedFlightUldAwbForm.getDatedFlightUldUldTypeCode(), datedFlightUldAwbForm.getDatedFlightUldUldCode(), datedFlightUldAwbForm.getDatedFlightUldUldOwnerCode()));
datedFlightUldAwb.setAirWaybill(airWaybillDao.find(datedFlightUldAwbForm.getAirWaybillAirWaybillNumber()));
datedFlightUldAwb.setGrossWeightUnitOfMeasure(unitOfMeasureDao.find(datedFlightUldAwbForm.getGrossWeightUnitOfMeasureCode()));
datedFlightUldAwb.setGrossVolumeUnitOfMeasure(unitOfMeasureDao.find(datedFlightUldAwbForm.getGrossVolumeUnitOfMeasureCode()));
return datedFlightUldAwb;
}

}
