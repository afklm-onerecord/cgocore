package com.afklm.cargo.cgocore.components.mapper.reference.commodities.forms.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.UnitOfMeasureForm;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.MetricDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UnitOfMeasureFormBaseMapper extends BasicMapperImpl<UnitOfMeasureForm, UnitOfMeasure> {

public UnitOfMeasureFormBaseMapper() {
super(UnitOfMeasureForm.class, UnitOfMeasure.class);
}

/*
 * properties
 */
@Inject
protected MetricDao metricDao;

/**
 * mapping form from object
 */
@Override
public UnitOfMeasureForm mapFrom(UnitOfMeasureForm unitOfMeasureForm, UnitOfMeasure unitOfMeasure) {
unitOfMeasureForm = super.mapFrom(unitOfMeasureForm, unitOfMeasure);
unitOfMeasureForm.setMetricCode(unitOfMeasure.getMetric().getCode());
return unitOfMeasureForm;
}

/**
 * mapping view to object
 */
@Override
public UnitOfMeasure mapTo(UnitOfMeasureForm unitOfMeasureForm, UnitOfMeasure unitOfMeasure) {
unitOfMeasure = super.mapTo(unitOfMeasureForm, unitOfMeasure);
unitOfMeasure.setMetric(metricDao.find(unitOfMeasureForm.getMetricCode()));
return unitOfMeasure;
}

}
