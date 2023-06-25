package com.afklm.cargo.cgocore.services.core;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.core.FlightPreparationCoreService;
import com.afklm.cargo.cgocore.api.model.core.UldOnFlightCoreForm;
import com.afklm.cargo.cgocore.api.model.core.validation.ValidationReport;
import com.afklm.cargo.cgocore.components.mapper.core.UldOnFlightCoreMapper;
import com.afklm.cargo.cgocore.components.processor.loading.DatedFlightUldProcessor;
import com.afklm.cargo.cgocore.components.validation.UldOnFlightCoreFormValidator;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;
import com.afklm.cargo.cgocore.persistence.interfaces.loading.DatedFlightUldDao;

@Service
public class FlightPreparationCoreServiceImpl implements FlightPreparationCoreService {
	
	@Inject
	private DatedFlightUldDao datedFlightUldDao;
		
	@Inject
	private UldOnFlightCoreFormValidator validator;
	
	@Inject
	private UldOnFlightCoreMapper mapper;
	
	@Inject
	private DatedFlightUldProcessor processor; 

	@Override
	@Transactional
	public ValidationReport registerUldOnFlight(UldOnFlightCoreForm form) {
		
		DatedFlightUld datedFlightUld = datedFlightUldDao.findOrNull(form.getDatedFlightCompanyIataCode(), form.getDatedFlightFlightNumber(), form.getDatedFlightDepartureDate(), form.getUldTypeCode(), form.getUldCode(), form.getUldOwnerCode());
		
		if (datedFlightUld == null) {
			datedFlightUld = new DatedFlightUld();			
		}
		
		datedFlightUld = mapper.mapTo(form, datedFlightUld);
		
		ValidationReport report = validator.validate(form);
		if (!report.hasRejects()) {
			processor.saveOrUpdate(datedFlightUld);
		}
		
		return report;
		
	}

}
