package com.afklm.cargo.cgocore.components.mapper.bookings.views.full.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.FullViewMapper;

import com.afklm.cargo.cgocore.api.model.bookings.forms.BookingForm;
import com.afklm.cargo.cgocore.api.model.bookings.views.full.BookingFullView;
import com.afklm.cargo.cgocore.components.rightsmanager.bookings.BookingRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.bookings.BookingStateManager;
import com.afklm.cargo.cgocore.model.bookings.Booking;

/**
 * auto generated mapper class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

public class BookingFullViewBaseMapper extends FullViewMapper<BookingFullView, Long, BookingForm, Booking> {

@Inject
protected BookingRightsManager bookingRightsManager;
@Inject
protected BookingStateManager bookingStateManager;

public BookingFullViewBaseMapper() {
super(BookingFullView.class, Booking.class);
}

@Override
public BookingFullView mapFrom(BookingFullView bookingFullView, Booking booking) {
bookingFullView = super.mapFrom(bookingFullView, booking);
bookingFullView.setCanUpdate(bookingRightsManager.canUpdate(booking) && bookingStateManager.canUpdate(booking));
bookingFullView.setCanDelete(bookingRightsManager.canDelete(booking) && bookingStateManager.canDelete(booking));
return bookingFullView;
}

}
