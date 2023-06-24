package com.afklm.cargo.cgocore.api.model.loading.forms;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

/**
 * auto generated form bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldAwbForm implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
@NotNull
private String datedFlightUldDatedFlightCompanyIataCode;
@NotNull
private String datedFlightUldDatedFlightFlightNumber;
@NotNull
private LocalDate datedFlightUldDatedFlightDepartureDate;
@NotNull
private String datedFlightUldUldTypeCode;
@NotNull
private String datedFlightUldUldCode;
@NotNull
private String datedFlightUldUldOwnerCode;
@NotNull
private String airWaybillAirWaybillNumber;
private Integer numberOfPieces;
private BigDecimal grossWeight;
private String grossWeightUnitOfMeasureCode;
private BigDecimal grossVolume;
private String grossVolumeUnitOfMeasureCode;

/*
 * getters and setters
 */
public String getDatedFlightUldDatedFlightCompanyIataCode() {
return this.datedFlightUldDatedFlightCompanyIataCode;
}
public void setDatedFlightUldDatedFlightCompanyIataCode(String datedFlightUldDatedFlightCompanyIataCode) {
this.datedFlightUldDatedFlightCompanyIataCode = datedFlightUldDatedFlightCompanyIataCode;
}
public String getDatedFlightUldDatedFlightFlightNumber() {
return this.datedFlightUldDatedFlightFlightNumber;
}
public void setDatedFlightUldDatedFlightFlightNumber(String datedFlightUldDatedFlightFlightNumber) {
this.datedFlightUldDatedFlightFlightNumber = datedFlightUldDatedFlightFlightNumber;
}
public LocalDate getDatedFlightUldDatedFlightDepartureDate() {
return this.datedFlightUldDatedFlightDepartureDate;
}
public void setDatedFlightUldDatedFlightDepartureDate(LocalDate datedFlightUldDatedFlightDepartureDate) {
this.datedFlightUldDatedFlightDepartureDate = datedFlightUldDatedFlightDepartureDate;
}
public String getDatedFlightUldUldTypeCode() {
return this.datedFlightUldUldTypeCode;
}
public void setDatedFlightUldUldTypeCode(String datedFlightUldUldTypeCode) {
this.datedFlightUldUldTypeCode = datedFlightUldUldTypeCode;
}
public String getDatedFlightUldUldCode() {
return this.datedFlightUldUldCode;
}
public void setDatedFlightUldUldCode(String datedFlightUldUldCode) {
this.datedFlightUldUldCode = datedFlightUldUldCode;
}
public String getDatedFlightUldUldOwnerCode() {
return this.datedFlightUldUldOwnerCode;
}
public void setDatedFlightUldUldOwnerCode(String datedFlightUldUldOwnerCode) {
this.datedFlightUldUldOwnerCode = datedFlightUldUldOwnerCode;
}
public String getAirWaybillAirWaybillNumber() {
return this.airWaybillAirWaybillNumber;
}
public void setAirWaybillAirWaybillNumber(String airWaybillAirWaybillNumber) {
this.airWaybillAirWaybillNumber = airWaybillAirWaybillNumber;
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
public String getGrossWeightUnitOfMeasureCode() {
return this.grossWeightUnitOfMeasureCode;
}
public void setGrossWeightUnitOfMeasureCode(String grossWeightUnitOfMeasureCode) {
this.grossWeightUnitOfMeasureCode = grossWeightUnitOfMeasureCode;
}
public BigDecimal getGrossVolume() {
return this.grossVolume;
}
public void setGrossVolume(BigDecimal grossVolume) {
this.grossVolume = grossVolume;
}
public String getGrossVolumeUnitOfMeasureCode() {
return this.grossVolumeUnitOfMeasureCode;
}
public void setGrossVolumeUnitOfMeasureCode(String grossVolumeUnitOfMeasureCode) {
this.grossVolumeUnitOfMeasureCode = grossVolumeUnitOfMeasureCode;
}

/* Specific Code Start */
/* Specific Code End */
}
