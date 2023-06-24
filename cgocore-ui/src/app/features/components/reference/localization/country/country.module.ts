import { CommonModule } from '@angular/common';
import { CountryDetailsComponent } from './details/country-details.component';
import { CountryListComponent } from './list/country-list.component';
import { CountryMenuComponent } from './menu/country-menu.component';
import { CountryModalComponent } from './modal/country-modal.component';
import { CountryRoutingModule } from './country-routing.module';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
import { StationListComponent } from './station/list/station-list.component';
import { StationModalComponent } from './station/modal/station-modal.component';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [CountryListComponent,CountryDetailsComponent, CountryModalComponent, CountryMenuComponent, StationListComponent, StationModalComponent],
imports: [CommonModule, SharedModule, CountryRoutingModule]
})
export class CountryModule { }
