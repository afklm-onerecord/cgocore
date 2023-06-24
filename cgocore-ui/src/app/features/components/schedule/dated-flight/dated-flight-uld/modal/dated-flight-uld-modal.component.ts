import { Component, OnInit, ViewChild } from '@angular/core';
import { DatedFlightFullView } from 'src/app/features/models/schedule/views/full/DatedFlightFullView';
import { DatedFlightRestClient } from 'src/app/features/services/schedule/DatedFlightRestClient';
import { DatedFlightUldFullView } from 'src/app/features/models/loading/views/full/DatedFlightUldFullView';
import { DatedFlightUldRestClient } from 'src/app/features/services/loading/DatedFlightUldRestClient';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StringUtils } from 'src/app/core/services/StringUtils';
import { UldTypeRestClient } from 'src/app/features/services/reference/containers/UldTypeRestClient';
import { UnitOfMeasureRestClient } from 'src/app/features/services/reference/commodities/UnitOfMeasureRestClient';
/**
 * auto generated one to many modal component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-dated-flight-uldfrom-dated-flight-modal',
templateUrl: './dated-flight-uld-modal.component.html',
styleUrls: ['./dated-flight-uld-modal.component.scss']
})
export class DatedFlightUldModalComponent implements OnInit {

parentId: number;
view: DatedFlightUldFullView;
form: FormGroup;
uldTypeCodeOptions: SelectItem[];
grossWeightUnitOfMeasureCodeOptions: SelectItem[];

constructor(private service:DatedFlightUldRestClient, private datedFlightService:DatedFlightRestClient, private uldTypeService:UldTypeRestClient, private unitOfMeasureService:UnitOfMeasureRestClient, private formBuilder: FormBuilder, private notifications: NotificationService, private dialogRef: MatDialogRef<DatedFlightUldModalComponent>) {}

ngOnInit(): void {
this.form = this.formBuilder.group({
uldTypeCode:[null, Validators.required],
uldCode:[null, Validators.required],
uldOwnerCode:[null, Validators.required],
grossWeight:[null],
grossWeightUnitOfMeasureCode:[null]});
this.loadOptionsForUldTypeCode();
this.loadOptionsForGrossWeightUnitOfMeasureCode();
this.restoreForm();
}
restoreForm(): void {
this.form.patchValue({
uldTypeCode: this.view.form.uldTypeCode,
uldCode: this.view.form.uldCode,
uldOwnerCode: this.view.form.uldOwnerCode,
grossWeight: this.view.form.grossWeight,
grossWeightUnitOfMeasureCode: this.view.form.grossWeightUnitOfMeasureCode
})
}

applyForm(): void {
this.view.form.uldTypeCode = StringUtils.emptyToNull(this.form.get('uldTypeCode').value);
this.view.form.uldCode = StringUtils.emptyToNull(this.form.get('uldCode').value);
this.view.form.uldOwnerCode = StringUtils.emptyToNull(this.form.get('uldOwnerCode').value);
this.view.form.grossWeight = StringUtils.emptyToNull(this.form.get('grossWeight').value);
this.view.form.grossWeightUnitOfMeasureCode = StringUtils.emptyToNull(this.form.get('grossWeightUnitOfMeasureCode').value);
}

loadOptionsForUldTypeCode() {
this.uldTypeService.getOptions().subscribe((t) => {this.uldTypeCodeOptions=t;});
}

loadOptionsForGrossWeightUnitOfMeasureCode() {
this.unitOfMeasureService.getOptions().subscribe((t) => {this.grossWeightUnitOfMeasureCodeOptions=t;});
}

save(): void {
this.applyForm();
let datedFlightFullView: DatedFlightFullView;
this.datedFlightService.load(this.parentId).subscribe((t) => {datedFlightFullView=t;
this.view.form.datedFlightCompanyIataCode = datedFlightFullView.form.companyIataCode;
this.view.form.datedFlightFlightNumber = datedFlightFullView.form.flightNumber;
this.view.form.datedFlightDepartureDate = datedFlightFullView.form.departureDate;
this.service.save(this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.dialogRef.close();}, error => {this.notifications.error("Operation failed")});
});
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
