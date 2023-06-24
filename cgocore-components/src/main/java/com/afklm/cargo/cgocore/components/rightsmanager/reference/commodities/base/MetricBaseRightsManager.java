package com.afklm.cargo.cgocore.components.rightsmanager.reference.commodities.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgocore.model.reference.commodities.Metric;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class MetricBaseRightsManager {

/**
 * can access all
 */
public boolean canAccess() {
return true;
}

/**
 * check can access all
 */
public void checkCanAccess() {
if (!canAccess()) {
throw new AccessDeniedException("Metric.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(Metric metric) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(Metric metric) {
if (!canAccess(metric)) {
throw new AccessDeniedException("Metric.accessDenied");
}
}

/**
 * can create
 */
public boolean canCreate() {
return true;
}

/**
 * check can create
 */
public void checkCanCreate() {
if (!canCreate()) {
throw new AccessDeniedException("Metric.create.operationDenied");
}
}

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
throw new AccessDeniedException("Metric.save.operationDenied");
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
throw new AccessDeniedException("Metric.update.operationDenied");
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
throw new AccessDeniedException("Metric.delete.operationDenied");
}
}

}
