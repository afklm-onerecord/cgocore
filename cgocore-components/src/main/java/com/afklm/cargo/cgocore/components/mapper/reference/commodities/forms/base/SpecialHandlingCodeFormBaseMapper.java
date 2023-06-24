package com.afklm.cargo.cgocore.components.mapper.reference.commodities.forms.base;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.SpecialHandlingCodeForm;
import com.afklm.cargo.cgocore.model.reference.commodities.SpecialHandlingCode;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class SpecialHandlingCodeFormBaseMapper extends BasicMapperImpl<SpecialHandlingCodeForm, SpecialHandlingCode> {

public SpecialHandlingCodeFormBaseMapper() {
super(SpecialHandlingCodeForm.class, SpecialHandlingCode.class);
}

/*
 * properties
 */

/**
 * mapping form from object
 */
@Override
public SpecialHandlingCodeForm mapFrom(SpecialHandlingCodeForm specialHandlingCodeForm, SpecialHandlingCode specialHandlingCode) {
specialHandlingCodeForm = super.mapFrom(specialHandlingCodeForm, specialHandlingCode);
return specialHandlingCodeForm;
}

/**
 * mapping view to object
 */
@Override
public SpecialHandlingCode mapTo(SpecialHandlingCodeForm specialHandlingCodeForm, SpecialHandlingCode specialHandlingCode) {
specialHandlingCode = super.mapTo(specialHandlingCodeForm, specialHandlingCode);
return specialHandlingCode;
}

}
