package com.afklm.cargo.cgocore.components.rightsmanager.reference.commodities.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgocore.model.reference.commodities.SpecialHandlingCode;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class SpecialHandlingCodeBaseRightsManager {

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
throw new AccessDeniedException("SpecialHandlingCode.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(SpecialHandlingCode specialHandlingCode) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(SpecialHandlingCode specialHandlingCode) {
if (!canAccess(specialHandlingCode)) {
throw new AccessDeniedException("SpecialHandlingCode.accessDenied");
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
throw new AccessDeniedException("SpecialHandlingCode.create.operationDenied");
}
}

/**
 * can save
 */
public boolean canSave(SpecialHandlingCode specialHandlingCode) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(SpecialHandlingCode specialHandlingCode) {
if (!canSave(specialHandlingCode)) {
throw new AccessDeniedException("SpecialHandlingCode.save.operationDenied");
}
}

/**
 * can update
 */
public boolean canUpdate(SpecialHandlingCode specialHandlingCode) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(SpecialHandlingCode specialHandlingCode) {
if (!canUpdate(specialHandlingCode)) {
throw new AccessDeniedException("SpecialHandlingCode.update.operationDenied");
}
}

/**
 * can delete
 */
public boolean canDelete(SpecialHandlingCode specialHandlingCode) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(SpecialHandlingCode specialHandlingCode) {
if (!canDelete(specialHandlingCode)) {
throw new AccessDeniedException("SpecialHandlingCode.delete.operationDenied");
}
}

}
