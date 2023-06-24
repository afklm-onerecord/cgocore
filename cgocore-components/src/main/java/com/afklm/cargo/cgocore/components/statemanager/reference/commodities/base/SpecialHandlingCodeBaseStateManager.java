package com.afklm.cargo.cgocore.components.statemanager.reference.commodities.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgocore.model.reference.commodities.SpecialHandlingCode;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class SpecialHandlingCodeBaseStateManager {

/**
 * can save
 */
public boolean canSave(SpecialHandlingCode specialHandlingCode) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(SpecialHandlingCode specialHandlingCode) {
if (!canSave(specialHandlingCode)) {
throw new InvalidStateException("SpecialHandlingCode.save.invalidState");
}
}

/**
 * can update
 */
public boolean canUpdate(SpecialHandlingCode specialHandlingCode) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(SpecialHandlingCode specialHandlingCode) {
if (!canUpdate(specialHandlingCode)) {
throw new InvalidStateException("SpecialHandlingCode.update.invalidState");
}
}

/**
 * can delete
 */
public boolean canDelete(SpecialHandlingCode specialHandlingCode) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(SpecialHandlingCode specialHandlingCode) {
if (!canDelete(specialHandlingCode)) {
throw new InvalidStateException("SpecialHandlingCode.delete.invalidState");
}
}

}
