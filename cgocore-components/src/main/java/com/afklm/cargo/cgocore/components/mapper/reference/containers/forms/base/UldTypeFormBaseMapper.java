package com.afklm.cargo.cgocore.components.mapper.reference.containers.forms.base;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.containers.forms.UldTypeForm;
import com.afklm.cargo.cgocore.model.reference.containers.UldType;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UldTypeFormBaseMapper extends BasicMapperImpl<UldTypeForm, UldType> {

public UldTypeFormBaseMapper() {
super(UldTypeForm.class, UldType.class);
}

/*
 * properties
 */

/**
 * mapping form from object
 */
@Override
public UldTypeForm mapFrom(UldTypeForm uldTypeForm, UldType uldType) {
uldTypeForm = super.mapFrom(uldTypeForm, uldType);
return uldTypeForm;
}

/**
 * mapping view to object
 */
@Override
public UldType mapTo(UldTypeForm uldTypeForm, UldType uldType) {
uldType = super.mapTo(uldTypeForm, uldType);
return uldType;
}

}
