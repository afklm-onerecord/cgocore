import { ActivatedRoute } from '@angular/router';
import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MetricRestClient } from 'src/app/features/services/reference/commodities/MetricRestClient';
import { NavLink } from 'src/app/core/models/nav-link';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StringUtils } from 'src/app/core/services/StringUtils';
import { UnitOfMeasureFullView } from 'src/app/features/models/reference/commodities/views/full/UnitOfMeasureFullView';
import { UnitOfMeasureRestClient } from 'src/app/features/services/reference/commodities/UnitOfMeasureRestClient';
/**
 * auto generated details component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-unit-of-measure-details',
templateUrl: './unit-of-measure-details.component.html',
styleUrls: ['./unit-of-measure-details.component.scss']
})
export class UnitOfMeasureDetailsComponent implements OnInit {

id:number;
activePath:string;
view: UnitOfMeasureFullView = new UnitOfMeasureFullView();
form: FormGroup;
metricCodeOptions: SelectItem[];

constructor(private service:UnitOfMeasureRestClient, private metricService:MetricRestClient, private route: ActivatedRoute, private formBuilder: FormBuilder, private notifications: NotificationService) {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.activePath = '/unit-of-measure/' + this.id.toString();
}

ngOnInit(): void {
this.form = this.formBuilder.group({
code:[null, Validators.required],
label:[null],
metricCode:[null, Validators.required]})
this.load();
}
restoreForm(): void {
this.form.patchValue({
code: this.view.form.code,
label: this.view.form.label,
metricCode: this.view.form.metricCode
})
}

applyForm(): void {
this.view.form.code = StringUtils.emptyToNull(this.form.get('code').value);
this.view.form.label = StringUtils.emptyToNull(this.form.get('label').value);
this.view.form.metricCode = StringUtils.emptyToNull(this.form.get('metricCode').value);
}

load(): void {
this.service.load(this.id).subscribe((t) => {this.view=t;this.restoreForm();});
this.loadOptionsForMetricCode();
}

loadOptionsForMetricCode() {
this.metricService.getOptions().subscribe((t) => {this.metricCodeOptions=t;});
}

update(): void {
this.applyForm();
this.service.update(this.id, this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.load();}, error => {this.notifications.error("Operation failed")});
}
/* Specific Code Start */
/* Specific Code End */
}
