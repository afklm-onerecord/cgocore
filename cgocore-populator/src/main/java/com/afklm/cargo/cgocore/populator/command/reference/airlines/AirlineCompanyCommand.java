package com.afklm.cargo.cgocore.populator.command.reference.airlines;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.ObjectArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.impl.StringArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.interfaces.ObjectArrayToBeanMapper;
import org.sklsft.generator.persistence.backup.command.interfaces.BackupArgumentsCommand;
import org.sklsft.generator.persistence.backup.reader.model.BackupArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.interfaces.reference.airlines.AirlineCompanyService;
import com.afklm.cargo.cgocore.api.model.reference.airlines.forms.AirlineCompanyForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class AirlineCompanyCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(AirlineCompanyCommand.class);

@Inject
private AirlineCompanyService airlineCompanyService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<AirlineCompanyForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<AirlineCompanyForm>(AirlineCompanyForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<AirlineCompanyForm>(AirlineCompanyForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute airlineCompanyService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
AirlineCompanyForm airlineCompanyForm = mapper.mapFrom(new AirlineCompanyForm(), args);

this.airlineCompanyService.save(airlineCompanyForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
