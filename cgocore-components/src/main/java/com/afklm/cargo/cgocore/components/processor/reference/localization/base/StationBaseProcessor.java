package com.afklm.cargo.cgocore.components.processor.reference.localization.base;

import javax.inject.Inject;

import com.afklm.cargo.cgocore.model.reference.localization.Station;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.StationDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class StationBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected StationDao stationDao;

/**
 * process save
 */
public Integer save(Station station) {
return stationDao.save(station);
}

/**
 * process update
 */
public void update(Station station) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(Station station) {
stationDao.delete(station);
}

}
