import { AirWaybillRestClient } from 'src/app/features/services/shipments/AirWaybillRestClient';
import { Component, OnInit, ViewChild } from '@angular/core';
import { DatedFlightUldAwbFullView } from 'src/app/features/models/loading/views/full/DatedFlightUldAwbFullView';
import { DatedFlightUldAwbRestClient } from 'src/app/features/services/loading/DatedFlightUldAwbRestClient';
import { DatedFlightUldFullView } from 'src/app/features/models/loading/views/full/DatedFlightUldFullView';
import { DatedFlightUldRestClient } from 'src/app/features/services/loading/DatedFlightUldRestClient';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StringUtils } from 'src/app/core/services/StringUtils';
import { UnitOfMeasureRestClient } from 'src/app/features/services/reference/commodities/UnitOfMeasureRestClient';
/**
 * auto generated one to many modal component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-dated-flight-uld-awbfrom-dated-flight-uld-modal',
templateUrl: './dated-flight-uld-awb-modal.component.html',
styleUrls: ['./dated-flight-uld-awb-modal.component.scss']
})
export class DatedFlightUldAwbModalComponent implements OnInit {

parentId: number;
view: DatedFlightUldAwbFullView;
form: FormGroup;
airWaybillAirWaybillNumberOptions: Observable<SelectItem[]>;
grossWeightUnitOfMeasureCodeOptions: SelectItem[];
grossVolumeUnitOfMeasureCodeOptions: SelectItem[];

constructor(private service:DatedFlightUldAwbRestClient, private datedFlightUldService:DatedFlightUldRestClient, private airWaybillService:AirWaybillRestClient, private unitOfMeasureService:UnitOfMeasureRestClient, private formBuilder: FormBuilder, private notifications: NotificationService, private dialogRef: MatDialogRef<DatedFlightUldAwbModalComponent>) {}

ngOnInit(): void {
this.form = this.formBuilder.group({
airWaybillAirWaybillNumber:[null, Validators.required],
numberOfPieces:[null],
grossWeight:[null],
grossWeightUnitOfMeasureCode:[null],
grossVolume:[null],
grossVolumeUnitOfMeasureCode:[null]});
this.form.controls['airWaybillAirWaybillNumber'].valueChanges.subscribe(value=>{this.searchOptionsForAirWaybillAirWaybillNumber(value)});
this.loadOptionsForGrossWeightUnitOfMeasureCode();
this.loadOptionsForGrossVolumeUnitOfMeasureCode();
this.restoreForm();
}
restoreForm(): void {
this.form.patchValue({
airWaybillAirWaybillNumber: this.view.form.airWaybillAirWaybillNumber,
numberOfPieces: this.view.form.numberOfPieces,
grossWeight: this.view.form.grossWeight,
grossWeightUnitOfMeasureCode: this.view.form.grossWeightUnitOfMeasureCode,
grossVolume: this.view.form.grossVolume,
grossVolumeUnitOfMeasureCode: this.view.form.grossVolumeUnitOfMeasureCode
})
}

applyForm(): void {
this.view.form.airWaybillAirWaybillNumber = StringUtils.emptyToNull(this.form.get('airWaybillAirWaybillNumber').value);
this.view.form.numberOfPieces = StringUtils.emptyToNull(this.form.get('numberOfPieces').value);
this.view.form.grossWeight = StringUtils.emptyToNull(this.form.get('grossWeight').value);
this.view.form.grossWeightUnitOfMeasureCode = StringUtils.emptyToNull(this.form.get('grossWeightUnitOfMeasureCode').value);
this.view.form.grossVolume = StringUtils.emptyToNull(this.form.get('grossVolume').value);
this.view.form.grossVolumeUnitOfMeasureCode = StringUtils.emptyToNull(this.form.get('grossVolumeUnitOfMeasureCode').value);
}

searchOptionsForAirWaybillAirWaybillNumber(value:string) {
if (value) {
this.airWaybillAirWaybillNumberOptions = this.airWaybillService.searchOptions(value);
}
}

loadOptionsForGrossWeightUnitOfMeasureCode() {
this.unitOfMeasureService.getOptions().subscribe((t) => {this.grossWeightUnitOfMeasureCodeOptions=t;});
}

loadOptionsForGrossVolumeUnitOfMeasureCode() {
this.unitOfMeasureService.getOptions().subscribe((t) => {this.grossVolumeUnitOfMeasureCodeOptions=t;});
}

save(): void {
this.applyForm();
let datedFlightUldFullView: DatedFlightUldFullView;
this.datedFlightUldService.load(this.parentId).subscribe((t) => {datedFlightUldFullView=t;
this.view.form.datedFlightUldDatedFlightCompanyIataCode = datedFlightUldFullView.form.datedFlightCompanyIataCode;
this.view.form.datedFlightUldDatedFlightFlightNumber = datedFlightUldFullView.form.datedFlightFlightNumber;
this.view.form.datedFlightUldDatedFlightDepartureDate = datedFlightUldFullView.form.datedFlightDepartureDate;
this.view.form.datedFlightUldUldTypeCode = datedFlightUldFullView.form.uldTypeCode;
this.view.form.datedFlightUldUldCode = datedFlightUldFullView.form.uldCode;
this.view.form.datedFlightUldUldOwnerCode = datedFlightUldFullView.form.uldOwnerCode;
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
