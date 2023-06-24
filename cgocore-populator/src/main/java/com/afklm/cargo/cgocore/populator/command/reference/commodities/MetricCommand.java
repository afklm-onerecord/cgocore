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

import com.afklm.cargo.cgocore.api.interfaces.reference.commodities.MetricService;
import com.afklm.cargo.cgocore.api.model.reference.commodities.forms.MetricForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class MetricCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(MetricCommand.class);

@Inject
private MetricService metricService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<MetricForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<MetricForm>(MetricForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<MetricForm>(MetricForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute metricService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
MetricForm metricForm = mapper.mapFrom(new MetricForm(), args);

this.metricService.save(metricForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
