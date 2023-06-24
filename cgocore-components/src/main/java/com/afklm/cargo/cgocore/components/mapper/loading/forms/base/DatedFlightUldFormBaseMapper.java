package com.afklm.cargo.cgocore.components.mapper.loading.forms.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.loading.forms.DatedFlightUldForm;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.containers.UldTypeDao;
import com.afklm.cargo.cgocore.persistence.interfaces.schedule.DatedFlightDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldFormBaseMapper extends BasicMapperImpl<DatedFlightUldForm, DatedFlightUld> {

public DatedFlightUldFormBaseMapper() {
super(DatedFlightUldForm.class, DatedFlightUld.class);
}

/*
 * properties
 */
@Inject
protected DatedFlightDao datedFlightDao;
@Inject
protected UldTypeDao uldTypeDao;
@Inject
protected UnitOfMeasureDao unitOfMeasureDao;

/**
 * mapping form from object
 */
@Override
public DatedFlightUldForm mapFrom(DatedFlightUldForm datedFlightUldForm, DatedFlightUld datedFlightUld) {
datedFlightUldForm = super.mapFrom(datedFlightUldForm, datedFlightUld);
datedFlightUldForm.setDatedFlightCompanyIataCode(datedFlightUld.getDatedFlight().getCompany().getIataCode());
datedFlightUldForm.setDatedFlightFlightNumber(datedFlightUld.getDatedFlight().getFlightNumber());
datedFlightUldForm.setDatedFlightDepartureDate(datedFlightUld.getDatedFlight().getDepartureDate());
datedFlightUldForm.setUldTypeCode(datedFlightUld.getUldType().getCode());
if (datedFlightUld.getGrossWeightUnitOfMeasure() != null) {
datedFlightUldForm.setGrossWeightUnitOfMeasureCode(datedFlightUld.getGrossWeightUnitOfMeasure().getCode());
}
return datedFlightUldForm;
}

/**
 * mapping view to object
 */
@Override
public DatedFlightUld mapTo(DatedFlightUldForm datedFlightUldForm, DatedFlightUld datedFlightUld) {
datedFlightUld = super.mapTo(datedFlightUldForm, datedFlightUld);
datedFlightUld.setDatedFlight(datedFlightDao.find(datedFlightUldForm.getDatedFlightCompanyIataCode(), datedFlightUldForm.getDatedFlightFlightNumber(), datedFlightUldForm.getDatedFlightDepartureDate()));
datedFlightUld.setUldType(uldTypeDao.find(datedFlightUldForm.getUldTypeCode()));
datedFlightUld.setGrossWeightUnitOfMeasure(unitOfMeasureDao.find(datedFlightUldForm.getGrossWeightUnitOfMeasureCode()));
return datedFlightUld;
}

}
