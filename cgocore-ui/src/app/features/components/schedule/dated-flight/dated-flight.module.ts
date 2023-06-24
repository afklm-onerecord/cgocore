import { CommonModule } from '@angular/common';
import { DatedFlightBookingListComponent } from './dated-flight-booking/list/dated-flight-booking-list.component';
import { DatedFlightBookingModalComponent } from './dated-flight-booking/modal/dated-flight-booking-modal.component';
import { DatedFlightDetailsComponent } from './details/dated-flight-details.component';
import { DatedFlightListComponent } from './list/dated-flight-list.component';
import { DatedFlightMenuComponent } from './menu/dated-flight-menu.component';
import { DatedFlightModalComponent } from './modal/dated-flight-modal.component';
import { DatedFlightRoutingModule } from './dated-flight-routing.module';
import { DatedFlightUldListComponent } from './dated-flight-uld/list/dated-flight-uld-list.component';
import { DatedFlightUldModalComponent } from './dated-flight-uld/modal/dated-flight-uld-modal.component';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [DatedFlightListComponent,DatedFlightDetailsComponent, DatedFlightModalComponent, DatedFlightMenuComponent, DatedFlightBookingListComponent, DatedFlightBookingModalComponent, DatedFlightUldListComponent, DatedFlightUldModalComponent],
imports: [CommonModule, SharedModule, DatedFlightRoutingModule]
})
export class DatedFlightModule { }
