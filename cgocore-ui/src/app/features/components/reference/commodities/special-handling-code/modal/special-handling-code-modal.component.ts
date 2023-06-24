import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { SpecialHandlingCodeFullView } from 'src/app/features/models/reference/commodities/views/full/SpecialHandlingCodeFullView';
import { SpecialHandlingCodeRestClient } from 'src/app/features/services/reference/commodities/SpecialHandlingCodeRestClient';
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated modal component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-special-handling-code-modal',
templateUrl: './special-handling-code-modal.component.html',
styleUrls: ['./special-handling-code-modal.component.scss']
})
export class SpecialHandlingCodeModalComponent implements OnInit {

view: SpecialHandlingCodeFullView;
form: FormGroup;

constructor(private service:SpecialHandlingCodeRestClient, private formBuilder: FormBuilder, private notifications: NotificationService, private dialogRef: MatDialogRef<SpecialHandlingCodeModalComponent>) {}

ngOnInit(): void {
this.form = this.formBuilder.group({
code:[null, Validators.required],
label:[null]});
this.restoreForm();
}
restoreForm(): void {
this.form.patchValue({
code: this.view.form.code,
label: this.view.form.label
})
}

applyForm(): void {
this.view.form.code = StringUtils.emptyToNull(this.form.get('code').value);
this.view.form.label = StringUtils.emptyToNull(this.form.get('label').value);
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
