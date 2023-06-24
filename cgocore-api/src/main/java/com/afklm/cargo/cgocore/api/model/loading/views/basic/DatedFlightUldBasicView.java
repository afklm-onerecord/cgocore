package com.afklm.cargo.cgocore.api.model.loading.views.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * auto generated view bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class DatedFlightUldBasicView implements Serializable {

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
private String uldTypeCode;
private String uldCode;
private String uldOwnerCode;
private BigDecimal grossWeight;
private String grossWeightUnitOfMeasureCode;

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

public String getUldTypeCode() {
return this.uldTypeCode;
}

public void setUldTypeCode(String uldTypeCode) {
this.uldTypeCode = uldTypeCode;
}

public String getUldCode() {
return this.uldCode;
}

public void setUldCode(String uldCode) {
this.uldCode = uldCode;
}

public String getUldOwnerCode() {
return this.uldOwnerCode;
}

public void setUldOwnerCode(String uldOwnerCode) {
this.uldOwnerCode = uldOwnerCode;
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


/* Specific Code Start */
/* Specific Code End */
}
