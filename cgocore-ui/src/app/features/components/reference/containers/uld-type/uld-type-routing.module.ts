import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UldTypeDetailsComponent } from './details/uld-type-details.component';
import { UldTypeListComponent } from './list/uld-type-list.component';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: UldTypeListComponent }
,{path: ':id', component: UldTypeDetailsComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class UldTypeRoutingModule { }
