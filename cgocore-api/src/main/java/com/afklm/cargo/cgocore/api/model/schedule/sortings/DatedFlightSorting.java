package com.afklm.cargo.cgocore.api.model.schedule.sortings;

import java.io.Serializable;

import org.sklsft.commons.api.model.OrderType;

/**
 * auto generated ordering class file
 * <br/>basic representation of filter used along with jsf datatable
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class DatedFlightSorting implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private OrderType companyIataCodeOrderType;
private OrderType flightNumberOrderType;
private OrderType departureDateOrderType;
private OrderType originIataCodeOrderType;
private OrderType departureTimeOrderType;
private OrderType destinationIataCodeOrderType;
private OrderType arrivalDateOrderType;
private OrderType arrivalTimeOrderType;

/*
 * getters and setters
 */
public OrderType getCompanyIataCodeOrderType() {
return this.companyIataCodeOrderType;
}

public void setCompanyIataCodeOrderType(OrderType companyIataCodeOrderType) {
this.companyIataCodeOrderType = companyIataCodeOrderType;
}

public OrderType getFlightNumberOrderType() {
return this.flightNumberOrderType;
}

public void setFlightNumberOrderType(OrderType flightNumberOrderType) {
this.flightNumberOrderType = flightNumberOrderType;
}

public OrderType getDepartureDateOrderType() {
return this.departureDateOrderType;
}

public void setDepartureDateOrderType(OrderType departureDateOrderType) {
this.departureDateOrderType = departureDateOrderType;
}

public OrderType getOriginIataCodeOrderType() {
return this.originIataCodeOrderType;
}

public void setOriginIataCodeOrderType(OrderType originIataCodeOrderType) {
this.originIataCodeOrderType = originIataCodeOrderType;
}

public OrderType getDepartureTimeOrderType() {
return this.departureTimeOrderType;
}

public void setDepartureTimeOrderType(OrderType departureTimeOrderType) {
this.departureTimeOrderType = departureTimeOrderType;
}

public OrderType getDestinationIataCodeOrderType() {
return this.destinationIataCodeOrderType;
}

public void setDestinationIataCodeOrderType(OrderType destinationIataCodeOrderType) {
this.destinationIataCodeOrderType = destinationIataCodeOrderType;
}

public OrderType getArrivalDateOrderType() {
return this.arrivalDateOrderType;
}

public void setArrivalDateOrderType(OrderType arrivalDateOrderType) {
this.arrivalDateOrderType = arrivalDateOrderType;
}

public OrderType getArrivalTimeOrderType() {
return this.arrivalTimeOrderType;
}

public void setArrivalTimeOrderType(OrderType arrivalTimeOrderType) {
this.arrivalTimeOrderType = arrivalTimeOrderType;
}


/* Specific Code Start */
/* Specific Code End */
}
