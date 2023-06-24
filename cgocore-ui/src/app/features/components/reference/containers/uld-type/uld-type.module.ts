import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
import { UldTypeDetailsComponent } from './details/uld-type-details.component';
import { UldTypeListComponent } from './list/uld-type-list.component';
import { UldTypeMenuComponent } from './menu/uld-type-menu.component';
import { UldTypeModalComponent } from './modal/uld-type-modal.component';
import { UldTypeRoutingModule } from './uld-type-routing.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [UldTypeListComponent,UldTypeDetailsComponent, UldTypeModalComponent, UldTypeMenuComponent],
imports: [CommonModule, SharedModule, UldTypeRoutingModule]
})
export class UldTypeModule { }
