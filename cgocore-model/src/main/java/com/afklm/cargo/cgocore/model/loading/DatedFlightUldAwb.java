package com.afklm.cargo.cgocore.model.loading;

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
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;

/**
 * auto generated entity class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@Entity
@Table(name="DATED_FLIGHT_ULD_AWB"
, uniqueConstraints = {
@UniqueConstraint(name = "UC_DATED_FLIGHT_ULD_AWB", columnNames = {"DATED_FLIGHT_ULD_ID", "AIR_WAYBILL_ID", "NUMBER_OF_PIECES", "GROSS_WEIGHT"})
}
, indexes = {
@Index(name = "IDX_DATED_FLIGHT_ULD_AWB_UC", columnList = "DATED_FLIGHT_ULD_ID, AIR_WAYBILL_ID, NUMBER_OF_PIECES, GROSS_WEIGHT")
, @Index(name = "IDX_DATED_FLIGHT_ULD_AWB_C0", columnList = "DATED_FLIGHT_ULD_ID")
, @Index(name = "IDX_DATED_FLIGHT_ULD_AWB_C1", columnList = "AIR_WAYBILL_ID")
, @Index(name = "IDX_DATED_FLIGHT_ULD_AWB_C4", columnList = "GROSS_WEIGHT_UNIT_OF_MEASURE_ID")
, @Index(name = "IDX_DATED_FLIGHT_ULD_AWB_C6", columnList = "GROSS_VOLUME_UNIT_OF_MEASURE_ID")
})
public class DatedFlightUldAwb implements org.sklsft.commons.model.interfaces.Entity<Integer> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public DatedFlightUldAwb(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "datedFlightUldAwbIdGenerator", sequenceName = "DATED_FLIGHT_ULD_AWB_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "datedFlightUldAwbIdGenerator")
private Integer id;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "DATED_FLIGHT_ULD_ID", nullable = false)
private DatedFlightUld datedFlightUld;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "AIR_WAYBILL_ID", nullable = false)
private AirWaybill airWaybill;

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

public DatedFlightUld getDatedFlightUld() {
return this.datedFlightUld;
}

public void setDatedFlightUld(DatedFlightUld datedFlightUld) {
this.datedFlightUld = datedFlightUld;
}

public AirWaybill getAirWaybill() {
return this.airWaybill;
}

public void setAirWaybill(AirWaybill airWaybill) {
this.airWaybill = airWaybill;
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