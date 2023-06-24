package com.afklm.cargo.cgocore.components.mapper.reference.containers.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.reference.containers.views.basic.UldTypeBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.containers.UldTypeRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.containers.UldTypeStateManager;
import com.afklm.cargo.cgocore.model.reference.containers.UldType;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class UldTypeBasicViewBaseMapper extends BasicMapperImpl<UldTypeBasicView, UldType> {

public UldTypeBasicViewBaseMapper() {
super(UldTypeBasicView.class, UldType.class);
}

/*
 * properties
 */

@Inject
protected UldTypeRightsManager uldTypeRightsManager;
@Inject
protected UldTypeStateManager uldTypeStateManager;

/**
 * mapping view from object
 */
@Override
public UldTypeBasicView mapFrom(UldTypeBasicView uldTypeBasicView, UldType uldType) {
uldTypeBasicView = super.mapFrom(uldTypeBasicView, uldType);
uldTypeBasicView.setSelected(false);
uldTypeBasicView.setCanDelete(uldTypeRightsManager.canDelete(uldType) && uldTypeStateManager.canDelete(uldType));
return uldTypeBasicView;
}

/**
 * mapping view to object
 */
@Override
public UldType mapTo(UldTypeBasicView uldTypeBasicView, UldType uldType) {
uldType = super.mapTo(uldTypeBasicView, uldType);
return uldType;
}

}
