import { AirlineCompanyDetailsComponent } from './details/airline-company-details.component';
import { AirlineCompanyListComponent } from './list/airline-company-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: AirlineCompanyListComponent }
,{path: ':id', component: AirlineCompanyDetailsComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class AirlineCompanyRoutingModule { }
