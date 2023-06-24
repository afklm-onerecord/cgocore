package com.afklm.cargo.cgocore.model.reference.commodities;

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
@Table(name="SPECIAL_HANDLING_CODE"
, uniqueConstraints = {
@UniqueConstraint(name = "UC_SPECIAL_HANDLING_CODE", columnNames = {"CODE"})
}
, indexes = {
@Index(name = "IDX_SPECIAL_HANDLING_CODE_UC", columnList = "CODE")
})
public class SpecialHandlingCode implements org.sklsft.commons.model.interfaces.Entity<Integer> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public SpecialHandlingCode(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "specialHandlingCodeIdGenerator", sequenceName = "SPECIAL_HANDLING_CODE_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "specialHandlingCodeIdGenerator")
private Integer id;

@Column(name = "CODE", nullable = false)
private String code;

@Column(name = "LABEL")
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


/* Specific Code Start */
/* Specific Code End */
}