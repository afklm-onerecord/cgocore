package com.afklm.cargo.cgocore.components.rightsmanager.reference.localization.base;

import org.sklsft.commons.api.exception.rights.AccessDeniedException;

import com.afklm.cargo.cgocore.model.reference.localization.Currency;

/**
 * auto generated base rights manager class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class CurrencyBaseRightsManager {

/**
 * can access all
 */
public boolean canAccess() {
return true;
}

/**
 * check can access all
 */
public void checkCanAccess() {
if (!canAccess()) {
throw new AccessDeniedException("Currency.accessDenied");
}
}

/**
 * can access
 */
public boolean canAccess(Currency currency) {
return true;
}

/**
 * check can access
 */
public void checkCanAccess(Currency currency) {
if (!canAccess(currency)) {
throw new AccessDeniedException("Currency.accessDenied");
}
}

/**
 * can create
 */
public boolean canCreate() {
return true;
}

/**
 * check can create
 */
public void checkCanCreate() {
if (!canCreate()) {
throw new AccessDeniedException("Currency.create.operationDenied");
}
}

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
throw new AccessDeniedException("Currency.save.operationDenied");
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
throw new AccessDeniedException("Currency.update.operationDenied");
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
throw new AccessDeniedException("Currency.delete.operationDenied");
}
}

}
