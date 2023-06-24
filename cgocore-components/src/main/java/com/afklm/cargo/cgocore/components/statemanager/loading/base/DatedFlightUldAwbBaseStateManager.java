package com.afklm.cargo.cgocore.components.statemanager.loading.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgocore.model.loading.DatedFlightUldAwb;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldAwbBaseStateManager {

/**
 * can save
 */
public boolean canSave(DatedFlightUldAwb datedFlightUldAwb) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(DatedFlightUldAwb datedFlightUldAwb) {
if (!canSave(datedFlightUldAwb)) {
throw new InvalidStateException("DatedFlightUldAwb.save.invalidState");
}
}

/**
 * can update
 */
public boolean canUpdate(DatedFlightUldAwb datedFlightUldAwb) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(DatedFlightUldAwb datedFlightUldAwb) {
if (!canUpdate(datedFlightUldAwb)) {
throw new InvalidStateException("DatedFlightUldAwb.update.invalidState");
}
}

/**
 * can delete
 */
public boolean canDelete(DatedFlightUldAwb datedFlightUldAwb) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(DatedFlightUldAwb datedFlightUldAwb) {
if (!canDelete(datedFlightUldAwb)) {
throw new InvalidStateException("DatedFlightUldAwb.delete.invalidState");
}
}

}
