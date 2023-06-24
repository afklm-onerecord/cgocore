package com.afklm.cargo.cgocore.components.processor.reference.commodities.base;

import javax.inject.Inject;

import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;

/**
 * auto generated base processor class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UnitOfMeasureBaseProcessor {

/*
 * properties injected by spring
 */
@Inject
protected UnitOfMeasureDao unitOfMeasureDao;

/**
 * process save
 */
public Integer save(UnitOfMeasure unitOfMeasure) {
return unitOfMeasureDao.save(unitOfMeasure);
}

/**
 * process update
 */
public void update(UnitOfMeasure unitOfMeasure) {
// Empty by default. Can be overridden
}

/**
 * process delete
 */
public void delete(UnitOfMeasure unitOfMeasure) {
unitOfMeasureDao.delete(unitOfMeasure);
}

}
