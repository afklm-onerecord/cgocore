import { BookingDetailsComponent } from './details/booking-details.component';
import { BookingListComponent } from './list/booking-list.component';
import { DatedFlightBookingListComponent } from './dated-flight-booking/list/dated-flight-booking-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: BookingListComponent }
,{path: ':id', component: BookingDetailsComponent }
,{path: ':id/dated-flight-booking/list', component: DatedFlightBookingListComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class BookingRoutingModule { }
