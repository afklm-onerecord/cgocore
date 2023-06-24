import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
/**
 * auto generated app routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path:'currency', loadChildren:()=>import('src/app/features/components/reference/localization/currency/currency.module').then(m=>m.CurrencyModule) }
,{path:'country', loadChildren:()=>import('src/app/features/components/reference/localization/country/country.module').then(m=>m.CountryModule) }
,{path:'station', loadChildren:()=>import('src/app/features/components/reference/localization/station/station.module').then(m=>m.StationModule) }
,{path:'airline-company', loadChildren:()=>import('src/app/features/components/reference/airlines/airline-company/airline-company.module').then(m=>m.AirlineCompanyModule) }
,{path:'metric', loadChildren:()=>import('src/app/features/components/reference/commodities/metric/metric.module').then(m=>m.MetricModule) }
,{path:'unit-of-measure', loadChildren:()=>import('src/app/features/components/reference/commodities/unit-of-measure/unit-of-measure.module').then(m=>m.UnitOfMeasureModule) }
,{path:'special-handling-code', loadChildren:()=>import('src/app/features/components/reference/commodities/special-handling-code/special-handling-code.module').then(m=>m.SpecialHandlingCodeModule) }
,{path:'uld-type', loadChildren:()=>import('src/app/features/components/reference/containers/uld-type/uld-type.module').then(m=>m.UldTypeModule) }
,{path:'dated-flight', loadChildren:()=>import('src/app/features/components/schedule/dated-flight/dated-flight.module').then(m=>m.DatedFlightModule) }
,{path:'air-waybill', loadChildren:()=>import('src/app/features/components/shipments/air-waybill/air-waybill.module').then(m=>m.AirWaybillModule) }
,{path:'booking', loadChildren:()=>import('src/app/features/components/bookings/booking/booking.module').then(m=>m.BookingModule) }
,{path:'dated-flight-booking', loadChildren:()=>import('src/app/features/components/bookings/dated-flight-booking/dated-flight-booking.module').then(m=>m.DatedFlightBookingModule) }
,{path:'dated-flight-uld', loadChildren:()=>import('src/app/features/components/loading/dated-flight-uld/dated-flight-uld.module').then(m=>m.DatedFlightUldModule) }
,{path:'dated-flight-uld-awb', loadChildren:()=>import('src/app/features/components/loading/dated-flight-uld-awb/dated-flight-uld-awb.module').then(m=>m.DatedFlightUldAwbModule) }
/* Specific Code Start */

/* Specific Code End */
];

@NgModule({
imports: [RouterModule.forRoot(routes)],
exports: [RouterModule]
})
export class AppRoutingModule { }
