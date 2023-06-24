package com.afklm.cargo.cgocore.model.reference.localization;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * auto generated entity metamodel class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@StaticMetamodel(Station.class)
public abstract class Station_ {

public static volatile SingularAttribute<Station, Integer> id;
public static volatile SingularAttribute<Station, String> iataCode;
public static volatile SingularAttribute<Station, String> label;
public static volatile SingularAttribute<Station, Country> country;

public static final String ID = "id";
public static final String IATA_CODE = "iataCode";
public static final String LABEL = "label";
public static final String COUNTRY = "country";

/* Specific Code Start */
/* Specific Code End */
}