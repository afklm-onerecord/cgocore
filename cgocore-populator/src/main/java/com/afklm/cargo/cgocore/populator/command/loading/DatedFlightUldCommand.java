package com.afklm.cargo.cgocore.populator.command.loading;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.ObjectArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.impl.StringArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.interfaces.ObjectArrayToBeanMapper;
import org.sklsft.generator.persistence.backup.command.interfaces.BackupArgumentsCommand;
import org.sklsft.generator.persistence.backup.reader.model.BackupArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.interfaces.loading.DatedFlightUldService;
import com.afklm.cargo.cgocore.api.model.loading.forms.DatedFlightUldForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class DatedFlightUldCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(DatedFlightUldCommand.class);

@Inject
private DatedFlightUldService datedFlightUldService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<DatedFlightUldForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<DatedFlightUldForm>(DatedFlightUldForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<DatedFlightUldForm>(DatedFlightUldForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute datedFlightUldService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
DatedFlightUldForm datedFlightUldForm = mapper.mapFrom(new DatedFlightUldForm(), args);

this.datedFlightUldService.save(datedFlightUldForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
