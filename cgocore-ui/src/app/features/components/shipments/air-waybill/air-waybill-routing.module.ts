import { AirWaybillDetailsComponent } from './details/air-waybill-details.component';
import { AirWaybillListComponent } from './list/air-waybill-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: AirWaybillListComponent }
,{path: ':id', component: AirWaybillDetailsComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class AirWaybillRoutingModule { }
