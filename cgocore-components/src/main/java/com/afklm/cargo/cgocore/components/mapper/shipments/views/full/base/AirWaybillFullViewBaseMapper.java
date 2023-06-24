package com.afklm.cargo.cgocore.components.mapper.shipments.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.shipments.forms.AirWaybillForm;
import com.afklm.cargo.cgocore.api.model.shipments.views.full.AirWaybillFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.shipments.AirWaybillRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.shipments.AirWaybillStateManager;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class AirWaybillFullViewBaseMapper extends FullViewMapper<AirWaybillFullView, Long, AirWaybillForm, AirWaybill> {

@Inject
protected AirWaybillRightsManager airWaybillRightsManager;
@Inject
protected AirWaybillStateManager airWaybillStateManager;

public AirWaybillFullViewBaseMapper() {
super(AirWaybillFullView.class, AirWaybill.class);
}

@Override
public AirWaybillFullView mapFrom(AirWaybillFullView airWaybillFullView, AirWaybill airWaybill) {
airWaybillFullView = super.mapFrom(airWaybillFullView, airWaybill);
airWaybillFullView.setCanUpdate(airWaybillRightsManager.canUpdate(airWaybill) && airWaybillStateManager.canUpdate(airWaybill));
airWaybillFullView.setCanDelete(airWaybillRightsManager.canDelete(airWaybill) && airWaybillStateManager.canDelete(airWaybill));
return airWaybillFullView;
}

}
