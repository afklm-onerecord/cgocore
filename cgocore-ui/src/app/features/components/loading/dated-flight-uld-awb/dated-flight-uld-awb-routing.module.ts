import { DatedFlightUldAwbDetailsComponent } from './details/dated-flight-uld-awb-details.component';
import { DatedFlightUldAwbListComponent } from './list/dated-flight-uld-awb-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: DatedFlightUldAwbListComponent }
,{path: ':id', component: DatedFlightUldAwbDetailsComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class DatedFlightUldAwbRoutingModule { }
