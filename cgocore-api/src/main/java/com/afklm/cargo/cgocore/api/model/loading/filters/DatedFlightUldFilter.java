package com.afklm.cargo.cgocore.api.model.loading.filters;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * auto generated filter class file
 * <br/>basic representation of filter used along with jsf datatable
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldFilter implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private String datedFlightCompanyIataCode;
private String datedFlightFlightNumber;
private LocalDate datedFlightDepartureDateMinValue;
private LocalDate datedFlightDepartureDateMaxValue;
private String uldTypeCode;
private String uldCode;
private String uldOwnerCode;
private BigDecimal grossWeightMinValue;
private BigDecimal grossWeightMaxValue;
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
public LocalDate getDatedFlightDepartureDateMinValue() {
return this.datedFlightDepartureDateMinValue;
}
public void setDatedFlightDepartureDateMinValue(LocalDate datedFlightDepartureDateMinValue) {
this.datedFlightDepartureDateMinValue = datedFlightDepartureDateMinValue;
}
public LocalDate getDatedFlightDepartureDateMaxValue() {
return this.datedFlightDepartureDateMaxValue;
}
public void setDatedFlightDepartureDateMaxValue(LocalDate datedFlightDepartureDateMaxValue) {
this.datedFlightDepartureDateMaxValue = datedFlightDepartureDateMaxValue;
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
public BigDecimal getGrossWeightMinValue() {
return this.grossWeightMinValue;
}
public void setGrossWeightMinValue(BigDecimal grossWeightMinValue) {
this.grossWeightMinValue = grossWeightMinValue;
}
public BigDecimal getGrossWeightMaxValue() {
return this.grossWeightMaxValue;
}
public void setGrossWeightMaxValue(BigDecimal grossWeightMaxValue) {
this.grossWeightMaxValue = grossWeightMaxValue;
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
