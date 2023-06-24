package com.afklm.cargo.cgocore.components.processor.shipments.base;

import javax.inject.Inject;

import com.afklm.cargo.cgocore.model.shipments.AirWaybill;
import com.afklm.cargo.cgocore.persistence.interfaces.shipments.AirWaybillDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class AirWaybillBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected AirWaybillDao airWaybillDao;

/**
 * process save
 */
public Long save(AirWaybill airWaybill) {
return airWaybillDao.save(airWaybill);
}

/**
 * process update
 */
public void update(AirWaybill airWaybill) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(AirWaybill airWaybill) {
airWaybillDao.delete(airWaybill);
}

}
