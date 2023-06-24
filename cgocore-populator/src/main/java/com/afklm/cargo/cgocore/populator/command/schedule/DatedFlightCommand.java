package com.afklm.cargo.cgocore.populator.command.schedule;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.ObjectArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.impl.StringArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.interfaces.ObjectArrayToBeanMapper;
import org.sklsft.generator.persistence.backup.command.interfaces.BackupArgumentsCommand;
import org.sklsft.generator.persistence.backup.reader.model.BackupArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.interfaces.schedule.DatedFlightService;
import com.afklm.cargo.cgocore.api.model.schedule.forms.DatedFlightForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class DatedFlightCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(DatedFlightCommand.class);

@Inject
private DatedFlightService datedFlightService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<DatedFlightForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<DatedFlightForm>(DatedFlightForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<DatedFlightForm>(DatedFlightForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute datedFlightService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
DatedFlightForm datedFlightForm = mapper.mapFrom(new DatedFlightForm(), args);

this.datedFlightService.save(datedFlightForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
