package com.afklm.cargo.cgocore.components.mapper.core;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.model.core.UldOnFlightCoreForm;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.containers.UldTypeDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.StationDao;
import com.afklm.cargo.cgocore.persistence.interfaces.schedule.DatedFlightDao;

@Component
public class UldOnFlightCoreMapper extends BasicMapperImpl<UldOnFlightCoreForm, DatedFlightUld> {

	public UldOnFlightCoreMapper() {
		super(UldOnFlightCoreForm.class, DatedFlightUld.class);
	}

	@Inject
	protected StationDao stationDao;
	
	@Inject
	protected UnitOfMeasureDao unitOfMeasureDao;
	
	@Inject
	private DatedFlightDao datedFlightDao;
	
	@Inject
	private UldTypeDao uldTypeDao;

	/**
	 * mapping form from object
	 */
	@Override
	public UldOnFlightCoreForm mapFrom(UldOnFlightCoreForm form, DatedFlightUld object) {
		form = super.mapFrom(form, object);
		
		form.setDatedFlightCompanyIataCode(object.getDatedFlight().getCompany().getIataCode());
		form.setDatedFlightFlightNumber(object.getDatedFlight().getFlightNumber());
		form.setDatedFlightDepartureDate(object.getDatedFlight().getDepartureDate());
		if (object.getGrossWeightUnitOfMeasure() != null) {
			form.setGrossWeightUnitOfMeasureCode(object.getGrossWeightUnitOfMeasure().getCode());
		}
		form.setUldTypeCode(object.getUldType().getCode());
		
		return form;
	}

	/**
	 * mapping view to object
	 */
	@Override
	public DatedFlightUld mapTo(UldOnFlightCoreForm form, DatedFlightUld object) {
		object = super.mapTo(form, object);
		object.setGrossWeightUnitOfMeasure(unitOfMeasureDao.find(form.getGrossWeightUnitOfMeasureCode()));
		object.setDatedFlight(datedFlightDao.find(form.getDatedFlightCompanyIataCode(), form.getDatedFlightFlightNumber(), form.getDatedFlightDepartureDate()));
		object.setUldType(uldTypeDao.find(form.getUldTypeCode()));
		
		return object;
	}

}
