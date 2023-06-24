package com.afklm.cargo.cgocore.components.rightsmanager.reference.commodities.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UnitOfMeasureBaseRightsManager {

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
throw new AccessDeniedException("UnitOfMeasure.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(UnitOfMeasure unitOfMeasure) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(UnitOfMeasure unitOfMeasure) {
if (!canAccess(unitOfMeasure)) {
throw new AccessDeniedException("UnitOfMeasure.accessDenied");
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
throw new AccessDeniedException("UnitOfMeasure.create.operationDenied");
}
}

/**
 * can save
 */
public boolean canSave(UnitOfMeasure unitOfMeasure) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(UnitOfMeasure unitOfMeasure) {
if (!canSave(unitOfMeasure)) {
throw new AccessDeniedException("UnitOfMeasure.save.operationDenied");
}
}

/**
 * can update
 */
public boolean canUpdate(UnitOfMeasure unitOfMeasure) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(UnitOfMeasure unitOfMeasure) {
if (!canUpdate(unitOfMeasure)) {
throw new AccessDeniedException("UnitOfMeasure.update.operationDenied");
}
}

/**
 * can delete
 */
public boolean canDelete(UnitOfMeasure unitOfMeasure) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(UnitOfMeasure unitOfMeasure) {
if (!canDelete(unitOfMeasure)) {
throw new AccessDeniedException("UnitOfMeasure.delete.operationDenied");
}
}

}
