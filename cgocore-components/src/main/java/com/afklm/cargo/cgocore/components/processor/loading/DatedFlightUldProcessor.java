package com.afklm.cargo.cgocore.components.processor.loading;

import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.components.processor.loading.base.DatedFlightUldBaseProcessor;
import com.afklm.cargo.cgocore.model.loading.DatedFlightUld;

/**
 * auto generated state manager class file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component
public class DatedFlightUldProcessor extends DatedFlightUldBaseProcessor {

/* Specific Code Start */
	
	public void saveOrUpdate(DatedFlightUld datedFlightUld) {
		if (datedFlightUld.getId()==null) {
			save(datedFlightUld);
		} else {
			update(datedFlightUld);
		}
	}

	
/* Specific Code End */
}
