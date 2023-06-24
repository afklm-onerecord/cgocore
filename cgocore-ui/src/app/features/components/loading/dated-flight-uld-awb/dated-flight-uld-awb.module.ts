import { CommonModule } from '@angular/common';
import { DatedFlightUldAwbDetailsComponent } from './details/dated-flight-uld-awb-details.component';
import { DatedFlightUldAwbListComponent } from './list/dated-flight-uld-awb-list.component';
import { DatedFlightUldAwbMenuComponent } from './menu/dated-flight-uld-awb-menu.component';
import { DatedFlightUldAwbModalComponent } from './modal/dated-flight-uld-awb-modal.component';
import { DatedFlightUldAwbRoutingModule } from './dated-flight-uld-awb-routing.module';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [DatedFlightUldAwbListComponent,DatedFlightUldAwbDetailsComponent, DatedFlightUldAwbModalComponent, DatedFlightUldAwbMenuComponent],
imports: [CommonModule, SharedModule, DatedFlightUldAwbRoutingModule]
})
export class DatedFlightUldAwbModule { }
