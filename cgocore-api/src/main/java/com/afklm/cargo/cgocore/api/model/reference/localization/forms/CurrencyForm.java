package com.afklm.cargo.cgocore.api.model.reference.localization.forms;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * auto generated form bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class CurrencyForm implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
@NotNull
private String isoCode;
@NotNull
private String label;

/*
 * getters and setters
 */
public String getIsoCode() {
return this.isoCode;
}
public void setIsoCode(String isoCode) {
this.isoCode = isoCode;
}
public String getLabel() {
return this.label;
}
public void setLabel(String label) {
this.label = label;
}

/* Specific Code Start */
/* Specific Code End */
}
