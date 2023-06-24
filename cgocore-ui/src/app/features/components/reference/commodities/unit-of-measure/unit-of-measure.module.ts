import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
import { UnitOfMeasureDetailsComponent } from './details/unit-of-measure-details.component';
import { UnitOfMeasureListComponent } from './list/unit-of-measure-list.component';
import { UnitOfMeasureMenuComponent } from './menu/unit-of-measure-menu.component';
import { UnitOfMeasureModalComponent } from './modal/unit-of-measure-modal.component';
import { UnitOfMeasureRoutingModule } from './unit-of-measure-routing.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [UnitOfMeasureListComponent,UnitOfMeasureDetailsComponent, UnitOfMeasureModalComponent, UnitOfMeasureMenuComponent],
imports: [CommonModule, SharedModule, UnitOfMeasureRoutingModule]
})
export class UnitOfMeasureModule { }
