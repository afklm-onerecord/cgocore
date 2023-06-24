package com.afklm.cargo.cgocore.components.statemanager.loading.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldBaseStateManager {

/**
 * can save
 */
public boolean canSave(DatedFlightUld datedFlightUld) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(DatedFlightUld datedFlightUld) {
if (!canSave(datedFlightUld)) {
throw new InvalidStateException("DatedFlightUld.save.invalidState");
}
}

/**
 * can update
 */
public boolean canUpdate(DatedFlightUld datedFlightUld) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(DatedFlightUld datedFlightUld) {
if (!canUpdate(datedFlightUld)) {
throw new InvalidStateException("DatedFlightUld.update.invalidState");
}
}

/**
 * can delete
 */
public boolean canDelete(DatedFlightUld datedFlightUld) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(DatedFlightUld datedFlightUld) {
if (!canDelete(datedFlightUld)) {
throw new InvalidStateException("DatedFlightUld.delete.invalidState");
}
}

}
