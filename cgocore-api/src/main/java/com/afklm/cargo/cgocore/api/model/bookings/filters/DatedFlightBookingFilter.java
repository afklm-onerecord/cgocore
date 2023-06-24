package com.afklm.cargo.cgocore.api.model.bookings.filters;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * auto generated filter class file
 * <br/>basic representation of filter used along with jsf datatable
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBookingFilter implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private String datedFlightCompanyIataCode;
private String datedFlightFlightNumber;
private LocalDate datedFlightDepartureDateMinValue;
private LocalDate datedFlightDepartureDateMaxValue;
private String bookingAirWaybillAirWaybillNumber;
private Integer numberOfPiecesMinValue;
private Integer numberOfPiecesMaxValue;
private BigDecimal grossWeightMinValue;
private BigDecimal grossWeightMaxValue;
private String grossWeightUnitOfMeasureCode;
private BigDecimal grossVolumeMinValue;
private BigDecimal grossVolumeMaxValue;
private String grossVolumeUnitOfMeasureCode;

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
public String getBookingAirWaybillAirWaybillNumber() {
return this.bookingAirWaybillAirWaybillNumber;
}
public void setBookingAirWaybillAirWaybillNumber(String bookingAirWaybillAirWaybillNumber) {
this.bookingAirWaybillAirWaybillNumber = bookingAirWaybillAirWaybillNumber;
}
public Integer getNumberOfPiecesMinValue() {
return this.numberOfPiecesMinValue;
}
public void setNumberOfPiecesMinValue(Integer numberOfPiecesMinValue) {
this.numberOfPiecesMinValue = numberOfPiecesMinValue;
}
public Integer getNumberOfPiecesMaxValue() {
return this.numberOfPiecesMaxValue;
}
public void setNumberOfPiecesMaxValue(Integer numberOfPiecesMaxValue) {
this.numberOfPiecesMaxValue = numberOfPiecesMaxValue;
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
public BigDecimal getGrossVolumeMinValue() {
return this.grossVolumeMinValue;
}
public void setGrossVolumeMinValue(BigDecimal grossVolumeMinValue) {
this.grossVolumeMinValue = grossVolumeMinValue;
}
public BigDecimal getGrossVolumeMaxValue() {
return this.grossVolumeMaxValue;
}
public void setGrossVolumeMaxValue(BigDecimal grossVolumeMaxValue) {
this.grossVolumeMaxValue = grossVolumeMaxValue;
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
