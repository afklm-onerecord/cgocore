import { CommonModule } from '@angular/common';
import { MetricDetailsComponent } from './details/metric-details.component';
import { MetricListComponent } from './list/metric-list.component';
import { MetricMenuComponent } from './menu/metric-menu.component';
import { MetricModalComponent } from './modal/metric-modal.component';
import { MetricRoutingModule } from './metric-routing.module';
import { NgModule } from '@angular/core';
import { SharedModule } from 'src/app/shared/shared.module';
/**
 * auto generated list module ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@NgModule({
declarations: [MetricListComponent,MetricDetailsComponent, MetricModalComponent, MetricMenuComponent],
imports: [CommonModule, SharedModule, MetricRoutingModule]
})
export class MetricModule { }
