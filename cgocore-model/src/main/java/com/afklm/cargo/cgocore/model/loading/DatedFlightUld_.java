package com.afklm.cargo.cgocore.model.loading;

import java.math.BigDecimal;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.model.reference.containers.UldType;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight;

/**
 * auto generated entity metamodel class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@StaticMetamodel(DatedFlightUld.class)
public abstract class DatedFlightUld_ {

public static volatile SingularAttribute<DatedFlightUld, Integer> id;
public static volatile SingularAttribute<DatedFlightUld, DatedFlight> datedFlight;
public static volatile SingularAttribute<DatedFlightUld, UldType> uldType;
public static volatile SingularAttribute<DatedFlightUld, String> uldCode;
public static volatile SingularAttribute<DatedFlightUld, String> uldOwnerCode;
public static volatile SingularAttribute<DatedFlightUld, BigDecimal> grossWeight;
public static volatile SingularAttribute<DatedFlightUld, UnitOfMeasure> grossWeightUnitOfMeasure;
public static volatile SetAttribute<DatedFlightUld, DatedFlightUldAwb> datedFlightUldAwbCollection;

public static final String ID = "id";
public static final String DATED_FLIGHT = "datedFlight";
public static final String ULD_TYPE = "uldType";
public static final String ULD_CODE = "uldCode";
public static final String ULD_OWNER_CODE = "uldOwnerCode";
public static final String GROSS_WEIGHT = "grossWeight";
public static final String GROSS_WEIGHT_UNIT_OF_MEASURE = "grossWeightUnitOfMeasure";
public static final String DATED_FLIGHT_ULD_AWB_COLLECTION = "datedFlightUldAwbCollection";

/* Specific Code Start */
/* Specific Code End */
}