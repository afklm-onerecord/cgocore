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

import com.afklm.cargo.cgocore.api.interfaces.reference.commodities.SpecialHandlingCodeService;
import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.SpecialHandlingCodeForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class SpecialHandlingCodeCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(SpecialHandlingCodeCommand.class);

@Inject
private SpecialHandlingCodeService specialHandlingCodeService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<SpecialHandlingCodeForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<SpecialHandlingCodeForm>(SpecialHandlingCodeForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<SpecialHandlingCodeForm>(SpecialHandlingCodeForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute specialHandlingCodeService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
SpecialHandlingCodeForm specialHandlingCodeForm = mapper.mapFrom(new SpecialHandlingCodeForm(), args);

this.specialHandlingCodeService.save(specialHandlingCodeForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
