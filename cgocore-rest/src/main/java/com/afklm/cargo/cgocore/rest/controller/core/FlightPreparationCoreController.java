package com.afklm.cargo.cgocore.rest.controller.core;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.afklm.cargo.cgocore.api.interfaces.core.AirWaybillCoreService;
import com.afklm.cargo.cgocore.api.interfaces.core.FlightPreparationCoreService;
import com.afklm.cargo.cgocore.api.model.core.AirWaybillCoreForm;
import com.afklm.cargo.cgocore.api.model.core.UldOnFlightCoreForm;
import com.afklm.cargo.cgocore.api.model.core.validation.ValidationReport;

@Controller
public class FlightPreparationCoreController {
	
	@Inject
	private FlightPreparationCoreService service;

	@RequestMapping(value = {FlightPreparationCoreService.POST_ULD_URL}, method = RequestMethod.POST)
	public @ResponseBody ValidationReport registerUldOnFlight(@Valid @RequestBody UldOnFlightCoreForm form) {
		return service.registerUldOnFlight(form);
	}
}
