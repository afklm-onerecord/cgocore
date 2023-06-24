package com.afklm.cargo.cgocore.api.model.reference.localization.sortings;

import java.io.Serializable;

import org.sklsft.commons.api.model.OrderType;

/**
 * auto generated ordering class file
 * <br/>basic representation of filter used along with jsf datatable
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class CountrySorting implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private OrderType iataCodeOrderType;
private OrderType labelOrderType;

/*
 * getters and setters
 */
public OrderType getIataCodeOrderType() {
return this.iataCodeOrderType;
}

public void setIataCodeOrderType(OrderType iataCodeOrderType) {
this.iataCodeOrderType = iataCodeOrderType;
}

public OrderType getLabelOrderType() {
return this.labelOrderType;
}

public void setLabelOrderType(OrderType labelOrderType) {
this.labelOrderType = labelOrderType;
}


/* Specific Code Start */
/* Specific Code End */
}
