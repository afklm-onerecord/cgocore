package com.afklm.cargo.cgocore.model.reference.localization;

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
@Table(name="CURRENCY"
, uniqueConstraints = {
@UniqueConstraint(name = "UC_CURRENCY", columnNames = {"ISO_CODE"})
}
, indexes = {
@Index(name = "IDX_CURRENCY_UC", columnList = "ISO_CODE")
})
public class Currency implements org.sklsft.commons.model.interfaces.Entity<Integer> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public Currency(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "currencyIdGenerator", sequenceName = "CURRENCY_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "currencyIdGenerator")
private Integer id;

@Column(name = "ISO_CODE", nullable = false)
private String isoCode;

@Column(name = "LABEL", nullable = false)
private String label;


/*
 * getters and setters
 */
public Integer getId() {
return this.id;
}

public void setId(Integer id) {
this.id = id;
}

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