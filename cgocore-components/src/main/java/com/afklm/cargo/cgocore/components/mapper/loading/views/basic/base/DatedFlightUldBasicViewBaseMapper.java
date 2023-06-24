package com.afklm.cargo.cgocore.components.mapper.loading.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.loading.views.basic.DatedFlightUldBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.loading.DatedFlightUldRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.loading.DatedFlightUldStateManager;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.containers.UldTypeDao;
import com.afklm.cargo.cgocore.persistence.interfaces.schedule.DatedFlightDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldBasicViewBaseMapper extends BasicMapperImpl<DatedFlightUldBasicView, DatedFlightUld> {

public DatedFlightUldBasicViewBaseMapper() {
super(DatedFlightUldBasicView.class, DatedFlightUld.class);
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

@Inject
protected DatedFlightUldRightsManager datedFlightUldRightsManager;
@Inject
protected DatedFlightUldStateManager datedFlightUldStateManager;

/**
 * mapping view from object
 */
@Override
public DatedFlightUldBasicView mapFrom(DatedFlightUldBasicView datedFlightUldBasicView, DatedFlightUld datedFlightUld) {
datedFlightUldBasicView = super.mapFrom(datedFlightUldBasicView, datedFlightUld);
datedFlightUldBasicView.setSelected(false);
datedFlightUldBasicView.setCanDelete(datedFlightUldRightsManager.canDelete(datedFlightUld) && datedFlightUldStateManager.canDelete(datedFlightUld));
datedFlightUldBasicView.setDatedFlightCompanyIataCode(datedFlightUld.getDatedFlight().getCompany().getIataCode());
datedFlightUldBasicView.setDatedFlightFlightNumber(datedFlightUld.getDatedFlight().getFlightNumber());
datedFlightUldBasicView.setDatedFlightDepartureDate(datedFlightUld.getDatedFlight().getDepartureDate());
datedFlightUldBasicView.setUldTypeCode(datedFlightUld.getUldType().getCode());
if (datedFlightUld.getGrossWeightUnitOfMeasure() != null) {
datedFlightUldBasicView.setGrossWeightUnitOfMeasureCode(datedFlightUld.getGrossWeightUnitOfMeasure().getCode());
}
return datedFlightUldBasicView;
}

/**
 * mapping view to object
 */
@Override
public DatedFlightUld mapTo(DatedFlightUldBasicView datedFlightUldBasicView, DatedFlightUld datedFlightUld) {
datedFlightUld = super.mapTo(datedFlightUldBasicView, datedFlightUld);
datedFlightUld.setDatedFlight(datedFlightDao.find(datedFlightUldBasicView.getDatedFlightCompanyIataCode(), datedFlightUldBasicView.getDatedFlightFlightNumber(), datedFlightUldBasicView.getDatedFlightDepartureDate()));
datedFlightUld.setUldType(uldTypeDao.find(datedFlightUldBasicView.getUldTypeCode()));
datedFlightUld.setGrossWeightUnitOfMeasure(unitOfMeasureDao.find(datedFlightUldBasicView.getGrossWeightUnitOfMeasureCode()));
return datedFlightUld;
}

}
