package com.afklm.cargo.cgocore.api.model.schedule.views.basic;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * auto generated view bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBasicView implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private Integer id;
private boolean selected;
private boolean canDelete;
private String companyIataCode;
private String flightNumber;
private LocalDate departureDate;
private String originIataCode;
private String departureTime;
private String destinationIataCode;
private LocalDate arrivalDate;
private String arrivalTime;

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
