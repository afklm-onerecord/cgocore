import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StationDetailsComponent } from './details/station-details.component';
import { StationListComponent } from './list/station-list.component';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: StationListComponent }
,{path: ':id', component: StationDetailsComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class StationRoutingModule { }
