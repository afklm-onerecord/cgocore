package com.afklm.cargo.cgocore.components.rightsmanager.loading.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldBaseRightsManager {

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
throw new AccessDeniedException("DatedFlightUld.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(DatedFlightUld datedFlightUld) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(DatedFlightUld datedFlightUld) {
if (!canAccess(datedFlightUld)) {
throw new AccessDeniedException("DatedFlightUld.accessDenied");
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
throw new AccessDeniedException("DatedFlightUld.create.operationDenied");
}
}

/**
 * can save
 */
public boolean canSave(DatedFlightUld datedFlightUld) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(DatedFlightUld datedFlightUld) {
if (!canSave(datedFlightUld)) {
throw new AccessDeniedException("DatedFlightUld.save.operationDenied");
}
}

/**
 * can update
 */
public boolean canUpdate(DatedFlightUld datedFlightUld) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(DatedFlightUld datedFlightUld) {
if (!canUpdate(datedFlightUld)) {
throw new AccessDeniedException("DatedFlightUld.update.operationDenied");
}
}

/**
 * can delete
 */
public boolean canDelete(DatedFlightUld datedFlightUld) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(DatedFlightUld datedFlightUld) {
if (!canDelete(datedFlightUld)) {
throw new AccessDeniedException("DatedFlightUld.delete.operationDenied");
}
}

}
