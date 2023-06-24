package com.afklm.cargo.cgocore.model.schedule;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.afklm.cargo.cgocore.model.bookings.DatedFlightBooking;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;
import com.afklm.cargo.cgocore.model.reference.airlines.AirlineCompany;
import com.afklm.cargo.cgocore.model.reference.localization.Station;

/**
 * auto generated entity class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@Entity
@Table(name="DATED_FLIGHT"
, uniqueConstraints = {
@UniqueConstraint(name = "UC_DATED_FLIGHT", columnNames = {"COMPANY_ID", "FLIGHT_NUMBER", "DEPARTURE_DATE"})
}
, indexes = {
@Index(name = "IDX_DATED_FLIGHT_UC", columnList = "COMPANY_ID, FLIGHT_NUMBER, DEPARTURE_DATE")
, @Index(name = "IDX_DATED_FLIGHT_C0", columnList = "COMPANY_ID")
, @Index(name = "IDX_DATED_FLIGHT_C3", columnList = "ORIGIN_ID")
, @Index(name = "IDX_DATED_FLIGHT_C5", columnList = "DESTINATION_ID")
})
public class DatedFlight implements org.sklsft.commons.model.interfaces.Entity<Integer> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public DatedFlight(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "datedFlightIdGenerator", sequenceName = "DATED_FLIGHT_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "datedFlightIdGenerator")
private Integer id;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "COMPANY_ID", nullable = false)
private AirlineCompany company;

@Column(name = "FLIGHT_NUMBER", nullable = false)
private String flightNumber;

@Column(name = "DEPARTURE_DATE", nullable = false)
private LocalDate departureDate;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "ORIGIN_ID")
private Station origin;

@Column(name = "DEPARTURE_TIME")
private String departureTime;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "DESTINATION_ID")
private Station destination;

@Column(name = "ARRIVAL_DATE")
private LocalDate arrivalDate;

@Column(name = "ARRIVAL_TIME")
private String arrivalTime;

@OneToMany(fetch = FetchType.LAZY, mappedBy = "datedFlight")
private Set <DatedFlightBooking> datedFlightBookingCollection;

@OneToMany(fetch = FetchType.LAZY, mappedBy = "datedFlight")
private Set <DatedFlightUld> datedFlightUldCollection;


/*
 * getters and setters
 */
public Integer getId() {
return this.id;
}

public void setId(Integer id) {
this.id = id;
}

public AirlineCompany getCompany() {
return this.company;
}

public void setCompany(AirlineCompany company) {
this.company = company;
}

public String getFlightNumber() {
return this.flightNumber;
}

public void setFlightNumber(String flightNumber) {
this.flightNumber = flightNumber;
}

public LocalDate getDepartureDate() {
return this.departureDate;
}

public void setDepartureDate(LocalDate departureDate) {
this.departureDate = departureDate;
}

public Station getOrigin() {
return this.origin;
}

public void setOrigin(Station origin) {
this.origin = origin;
}

public String getDepartureTime() {
return this.departureTime;
}

public void setDepartureTime(String departureTime) {
this.departureTime = departureTime;
}

public Station getDestination() {
return this.destination;
}

public void setDestination(Station destination) {
this.destination = destination;
}

public LocalDate getArrivalDate() {
return this.arrivalDate;
}

public void setArrivalDate(LocalDate arrivalDate) {
this.arrivalDate = arrivalDate;
}

public String getArrivalTime() {
return this.arrivalTime;
}

public void setArrivalTime(String arrivalTime) {
this.arrivalTime = arrivalTime;
}

public Set <DatedFlightBooking> getDatedFlightBookingCollection () {
return this.datedFlightBookingCollection;
}

public void setDatedFlightBookingCollection(Set <DatedFlightBooking> datedFlightBookingCollection) {
this.datedFlightBookingCollection = datedFlightBookingCollection;
}

public Set <DatedFlightUld> getDatedFlightUldCollection () {
return this.datedFlightUldCollection;
}

public void setDatedFlightUldCollection(Set <DatedFlightUld> datedFlightUldCollection) {
this.datedFlightUldCollection = datedFlightUldCollection;
}


/* Specific Code Start */
/* Specific Code End */
}