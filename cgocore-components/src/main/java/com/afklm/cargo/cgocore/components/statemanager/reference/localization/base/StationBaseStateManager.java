package com.afklm.cargo.cgocore.components.statemanager.reference.localization.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgocore.model.reference.localization.Station;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class StationBaseStateManager {

/**
 * can save
 */
public boolean canSave(Station station) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(Station station) {
if (!canSave(station)) {
throw new InvalidStateException("Station.save.invalidState");
}
}

/**
 * can update
 */
public boolean canUpdate(Station station) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(Station station) {
if (!canUpdate(station)) {
throw new InvalidStateException("Station.update.invalidState");
}
}

/**
 * can delete
 */
public boolean canDelete(Station station) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(Station station) {
if (!canDelete(station)) {
throw new InvalidStateException("Station.delete.invalidState");
}
}

}
