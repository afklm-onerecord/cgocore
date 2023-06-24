package com.afklm.cargo.cgocore.api.model.bookings.views.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * auto generated view bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBookingBasicView implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private Integer id;
private boolean selected;
private boolean canDelete;
private String datedFlightCompanyIataCode;
private String datedFlightFlightNumber;
private LocalDate datedFlightDepartureDate;
private String bookingAirWaybillAirWaybillNumber;
private Integer numberOfPieces;
private BigDecimal grossWeight;
private String grossWeightUnitOfMeasureCode;
private BigDecimal grossVolume;
private String grossVolumeUnitOfMeasureCode;

/*
 * getters and setters
 */
public Integer getId() {
return this.id;
}

public void setId(Integer id) {
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
