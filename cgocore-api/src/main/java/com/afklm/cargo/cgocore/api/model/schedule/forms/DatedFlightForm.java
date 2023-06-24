package com.afklm.cargo.cgocore.api.model.schedule.forms;

import java.io.Serializable;
import java.time.LocalDate;

import javax.validation.constraints.NotNull;

/**
 * auto generated form bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class DatedFlightForm implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
@NotNull
private String companyIataCode;
@NotNull
private String flightNumber;
@NotNull
private LocalDate departureDate;
private String originIataCode;
private String departureTime;
private String destinationIataCode;
private LocalDate arrivalDate;
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
public LocalDate getDepartureDate() {
return this.departureDate;
}
public void setDepartureDate(LocalDate departureDate) {
this.departureDate = departureDate;
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
public LocalDate getArrivalDate() {
return this.arrivalDate;
}
public void setArrivalDate(LocalDate arrivalDate) {
this.arrivalDate = arrivalDate;
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
