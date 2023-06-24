import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import { MetricRestClient } from 'src/app/features/services/reference/commodities/MetricRestClient';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StringUtils } from 'src/app/core/services/StringUtils';
import { UnitOfMeasureFullView } from 'src/app/features/models/reference/commodities/views/full/UnitOfMeasureFullView';
import { UnitOfMeasureRestClient } from 'src/app/features/services/reference/commodities/UnitOfMeasureRestClient';
/**
 * auto generated modal component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-unit-of-measure-modal',
templateUrl: './unit-of-measure-modal.component.html',
styleUrls: ['./unit-of-measure-modal.component.scss']
})
export class UnitOfMeasureModalComponent implements OnInit {

view: UnitOfMeasureFullView;
form: FormGroup;
metricCodeOptions: SelectItem[];

constructor(private service:UnitOfMeasureRestClient, private metricService:MetricRestClient, private formBuilder: FormBuilder, private notifications: NotificationService, private dialogRef: MatDialogRef<UnitOfMeasureModalComponent>) {}

ngOnInit(): void {
this.form = this.formBuilder.group({
code:[null, Validators.required],
label:[null],
metricCode:[null, Validators.required]});
this.loadOptionsForMetricCode();
this.restoreForm();
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

loadOptionsForMetricCode() {
this.metricService.getOptions().subscribe((t) => {this.metricCodeOptions=t;});
}

save(): void {
this.applyForm();
this.service.save(this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.dialogRef.close();}, error => {this.notifications.error("Operation failed")});
}

update(): void {
this.applyForm();
this.service.update(this.view.id, this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.dialogRef.close();}, error => {this.notifications.error("Operation failed")});
}

saveOrUpdate(): void {
if (this.view.id == null) {this.save()} else {this.update()}
}

/* Specific Code Start */
/* Specific Code End */
}
