import { MetricDetailsComponent } from './details/metric-details.component';
import { MetricListComponent } from './list/metric-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: MetricListComponent }
,{path: ':id', component: MetricDetailsComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class MetricRoutingModule { }
