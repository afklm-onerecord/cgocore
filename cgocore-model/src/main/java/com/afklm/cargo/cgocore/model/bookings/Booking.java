package com.afklm.cargo.cgocore.model.bookings;

import java.math.BigDecimal;
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

import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;
import com.afklm.cargo.cgocore.model.reference.localization.Station;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;

/**
 * auto generated entity class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@Entity
@Table(name="BOOKING"
, uniqueConstraints = {
@UniqueConstraint(name = "UC_BOOKING", columnNames = {"AIR_WAYBILL_ID"})
}
, indexes = {
@Index(name = "IDX_BOOKING_UC", columnList = "AIR_WAYBILL_ID")
, @Index(name = "IDX_BOOKING_C0", columnList = "AIR_WAYBILL_ID")
, @Index(name = "IDX_BOOKING_C1", columnList = "ORIGIN_ID")
, @Index(name = "IDX_BOOKING_C2", columnList = "DESTINATION_ID")
, @Index(name = "IDX_BOOKING_C5", columnList = "GROSS_WEIGHT_UNIT_OF_MEASURE_ID")
, @Index(name = "IDX_BOOKING_C7", columnList = "GROSS_VOLUME_UNIT_OF_MEASURE_ID")
})
public class Booking implements org.sklsft.commons.model.interfaces.Entity<Long> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public Booking(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "bookingIdGenerator", sequenceName = "BOOKING_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookingIdGenerator")
private Long id;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "AIR_WAYBILL_ID", nullable = false)
private AirWaybill airWaybill;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "ORIGIN_ID")
private Station origin;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "DESTINATION_ID")
private Station destination;

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

@OneToMany(fetch = FetchType.LAZY, mappedBy = "booking")
private Set <DatedFlightBooking> datedFlightBookingCollection;


/*
 * getters and setters
 */
public Long getId() {
return this.id;
}

public void setId(Long id) {
this.id = id;
}

public AirWaybill getAirWaybill() {
return this.airWaybill;
}

public void setAirWaybill(AirWaybill airWaybill) {
this.airWaybill = airWaybill;
}

public Station getOrigin() {
return this.origin;
}

public void setOrigin(Station origin) {
this.origin = origin;
}

public Station getDestination() {
return this.destination;
}

public void setDestination(Station destination) {
this.destination = destination;
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

public Set <DatedFlightBooking> getDatedFlightBookingCollection () {
return this.datedFlightBookingCollection;
}

public void setDatedFlightBookingCollection(Set <DatedFlightBooking> datedFlightBookingCollection) {
this.datedFlightBookingCollection = datedFlightBookingCollection;
}


/* Specific Code Start */
/* Specific Code End */
}