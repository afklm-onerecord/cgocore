package com.afklm.cargo.cgocore.api.model.core;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UldOnFlightCoreForm {

	private String datedFlightCompanyIataCode;
	private String datedFlightFlightNumber;
	private LocalDate datedFlightDepartureDate;
	private String uldTypeCode;
	private String uldCode;
	private String uldOwnerCode;
	private BigDecimal grossWeight;
	private String grossWeightUnitOfMeasureCode;
	
	private List<FractionOnUldCoreForm> fractions = new ArrayList<>();
	
	
	/*
	 * getters and setters
	 */
	public String getDatedFlightCompanyIataCode() {
		return datedFlightCompanyIataCode;
	}
	public void setDatedFlightCompanyIataCode(String datedFlightCompanyIataCode) {
		this.datedFlightCompanyIataCode = datedFlightCompanyIataCode;
	}
	public String getDatedFlightFlightNumber() {
		return datedFlightFlightNumber;
	}
	public void setDatedFlightFlightNumber(String datedFlightFlightNumber) {
		this.datedFlightFlightNumber = datedFlightFlightNumber;
	}
	public LocalDate getDatedFlightDepartureDate() {
		return datedFlightDepartureDate;
	}
	public void setDatedFlightDepartureDate(LocalDate datedFlightDepartureDate) {
		this.datedFlightDepartureDate = datedFlightDepartureDate;
	}
	public String getUldTypeCode() {
		return uldTypeCode;
	}
	public void setUldTypeCode(String uldTypeCode) {
		this.uldTypeCode = uldTypeCode;
	}
	public String getUldCode() {
		return uldCode;
	}
	public void setUldCode(String uldCode) {
		this.uldCode = uldCode;
	}
	public String getUldOwnerCode() {
		return uldOwnerCode;
	}
	public void setUldOwnerCode(String uldOwnerCode) {
		this.uldOwnerCode = uldOwnerCode;
	}
	public BigDecimal getGrossWeight() {
		return grossWeight;
	}
	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}
	public String getGrossWeightUnitOfMeasureCode() {
		return grossWeightUnitOfMeasureCode;
	}
	public void setGrossWeightUnitOfMeasureCode(String grossWeightUnitOfMeasureCode) {
		this.grossWeightUnitOfMeasureCode = grossWeightUnitOfMeasureCode;
	}
	public List<FractionOnUldCoreForm> getFractions() {
		return fractions;
	}
	public void setFractions(List<FractionOnUldCoreForm> fractions) {
		this.fractions = fractions;
	}
}
