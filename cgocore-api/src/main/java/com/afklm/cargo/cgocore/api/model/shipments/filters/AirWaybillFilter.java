package com.afklm.cargo.cgocore.api.model.shipments.filters;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * auto generated filter class file
 * <br/>basic representation of filter used along with jsf datatable
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class AirWaybillFilter implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private String airWaybillNumber;
private String forwarderName;
private String originIataCode;
private String destinationIataCode;
private String goddsDescription;
private String hsCode;
private Integer numberOfPiecesMinValue;
private Integer numberOfPiecesMaxValue;
private BigDecimal grossWeightMinValue;
private BigDecimal grossWeightMaxValue;
private BigDecimal chargeableWeightMinValue;
private BigDecimal chargeableWeightMaxValue;
private String grossWeightUnitOfMeasureCode;
private BigDecimal grossVolumeMinValue;
private BigDecimal grossVolumeMaxValue;
private String grossVolumeUnitOfMeasureCode;

/*
 * getters and setters
 */
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
public BigDecimal getChargeableWeightMinValue() {
return this.chargeableWeightMinValue;
}
public void setChargeableWeightMinValue(BigDecimal chargeableWeightMinValue) {
this.chargeableWeightMinValue = chargeableWeightMinValue;
}
public BigDecimal getChargeableWeightMaxValue() {
return this.chargeableWeightMaxValue;
}
public void setChargeableWeightMaxValue(BigDecimal chargeableWeightMaxValue) {
this.chargeableWeightMaxValue = chargeableWeightMaxValue;
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
