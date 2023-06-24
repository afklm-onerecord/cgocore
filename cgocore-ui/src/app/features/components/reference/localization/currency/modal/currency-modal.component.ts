import { Component, OnInit, ViewChild } from '@angular/core';
import { CurrencyFullView } from 'src/app/features/models/reference/localization/views/full/CurrencyFullView';
import { CurrencyRestClient } from 'src/app/features/services/reference/localization/CurrencyRestClient';
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
selector: 'app-currency-modal',
templateUrl: './currency-modal.component.html',
styleUrls: ['./currency-modal.component.scss']
})
export class CurrencyModalComponent implements OnInit {

view: CurrencyFullView;
form: FormGroup;

constructor(private service:CurrencyRestClient, private formBuilder: FormBuilder, private notifications: NotificationService, private dialogRef: MatDialogRef<CurrencyModalComponent>) {}

ngOnInit(): void {
this.form = this.formBuilder.group({
isoCode:[null, Validators.required],
label:[null, Validators.required]});
this.restoreForm();
}
restoreForm(): void {
this.form.patchValue({
isoCode: this.view.form.isoCode,
label: this.view.form.label
})
}

applyForm(): void {
this.view.form.isoCode = StringUtils.emptyToNull(this.form.get('isoCode').value);
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
