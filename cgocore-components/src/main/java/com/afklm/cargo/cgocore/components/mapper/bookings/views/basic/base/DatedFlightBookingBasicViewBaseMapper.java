package com.afklm.cargo.cgocore.components.mapper.bookings.views.basic.base;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;

import com.afklm.cargo.cgocore.api.model.bookings.views.basic.DatedFlightBookingBasicView;
import com.afklm.cargo.cgocore.components.rightsmanager.bookings.DatedFlightBookingRightsManager;
import com.afklm.cargo.cgocore.components.statemanager.bookings.DatedFlightBookingStateManager;
import com.afklm.cargo.cgocore.model.bookings.DatedFlightBooking;
import com.afklm.cargo.cgocore.persistence.interfaces.bookings.BookingDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;
import com.afklm.cargo.cgocore.persistence.interfaces.schedule.DatedFlightDao;

/**
 * auto generated base mapper class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
public class DatedFlightBookingBasicViewBaseMapper extends BasicMapperImpl<DatedFlightBookingBasicView, DatedFlightBooking> {

public DatedFlightBookingBasicViewBaseMapper() {
super(DatedFlightBookingBasicView.class, DatedFlightBooking.class);
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

@Inject
protected DatedFlightBookingRightsManager datedFlightBookingRightsManager;
@Inject
protected DatedFlightBookingStateManager datedFlightBookingStateManager;

/**
 * mapping view from object
 */
@Override
public DatedFlightBookingBasicView mapFrom(DatedFlightBookingBasicView datedFlightBookingBasicView, DatedFlightBooking datedFlightBooking) {
datedFlightBookingBasicView = super.mapFrom(datedFlightBookingBasicView, datedFlightBooking);
datedFlightBookingBasicView.setSelected(false);
datedFlightBookingBasicView.setCanDelete(datedFlightBookingRightsManager.canDelete(datedFlightBooking) && datedFlightBookingStateManager.canDelete(datedFlightBooking));
datedFlightBookingBasicView.setDatedFlightCompanyIataCode(datedFlightBooking.getDatedFlight().getCompany().getIataCode());
datedFlightBookingBasicView.setDatedFlightFlightNumber(datedFlightBooking.getDatedFlight().getFlightNumber());
datedFlightBookingBasicView.setDatedFlightDepartureDate(datedFlightBooking.getDatedFlight().getDepartureDate());
datedFlightBookingBasicView.setBookingAirWaybillAirWaybillNumber(datedFlightBooking.getBooking().getAirWaybill().getAirWaybillNumber());
if (datedFlightBooking.getGrossWeightUnitOfMeasure() != null) {
datedFlightBookingBasicView.setGrossWeightUnitOfMeasureCode(datedFlightBooking.getGrossWeightUnitOfMeasure().getCode());
}
if (datedFlightBooking.getGrossVolumeUnitOfMeasure() != null) {
datedFlightBookingBasicView.setGrossVolumeUnitOfMeasureCode(datedFlightBooking.getGrossVolumeUnitOfMeasure().getCode());
}
return datedFlightBookingBasicView;
}

/**
 * mapping view to object
 */
@Override
public DatedFlightBooking mapTo(DatedFlightBookingBasicView datedFlightBookingBasicView, DatedFlightBooking datedFlightBooking) {
datedFlightBooking = super.mapTo(datedFlightBookingBasicView, datedFlightBooking);
datedFlightBooking.setDatedFlight(datedFlightDao.find(datedFlightBookingBasicView.getDatedFlightCompanyIataCode(), datedFlightBookingBasicView.getDatedFlightFlightNumber(), datedFlightBookingBasicView.getDatedFlightDepartureDate()));
datedFlightBooking.setBooking(bookingDao.find(datedFlightBookingBasicView.getBookingAirWaybillAirWaybillNumber()));
datedFlightBooking.setGrossWeightUnitOfMeasure(unitOfMeasureDao.find(datedFlightBookingBasicView.getGrossWeightUnitOfMeasureCode()));
datedFlightBooking.setGrossVolumeUnitOfMeasure(unitOfMeasureDao.find(datedFlightBookingBasicView.getGrossVolumeUnitOfMeasureCode()));
return datedFlightBooking;
}

}
