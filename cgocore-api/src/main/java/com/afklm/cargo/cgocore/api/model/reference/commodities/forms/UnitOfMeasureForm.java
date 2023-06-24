package com.afklm.cargo.cgocore.api.model.reference.commodities.forms;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * auto generated form bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class UnitOfMeasureForm implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
@NotNull
private String code;
private String label;
@NotNull
private String metricCode;

/*
 * getters and setters
 */
public String getCode() {
return this.code;
}
public void setCode(String code) {
this.code = code;
}
public String getLabel() {
return this.label;
}
public void setLabel(String label) {
this.label = label;
}
public String getMetricCode() {
return this.metricCode;
}
public void setMetricCode(String metricCode) {
this.metricCode = metricCode;
}

/* Specific Code Start */
/* Specific Code End */
}
