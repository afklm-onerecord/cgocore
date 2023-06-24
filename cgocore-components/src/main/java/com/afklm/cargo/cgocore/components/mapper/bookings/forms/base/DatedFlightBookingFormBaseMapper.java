package com.afklm.cargo.cgocore.components.mapper.bookings.forms.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.bookings.forms.DatedFlightBookingForm;
import com.afklm.cargo.cgocore.model.bookings.DatedFlightBooking;
import com.afklm.cargo.cgocore.persistence.interfaces.bookings.BookingDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;
import com.afklm.cargo.cgocore.persistence.interfaces.schedule.DatedFlightDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBookingFormBaseMapper extends BasicMapperImpl<DatedFlightBookingForm, DatedFlightBooking> {

public DatedFlightBookingFormBaseMapper() {
super(DatedFlightBookingForm.class, DatedFlightBooking.class);
}

/*
 * properties
 */
@Inject
protected DatedFlightDao datedFlightDao;
@Inject
protected BookingDao bookingDao;
@Inject
protected UnitOfMeasureDao unitOfMeasureDao;

/**
 * mapping form from object
 */
@Override
public DatedFlightBookingForm mapFrom(DatedFlightBookingForm datedFlightBookingForm, DatedFlightBooking datedFlightBooking) {
datedFlightBookingForm = super.mapFrom(datedFlightBookingForm, datedFlightBooking);
datedFlightBookingForm.setDatedFlightCompanyIataCode(datedFlightBooking.getDatedFlight().getCompany().getIataCode());
datedFlightBookingForm.setDatedFlightFlightNumber(datedFlightBooking.getDatedFlight().getFlightNumber());
datedFlightBookingForm.setDatedFlightDepartureDate(datedFlightBooking.getDatedFlight().getDepartureDate());
datedFlightBookingForm.setBookingAirWaybillAirWaybillNumber(datedFlightBooking.getBooking().getAirWaybill().getAirWaybillNumber());
if (datedFlightBooking.getGrossWeightUnitOfMeasure() != null) {
datedFlightBookingForm.setGrossWeightUnitOfMeasureCode(datedFlightBooking.getGrossWeightUnitOfMeasure().getCode());
}
if (datedFlightBooking.getGrossVolumeUnitOfMeasure() != null) {
datedFlightBookingForm.setGrossVolumeUnitOfMeasureCode(datedFlightBooking.getGrossVolumeUnitOfMeasure().getCode());
}
return datedFlightBookingForm;
}

/**
 * mapping view to object
 */
@Override
public DatedFlightBooking mapTo(DatedFlightBookingForm datedFlightBookingForm, DatedFlightBooking datedFlightBooking) {
datedFlightBooking = super.mapTo(datedFlightBookingForm, datedFlightBooking);
datedFlightBooking.setDatedFlight(datedFlightDao.find(datedFlightBookingForm.getDatedFlightCompanyIataCode(), datedFlightBookingForm.getDatedFlightFlightNumber(), datedFlightBookingForm.getDatedFlightDepartureDate()));
datedFlightBooking.setBooking(bookingDao.find(datedFlightBookingForm.getBookingAirWaybillAirWaybillNumber()));
datedFlightBooking.setGrossWeightUnitOfMeasure(unitOfMeasureDao.find(datedFlightBookingForm.getGrossWeightUnitOfMeasureCode()));
datedFlightBooking.setGrossVolumeUnitOfMeasure(unitOfMeasureDao.find(datedFlightBookingForm.getGrossVolumeUnitOfMeasureCode()));
return datedFlightBooking;
}

}
