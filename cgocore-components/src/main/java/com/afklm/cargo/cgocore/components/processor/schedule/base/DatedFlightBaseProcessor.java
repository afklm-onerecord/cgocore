package com.afklm.cargo.cgocore.components.processor.schedule.base;

import javax.inject.Inject;

import com.afklm.cargo.cgocore.model.schedule.DatedFlight;
import com.afklm.cargo.cgocore.persistence.interfaces.schedule.DatedFlightDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected DatedFlightDao datedFlightDao;

/**
 * process save
 */
public Integer save(DatedFlight datedFlight) {
return datedFlightDao.save(datedFlight);
}

/**
 * process update
 */
public void update(DatedFlight datedFlight) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(DatedFlight datedFlight) {
datedFlightDao.delete(datedFlight);
}

}
