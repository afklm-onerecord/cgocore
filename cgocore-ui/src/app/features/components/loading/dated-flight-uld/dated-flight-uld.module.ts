import { CommonModule } from '@angular/common';
import { DatedFlightUldAwbListComponent } from './dated-flight-uld-awb/list/dated-flight-uld-awb-list.component';
import { DatedFlightUldAwbModalComponent } from './dated-flight-uld-awb/modal/dated-flight-uld-awb-modal.component';
import { DatedFlightUldDetailsComponent } from './details/dated-flight-uld-details.component';
import { DatedFlightUldListComponent } from './list/dated-flight-uld-list.component';
import { DatedFlightUldMenuComponent } from './menu/dated-flight-uld-menu.component';
import { DatedFlightUldModalComponent } from './modal/dated-flight-uld-modal.component';
import { DatedFlightUldRoutingModule } from './dated-flight-uld-routing.module';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [DatedFlightUldListComponent,DatedFlightUldDetailsComponent, DatedFlightUldModalComponent, DatedFlightUldMenuComponent, DatedFlightUldAwbListComponent, DatedFlightUldAwbModalComponent],
imports: [CommonModule, SharedModule, DatedFlightUldRoutingModule]
})
export class DatedFlightUldModule { }
