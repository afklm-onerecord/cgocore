import { BookingDetailsComponent } from './details/booking-details.component';
import { BookingListComponent } from './list/booking-list.component';
import { BookingMenuComponent } from './menu/booking-menu.component';
import { BookingModalComponent } from './modal/booking-modal.component';
import { BookingRoutingModule } from './booking-routing.module';
import { CommonModule } from '@angular/common';
import { DatedFlightBookingListComponent } from './dated-flight-booking/list/dated-flight-booking-list.component';
import { DatedFlightBookingModalComponent } from './dated-flight-booking/modal/dated-flight-booking-modal.component';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [BookingListComponent,BookingDetailsComponent, BookingModalComponent, BookingMenuComponent, DatedFlightBookingListComponent, DatedFlightBookingModalComponent],
imports: [CommonModule, SharedModule, BookingRoutingModule]
})
export class BookingModule { }
