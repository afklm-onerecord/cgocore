package com.afklm.cargo.cgocore.services.core;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.afklm.cargo.cgocore.api.interfaces.core.AirWaybillCoreService;
import com.afklm.cargo.cgocore.api.model.core.AirWaybillCoreForm;
import com.afklm.cargo.cgocore.api.model.core.validation.ValidationReport;
import com.afklm.cargo.cgocore.components.mapper.core.AirWaybillCoreMapper;
import com.afklm.cargo.cgocore.components.processor.shipments.AirWaybillProcessor;
import com.afklm.cargo.cgocore.components.validation.AirWaybillCoreFormValidator;
import com.afklm.cargo.cgocore.model.shipments.AirWaybill;
import com.afklm.cargo.cgocore.persistence.interfaces.shipments.AirWaybillDao;

@Service
public class AirWaybillCoreServiceImpl implements AirWaybillCoreService {
	
	@Inject
	private AirWaybillDao dao;
	
	@Inject
	private AirWaybillCoreMapper mapper;
	
	@Inject
	private AirWaybillCoreFormValidator validator;
	
	@Inject
	private AirWaybillProcessor processor;

	@Transactional
	public ValidationReport register(AirWaybillCoreForm form) {
		
		ValidationReport report = validator.validate(form);
		if (!report.hasRejects()) {
			AirWaybill airWaybill = dao.find(form.getAirWaybillNumber());
			airWaybill = mapper.mapTo(form, airWaybill);
			processor.update(airWaybill);
		}
		return report;
	}
}
