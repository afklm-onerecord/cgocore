package com.afklm.cargo.cgocore.components.mapper.reference.localization.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.reference.localization.forms.StationForm;
import com.afklm.cargo.cgocore.api.model.reference.localization.views.full.StationFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.reference.localization.StationRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.reference.localization.StationStateManager;
import com.afklm.cargo.cgocore.model.reference.localization.Station;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class StationFullViewBaseMapper extends FullViewMapper<StationFullView, Integer, StationForm, Station> {

@Inject
protected StationRightsManager stationRightsManager;
@Inject
protected StationStateManager stationStateManager;

public StationFullViewBaseMapper() {
super(StationFullView.class, Station.class);
}

@Override
public StationFullView mapFrom(StationFullView stationFullView, Station station) {
stationFullView = super.mapFrom(stationFullView, station);
stationFullView.setCanUpdate(stationRightsManager.canUpdate(station) && stationStateManager.canUpdate(station));
stationFullView.setCanDelete(stationRightsManager.canDelete(station) && stationStateManager.canDelete(station));
return stationFullView;
}

}
