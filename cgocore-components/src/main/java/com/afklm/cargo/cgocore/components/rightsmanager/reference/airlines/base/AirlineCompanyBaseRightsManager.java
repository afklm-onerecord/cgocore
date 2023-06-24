package com.afklm.cargo.cgocore.components.rightsmanager.reference.airlines.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirlineCompanyBaseRightsManager {

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
throw new AccessDeniedException("AirlineCompany.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(AirlineCompany airlineCompany) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(AirlineCompany airlineCompany) {
if (!canAccess(airlineCompany)) {
throw new AccessDeniedException("AirlineCompany.accessDenied");
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
throw new AccessDeniedException("AirlineCompany.create.operationDenied");
}
}

/**
 * can save
 */
public boolean canSave(AirlineCompany airlineCompany) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(AirlineCompany airlineCompany) {
if (!canSave(airlineCompany)) {
throw new AccessDeniedException("AirlineCompany.save.operationDenied");
}
}

/**
 * can update
 */
public boolean canUpdate(AirlineCompany airlineCompany) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(AirlineCompany airlineCompany) {
if (!canUpdate(airlineCompany)) {
throw new AccessDeniedException("AirlineCompany.update.operationDenied");
}
}

/**
 * can delete
 */
public boolean canDelete(AirlineCompany airlineCompany) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(AirlineCompany airlineCompany) {
if (!canDelete(airlineCompany)) {
throw new AccessDeniedException("AirlineCompany.delete.operationDenied");
}
}

}
