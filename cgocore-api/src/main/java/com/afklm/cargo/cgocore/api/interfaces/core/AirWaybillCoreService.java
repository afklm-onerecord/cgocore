package com.afklm.cargo.cgocore.api.interfaces.core;

import com.afklm.cargo.cgocore.api.model.core.AirWaybillCoreForm;
import com.afklm.cargo.cgocore.api.model.core.validation.ValidationReport;

public interface AirWaybillCoreService {

	public static final String POST_URL = "/airwaybill";
	ValidationReport register(AirWaybillCoreForm form);
}
