import { CountryDetailsComponent } from './details/country-details.component';
import { CountryListComponent } from './list/country-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StationListComponent } from './station/list/station-list.component';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: CountryListComponent }
,{path: ':id', component: CountryDetailsComponent }
,{path: ':id/station/list', component: StationListComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class CountryRoutingModule { }
