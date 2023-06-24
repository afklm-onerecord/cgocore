package com.afklm.cargo.cgocore.components.processor.reference.airlines.base;

import javax.inject.Inject;

import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.airlines.AirlineCompanyDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirlineCompanyBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected AirlineCompanyDao airlineCompanyDao;

/**
 * process save
 */
public Integer save(AirlineCompany airlineCompany) {
return airlineCompanyDao.save(airlineCompany);
}

/**
 * process update
 */
public void update(AirlineCompany airlineCompany) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(AirlineCompany airlineCompany) {
airlineCompanyDao.delete(airlineCompany);
}

}
