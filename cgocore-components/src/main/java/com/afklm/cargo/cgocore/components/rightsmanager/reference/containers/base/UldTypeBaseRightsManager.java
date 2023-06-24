package com.afklm.cargo.cgocore.components.rightsmanager.reference.containers.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgocore.model.reference.containers.UldType;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UldTypeBaseRightsManager {

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
throw new AccessDeniedException("UldType.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(UldType uldType) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(UldType uldType) {
if (!canAccess(uldType)) {
throw new AccessDeniedException("UldType.accessDenied");
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
throw new AccessDeniedException("UldType.create.operationDenied");
}
}

/**
 * can save
 */
public boolean canSave(UldType uldType) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(UldType uldType) {
if (!canSave(uldType)) {
throw new AccessDeniedException("UldType.save.operationDenied");
}
}

/**
 * can update
 */
public boolean canUpdate(UldType uldType) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(UldType uldType) {
if (!canUpdate(uldType)) {
throw new AccessDeniedException("UldType.update.operationDenied");
}
}

/**
 * can delete
 */
public boolean canDelete(UldType uldType) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(UldType uldType) {
if (!canDelete(uldType)) {
throw new AccessDeniedException("UldType.delete.operationDenied");
}
}

}
