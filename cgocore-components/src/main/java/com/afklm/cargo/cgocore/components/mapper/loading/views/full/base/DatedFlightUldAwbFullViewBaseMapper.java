package com.afklm.cargo.cgocore.components.mapper.loading.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.loading.forms.DatedFlightUldAwbForm;
import com.afklm.cargo.cgocore.api.model.loading.views.full.DatedFlightUldAwbFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.loading.DatedFlightUldAwbRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.loading.DatedFlightUldAwbStateManager;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUldAwb;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class DatedFlightUldAwbFullViewBaseMapper extends FullViewMapper<DatedFlightUldAwbFullView, Integer, DatedFlightUldAwbForm, DatedFlightUldAwb> {

@Inject
protected DatedFlightUldAwbRightsManager datedFlightUldAwbRightsManager;
@Inject
protected DatedFlightUldAwbStateManager datedFlightUldAwbStateManager;

public DatedFlightUldAwbFullViewBaseMapper() {
super(DatedFlightUldAwbFullView.class, DatedFlightUldAwb.class);
}

@Override
public DatedFlightUldAwbFullView mapFrom(DatedFlightUldAwbFullView datedFlightUldAwbFullView, DatedFlightUldAwb datedFlightUldAwb) {
datedFlightUldAwbFullView = super.mapFrom(datedFlightUldAwbFullView, datedFlightUldAwb);
datedFlightUldAwbFullView.setCanUpdate(datedFlightUldAwbRightsManager.canUpdate(datedFlightUldAwb) && datedFlightUldAwbStateManager.canUpdate(datedFlightUldAwb));
datedFlightUldAwbFullView.setCanDelete(datedFlightUldAwbRightsManager.canDelete(datedFlightUldAwb) && datedFlightUldAwbStateManager.canDelete(datedFlightUldAwb));
return datedFlightUldAwbFullView;
}

}
