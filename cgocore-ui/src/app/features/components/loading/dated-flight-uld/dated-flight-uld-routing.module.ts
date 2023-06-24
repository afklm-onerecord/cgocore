import { DatedFlightUldAwbListComponent } from './dated-flight-uld-awb/list/dated-flight-uld-awb-list.component';
import { DatedFlightUldDetailsComponent } from './details/dated-flight-uld-details.component';
import { DatedFlightUldListComponent } from './list/dated-flight-uld-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: DatedFlightUldListComponent }
,{path: ':id', component: DatedFlightUldDetailsComponent }
,{path: ':id/dated-flight-uld-awb/list', component: DatedFlightUldAwbListComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class DatedFlightUldRoutingModule { }
