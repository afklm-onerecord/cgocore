package com.afklm.cargo.cgocore.components.mapper.reference.commodities.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.commodities.views.basic.UnitOfMeasureBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.commodities.UnitOfMeasureRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.commodities.UnitOfMeasureStateManager;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.MetricDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UnitOfMeasureBasicViewBaseMapper extends BasicMapperImpl<UnitOfMeasureBasicView, UnitOfMeasure> {

public UnitOfMeasureBasicViewBaseMapper() {
super(UnitOfMeasureBasicView.class, UnitOfMeasure.class);
}

/*
 * properties
 */
@Inject
protected MetricDao metricDao;

@Inject
protected UnitOfMeasureRightsManager unitOfMeasureRightsManager;
@Inject
protected UnitOfMeasureStateManager unitOfMeasureStateManager;

/**
 * mapping view from object
 */
@Override
public UnitOfMeasureBasicView mapFrom(UnitOfMeasureBasicView unitOfMeasureBasicView, UnitOfMeasure unitOfMeasure) {
unitOfMeasureBasicView = super.mapFrom(unitOfMeasureBasicView, unitOfMeasure);
unitOfMeasureBasicView.setSelected(false);
unitOfMeasureBasicView.setCanDelete(unitOfMeasureRightsManager.canDelete(unitOfMeasure) && unitOfMeasureStateManager.canDelete(unitOfMeasure));
unitOfMeasureBasicView.setMetricCode(unitOfMeasure.getMetric().getCode());
return unitOfMeasureBasicView;
}

/**
 * mapping view to object
 */
@Override
public UnitOfMeasure mapTo(UnitOfMeasureBasicView unitOfMeasureBasicView, UnitOfMeasure unitOfMeasure) {
unitOfMeasure = super.mapTo(unitOfMeasureBasicView, unitOfMeasure);
unitOfMeasure.setMetric(metricDao.find(unitOfMeasureBasicView.getMetricCode()));
return unitOfMeasure;
}

}
