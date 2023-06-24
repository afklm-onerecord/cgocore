package com.afklm.cargo.cgocore.rest.controller.core;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.afklm.cargo.cgocore.api.interfaces.core.AirWaybillCoreService;
import com.afklm.cargo.cgocore.api.model.core.AirWaybillCoreForm;
import com.afklm.cargo.cgocore.api.model.core.validation.ValidationReport;

@Controller
public class AirWaybillCoreController {
	
	@Inject
	private AirWaybillCoreService service;

	@RequestMapping(value = {AirWaybillCoreService.POST_URL}, method = RequestMethod.POST)
	public @ResponseBody ValidationReport register(@Valid @RequestBody AirWaybillCoreForm form) {
		return service.register(form);
	}
}
