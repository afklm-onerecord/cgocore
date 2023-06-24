package com.afklm.cargo.cgocore.components.validation;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.model.core.AirWaybillCoreForm;
import com.afklm.cargo.cgocore.api.model.core.validation.ValidationReport;
import com.afklm.cargo.cgocore.api.model.core.validation.ValidationResult;
import com.afklm.cargo.cgocore.persistence.interfaces.reference.localization.StationDao;

@Component
public class AirWaybillCoreFormValidator {
	
	@Inject
	private StationDao stationDao;

	public ValidationReport validate(AirWaybillCoreForm form) {
		ValidationReport result = new ValidationReport();
		
		if (!stationDao.exists(form.getOriginIataCode())) {
			result.addResult(new ValidationResult(ValidationResult.ERROR,"MOV301", "Invalid origin station, please provide airport code"));
		}
		if (!stationDao.exists(form.getDestinationIataCode())) {
			result.addResult(new ValidationResult(ValidationResult.ERROR,"MOV401", "Invalid destination station, please provide airport code"));
		}
				
		return result;
	}
}
