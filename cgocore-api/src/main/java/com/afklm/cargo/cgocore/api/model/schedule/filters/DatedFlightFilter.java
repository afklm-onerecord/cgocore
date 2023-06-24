package com.afklm.cargo.cgocore.api.model.schedule.filters;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * auto generated filter class file
 * <br/>basic representation of filter used along with jsf datatable
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class DatedFlightFilter implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private String companyIataCode;
private String flightNumber;
private LocalDate departureDateMinValue;
private LocalDate departureDateMaxValue;
private String originIataCode;
private String departureTime;
private String destinationIataCode;
private LocalDate arrivalDateMinValue;
private LocalDate arrivalDateMaxValue;
private String arrivalTime;

/*
 * getters and setters
 */
public String getCompanyIataCode() {
return this.companyIataCode;
}
public void setCompanyIataCode(String companyIataCode) {
this.companyIataCode = companyIataCode;
}
public String getFlightNumber() {
return this.flightNumber;
}
public void setFlightNumber(String flightNumber) {
this.flightNumber = flightNumber;
}
public LocalDate getDepartureDateMinValue() {
return this.departureDateMinValue;
}
public void setDepartureDateMinValue(LocalDate departureDateMinValue) {
this.departureDateMinValue = departureDateMinValue;
}
public LocalDate getDepartureDateMaxValue() {
return this.departureDateMaxValue;
}
public void setDepartureDateMaxValue(LocalDate departureDateMaxValue) {
this.departureDateMaxValue = departureDateMaxValue;
}
public String getOriginIataCode() {
return this.originIataCode;
}
public void setOriginIataCode(String originIataCode) {
this.originIataCode = originIataCode;
}
public String getDepartureTime() {
return this.departureTime;
}
public void setDepartureTime(String departureTime) {
this.departureTime = departureTime;
}
public String getDestinationIataCode() {
return this.destinationIataCode;
}
public void setDestinationIataCode(String destinationIataCode) {
this.destinationIataCode = destinationIataCode;
}
public LocalDate getArrivalDateMinValue() {
return this.arrivalDateMinValue;
}
public void setArrivalDateMinValue(LocalDate arrivalDateMinValue) {
this.arrivalDateMinValue = arrivalDateMinValue;
}
public LocalDate getArrivalDateMaxValue() {
return this.arrivalDateMaxValue;
}
public void setArrivalDateMaxValue(LocalDate arrivalDateMaxValue) {
this.arrivalDateMaxValue = arrivalDateMaxValue;
}
public String getArrivalTime() {
return this.arrivalTime;
}
public void setArrivalTime(String arrivalTime) {
this.arrivalTime = arrivalTime;
}

/* Specific Code Start */
/* Specific Code End */
}
