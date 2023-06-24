package com.afklm.cargo.cgocore.components.statemanager.schedule.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgocore.model.schedule.DatedFlight;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBaseStateManager {

/**
 * can save
 */
public boolean canSave(DatedFlight datedFlight) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(DatedFlight datedFlight) {
if (!canSave(datedFlight)) {
throw new InvalidStateException("DatedFlight.save.invalidState");
}
}

/**
 * can update
 */
public boolean canUpdate(DatedFlight datedFlight) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(DatedFlight datedFlight) {
if (!canUpdate(datedFlight)) {
throw new InvalidStateException("DatedFlight.update.invalidState");
}
}

/**
 * can delete
 */
public boolean canDelete(DatedFlight datedFlight) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(DatedFlight datedFlight) {
if (!canDelete(datedFlight)) {
throw new InvalidStateException("DatedFlight.delete.invalidState");
}
}

}
