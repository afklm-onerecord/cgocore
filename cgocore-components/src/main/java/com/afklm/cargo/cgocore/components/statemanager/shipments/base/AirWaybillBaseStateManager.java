package com.afklm.cargo.cgocore.components.statemanager.shipments.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgocore.model.shipments.AirWaybill;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirWaybillBaseStateManager {

/**
 * can save
 */
public boolean canSave(AirWaybill airWaybill) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(AirWaybill airWaybill) {
if (!canSave(airWaybill)) {
throw new InvalidStateException("AirWaybill.save.invalidState");
}
}

/**
 * can update
 */
public boolean canUpdate(AirWaybill airWaybill) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(AirWaybill airWaybill) {
if (!canUpdate(airWaybill)) {
throw new InvalidStateException("AirWaybill.update.invalidState");
}
}

/**
 * can delete
 */
public boolean canDelete(AirWaybill airWaybill) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(AirWaybill airWaybill) {
if (!canDelete(airWaybill)) {
throw new InvalidStateException("AirWaybill.delete.invalidState");
}
}

}
