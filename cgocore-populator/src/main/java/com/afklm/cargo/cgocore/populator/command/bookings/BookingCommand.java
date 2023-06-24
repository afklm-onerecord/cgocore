package com.afklm.cargo.cgocore.populator.command.bookings;

import javax.inject.Inject;

import org.sklsft.commons.mapper.impl.ObjectArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.impl.StringArrayToBeanMapperImpl;
import org.sklsft.commons.mapper.interfaces.ObjectArrayToBeanMapper;
import org.sklsft.generator.persistence.backup.command.interfaces.BackupArgumentsCommand;
import org.sklsft.generator.persistence.backup.reader.model.BackupArguments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.afklm.cargo.cgocore.api.interfaces.bookings.BookingService;
import com.afklm.cargo.cgocore.api.model.bookings.forms.BookingForm;

/**
 * auto generated bean populator command class file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Component
public class BookingCommand implements BackupArgumentsCommand {

/*
 * logger
 */
private static final Logger logger = LoggerFactory.getLogger(BookingCommand.class);

@Inject
private BookingService bookingService;

@Override
public void execute(BackupArguments arguments) {
ObjectArrayToBeanMapper<BookingForm> mapper;
if (arguments.isArgumentsTyped()) {
mapper = new ObjectArrayToBeanMapperImpl<BookingForm>(BookingForm.class);
} else {
mapper = new StringArrayToBeanMapperImpl<BookingForm>(BookingForm.class);
}
for (Object[] args : arguments.getArguments()) {
String message = "execute bookingService.save - args : ";
for (Object arg:args) {
message += "[" + arg + "]";
}
logger.info(message);

try {
BookingForm bookingForm = mapper.mapFrom(new BookingForm(), args);

this.bookingService.save(bookingForm);
} catch (Exception e) {
logger.error(message + "failed : " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
}
}
}
}
