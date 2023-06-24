package com.afklm.cargo.cgocore.components.mapper.reference.commodities.forms.base;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.MetricForm;
import com.afklm.cargo.cgocore.model.reference.commodities.Metric;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class MetricFormBaseMapper extends BasicMapperImpl<MetricForm, Metric> {

public MetricFormBaseMapper() {
super(MetricForm.class, Metric.class);
}

/*
 * properties
 */

/**
 * mapping form from object
 */
@Override
public MetricForm mapFrom(MetricForm metricForm, Metric metric) {
metricForm = super.mapFrom(metricForm, metric);
return metricForm;
}

/**
 * mapping view to object
 */
@Override
public Metric mapTo(MetricForm metricForm, Metric metric) {
metric = super.mapTo(metricForm, metric);
return metric;
}

}
