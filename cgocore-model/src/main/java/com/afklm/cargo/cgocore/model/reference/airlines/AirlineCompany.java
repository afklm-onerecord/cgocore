package com.afklm.cargo.cgocore.model.reference.airlines;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * auto generated entity class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@Entity
@Table(name="AIRLINE_COMPANY"
, uniqueConstraints = {
@UniqueConstraint(name = "UC_AIRLINE_COMPANY", columnNames = {"IATA_CODE"})
}
, indexes = {
@Index(name = "IDX_AIRLINE_COMPANY_UC", columnList = "IATA_CODE")
})
public class AirlineCompany implements org.sklsft.commons.model.interfaces.Entity<Integer> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public AirlineCompany(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "airlineCompanyIdGenerator", sequenceName = "AIRLINE_COMPANY_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "airlineCompanyIdGenerator")
private Integer id;

@Column(name = "IATA_CODE", nullable = false)
private String iataCode;

@Column(name = "LABEL")
private String label;

@Column(name = "PREFIX")
private String prefix;


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

public String getPrefix() {
return this.prefix;
}

public void setPrefix(String prefix) {
this.prefix = prefix;
}


/* Specific Code Start */
/* Specific Code End */
}