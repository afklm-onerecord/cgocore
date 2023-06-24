package com.afklm.cargo.cgocore.model.bookings;

import java.math.BigDecimal;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.model.reference.localization.Station;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;

/**
 * auto generated entity metamodel class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@StaticMetamodel(Booking.class)
public abstract class Booking_ {

public static volatile SingularAttribute<Booking, Long> id;
public static volatile SingularAttribute<Booking, AirWaybill> airWaybill;
public static volatile SingularAttribute<Booking, Station> origin;
public static volatile SingularAttribute<Booking, Station> destination;
public static volatile SingularAttribute<Booking, Integer> numberOfPieces;
public static volatile SingularAttribute<Booking, BigDecimal> grossWeight;
public static volatile SingularAttribute<Booking, UnitOfMeasure> grossWeightUnitOfMeasure;
public static volatile SingularAttribute<Booking, BigDecimal> grossVolume;
public static volatile SingularAttribute<Booking, UnitOfMeasure> grossVolumeUnitOfMeasure;
public static volatile SetAttribute<Booking, DatedFlightBooking> datedFlightBookingCollection;

public static final String ID = "id";
public static final String AIR_WAYBILL = "airWaybill";
public static final String ORIGIN = "origin";
public static final String DESTINATION = "destination";
public static final String NUMBER_OF_PIECES = "numberOfPieces";
public static final String GROSS_WEIGHT = "grossWeight";
public static final String GROSS_WEIGHT_UNIT_OF_MEASURE = "grossWeightUnitOfMeasure";
public static final String GROSS_VOLUME = "grossVolume";
public static final String GROSS_VOLUME_UNIT_OF_MEASURE = "grossVolumeUnitOfMeasure";
public static final String DATED_FLIGHT_BOOKING_COLLECTION = "datedFlightBookingCollection";

/* Specific Code Start */
/* Specific Code End */
}