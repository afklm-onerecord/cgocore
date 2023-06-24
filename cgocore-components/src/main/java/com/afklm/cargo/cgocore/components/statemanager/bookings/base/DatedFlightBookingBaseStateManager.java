package com.afklm.cargo.cgocore.components.statemanager.bookings.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgocore.model.bookings.DatedFlightBooking;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBookingBaseStateManager {

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
throw new InvalidStateException("DatedFlightBooking.save.invalidState");
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
throw new InvalidStateException("DatedFlightBooking.update.invalidState");
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
throw new InvalidStateException("DatedFlightBooking.delete.invalidState");
}
}

}
