package com.afklm.cargo.cgocore.api.model.reference.localization.forms;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * auto generated form bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class StationForm implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
@NotNull
private String iataCode;
@NotNull
private String label;
private String countryIataCode;

/*
 * getters and setters
 */
public String getIataCode() {
return this.iataCode;
}
public void setIataCode(String iataCode) {
this.iataCode = iataCode;
}
public String getLabel() {
return this.label;
}
public void setLabel(String label) {
this.label = label;
}
public String getCountryIataCode() {
return this.countryIataCode;
}
public void setCountryIataCode(String countryIataCode) {
this.countryIataCode = countryIataCode;
}

/* Specific Code Start */
/* Specific Code End */
}
