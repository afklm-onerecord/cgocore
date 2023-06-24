package com.afklm.cargo.cgocore.components.mapper.bookings.forms.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.bookings.forms.BookingForm;
import com.afklm.cargo.cgocore.model.bookings.Booking;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.StationDao;
import com.afklm.cargo.cgocore.persistence.interfaces.shipments.AirWaybillDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class BookingFormBaseMapper extends BasicMapperImpl<BookingForm, Booking> {

public BookingFormBaseMapper() {
super(BookingForm.class, Booking.class);
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

/**
 * mapping form from object
 */
@Override
public BookingForm mapFrom(BookingForm bookingForm, Booking booking) {
bookingForm = super.mapFrom(bookingForm, booking);
bookingForm.setAirWaybillAirWaybillNumber(booking.getAirWaybill().getAirWaybillNumber());
if (booking.getOrigin() != null) {
bookingForm.setOriginIataCode(booking.getOrigin().getIataCode());
}
if (booking.getDestination() != null) {
bookingForm.setDestinationIataCode(booking.getDestination().getIataCode());
}
if (booking.getGrossWeightUnitOfMeasure() != null) {
bookingForm.setGrossWeightUnitOfMeasureCode(booking.getGrossWeightUnitOfMeasure().getCode());
}
if (booking.getGrossVolumeUnitOfMeasure() != null) {
bookingForm.setGrossVolumeUnitOfMeasureCode(booking.getGrossVolumeUnitOfMeasure().getCode());
}
return bookingForm;
}

/**
 * mapping view to object
 */
@Override
public Booking mapTo(BookingForm bookingForm, Booking booking) {
booking = super.mapTo(bookingForm, booking);
booking.setAirWaybill(airWaybillDao.find(bookingForm.getAirWaybillAirWaybillNumber()));
booking.setOrigin(stationDao.find(bookingForm.getOriginIataCode()));
booking.setDestination(stationDao.find(bookingForm.getDestinationIataCode()));
booking.setGrossWeightUnitOfMeasure(unitOfMeasureDao.find(bookingForm.getGrossWeightUnitOfMeasureCode()));
booking.setGrossVolumeUnitOfMeasure(unitOfMeasureDao.find(bookingForm.getGrossVolumeUnitOfMeasureCode()));
return booking;
}

}
