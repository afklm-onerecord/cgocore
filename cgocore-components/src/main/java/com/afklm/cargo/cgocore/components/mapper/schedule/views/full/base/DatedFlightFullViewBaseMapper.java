package com.afklm.cargo.cgocore.components.mapper.schedule.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.schedule.forms.DatedFlightForm;
import com.afklm.cargo.cgocore.api.model.schedule.views.full.DatedFlightFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.schedule.DatedFlightRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.schedule.DatedFlightStateManager;
import com.afklm.cargo.cgocore.model.schedule.DatedFlight;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class DatedFlightFullViewBaseMapper extends FullViewMapper<DatedFlightFullView, Integer, DatedFlightForm, DatedFlight> {

@Inject
protected DatedFlightRightsManager datedFlightRightsManager;
@Inject
protected DatedFlightStateManager datedFlightStateManager;

public DatedFlightFullViewBaseMapper() {
super(DatedFlightFullView.class, DatedFlight.class);
}

@Override
public DatedFlightFullView mapFrom(DatedFlightFullView datedFlightFullView, DatedFlight datedFlight) {
datedFlightFullView = super.mapFrom(datedFlightFullView, datedFlight);
datedFlightFullView.setCanUpdate(datedFlightRightsManager.canUpdate(datedFlight) && datedFlightStateManager.canUpdate(datedFlight));
datedFlightFullView.setCanDelete(datedFlightRightsManager.canDelete(datedFlight) && datedFlightStateManager.canDelete(datedFlight));
return datedFlightFullView;
}

}
