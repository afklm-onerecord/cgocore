package com.afklm.cargo.cgocore.components.statemanager.reference.containers.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgocore.model.reference.containers.UldType;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UldTypeBaseStateManager {

/**
 * can save
 */
public boolean canSave(UldType uldType) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(UldType uldType) {
if (!canSave(uldType)) {
throw new InvalidStateException("UldType.save.invalidState");
}
}

/**
 * can update
 */
public boolean canUpdate(UldType uldType) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(UldType uldType) {
if (!canUpdate(uldType)) {
throw new InvalidStateException("UldType.update.invalidState");
}
}

/**
 * can delete
 */
public boolean canDelete(UldType uldType) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(UldType uldType) {
if (!canDelete(uldType)) {
throw new InvalidStateException("UldType.delete.invalidState");
}
}

}
