package com.afklm.cargo.cgocore.components.rightsmanager.loading.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgocore.model.loading.DatedFlightUldAwb;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldAwbBaseRightsManager {

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
throw new AccessDeniedException("DatedFlightUldAwb.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(DatedFlightUldAwb datedFlightUldAwb) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(DatedFlightUldAwb datedFlightUldAwb) {
if (!canAccess(datedFlightUldAwb)) {
throw new AccessDeniedException("DatedFlightUldAwb.accessDenied");
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
throw new AccessDeniedException("DatedFlightUldAwb.create.operationDenied");
}
}

/**
 * can save
 */
public boolean canSave(DatedFlightUldAwb datedFlightUldAwb) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(DatedFlightUldAwb datedFlightUldAwb) {
if (!canSave(datedFlightUldAwb)) {
throw new AccessDeniedException("DatedFlightUldAwb.save.operationDenied");
}
}

/**
 * can update
 */
public boolean canUpdate(DatedFlightUldAwb datedFlightUldAwb) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(DatedFlightUldAwb datedFlightUldAwb) {
if (!canUpdate(datedFlightUldAwb)) {
throw new AccessDeniedException("DatedFlightUldAwb.update.operationDenied");
}
}

/**
 * can delete
 */
public boolean canDelete(DatedFlightUldAwb datedFlightUldAwb) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(DatedFlightUldAwb datedFlightUldAwb) {
if (!canDelete(datedFlightUldAwb)) {
throw new AccessDeniedException("DatedFlightUldAwb.delete.operationDenied");
}
}

}
