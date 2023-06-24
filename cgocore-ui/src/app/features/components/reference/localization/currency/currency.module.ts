import { CommonModule } from '@angular/common';
import { CurrencyDetailsComponent } from './details/currency-details.component';
import { CurrencyListComponent } from './list/currency-list.component';
import { CurrencyMenuComponent } from './menu/currency-menu.component';
import { CurrencyModalComponent } from './modal/currency-modal.component';
import { CurrencyRoutingModule } from './currency-routing.module';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [CurrencyListComponent,CurrencyDetailsComponent, CurrencyModalComponent, CurrencyMenuComponent],
imports: [CommonModule, SharedModule, CurrencyRoutingModule]
})
export class CurrencyModule { }
