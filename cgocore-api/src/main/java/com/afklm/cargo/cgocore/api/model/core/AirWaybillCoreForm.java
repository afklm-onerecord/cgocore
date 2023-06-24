package com.afklm.cargo.cgocore.api.model.core;

import java.math.BigDecimal;

public class AirWaybillCoreForm {
	
	private String airWaybillNumber;
	private String forwarderName;
	private String originIataCode;
	private String destinationIataCode;
	private String goddsDescription;
	private String hsCode;
	private Integer numberOfPieces;
	private BigDecimal grossWeight;
	private BigDecimal chargeableWeight;
	private String grossWeightUnitOfMeasureCode;
	private BigDecimal grossVolume;
	private String grossVolumeUnitOfMeasureCode;
	
	
	/*
	 * getters and setters
	 */
	public String getAirWaybillNumber() {
		return airWaybillNumber;
	}
	public void setAirWaybillNumber(String airWaybillNumber) {
		this.airWaybillNumber = airWaybillNumber;
	}
	public String getForwarderName() {
		return forwarderName;
	}
	public void setForwarderName(String forwarderName) {
		this.forwarderName = forwarderName;
	}
	public String getOriginIataCode() {
		return originIataCode;
	}
	public void setOriginIataCode(String originIataCode) {
		this.originIataCode = originIataCode;
	}
	public String getDestinationIataCode() {
		return destinationIataCode;
	}
	public void setDestinationIataCode(String destinationIataCode) {
		this.destinationIataCode = destinationIataCode;
	}
	public String getGoddsDescription() {
		return goddsDescription;
	}
	public void setGoddsDescription(String goddsDescription) {
		this.goddsDescription = goddsDescription;
	}
	public String getHsCode() {
		return hsCode;
	}
	public void setHsCode(String hsCode) {
		this.hsCode = hsCode;
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
	public BigDecimal getChargeableWeight() {
		return chargeableWeight;
	}
	public void setChargeableWeight(BigDecimal chargeableWeight) {
		this.chargeableWeight = chargeableWeight;
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
