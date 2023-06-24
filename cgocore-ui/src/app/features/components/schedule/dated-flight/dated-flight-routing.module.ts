import { DatedFlightBookingListComponent } from './dated-flight-booking/list/dated-flight-booking-list.component';
import { DatedFlightDetailsComponent } from './details/dated-flight-details.component';
import { DatedFlightListComponent } from './list/dated-flight-list.component';
import { DatedFlightUldListComponent } from './dated-flight-uld/list/dated-flight-uld-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: DatedFlightListComponent }
,{path: ':id', component: DatedFlightDetailsComponent }
,{path: ':id/dated-flight-booking/list', component: DatedFlightBookingListComponent }
,{path: ':id/dated-flight-uld/list', component: DatedFlightUldListComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class DatedFlightRoutingModule { }
