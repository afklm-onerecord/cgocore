package com.afklm.cargo.cgocore.components.mapper.reference.commodities.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.UnitOfMeasureForm;
import com.afklm.cargo.cgocore.api.model.reference.commodities.views.full.UnitOfMeasureFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.commodities.UnitOfMeasureRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.commodities.UnitOfMeasureStateManager;
import com.afklm.cargo.cgocore.model.reference.commodities.UnitOfMeasure;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class UnitOfMeasureFullViewBaseMapper extends FullViewMapper<UnitOfMeasureFullView, Integer, UnitOfMeasureForm, UnitOfMeasure> {

@Inject
protected UnitOfMeasureRightsManager unitOfMeasureRightsManager;
@Inject
protected UnitOfMeasureStateManager unitOfMeasureStateManager;

public UnitOfMeasureFullViewBaseMapper() {
super(UnitOfMeasureFullView.class, UnitOfMeasure.class);
}

@Override
public UnitOfMeasureFullView mapFrom(UnitOfMeasureFullView unitOfMeasureFullView, UnitOfMeasure unitOfMeasure) {
unitOfMeasureFullView = super.mapFrom(unitOfMeasureFullView, unitOfMeasure);
unitOfMeasureFullView.setCanUpdate(unitOfMeasureRightsManager.canUpdate(unitOfMeasure) && unitOfMeasureStateManager.canUpdate(unitOfMeasure));
unitOfMeasureFullView.setCanDelete(unitOfMeasureRightsManager.canDelete(unitOfMeasure) && unitOfMeasureStateManager.canDelete(unitOfMeasure));
return unitOfMeasureFullView;
}

}
