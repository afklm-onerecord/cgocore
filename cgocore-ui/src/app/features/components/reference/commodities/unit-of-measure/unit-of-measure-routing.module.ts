import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UnitOfMeasureDetailsComponent } from './details/unit-of-measure-details.component';
import { UnitOfMeasureListComponent } from './list/unit-of-measure-list.component';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: UnitOfMeasureListComponent }
,{path: ':id', component: UnitOfMeasureDetailsComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class UnitOfMeasureRoutingModule { }
