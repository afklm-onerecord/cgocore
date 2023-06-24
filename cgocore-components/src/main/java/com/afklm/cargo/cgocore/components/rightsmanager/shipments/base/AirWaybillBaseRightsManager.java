package com.afklm.cargo.cgocore.components.rightsmanager.shipments.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgocore.model.shipments.AirWaybill;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirWaybillBaseRightsManager {

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
throw new AccessDeniedException("AirWaybill.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(AirWaybill airWaybill) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(AirWaybill airWaybill) {
if (!canAccess(airWaybill)) {
throw new AccessDeniedException("AirWaybill.accessDenied");
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
throw new AccessDeniedException("AirWaybill.create.operationDenied");
}
}

/**
 * can save
 */
public boolean canSave(AirWaybill airWaybill) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(AirWaybill airWaybill) {
if (!canSave(airWaybill)) {
throw new AccessDeniedException("AirWaybill.save.operationDenied");
}
}

/**
 * can update
 */
public boolean canUpdate(AirWaybill airWaybill) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(AirWaybill airWaybill) {
if (!canUpdate(airWaybill)) {
throw new AccessDeniedException("AirWaybill.update.operationDenied");
}
}

/**
 * can delete
 */
public boolean canDelete(AirWaybill airWaybill) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(AirWaybill airWaybill) {
if (!canDelete(airWaybill)) {
throw new AccessDeniedException("AirWaybill.delete.operationDenied");
}
}

}
