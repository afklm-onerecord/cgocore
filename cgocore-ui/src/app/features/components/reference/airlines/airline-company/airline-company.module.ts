import { AirlineCompanyDetailsComponent } from './details/airline-company-details.component';
import { AirlineCompanyListComponent } from './list/airline-company-list.component';
import { AirlineCompanyMenuComponent } from './menu/airline-company-menu.component';
import { AirlineCompanyModalComponent } from './modal/airline-company-modal.component';
import { AirlineCompanyRoutingModule } from './airline-company-routing.module';
import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [AirlineCompanyListComponent,AirlineCompanyDetailsComponent, AirlineCompanyModalComponent, AirlineCompanyMenuComponent],
imports: [CommonModule, SharedModule, AirlineCompanyRoutingModule]
})
export class AirlineCompanyModule { }
