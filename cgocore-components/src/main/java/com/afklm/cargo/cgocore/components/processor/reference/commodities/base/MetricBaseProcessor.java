package com.afklm.cargo.cgocore.components.processor.reference.commodities.base;

import javax.inject.Inject;

import com.afklm.cargo.cgocore.model.reference.commodities.Metric;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.MetricDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class MetricBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected MetricDao metricDao;

/**
 * process save
 */
public Integer save(Metric metric) {
return metricDao.save(metric);
}

/**
 * process update
 */
public void update(Metric metric) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(Metric metric) {
metricDao.delete(metric);
}

}
