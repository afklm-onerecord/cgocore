package com.afklm.cargo.cgocore.api.interfaces.core;

import com.afklm.cargo.cgocore.api.model.core.UldOnFlightCoreForm;
import com.afklm.cargo.cgocore.api.model.core.validation.ValidationReport;

public interface FlightPreparationCoreService {

	public static final String POST_ULD_URL = "/uld-on-flight";
	ValidationReport registerUldOnFlight(UldOnFlightCoreForm form);
	
	
}
