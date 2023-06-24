package com.afklm.cargo.cgocore.model.reference.commodities;

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
@Table(name="UNIT_OF_MEASURE"
, uniqueConstraints = {
@UniqueConstraint(name = "UC_UNIT_OF_MEASURE", columnNames = {"CODE"})
}
, indexes = {
@Index(name = "IDX_UNIT_OF_MEASURE_UC", columnList = "CODE")
, @Index(name = "IDX_UNIT_OF_MEASURE_C2", columnList = "METRIC_ID")
})
public class UnitOfMeasure implements org.sklsft.commons.model.interfaces.Entity<Integer> {

private static final long serialVersionUID = 1L;

/*
 * no argument constructor
 */
public UnitOfMeasure(){
}

/*
 * properties
 */
@Id
@Column(name = "id", nullable = false)
@SequenceGenerator(name = "unitOfMeasureIdGenerator", sequenceName = "UNIT_OF_MEASURE_SEQ", allocationSize=1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "unitOfMeasureIdGenerator")
private Integer id;

@Column(name = "CODE", nullable = false)
private String code;

@Column(name = "LABEL")
private String label;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "METRIC_ID", nullable = false)
private Metric metric;


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

public Metric getMetric() {
return this.metric;
}

public void setMetric(Metric metric) {
this.metric = metric;
}


/* Specific Code Start */
/* Specific Code End */
}