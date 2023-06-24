package com.afklm.cargo.cgocore.components.mapper.bookings.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.bookings.views.basic.BookingBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.bookings.BookingRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.bookings.BookingStateManager;
import com.afklm.cargo.cgocore.model.bookings.Booking;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.StationDao;
import com.afklm.cargo.cgocore.persistence.interfaces.shipments.AirWaybillDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class BookingBasicViewBaseMapper extends BasicMapperImpl<BookingBasicView, Booking> {

public BookingBasicViewBaseMapper() {
super(BookingBasicView.class, Booking.class);
}

/*
 * properties
 */
@Inject
protected AirWaybillDao airWaybillDao;
@Inject
protected StationDao stationDao;
@Inject
protected UnitOfMeasureDao unitOfMeasureDao;

@Inject
protected BookingRightsManager bookingRightsManager;
@Inject
protected BookingStateManager bookingStateManager;

/**
 * mapping view from object
 */
@Override
public BookingBasicView mapFrom(BookingBasicView bookingBasicView, Booking booking) {
bookingBasicView = super.mapFrom(bookingBasicView, booking);
bookingBasicView.setSelected(false);
bookingBasicView.setCanDelete(bookingRightsManager.canDelete(booking) && bookingStateManager.canDelete(booking));
bookingBasicView.setAirWaybillAirWaybillNumber(booking.getAirWaybill().getAirWaybillNumber());
if (booking.getOrigin() != null) {
bookingBasicView.setOriginIataCode(booking.getOrigin().getIataCode());
}
if (booking.getDestination() != null) {
bookingBasicView.setDestinationIataCode(booking.getDestination().getIataCode());
}
if (booking.getGrossWeightUnitOfMeasure() != null) {
bookingBasicView.setGrossWeightUnitOfMeasureCode(booking.getGrossWeightUnitOfMeasure().getCode());
}
if (booking.getGrossVolumeUnitOfMeasure() != null) {
bookingBasicView.setGrossVolumeUnitOfMeasureCode(booking.getGrossVolumeUnitOfMeasure().getCode());
}
return bookingBasicView;
}

/**
 * mapping view to object
 */
@Override
public Booking mapTo(BookingBasicView bookingBasicView, Booking booking) {
booking = super.mapTo(bookingBasicView, booking);
booking.setAirWaybill(airWaybillDao.find(bookingBasicView.getAirWaybillAirWaybillNumber()));
booking.setOrigin(stationDao.find(bookingBasicView.getOriginIataCode()));
booking.setDestination(stationDao.find(bookingBasicView.getDestinationIataCode()));
booking.setGrossWeightUnitOfMeasure(unitOfMeasureDao.find(bookingBasicView.getGrossWeightUnitOfMeasureCode()));
booking.setGrossVolumeUnitOfMeasure(unitOfMeasureDao.find(bookingBasicView.getGrossVolumeUnitOfMeasureCode()));
return booking;
}

}
