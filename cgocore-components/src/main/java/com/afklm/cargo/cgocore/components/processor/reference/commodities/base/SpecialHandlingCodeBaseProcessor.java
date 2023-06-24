package com.afklm.cargo.cgocore.components.processor.reference.commodities.base;

import javax.inject.Inject;

import com.afklm.cargo.cgocore.model.reference.commodities.SpecialHandlingCode;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.SpecialHandlingCodeDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class SpecialHandlingCodeBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected SpecialHandlingCodeDao specialHandlingCodeDao;

/**
 * process save
 */
public Integer save(SpecialHandlingCode specialHandlingCode) {
return specialHandlingCodeDao.save(specialHandlingCode);
}

/**
 * process update
 */
public void update(SpecialHandlingCode specialHandlingCode) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(SpecialHandlingCode specialHandlingCode) {
specialHandlingCodeDao.delete(specialHandlingCode);
}

}
