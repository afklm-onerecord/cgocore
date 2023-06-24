package com.afklm.cargo.cgocore.components.mapper.reference.commodities.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.MetricForm;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.full.MetricFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.commodities.MetricRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.commodities.MetricStateManager;
import com.afklm.cargo.cgocore.model.reference.commodities.Metric;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class MetricFullViewBaseMapper extends FullViewMapper<MetricFullView, Integer, MetricForm, Metric> {

@Inject
protected MetricRightsManager metricRightsManager;
@Inject
protected MetricStateManager metricStateManager;

public MetricFullViewBaseMapper() {
super(MetricFullView.class, Metric.class);
}

@Override
public MetricFullView mapFrom(MetricFullView metricFullView, Metric metric) {
metricFullView = super.mapFrom(metricFullView, metric);
metricFullView.setCanUpdate(metricRightsManager.canUpdate(metric) && metricStateManager.canUpdate(metric));
metricFullView.setCanDelete(metricRightsManager.canDelete(metric) && metricStateManager.canDelete(metric));
return metricFullView;
}

}
