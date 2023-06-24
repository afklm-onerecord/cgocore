package com.afklm.cargo.cgocore.components.statemanager.reference.airlines.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirlineCompanyBaseStateManager {

/**
 * can save
 */
public boolean canSave(AirlineCompany airlineCompany) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(AirlineCompany airlineCompany) {
if (!canSave(airlineCompany)) {
throw new InvalidStateException("AirlineCompany.save.invalidState");
}
}

/**
 * can update
 */
public boolean canUpdate(AirlineCompany airlineCompany) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(AirlineCompany airlineCompany) {
if (!canUpdate(airlineCompany)) {
throw new InvalidStateException("AirlineCompany.update.invalidState");
}
}

/**
 * can delete
 */
public boolean canDelete(AirlineCompany airlineCompany) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(AirlineCompany airlineCompany) {
if (!canDelete(airlineCompany)) {
throw new InvalidStateException("AirlineCompany.delete.invalidState");
}
}

}
