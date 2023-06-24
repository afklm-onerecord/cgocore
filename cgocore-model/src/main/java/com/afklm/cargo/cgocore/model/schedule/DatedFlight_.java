package com.afklm.cargo.cgocore.model.schedule;

import java.time.LocalDate;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.afklm.cargo.cgocore.model.bookings.DatedFlightBooking;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;
import com.afklm.cargo.cgocore.model.reference.localization.Station;

/**
 * auto generated entity metamodel class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@StaticMetamodel(DatedFlight.class)
public abstract class DatedFlight_ {

public static volatile SingularAttribute<DatedFlight, Integer> id;
public static volatile SingularAttribute<DatedFlight, AirlineCompany> company;
public static volatile SingularAttribute<DatedFlight, String> flightNumber;
public static volatile SingularAttribute<DatedFlight, LocalDate> departureDate;
public static volatile SingularAttribute<DatedFlight, Station> origin;
public static volatile SingularAttribute<DatedFlight, String> departureTime;
public static volatile SingularAttribute<DatedFlight, Station> destination;
public static volatile SingularAttribute<DatedFlight, LocalDate> arrivalDate;
public static volatile SingularAttribute<DatedFlight, String> arrivalTime;
public static volatile SetAttribute<DatedFlight, DatedFlightBooking> datedFlightBookingCollection;
public static volatile SetAttribute<DatedFlight, DatedFlightUld> datedFlightUldCollection;

public static final String ID = "id";
public static final String COMPANY = "company";
public static final String FLIGHT_NUMBER = "flightNumber";
public static final String DEPARTURE_DATE = "departureDate";
public static final String ORIGIN = "origin";
public static final String DEPARTURE_TIME = "departureTime";
public static final String DESTINATION = "destination";
public static final String ARRIVAL_DATE = "arrivalDate";
public static final String ARRIVAL_TIME = "arrivalTime";
public static final String DATED_FLIGHT_BOOKING_COLLECTION = "datedFlightBookingCollection";
public static final String DATED_FLIGHT_ULD_COLLECTION = "datedFlightUldCollection";

/* Specific Code Start */
/* Specific Code End */
}