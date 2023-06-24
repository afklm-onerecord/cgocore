package com.afklm.cargo.cgocore.components.statemanager.reference.localization.base;

import org.sklsft.commons.api.exception.state.InvalidStateException;

import com.afklm.cargo.cgocore.model.reference.localization.Currency;

/**
 * auto generated base state manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class CurrencyBaseStateManager {

/**
 * can save
 */
public boolean canSave(Currency currency) {
return true;
}

/**
 * check can save
 */
public void checkCanSave(Currency currency) {
if (!canSave(currency)) {
throw new InvalidStateException("Currency.save.invalidState");
}
}

/**
 * can update
 */
public boolean canUpdate(Currency currency) {
return true;
}

/**
 * check can update
 */
public void checkCanUpdate(Currency currency) {
if (!canUpdate(currency)) {
throw new InvalidStateException("Currency.update.invalidState");
}
}

/**
 * can delete
 */
public boolean canDelete(Currency currency) {
return true;
}

/**
 * check can delete
 */
public void checkCanDelete(Currency currency) {
if (!canDelete(currency)) {
throw new InvalidStateException("Currency.delete.invalidState");
}
}

}
