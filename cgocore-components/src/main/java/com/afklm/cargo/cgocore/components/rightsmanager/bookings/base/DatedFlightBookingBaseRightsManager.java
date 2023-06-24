package com.afklm.cargo.cgocore.components.rightsmanager.bookings.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgocore.model.bookings.DatedFlightBooking;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBookingBaseRightsManager {

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
throw new AccessDeniedException("DatedFlightBooking.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(DatedFlightBooking datedFlightBooking) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(DatedFlightBooking datedFlightBooking) {
if (!canAccess(datedFlightBooking)) {
throw new AccessDeniedException("DatedFlightBooking.accessDenied");
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
throw new AccessDeniedException("DatedFlightBooking.create.operationDenied");
}
}

/**
 * can save
 */
public boolean canSave(DatedFlightBooking datedFlightBooking) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(DatedFlightBooking datedFlightBooking) {
if (!canSave(datedFlightBooking)) {
throw new AccessDeniedException("DatedFlightBooking.save.operationDenied");
}
}

/**
 * can update
 */
public boolean canUpdate(DatedFlightBooking datedFlightBooking) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(DatedFlightBooking datedFlightBooking) {
if (!canUpdate(datedFlightBooking)) {
throw new AccessDeniedException("DatedFlightBooking.update.operationDenied");
}
}

/**
 * can delete
 */
public boolean canDelete(DatedFlightBooking datedFlightBooking) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(DatedFlightBooking datedFlightBooking) {
if (!canDelete(datedFlightBooking)) {
throw new AccessDeniedException("DatedFlightBooking.delete.operationDenied");
}
}

}
