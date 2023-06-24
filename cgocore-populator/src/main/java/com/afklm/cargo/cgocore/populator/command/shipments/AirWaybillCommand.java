package com.afklm.cargo.cgocore.populator.command.shipments;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.ObjectArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.impl.StringArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.interfaces.ObjectArrayToBeanMapper;
import org.sklsft.generator.persistence.backup.command.interfaces.BackupArgumentsCommand;
import org.sklsft.generator.persistence.backup.reader.model.BackupArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.interfaces.shipments.AirWaybillService;
import com.afklm.cargo.cgocore.api.model.shipments.forms.AirWaybillForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class AirWaybillCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(AirWaybillCommand.class);

@Inject
private AirWaybillService airWaybillService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<AirWaybillForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<AirWaybillForm>(AirWaybillForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<AirWaybillForm>(AirWaybillForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute airWaybillService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
AirWaybillForm airWaybillForm = mapper.mapFrom(new AirWaybillForm(), args);

this.airWaybillService.save(airWaybillForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
