package com.afklm.cargo.cgocore.model.bookings;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight;

/**
 * auto generated entity class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@Entity
@Table(name="DATED_FLIGHT_BOOKING"
, uniqueConstraints = {
@UniqueConstraint(name = "UC_DATED_FLIGHT_BOOKING", columnNames = {"DATED_FLIGHT_ID", "BOOKING_ID"})
}
, indexes = {
@Index(name = "IDX_DATED_FLIGHT_BOOKING_UC", columnList = "DATED_FLIGHT_ID, BOOKING_ID")
, @Index(name = "IDX_DATED_FLIGHT_BOOKING_C0", columnList = "DATED_FLIGHT_ID")
, @Index(name = "IDX_DATED_FLIGHT_BOOKING_C1", columnList = "BOOKING_ID")
, @Index(name = "IDX_DATED_FLIGHT_BOOKING_C4", columnList = "GROSS_WEIGHT_UNIT_OF_MEASURE_ID")
, @Index(name = "IDX_DATED_FLIGHT_BOOKING_C6", columnList = "GROSS_VOLUME_UNIT_OF_MEASURE_ID")
})
public class DatedFlightBooking implements org.sklsft.commons.model.interfaces.Entity<Integer> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public DatedFlightBooking(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "datedFlightBookingIdGenerator", sequenceName = "DATED_FLIGHT_BOOKING_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "datedFlightBookingIdGenerator")
private Integer id;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "DATED_FLIGHT_ID", nullable = false)
private DatedFlight datedFlight;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "BOOKING_ID", nullable = false)
private Booking booking;

@Column(name = "NUMBER_OF_PIECES")
private Integer numberOfPieces;

@Column(name = "GROSS_WEIGHT")
private BigDecimal grossWeight;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "GROSS_WEIGHT_UNIT_OF_MEASURE_ID")
private UnitOfMeasure grossWeightUnitOfMeasure;

@Column(name = "GROSS_VOLUME")
private BigDecimal grossVolume;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "GROSS_VOLUME_UNIT_OF_MEASURE_ID")
private UnitOfMeasure grossVolumeUnitOfMeasure;


/*
 * getters and setters
 */
public Integer getId() {
return this.id;
}

public void setId(Integer id) {
this.id = id;
}

public DatedFlight getDatedFlight() {
return this.datedFlight;
}

public void setDatedFlight(DatedFlight datedFlight) {
this.datedFlight = datedFlight;
}

public Booking getBooking() {
return this.booking;
}

public void setBooking(Booking booking) {
this.booking = booking;
}

public Integer getNumberOfPieces() {
return this.numberOfPieces;
}

public void setNumberOfPieces(Integer numberOfPieces) {
this.numberOfPieces = numberOfPieces;
}

public BigDecimal getGrossWeight() {
return this.grossWeight;
}

public void setGrossWeight(BigDecimal grossWeight) {
this.grossWeight = grossWeight;
}

public UnitOfMeasure getGrossWeightUnitOfMeasure() {
return this.grossWeightUnitOfMeasure;
}

public void setGrossWeightUnitOfMeasure(UnitOfMeasure grossWeightUnitOfMeasure) {
this.grossWeightUnitOfMeasure = grossWeightUnitOfMeasure;
}

public BigDecimal getGrossVolume() {
return this.grossVolume;
}

public void setGrossVolume(BigDecimal grossVolume) {
this.grossVolume = grossVolume;
}

public UnitOfMeasure getGrossVolumeUnitOfMeasure() {
return this.grossVolumeUnitOfMeasure;
}

public void setGrossVolumeUnitOfMeasure(UnitOfMeasure grossVolumeUnitOfMeasure) {
this.grossVolumeUnitOfMeasure = grossVolumeUnitOfMeasure;
}


/* Specific Code Start */
/* Specific Code End */
}