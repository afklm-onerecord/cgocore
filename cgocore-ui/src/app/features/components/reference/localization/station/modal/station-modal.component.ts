import { Component, OnInit, ViewChild } from '@angular/core';
import { CountryRestClient } from 'src/app/features/services/reference/localization/CountryRestClient';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StationFullView } from 'src/app/features/models/reference/localization/views/full/StationFullView';
import { StationRestClient } from 'src/app/features/services/reference/localization/StationRestClient';
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated modal component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-station-modal',
templateUrl: './station-modal.component.html',
styleUrls: ['./station-modal.component.scss']
})
export class StationModalComponent implements OnInit {

view: StationFullView;
form: FormGroup;
countryIataCodeOptions: Observable<SelectItem[]>;

constructor(private service:StationRestClient, private countryService:CountryRestClient, private formBuilder: FormBuilder, private notifications: NotificationService, private dialogRef: MatDialogRef<StationModalComponent>) {}

ngOnInit(): void {
this.form = this.formBuilder.group({
iataCode:[null, Validators.required],
label:[null, Validators.required],
countryIataCode:[null]});
this.form.controls['countryIataCode'].valueChanges.subscribe(value=>{this.searchOptionsForCountryIataCode(value)});
this.restoreForm();
}
restoreForm(): void {
this.form.patchValue({
iataCode: this.view.form.iataCode,
label: this.view.form.label,
countryIataCode: this.view.form.countryIataCode
})
}

applyForm(): void {
this.view.form.iataCode = StringUtils.emptyToNull(this.form.get('iataCode').value);
this.view.form.label = StringUtils.emptyToNull(this.form.get('label').value);
this.view.form.countryIataCode = StringUtils.emptyToNull(this.form.get('countryIataCode').value);
}

searchOptionsForCountryIataCode(value:string) {
if (value) {
this.countryIataCodeOptions = this.countryService.searchOptions(value);
}
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
