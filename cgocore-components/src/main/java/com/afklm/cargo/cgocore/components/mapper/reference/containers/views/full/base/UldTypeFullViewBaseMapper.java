package com.afklm.cargo.cgocore.components.mapper.reference.containers.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.reference.containers.forms.UldTypeForm;
import com.afklm.cargo.cgocore.api.model.reference.containers.views.full.UldTypeFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.containers.UldTypeRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.containers.UldTypeStateManager;
import com.afklm.cargo.cgocore.model.reference.containers.UldType;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class UldTypeFullViewBaseMapper extends FullViewMapper<UldTypeFullView, Integer, UldTypeForm, UldType> {

@Inject
protected UldTypeRightsManager uldTypeRightsManager;
@Inject
protected UldTypeStateManager uldTypeStateManager;

public UldTypeFullViewBaseMapper() {
super(UldTypeFullView.class, UldType.class);
}

@Override
public UldTypeFullView mapFrom(UldTypeFullView uldTypeFullView, UldType uldType) {
uldTypeFullView = super.mapFrom(uldTypeFullView, uldType);
uldTypeFullView.setCanUpdate(uldTypeRightsManager.canUpdate(uldType) && uldTypeStateManager.canUpdate(uldType));
uldTypeFullView.setCanDelete(uldTypeRightsManager.canDelete(uldType) && uldTypeStateManager.canDelete(uldType));
return uldTypeFullView;
}

}
