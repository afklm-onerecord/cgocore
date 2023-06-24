package com.afklm.cargo.cgocore.api.model.shipments.views.basic;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * auto generated view bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class AirWaybillBasicView implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private Long id;
private boolean selected;
private boolean canDelete;
private String airWaybillNumber;
private String forwarderName;
private String originIataCode;
private String destinationIataCode;
private String goddsDescription;
private String hsCode;
private Integer numberOfPieces;
private BigDecimal grossWeight;
private BigDecimal chargeableWeight;
private String grossWeightUnitOfMeasureCode;
private BigDecimal grossVolume;
private String grossVolumeUnitOfMeasureCode;

/*
 * getters and setters
 */
public Long getId() {
return this.id;
}

public void setId(Long id) {
this.id = id;
}

public boolean getSelected() {
return this.selected;
}

public void setSelected(boolean selected) {
this.selected = selected;
}

public boolean getCanDelete() {
return this.canDelete;
}

public void setCanDelete(boolean canDelete) {
this.canDelete = canDelete;
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
