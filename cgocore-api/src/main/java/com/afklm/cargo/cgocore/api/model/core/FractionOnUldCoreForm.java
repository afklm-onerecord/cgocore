package com.afklm.cargo.cgocore.api.model.core;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FractionOnUldCoreForm {

	private String datedFlightUldDatedFlightCompanyIataCode;
	private String datedFlightUldDatedFlightFlightNumber;
	private LocalDate datedFlightUldDatedFlightDepartureDate;
	private String datedFlightUldUldTypeCode;
	private String datedFlightUldUldCode;
	private String datedFlightUldUldOwnerCode;
	private String airWaybillAirWaybillNumber;
	private Integer numberOfPieces;
	private BigDecimal grossWeight;
	private String grossWeightUnitOfMeasureCode;
	private BigDecimal grossVolume;
	private String grossVolumeUnitOfMeasureCode;
		
	
	/*
	 * getters and setters
	 */
	public String getDatedFlightUldDatedFlightCompanyIataCode() {
		return datedFlightUldDatedFlightCompanyIataCode;
	}
	public void setDatedFlightUldDatedFlightCompanyIataCode(String datedFlightUldDatedFlightCompanyIataCode) {
		this.datedFlightUldDatedFlightCompanyIataCode = datedFlightUldDatedFlightCompanyIataCode;
	}
	public String getDatedFlightUldDatedFlightFlightNumber() {
		return datedFlightUldDatedFlightFlightNumber;
	}
	public void setDatedFlightUldDatedFlightFlightNumber(String datedFlightUldDatedFlightFlightNumber) {
		this.datedFlightUldDatedFlightFlightNumber = datedFlightUldDatedFlightFlightNumber;
	}
	public LocalDate getDatedFlightUldDatedFlightDepartureDate() {
		return datedFlightUldDatedFlightDepartureDate;
	}
	public void setDatedFlightUldDatedFlightDepartureDate(LocalDate datedFlightUldDatedFlightDepartureDate) {
		this.datedFlightUldDatedFlightDepartureDate = datedFlightUldDatedFlightDepartureDate;
	}
	public String getDatedFlightUldUldTypeCode() {
		return datedFlightUldUldTypeCode;
	}
	public void setDatedFlightUldUldTypeCode(String datedFlightUldUldTypeCode) {
		this.datedFlightUldUldTypeCode = datedFlightUldUldTypeCode;
	}
	public String getDatedFlightUldUldCode() {
		return datedFlightUldUldCode;
	}
	public void setDatedFlightUldUldCode(String datedFlightUldUldCode) {
		this.datedFlightUldUldCode = datedFlightUldUldCode;
	}
	public String getDatedFlightUldUldOwnerCode() {
		return datedFlightUldUldOwnerCode;
	}
	public void setDatedFlightUldUldOwnerCode(String datedFlightUldUldOwnerCode) {
		this.datedFlightUldUldOwnerCode = datedFlightUldUldOwnerCode;
	}
	public String getAirWaybillAirWaybillNumber() {
		return airWaybillAirWaybillNumber;
	}
	public void setAirWaybillAirWaybillNumber(String airWaybillAirWaybillNumber) {
		this.airWaybillAirWaybillNumber = airWaybillAirWaybillNumber;
	}
	public Integer getNumberOfPieces() {
		return numberOfPieces;
	}
	public void setNumberOfPieces(Integer numberOfPieces) {
		this.numberOfPieces = numberOfPieces;
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
	public BigDecimal getGrossVolume() {
		return grossVolume;
	}
	public void setGrossVolume(BigDecimal grossVolume) {
		this.grossVolume = grossVolume;
	}
	public String getGrossVolumeUnitOfMeasureCode() {
		return grossVolumeUnitOfMeasureCode;
	}
	public void setGrossVolumeUnitOfMeasureCode(String grossVolumeUnitOfMeasureCode) {
		this.grossVolumeUnitOfMeasureCode = grossVolumeUnitOfMeasureCode;
	}
}
