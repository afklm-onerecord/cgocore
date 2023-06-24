package com.afklm.cargo.cgocore.model.bookings;

import java.math.BigDecimal;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight;

/**
 * auto generated entity metamodel class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@StaticMetamodel(DatedFlightBooking.class)
public abstract class DatedFlightBooking_ {

public static volatile SingularAttribute<DatedFlightBooking, Integer> id;
public static volatile SingularAttribute<DatedFlightBooking, DatedFlight> datedFlight;
public static volatile SingularAttribute<DatedFlightBooking, Booking> booking;
public static volatile SingularAttribute<DatedFlightBooking, Integer> numberOfPieces;
public static volatile SingularAttribute<DatedFlightBooking, BigDecimal> grossWeight;
public static volatile SingularAttribute<DatedFlightBooking, UnitOfMeasure> grossWeightUnitOfMeasure;
public static volatile SingularAttribute<DatedFlightBooking, BigDecimal> grossVolume;
public static volatile SingularAttribute<DatedFlightBooking, UnitOfMeasure> grossVolumeUnitOfMeasure;

public static final String ID = "id";
public static final String DATED_FLIGHT = "datedFlight";
public static final String BOOKING = "booking";
public static final String NUMBER_OF_PIECES = "numberOfPieces";
public static final String GROSS_WEIGHT = "grossWeight";
public static final String GROSS_WEIGHT_UNIT_OF_MEASURE = "grossWeightUnitOfMeasure";
public static final String GROSS_VOLUME = "grossVolume";
public static final String GROSS_VOLUME_UNIT_OF_MEASURE = "grossVolumeUnitOfMeasure";

/* Specific Code Start */
/* Specific Code End */
}