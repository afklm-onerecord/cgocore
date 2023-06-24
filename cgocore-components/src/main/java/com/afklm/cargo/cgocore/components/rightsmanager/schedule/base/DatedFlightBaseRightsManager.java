package com.afklm.cargo.cgocore.components.rightsmanager.schedule.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgocore.model.schedule.DatedFlight;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBaseRightsManager {

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
throw new AccessDeniedException("DatedFlight.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(DatedFlight datedFlight) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(DatedFlight datedFlight) {
if (!canAccess(datedFlight)) {
throw new AccessDeniedException("DatedFlight.accessDenied");
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
throw new AccessDeniedException("DatedFlight.create.operationDenied");
}
}

/**
 * can save
 */
public boolean canSave(DatedFlight datedFlight) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(DatedFlight datedFlight) {
if (!canSave(datedFlight)) {
throw new AccessDeniedException("DatedFlight.save.operationDenied");
}
}

/**
 * can update
 */
public boolean canUpdate(DatedFlight datedFlight) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(DatedFlight datedFlight) {
if (!canUpdate(datedFlight)) {
throw new AccessDeniedException("DatedFlight.update.operationDenied");
}
}

/**
 * can delete
 */
public boolean canDelete(DatedFlight datedFlight) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(DatedFlight datedFlight) {
if (!canDelete(datedFlight)) {
throw new AccessDeniedException("DatedFlight.delete.operationDenied");
}
}

}
