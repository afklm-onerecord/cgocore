package com.afklm.cargo.cgocore.components.processor.loading.base;

import javax.inject.Inject;

import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;
import com.afklm.cargo.cgocore.persistence.interfaces.loading.DatedFlightUldDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected DatedFlightUldDao datedFlightUldDao;

/**
 * process save
 */
public Integer save(DatedFlightUld datedFlightUld) {
return datedFlightUldDao.save(datedFlightUld);
}

/**
 * process update
 */
public void update(DatedFlightUld datedFlightUld) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(DatedFlightUld datedFlightUld) {
datedFlightUldDao.delete(datedFlightUld);
}

}
