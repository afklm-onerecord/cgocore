package com.afklm.cargo.cgocore.components.validation;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.model.core.UldOnFlightCoreForm;
import com.afklm.cargo.cgocore.api.model.core.validation.ValidationReport;
import com.afklm.cargo.cgocore.api.model.core.validation.ValidationResult;
import com.afklm.cargo.cgocore.persistence.interfaces.schedule.DatedFlightDao;

@Component
public class UldOnFlightCoreFormValidator {
	
	@Inject
	private DatedFlightDao datedFlightDao;

	public ValidationReport validate(UldOnFlightCoreForm form) {
		ValidationReport result = new ValidationReport();
		
		if (!datedFlightDao.exists(form.getDatedFlightCompanyIataCode(), form.getDatedFlightFlightNumber(), form.getDatedFlightDepartureDate())) {
			result.addResult(new ValidationResult(ValidationResult.ERROR,"XXX", "Invalid dated flight"));
		}
				
		return result;
	}
}
