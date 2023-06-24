package com.afklm.cargo.cgocore.model.shipments;

import java.math.BigDecimal;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.model.reference.localization.Station;

/**
 * auto generated entity metamodel class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@StaticMetamodel(AirWaybill.class)
public abstract class AirWaybill_ {

public static volatile SingularAttribute<AirWaybill, Long> id;
public static volatile SingularAttribute<AirWaybill, String> airWaybillNumber;
public static volatile SingularAttribute<AirWaybill, String> forwarderName;
public static volatile SingularAttribute<AirWaybill, Station> origin;
public static volatile SingularAttribute<AirWaybill, Station> destination;
public static volatile SingularAttribute<AirWaybill, String> goddsDescription;
public static volatile SingularAttribute<AirWaybill, String> hsCode;
public static volatile SingularAttribute<AirWaybill, Integer> numberOfPieces;
public static volatile SingularAttribute<AirWaybill, BigDecimal> grossWeight;
public static volatile SingularAttribute<AirWaybill, BigDecimal> chargeableWeight;
public static volatile SingularAttribute<AirWaybill, UnitOfMeasure> grossWeightUnitOfMeasure;
public static volatile SingularAttribute<AirWaybill, BigDecimal> grossVolume;
public static volatile SingularAttribute<AirWaybill, UnitOfMeasure> grossVolumeUnitOfMeasure;

public static final String ID = "id";
public static final String AIR_WAYBILL_NUMBER = "airWaybillNumber";
public static final String FORWARDER_NAME = "forwarderName";
public static final String ORIGIN = "origin";
public static final String DESTINATION = "destination";
public static final String GODDS_DESCRIPTION = "goddsDescription";
public static final String HS_CODE = "hsCode";
public static final String NUMBER_OF_PIECES = "numberOfPieces";
public static final String GROSS_WEIGHT = "grossWeight";
public static final String CHARGEABLE_WEIGHT = "chargeableWeight";
public static final String GROSS_WEIGHT_UNIT_OF_MEASURE = "grossWeightUnitOfMeasure";
public static final String GROSS_VOLUME = "grossVolume";
public static final String GROSS_VOLUME_UNIT_OF_MEASURE = "grossVolumeUnitOfMeasure";

/* Specific Code Start */
/* Specific Code End */
}