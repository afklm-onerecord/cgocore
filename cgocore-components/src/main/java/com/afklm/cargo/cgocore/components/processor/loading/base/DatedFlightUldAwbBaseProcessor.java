package com.afklm.cargo.cgocore.components.processor.loading.base;

import javax.inject.Inject;

import com.afklm.cargo.cgocore.model.loading.DatedFlightUldAwb;
import com.afklm.cargo.cgocore.persistence.interfaces.loading.DatedFlightUldAwbDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldAwbBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected DatedFlightUldAwbDao datedFlightUldAwbDao;

/**
 * process save
 */
public Integer save(DatedFlightUldAwb datedFlightUldAwb) {
return datedFlightUldAwbDao.save(datedFlightUldAwb);
}

/**
 * process update
 */
public void update(DatedFlightUldAwb datedFlightUldAwb) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(DatedFlightUldAwb datedFlightUldAwb) {
datedFlightUldAwbDao.delete(datedFlightUldAwb);
}

}
