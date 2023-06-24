package com.afklm.cargo.cgocore.components.statemanager.bookings.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgocore.model.bookings.Booking;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class BookingBaseStateManager {

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
throw new InvalidStateException("Booking.save.invalidState");
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
throw new InvalidStateException("Booking.update.invalidState");
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
throw new InvalidStateException("Booking.delete.invalidState");
}
}

}
