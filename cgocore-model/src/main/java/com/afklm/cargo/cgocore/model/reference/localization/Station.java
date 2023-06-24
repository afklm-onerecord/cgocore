package com.afklm.cargo.cgocore.model.reference.localization;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * auto generated entity class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@Entity
@Table(name="STATION"
, uniqueConstraints = {
@UniqueConstraint(name = "UC_STATION", columnNames = {"IATA_CODE"})
}
, indexes = {
@Index(name = "IDX_STATION_UC", columnList = "IATA_CODE")
, @Index(name = "IDX_STATION_C2", columnList = "COUNTRY_ID")
})
public class Station implements org.sklsft.commons.model.interfaces.Entity<Integer> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public Station(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "stationIdGenerator", sequenceName = "STATION_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stationIdGenerator")
private Integer id;

@Column(name = "IATA_CODE", nullable = false)
private String iataCode;

@Column(name = "LABEL", nullable = false)
private String label;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "COUNTRY_ID")
private Country country;


/*
 * getters and setters
 */
public Integer getId() {
return this.id;
}

public void setId(Integer id) {
this.id = id;
}

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

public Country getCountry() {
return this.country;
}

public void setCountry(Country country) {
this.country = country;
}


/* Specific Code Start */
/* Specific Code End */
}