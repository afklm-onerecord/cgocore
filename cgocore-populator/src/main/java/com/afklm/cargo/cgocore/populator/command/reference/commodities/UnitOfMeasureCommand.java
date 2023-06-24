package com.afklm.cargo.cgocore.populator.command.reference.commodities;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.ObjectArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.impl.StringArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.interfaces.ObjectArrayToBeanMapper;
import org.sklsft.generator.persistence.backup.command.interfaces.BackupArgumentsCommand;
import org.sklsft.generator.persistence.backup.reader.model.BackupArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.interfaces.reference.commodities.UnitOfMeasureService;
import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.UnitOfMeasureForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class UnitOfMeasureCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(UnitOfMeasureCommand.class);

@Inject
private UnitOfMeasureService unitOfMeasureService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<UnitOfMeasureForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<UnitOfMeasureForm>(UnitOfMeasureForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<UnitOfMeasureForm>(UnitOfMeasureForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute unitOfMeasureService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
UnitOfMeasureForm unitOfMeasureForm = mapper.mapFrom(new UnitOfMeasureForm(), args);

this.unitOfMeasureService.save(unitOfMeasureForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
