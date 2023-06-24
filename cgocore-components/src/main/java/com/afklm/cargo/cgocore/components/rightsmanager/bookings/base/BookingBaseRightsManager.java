package com.afklm.cargo.cgocore.components.rightsmanager.bookings.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgocore.model.bookings.Booking;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class BookingBaseRightsManager {

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
throw new AccessDeniedException("Booking.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(Booking booking) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(Booking booking) {
if (!canAccess(booking)) {
throw new AccessDeniedException("Booking.accessDenied");
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
throw new AccessDeniedException("Booking.create.operationDenied");
}
}

/**
 * can save
 */
public boolean canSave(Booking booking) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(Booking booking) {
if (!canSave(booking)) {
throw new AccessDeniedException("Booking.save.operationDenied");
}
}

/**
 * can update
 */
public boolean canUpdate(Booking booking) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(Booking booking) {
if (!canUpdate(booking)) {
throw new AccessDeniedException("Booking.update.operationDenied");
}
}

/**
 * can delete
 */
public boolean canDelete(Booking booking) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(Booking booking) {
if (!canDelete(booking)) {
throw new AccessDeniedException("Booking.delete.operationDenied");
}
}

}
