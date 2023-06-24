package com.afklm.cargo.cgocore.components.mapper.bookings.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.bookings.forms.DatedFlightBookingForm;
import com.afklm.cargo.cgocore.api.model.bookings.views.full.DatedFlightBookingFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.bookings.DatedFlightBookingRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.bookings.DatedFlightBookingStateManager;
import com.afklm.cargo.cgocore.model.bookings.DatedFlightBooking;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class DatedFlightBookingFullViewBaseMapper extends FullViewMapper<DatedFlightBookingFullView, Integer, DatedFlightBookingForm, DatedFlightBooking> {

@Inject
protected DatedFlightBookingRightsManager datedFlightBookingRightsManager;
@Inject
protected DatedFlightBookingStateManager datedFlightBookingStateManager;

public DatedFlightBookingFullViewBaseMapper() {
super(DatedFlightBookingFullView.class, DatedFlightBooking.class);
}

@Override
public DatedFlightBookingFullView mapFrom(DatedFlightBookingFullView datedFlightBookingFullView, DatedFlightBooking datedFlightBooking) {
datedFlightBookingFullView = super.mapFrom(datedFlightBookingFullView, datedFlightBooking);
datedFlightBookingFullView.setCanUpdate(datedFlightBookingRightsManager.canUpdate(datedFlightBooking) && datedFlightBookingStateManager.canUpdate(datedFlightBooking));
datedFlightBookingFullView.setCanDelete(datedFlightBookingRightsManager.canDelete(datedFlightBooking) && datedFlightBookingStateManager.canDelete(datedFlightBooking));
return datedFlightBookingFullView;
}

}
