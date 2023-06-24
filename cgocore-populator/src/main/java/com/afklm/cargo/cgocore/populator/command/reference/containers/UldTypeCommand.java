package com.afklm.cargo.cgocore.populator.command.reference.containers;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.ObjectArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.impl.StringArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.interfaces.ObjectArrayToBeanMapper;
import org.sklsft.generator.persistence.backup.command.interfaces.BackupArgumentsCommand;
import org.sklsft.generator.persistence.backup.reader.model.BackupArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.interfaces.reference.containers.UldTypeService;
import com.afklm.cargo.cgocore.api.model.reference.containers.forms.UldTypeForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class UldTypeCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(UldTypeCommand.class);

@Inject
private UldTypeService uldTypeService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<UldTypeForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<UldTypeForm>(UldTypeForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<UldTypeForm>(UldTypeForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute uldTypeService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
UldTypeForm uldTypeForm = mapper.mapFrom(new UldTypeForm(), args);

this.uldTypeService.save(uldTypeForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
