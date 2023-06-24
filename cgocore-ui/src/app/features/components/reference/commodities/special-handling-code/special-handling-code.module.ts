import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
import { SpecialHandlingCodeDetailsComponent } from './details/special-handling-code-details.component';
import { SpecialHandlingCodeListComponent } from './list/special-handling-code-list.component';
import { SpecialHandlingCodeMenuComponent } from './menu/special-handling-code-menu.component';
import { SpecialHandlingCodeModalComponent } from './modal/special-handling-code-modal.component';
import { SpecialHandlingCodeRoutingModule } from './special-handling-code-routing.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [SpecialHandlingCodeListComponent,SpecialHandlingCodeDetailsComponent, SpecialHandlingCodeModalComponent, SpecialHandlingCodeMenuComponent],
imports: [CommonModule, SharedModule, SpecialHandlingCodeRoutingModule]
})
export class SpecialHandlingCodeModule { }
