package com.afklm.cargo.cgocore.api.model.bookings.forms;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

/**
 * auto generated form bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class BookingForm implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
@NotNull
private String airWaybillAirWaybillNumber;
private String originIataCode;
private String destinationIataCode;
private Integer numberOfPieces;
private BigDecimal grossWeight;
private String grossWeightUnitOfMeasureCode;
private BigDecimal grossVolume;
private String grossVolumeUnitOfMeasureCode;

/*
 * getters and setters
 */
public String getAirWaybillAirWaybillNumber() {
return this.airWaybillAirWaybillNumber;
}
public void setAirWaybillAirWaybillNumber(String airWaybillAirWaybillNumber) {
this.airWaybillAirWaybillNumber = airWaybillAirWaybillNumber;
}
public String getOriginIataCode() {
return this.originIataCode;
}
public void setOriginIataCode(String originIataCode) {
this.originIataCode = originIataCode;
}
public String getDestinationIataCode() {
return this.destinationIataCode;
}
public void setDestinationIataCode(String destinationIataCode) {
this.destinationIataCode = destinationIataCode;
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
