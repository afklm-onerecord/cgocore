import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SpecialHandlingCodeDetailsComponent } from './details/special-handling-code-details.component';
import { SpecialHandlingCodeListComponent } from './list/special-handling-code-list.component';
/**
 * auto generated list routing module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

const routes: Routes = [
{path: 'list', component: SpecialHandlingCodeListComponent }
,{path: ':id', component: SpecialHandlingCodeDetailsComponent }
];

@NgModule({
imports: [RouterModule.forChild(routes)],
exports: [RouterModule]
})
export class SpecialHandlingCodeRoutingModule { }
