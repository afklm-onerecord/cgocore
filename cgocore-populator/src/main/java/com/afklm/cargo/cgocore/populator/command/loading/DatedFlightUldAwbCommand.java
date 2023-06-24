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

import com.afklm.cargo.cgocore.api.interfaces.loading.DatedFlightUldAwbService;
import com.afklm.cargo.cgocore.api.model.loading.forms.DatedFlightUldAwbForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class DatedFlightUldAwbCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(DatedFlightUldAwbCommand.class);

@Inject
private DatedFlightUldAwbService datedFlightUldAwbService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<DatedFlightUldAwbForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<DatedFlightUldAwbForm>(DatedFlightUldAwbForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<DatedFlightUldAwbForm>(DatedFlightUldAwbForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute datedFlightUldAwbService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
DatedFlightUldAwbForm datedFlightUldAwbForm = mapper.mapFrom(new DatedFlightUldAwbForm(), args);

this.datedFlightUldAwbService.save(datedFlightUldAwbForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
