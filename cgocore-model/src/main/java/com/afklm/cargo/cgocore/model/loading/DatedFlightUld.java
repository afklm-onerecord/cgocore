package com.afklm.cargo.cgocore.model.loading;

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
import com.afklm.cargo.cgocore.model.reference.containers.UldType;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight;

/**
 * auto generated entity class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@Entity
@Table(name="DATED_FLIGHT_ULD"
, uniqueConstraints = {
@UniqueConstraint(name = "UC_DATED_FLIGHT_ULD", columnNames = {"DATED_FLIGHT_ID", "ULD_TYPE_ID", "ULD_CODE", "ULD_OWNER_CODE"})
}
, indexes = {
@Index(name = "IDX_DATED_FLIGHT_ULD_UC", columnList = "DATED_FLIGHT_ID, ULD_TYPE_ID, ULD_CODE, ULD_OWNER_CODE")
, @Index(name = "IDX_DATED_FLIGHT_ULD_C0", columnList = "DATED_FLIGHT_ID")
, @Index(name = "IDX_DATED_FLIGHT_ULD_C1", columnList = "ULD_TYPE_ID")
, @Index(name = "IDX_DATED_FLIGHT_ULD_C5", columnList = "GROSS_WEIGHT_UNIT_OF_MEASURE_ID")
})
public class DatedFlightUld implements org.sklsft.commons.model.interfaces.Entity<Integer> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public DatedFlightUld(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "datedFlightUldIdGenerator", sequenceName = "DATED_FLIGHT_ULD_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "datedFlightUldIdGenerator")
private Integer id;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "DATED_FLIGHT_ID", nullable = false)
private DatedFlight datedFlight;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "ULD_TYPE_ID", nullable = false)
private UldType uldType;

@Column(name = "ULD_CODE", nullable = false)
private String uldCode;

@Column(name = "ULD_OWNER_CODE", nullable = false)
private String uldOwnerCode;

@Column(name = "GROSS_WEIGHT")
private BigDecimal grossWeight;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "GROSS_WEIGHT_UNIT_OF_MEASURE_ID")
private UnitOfMeasure grossWeightUnitOfMeasure;

@OneToMany(fetch = FetchType.LAZY, mappedBy = "datedFlightUld")
private Set <DatedFlightUldAwb> datedFlightUldAwbCollection;


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

public UldType getUldType() {
return this.uldType;
}

public void setUldType(UldType uldType) {
this.uldType = uldType;
}

public String getUldCode() {
return this.uldCode;
}

public void setUldCode(String uldCode) {
this.uldCode = uldCode;
}

public String getUldOwnerCode() {
return this.uldOwnerCode;
}

public void setUldOwnerCode(String uldOwnerCode) {
this.uldOwnerCode = uldOwnerCode;
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

public Set <DatedFlightUldAwb> getDatedFlightUldAwbCollection () {
return this.datedFlightUldAwbCollection;
}

public void setDatedFlightUldAwbCollection(Set <DatedFlightUldAwb> datedFlightUldAwbCollection) {
this.datedFlightUldAwbCollection = datedFlightUldAwbCollection;
}


/* Specific Code Start */
/* Specific Code End */
}