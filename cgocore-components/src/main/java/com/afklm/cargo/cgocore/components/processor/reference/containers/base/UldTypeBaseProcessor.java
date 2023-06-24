package com.afklm.cargo.cgocore.components.processor.reference.containers.base;

import javax.inject.Inject;

import com.afklm.cargo.cgocore.model.reference.containers.UldType;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.containers.UldTypeDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UldTypeBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected UldTypeDao uldTypeDao;

/**
 * process save
 */
public Integer save(UldType uldType) {
return uldTypeDao.save(uldType);
}

/**
 * process update
 */
public void update(UldType uldType) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(UldType uldType) {
uldTypeDao.delete(uldType);
}

}
