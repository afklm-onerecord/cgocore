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
public class DatedFlightUldForm implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
@NotNull
private String datedFlightCompanyIataCode;
@NotNull
private String datedFlightFlightNumber;
@NotNull
private LocalDate datedFlightDepartureDate;
@NotNull
private String uldTypeCode;
@NotNull
private String uldCode;
@NotNull
private String uldOwnerCode;
private BigDecimal grossWeight;
private String grossWeightUnitOfMeasureCode;

/*
 * getters and setters
 */
public String getDatedFlightCompanyIataCode() {
return this.datedFlightCompanyIataCode;
}
public void setDatedFlightCompanyIataCode(String datedFlightCompanyIataCode) {
this.datedFlightCompanyIataCode = datedFlightCompanyIataCode;
}
public String getDatedFlightFlightNumber() {
return this.datedFlightFlightNumber;
}
public void setDatedFlightFlightNumber(String datedFlightFlightNumber) {
this.datedFlightFlightNumber = datedFlightFlightNumber;
}
public LocalDate getDatedFlightDepartureDate() {
return this.datedFlightDepartureDate;
}
public void setDatedFlightDepartureDate(LocalDate datedFlightDepartureDate) {
this.datedFlightDepartureDate = datedFlightDepartureDate;
}
public String getUldTypeCode() {
return this.uldTypeCode;
}
public void setUldTypeCode(String uldTypeCode) {
this.uldTypeCode = uldTypeCode;
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
public String getGrossWeightUnitOfMeasureCode() {
return this.grossWeightUnitOfMeasureCode;
}
public void setGrossWeightUnitOfMeasureCode(String grossWeightUnitOfMeasureCode) {
this.grossWeightUnitOfMeasureCode = grossWeightUnitOfMeasureCode;
}

/* Specific Code Start */
/* Specific Code End */
}
