package com.afklm.cargo.cgocore.components.statemanager.reference.commodities.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UnitOfMeasureBaseStateManager {

/**
 * can save
 */
public boolean canSave(UnitOfMeasure unitOfMeasure) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(UnitOfMeasure unitOfMeasure) {
if (!canSave(unitOfMeasure)) {
throw new InvalidStateException("UnitOfMeasure.save.invalidState");
}
}

/**
 * can update
 */
public boolean canUpdate(UnitOfMeasure unitOfMeasure) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(UnitOfMeasure unitOfMeasure) {
if (!canUpdate(unitOfMeasure)) {
throw new InvalidStateException("UnitOfMeasure.update.invalidState");
}
}

/**
 * can delete
 */
public boolean canDelete(UnitOfMeasure unitOfMeasure) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(UnitOfMeasure unitOfMeasure) {
if (!canDelete(unitOfMeasure)) {
throw new InvalidStateException("UnitOfMeasure.delete.invalidState");
}
}

}
