import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
import { StationDetailsComponent } from './details/station-details.component';
import { StationListComponent } from './list/station-list.component';
import { StationMenuComponent } from './menu/station-menu.component';
import { StationModalComponent } from './modal/station-modal.component';
import { StationRoutingModule } from './station-routing.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [StationListComponent,StationDetailsComponent, StationModalComponent, StationMenuComponent],
imports: [CommonModule, SharedModule, StationRoutingModule]
})
export class StationModule { }
