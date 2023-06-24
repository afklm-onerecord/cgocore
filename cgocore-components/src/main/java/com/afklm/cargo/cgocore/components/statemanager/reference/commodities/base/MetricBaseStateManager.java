package com.afklm.cargo.cgocore.components.statemanager.reference.commodities.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgocore.model.reference.commodities.Metric;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class MetricBaseStateManager {

/**
 * can save
 */
public boolean canSave(Metric metric) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(Metric metric) {
if (!canSave(metric)) {
throw new InvalidStateException("Metric.save.invalidState");
}
}

/**
 * can update
 */
public boolean canUpdate(Metric metric) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(Metric metric) {
if (!canUpdate(metric)) {
throw new InvalidStateException("Metric.update.invalidState");
}
}

/**
 * can delete
 */
public boolean canDelete(Metric metric) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(Metric metric) {
if (!canDelete(metric)) {
throw new InvalidStateException("Metric.delete.invalidState");
}
}

}
