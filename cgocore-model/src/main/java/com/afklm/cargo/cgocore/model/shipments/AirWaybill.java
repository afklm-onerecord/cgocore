package com.afklm.cargo.cgocore.model.shipments;

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
import com.afklm.cargo.cgocore.model.reference.localization.Station;

/**
 * auto generated entity class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@Entity
@Table(name="AIR_WAYBILL"
, uniqueConstraints = {
@UniqueConstraint(name = "UC_AIR_WAYBILL", columnNames = {"AIR_WAYBILL_NUMBER"})
}
, indexes = {
@Index(name = "IDX_AIR_WAYBILL_UC", columnList = "AIR_WAYBILL_NUMBER")
, @Index(name = "IDX_AIR_WAYBILL_C2", columnList = "ORIGIN_ID")
, @Index(name = "IDX_AIR_WAYBILL_C3", columnList = "DESTINATION_ID")
, @Index(name = "IDX_AIR_WAYBILL_C9", columnList = "GROSS_WEIGHT_UNIT_OF_MEASURE_ID")
, @Index(name = "IDX_AIR_WAYBILL_C11", columnList = "GROSS_VOLUME_UNIT_OF_MEASURE_ID")
})
public class AirWaybill implements org.sklsft.commons.model.interfaces.Entity<Long> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public AirWaybill(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "airWaybillIdGenerator", sequenceName = "AIR_WAYBILL_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "airWaybillIdGenerator")
private Long id;

@Column(name = "AIR_WAYBILL_NUMBER", nullable = false)
private String airWaybillNumber;

@Column(name = "FORWARDER_NAME")
private String forwarderName;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "ORIGIN_ID")
private Station origin;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "DESTINATION_ID")
private Station destination;

@Column(name = "GODDS_DESCRIPTION")
private String goddsDescription;

@Column(name = "HS_CODE")
private String hsCode;

@Column(name = "NUMBER_OF_PIECES")
private Integer numberOfPieces;

@Column(name = "GROSS_WEIGHT")
private BigDecimal grossWeight;

@Column(name = "CHARGEABLE_WEIGHT")
private BigDecimal chargeableWeight;

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
public Long getId() {
return this.id;
}

public void setId(Long id) {
this.id = id;
}

public String getAirWaybillNumber() {
return this.airWaybillNumber;
}

public void setAirWaybillNumber(String airWaybillNumber) {
this.airWaybillNumber = airWaybillNumber;
}

public String getForwarderName() {
return this.forwarderName;
}

public void setForwarderName(String forwarderName) {
this.forwarderName = forwarderName;
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

public String getGoddsDescription() {
return this.goddsDescription;
}

public void setGoddsDescription(String goddsDescription) {
this.goddsDescription = goddsDescription;
}

public String getHsCode() {
return this.hsCode;
}

public void setHsCode(String hsCode) {
this.hsCode = hsCode;
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

public BigDecimal getChargeableWeight() {
return this.chargeableWeight;
}

public void setChargeableWeight(BigDecimal chargeableWeight) {
this.chargeableWeight = chargeableWeight;
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