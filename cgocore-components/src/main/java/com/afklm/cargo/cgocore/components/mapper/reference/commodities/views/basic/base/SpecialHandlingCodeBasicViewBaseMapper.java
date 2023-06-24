package com.afklm.cargo.cgocore.components.mapper.reference.commodities.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.commodities.views.basic.SpecialHandlingCodeBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.commodities.SpecialHandlingCodeRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.commodities.SpecialHandlingCodeStateManager;
import com.afklm.cargo.cgocore.model.reference.commodities.SpecialHandlingCode;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class SpecialHandlingCodeBasicViewBaseMapper extends BasicMapperImpl<SpecialHandlingCodeBasicView, SpecialHandlingCode> {

public SpecialHandlingCodeBasicViewBaseMapper() {
super(SpecialHandlingCodeBasicView.class, SpecialHandlingCode.class);
}

/*
 * properties
 */

@Inject
protected SpecialHandlingCodeRightsManager specialHandlingCodeRightsManager;
@Inject
protected SpecialHandlingCodeStateManager specialHandlingCodeStateManager;

/**
 * mapping view from object
 */
@Override
public SpecialHandlingCodeBasicView mapFrom(SpecialHandlingCodeBasicView specialHandlingCodeBasicView, SpecialHandlingCode specialHandlingCode) {
specialHandlingCodeBasicView = super.mapFrom(specialHandlingCodeBasicView, specialHandlingCode);
specialHandlingCodeBasicView.setSelected(false);
specialHandlingCodeBasicView.setCanDelete(specialHandlingCodeRightsManager.canDelete(specialHandlingCode) && specialHandlingCodeStateManager.canDelete(specialHandlingCode));
return specialHandlingCodeBasicView;
}

/**
 * mapping view to object
 */
@Override
public SpecialHandlingCode mapTo(SpecialHandlingCodeBasicView specialHandlingCodeBasicView, SpecialHandlingCode specialHandlingCode) {
specialHandlingCode = super.mapTo(specialHandlingCodeBasicView, specialHandlingCode);
return specialHandlingCode;
}

}
