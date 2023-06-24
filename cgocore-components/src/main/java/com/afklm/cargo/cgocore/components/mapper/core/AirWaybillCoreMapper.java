package com.afklm.cargo.cgocore.components.mapper.core;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.BasicMapperImpl;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.model.core.AirWaybillCoreForm;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.commodities.UnitOfMeasureDao;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.StationDao;

@Component
public class AirWaybillCoreMapper extends BasicMapperImpl<AirWaybillCoreForm, AirWaybill> {

	public AirWaybillCoreMapper() {
		super(AirWaybillCoreForm.class, AirWaybill.class);
	}

	@Inject
	protected StationDao stationDao;
	@Inject
	protected UnitOfMeasureDao unitOfMeasureDao;

	/**
	 * mapping form from object
	 */
	@Override
	public AirWaybillCoreForm mapFrom(AirWaybillCoreForm form, AirWaybill airWaybill) {
		form = super.mapFrom(form, airWaybill);
		if (airWaybill.getOrigin() != null) {
			form.setOriginIataCode(airWaybill.getOrigin().getIataCode());
		}
		if (airWaybill.getDestination() != null) {
			form.setDestinationIataCode(airWaybill.getDestination().getIataCode());
		}
		if (airWaybill.getGrossWeightUnitOfMeasure() != null) {
			form.setGrossWeightUnitOfMeasureCode(airWaybill.getGrossWeightUnitOfMeasure().getCode());
		}
		if (airWaybill.getGrossVolumeUnitOfMeasure() != null) {
			form.setGrossVolumeUnitOfMeasureCode(airWaybill.getGrossVolumeUnitOfMeasure().getCode());
		}
		return form;
	}

	/**
	 * mapping view to object
	 */
	@Override
	public AirWaybill mapTo(AirWaybillCoreForm form, AirWaybill airWaybill) {
		airWaybill = super.mapTo(form, airWaybill);
		airWaybill.setOrigin(stationDao.find(form.getOriginIataCode()));
		airWaybill.setDestination(stationDao.find(form.getDestinationIataCode()));
		airWaybill.setGrossWeightUnitOfMeasure(unitOfMeasureDao.find(form.getGrossWeightUnitOfMeasureCode()));
		airWaybill.setGrossVolumeUnitOfMeasure(unitOfMeasureDao.find(form.getGrossVolumeUnitOfMeasureCode()));
		return airWaybill;
	}

}
