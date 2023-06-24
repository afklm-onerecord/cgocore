import { AirlineCompanyFullView } from 'src/app/features/models/reference/airlines/views/full/AirlineCompanyFullView';
import { AirlineCompanyRestClient } from 'src/app/features/services/reference/airlines/AirlineCompanyRestClient';
import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated modal component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-airline-company-modal',
templateUrl: './airline-company-modal.component.html',
styleUrls: ['./airline-company-modal.component.scss']
})
export class AirlineCompanyModalComponent implements OnInit {

view: AirlineCompanyFullView;
form: FormGroup;

constructor(private service:AirlineCompanyRestClient, private formBuilder: FormBuilder, private notifications: NotificationService, private dialogRef: MatDialogRef<AirlineCompanyModalComponent>) {}

ngOnInit(): void {
this.form = this.formBuilder.group({
iataCode:[null, Validators.required],
label:[null],
prefix:[null]});
this.restoreForm();
}
restoreForm(): void {
this.form.patchValue({
iataCode: this.view.form.iataCode,
label: this.view.form.label,
prefix: this.view.form.prefix
})
}

applyForm(): void {
this.view.form.iataCode = StringUtils.emptyToNull(this.form.get('iataCode').value);
this.view.form.label = StringUtils.emptyToNull(this.form.get('label').value);
this.view.form.prefix = StringUtils.emptyToNull(this.form.get('prefix').value);
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
