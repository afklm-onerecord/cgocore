package com.afklm.cargo.cgocore.api.model.bookings.forms;

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
public class DatedFlightBookingForm implements Serializable {

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
private String bookingAirWaybillAirWaybillNumber;
private Integer numberOfPieces;
private BigDecimal grossWeight;
private String grossWeightUnitOfMeasureCode;
private BigDecimal grossVolume;
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
public LocalDate getDatedFlightDepartureDate() {
return this.datedFlightDepartureDate;
}
public void setDatedFlightDepartureDate(LocalDate datedFlightDepartureDate) {
this.datedFlightDepartureDate = datedFlightDepartureDate;
}
public String getBookingAirWaybillAirWaybillNumber() {
return this.bookingAirWaybillAirWaybillNumber;
}
public void setBookingAirWaybillAirWaybillNumber(String bookingAirWaybillAirWaybillNumber) {
this.bookingAirWaybillAirWaybillNumber = bookingAirWaybillAirWaybillNumber;
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
