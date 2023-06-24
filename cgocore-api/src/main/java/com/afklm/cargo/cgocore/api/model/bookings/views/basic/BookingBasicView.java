package com.afklm.cargo.cgocore.api.model.bookings.views.basic;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * auto generated view bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class BookingBasicView implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private Long id;
private boolean selected;
private boolean canDelete;
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
