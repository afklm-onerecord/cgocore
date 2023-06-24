package com.afklm.cargo.cgocore.components.rightsmanager.reference.localization.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgocore.model.reference.localization.Station;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class StationBaseRightsManager {

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
throw new AccessDeniedException("Station.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(Station station) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(Station station) {
if (!canAccess(station)) {
throw new AccessDeniedException("Station.accessDenied");
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
throw new AccessDeniedException("Station.create.operationDenied");
}
}

/**
 * can save
 */
public boolean canSave(Station station) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(Station station) {
if (!canSave(station)) {
throw new AccessDeniedException("Station.save.operationDenied");
}
}

/**
 * can update
 */
public boolean canUpdate(Station station) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(Station station) {
if (!canUpdate(station)) {
throw new AccessDeniedException("Station.update.operationDenied");
}
}

/**
 * can delete
 */
public boolean canDelete(Station station) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(Station station) {
if (!canDelete(station)) {
throw new AccessDeniedException("Station.delete.operationDenied");
}
}

}
