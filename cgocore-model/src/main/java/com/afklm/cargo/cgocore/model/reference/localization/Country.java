package com.afklm.cargo.cgocore.model.reference.localization;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * auto generated entity class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@Entity
@Table(name="COUNTRY"
, uniqueConstraints = {
@UniqueConstraint(name = "UC_COUNTRY", columnNames = {"IATA_CODE"})
}
, indexes = {
@Index(name = "IDX_COUNTRY_UC", columnList = "IATA_CODE")
})
public class Country implements org.sklsft.commons.model.interfaces.Entity<Integer> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public Country(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "countryIdGenerator", sequenceName = "COUNTRY_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "countryIdGenerator")
private Integer id;

@Column(name = "IATA_CODE", nullable = false)
private String iataCode;

@Column(name = "LABEL", nullable = false)
private String label;

@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
private Set <Station> stationCollection;


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

public Set <Station> getStationCollection () {
return this.stationCollection;
}

public void setStationCollection(Set <Station> stationCollection) {
this.stationCollection = stationCollection;
}


/* Specific Code Start */
/* Specific Code End */
}