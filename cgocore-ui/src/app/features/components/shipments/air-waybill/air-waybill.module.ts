import { AirWaybillDetailsComponent } from './details/air-waybill-details.component';
import { AirWaybillListComponent } from './list/air-waybill-list.component';
import { AirWaybillMenuComponent } from './menu/air-waybill-menu.component';
import { AirWaybillModalComponent } from './modal/air-waybill-modal.component';
import { AirWaybillRoutingModule } from './air-waybill-routing.module';
import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [AirWaybillListComponent,AirWaybillDetailsComponent, AirWaybillModalComponent, AirWaybillMenuComponent],
imports: [CommonModule, SharedModule, AirWaybillRoutingModule]
})
export class AirWaybillModule { }
