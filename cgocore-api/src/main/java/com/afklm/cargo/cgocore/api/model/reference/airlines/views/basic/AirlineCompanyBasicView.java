package com.afklm.cargo.cgocore.api.model.reference.airlines.views.basic;

import java.io.Serializable;

/**
 * auto generated view bean class file
 * <br/>basic representation of what is going to be considered as model in MVC patterns
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
public class AirlineCompanyBasicView implements Serializable {

private static final long serialVersionUID = 1L;

/*
 * properties
 */
private Integer id;
private boolean selected;
private boolean canDelete;
private String iataCode;
private String label;
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

public boolean getSelected() {
return this.selected;
}

public void setSelected(boolean selected) {
this.selected = selected;
}

public boolean getCanDelete() {
return this.canDelete;
}

public void setCanDelete(boolean canDelete) {
this.canDelete = canDelete;
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
