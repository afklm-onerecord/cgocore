import { DatedFlightBookingDetailsComponent } from './details/dated-flight-booking-details.component';
import { DatedFlightBookingListComponent } from './list/dated-flight-booking-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: DatedFlightBookingListComponent }
,{path: ':id', component: DatedFlightBookingDetailsComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class DatedFlightBookingRoutingModule { }
