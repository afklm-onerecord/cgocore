package com.afklm.cargo.cgocore.components.mapper.loading.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.loading.forms.DatedFlightUldForm;
import com.afklm.cargo.cgocore.api.model.loading.views.full.DatedFlightUldFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.loading.DatedFlightUldRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.loading.DatedFlightUldStateManager;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class DatedFlightUldFullViewBaseMapper extends FullViewMapper<DatedFlightUldFullView, Integer, DatedFlightUldForm, DatedFlightUld> {

@Inject
protected DatedFlightUldRightsManager datedFlightUldRightsManager;
@Inject
protected DatedFlightUldStateManager datedFlightUldStateManager;

public DatedFlightUldFullViewBaseMapper() {
super(DatedFlightUldFullView.class, DatedFlightUld.class);
}

@Override
public DatedFlightUldFullView mapFrom(DatedFlightUldFullView datedFlightUldFullView, DatedFlightUld datedFlightUld) {
datedFlightUldFullView = super.mapFrom(datedFlightUldFullView, datedFlightUld);
datedFlightUldFullView.setCanUpdate(datedFlightUldRightsManager.canUpdate(datedFlightUld) && datedFlightUldStateManager.canUpdate(datedFlightUld));
datedFlightUldFullView.setCanDelete(datedFlightUldRightsManager.canDelete(datedFlightUld) && datedFlightUldStateManager.canDelete(datedFlightUld));
return datedFlightUldFullView;
}

}
