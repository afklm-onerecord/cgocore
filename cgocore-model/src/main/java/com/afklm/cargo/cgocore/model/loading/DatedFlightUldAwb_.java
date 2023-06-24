package com.afklm.cargo.cgocore.model.loading;

import java.math.BigDecimal;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;

/**
 * auto generated entity metamodel class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@StaticMetamodel(DatedFlightUldAwb.class)
public abstract class DatedFlightUldAwb_ {

public static volatile SingularAttribute<DatedFlightUldAwb, Integer> id;
public static volatile SingularAttribute<DatedFlightUldAwb, DatedFlightUld> datedFlightUld;
public static volatile SingularAttribute<DatedFlightUldAwb, AirWaybill> airWaybill;
public static volatile SingularAttribute<DatedFlightUldAwb, Integer> numberOfPieces;
public static volatile SingularAttribute<DatedFlightUldAwb, BigDecimal> grossWeight;
public static volatile SingularAttribute<DatedFlightUldAwb, UnitOfMeasure> grossWeightUnitOfMeasure;
public static volatile SingularAttribute<DatedFlightUldAwb, BigDecimal> grossVolume;
public static volatile SingularAttribute<DatedFlightUldAwb, UnitOfMeasure> grossVolumeUnitOfMeasure;

public static final String ID = "id";
public static final String DATED_FLIGHT_ULD = "datedFlightUld";
public static final String AIR_WAYBILL = "airWaybill";
public static final String NUMBER_OF_PIECES = "numberOfPieces";
public static final String GROSS_WEIGHT = "grossWeight";
public static final String GROSS_WEIGHT_UNIT_OF_MEASURE = "grossWeightUnitOfMeasure";
public static final String GROSS_VOLUME = "grossVolume";
public static final String GROSS_VOLUME_UNIT_OF_MEASURE = "grossVolumeUnitOfMeasure";

/* Specific Code Start */
/* Specific Code End */
}