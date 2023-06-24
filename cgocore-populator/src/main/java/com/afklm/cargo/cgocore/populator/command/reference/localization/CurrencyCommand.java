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

import com.afklm.cargo.cgocore.api.interfaces.reference.localization.CurrencyService;
import com.afklm.cargo.cgocore.api.model.reference.localization.forms.CurrencyForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class CurrencyCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(CurrencyCommand.class);

@Inject
private CurrencyService currencyService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<CurrencyForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<CurrencyForm>(CurrencyForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<CurrencyForm>(CurrencyForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute currencyService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
CurrencyForm currencyForm = mapper.mapFrom(new CurrencyForm(), args);

this.currencyService.save(currencyForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
