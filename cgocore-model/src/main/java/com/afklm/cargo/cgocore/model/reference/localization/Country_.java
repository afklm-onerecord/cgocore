package com.afklm.cargo.cgocore.model.reference.localization;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * auto generated entity metamodel class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */
@StaticMetamodel(Country.class)
public abstract class Country_ {

public static volatile SingularAttribute<Country, Integer> id;
public static volatile SingularAttribute<Country, String> iataCode;
public static volatile SingularAttribute<Country, String> label;
public static volatile SetAttribute<Country, Station> stationCollection;

public static final String ID = "id";
public static final String IATA_CODE = "iataCode";
public static final String LABEL = "label";
public static final String STATION_COLLECTION = "stationCollection";

/* Specific Code Start */
/* Specific Code End */
}