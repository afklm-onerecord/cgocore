package com.afklm.cargo.cgocore.components.mapper.reference.commodities.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.SpecialHandlingCodeForm;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.full.SpecialHandlingCodeFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.commodities.SpecialHandlingCodeRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.commodities.SpecialHandlingCodeStateManager;
import com.afklm.cargo.cgocore.model.reference.commodities.SpecialHandlingCode;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class SpecialHandlingCodeFullViewBaseMapper extends FullViewMapper<SpecialHandlingCodeFullView, Integer, SpecialHandlingCodeForm, SpecialHandlingCode> {

@Inject
protected SpecialHandlingCodeRightsManager specialHandlingCodeRightsManager;
@Inject
protected SpecialHandlingCodeStateManager specialHandlingCodeStateManager;

public SpecialHandlingCodeFullViewBaseMapper() {
super(SpecialHandlingCodeFullView.class, SpecialHandlingCode.class);
}

@Override
public SpecialHandlingCodeFullView mapFrom(SpecialHandlingCodeFullView specialHandlingCodeFullView, SpecialHandlingCode specialHandlingCode) {
specialHandlingCodeFullView = super.mapFrom(specialHandlingCodeFullView, specialHandlingCode);
specialHandlingCodeFullView.setCanUpdate(specialHandlingCodeRightsManager.canUpdate(specialHandlingCode) && specialHandlingCodeStateManager.canUpdate(specialHandlingCode));
specialHandlingCodeFullView.setCanDelete(specialHandlingCodeRightsManager.canDelete(specialHandlingCode) && specialHandlingCodeStateManager.canDelete(specialHandlingCode));
return specialHandlingCodeFullView;
}

}
