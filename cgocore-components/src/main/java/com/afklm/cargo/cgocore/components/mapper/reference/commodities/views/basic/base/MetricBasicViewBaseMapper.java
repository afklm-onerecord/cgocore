package com.afklm.cargo.cgocore.components.mapper.reference.commodities.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.commodities.views.basic.MetricBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.commodities.MetricRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.commodities.MetricStateManager;
import com.afklm.cargo.cgocore.model.reference.commodities.Metric;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class MetricBasicViewBaseMapper extends BasicMapperImpl<MetricBasicView, Metric> {

public MetricBasicViewBaseMapper() {
super(MetricBasicView.class, Metric.class);
}

/*
 * properties
 */

@Inject
protected MetricRightsManager metricRightsManager;
@Inject
protected MetricStateManager metricStateManager;

/**
 * mapping view from object
 */
@Override
public MetricBasicView mapFrom(MetricBasicView metricBasicView, Metric metric) {
metricBasicView = super.mapFrom(metricBasicView, metric);
metricBasicView.setSelected(false);
metricBasicView.setCanDelete(metricRightsManager.canDelete(metric) && metricStateManager.canDelete(metric));
return metricBasicView;
}

/**
 * mapping view to object
 */
@Override
public Metric mapTo(MetricBasicView metricBasicView, Metric metric) {
metric = super.mapTo(metricBasicView, metric);
return metric;
}

}
