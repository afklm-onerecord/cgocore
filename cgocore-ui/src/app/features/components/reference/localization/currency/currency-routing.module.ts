import { CurrencyDetailsComponent } from './details/currency-details.component';
import { CurrencyListComponent } from './list/currency-list.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: CurrencyListComponent }
,{path: ':id', component: CurrencyDetailsComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class CurrencyRoutingModule { }
