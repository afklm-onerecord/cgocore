package com.afklm.cargo.cgocore.populator.command.reference.localization;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.ObjectArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.impl.StringArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.interfaces.ObjectArrayToBeanMapper;
import org.sklsft.generator.persistence.backup.command.interfaces.BackupArgumentsCommand;
import org.sklsft.generator.persistence.backup.reader.model.BackupArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.interfaces.reference.localization.StationService;
import com.afklm.cargo.cgocore.api.model.reference.localization.forms.StationForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class StationCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(StationCommand.class);

@Inject
private StationService stationService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<StationForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<StationForm>(StationForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<StationForm>(StationForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute stationService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
StationForm stationForm = mapper.mapFrom(new StationForm(), args);

this.stationService.save(stationForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
