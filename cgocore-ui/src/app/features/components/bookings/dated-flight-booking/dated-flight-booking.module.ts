import { CommonModule } from '@angular/common';
import { DatedFlightBookingDetailsComponent } from './details/dated-flight-booking-details.component';
import { DatedFlightBookingListComponent } from './list/dated-flight-booking-list.component';
import { DatedFlightBookingMenuComponent } from './menu/dated-flight-booking-menu.component';
import { DatedFlightBookingModalComponent } from './modal/dated-flight-booking-modal.component';
import { DatedFlightBookingRoutingModule } from './dated-flight-booking-routing.module';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [DatedFlightBookingListComponent,DatedFlightBookingDetailsComponent, DatedFlightBookingModalComponent, DatedFlightBookingMenuComponent],
imports: [CommonModule, SharedModule, DatedFlightBookingRoutingModule]
})
export class DatedFlightBookingModule { }
