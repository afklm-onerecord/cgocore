import { AirWaybillRestClient } from 'src/app/features/services/shipments/AirWaybillRestClient';
import { AirlineCompanyRestClient } from 'src/app/features/services/reference/airlines/AirlineCompanyRestClient';
import { Component, OnInit, ViewChild } from '@angular/core';
import { DatedFlightUldAwbFullView } from 'src/app/features/models/loading/views/full/DatedFlightUldAwbFullView';
import { DatedFlightUldAwbRestClient } from 'src/app/features/services/loading/DatedFlightUldAwbRestClient';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StringUtils } from 'src/app/core/services/StringUtils';
import { UldTypeRestClient } from 'src/app/features/services/reference/containers/UldTypeRestClient';
import { UnitOfMeasureRestClient } from 'src/app/features/services/reference/commodities/UnitOfMeasureRestClient';
/**
 * auto generated modal component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-dated-flight-uld-awb-modal',
templateUrl: './dated-flight-uld-awb-modal.component.html',
styleUrls: ['./dated-flight-uld-awb-modal.component.scss']
})
export class DatedFlightUldAwbModalComponent implements OnInit {

view: DatedFlightUldAwbFullView;
form: FormGroup;
datedFlightUldDatedFlightCompanyIataCodeOptions: Observable<SelectItem[]>;
datedFlightUldUldTypeCodeOptions: SelectItem[];
airWaybillAirWaybillNumberOptions: Observable<SelectItem[]>;
grossWeightUnitOfMeasureCodeOptions: SelectItem[];
grossVolumeUnitOfMeasureCodeOptions: SelectItem[];

constructor(private service:DatedFlightUldAwbRestClient, private uldTypeService:UldTypeRestClient, private airWaybillService:AirWaybillRestClient, private unitOfMeasureService:UnitOfMeasureRestClient, private airlineCompanyService:AirlineCompanyRestClient, private formBuilder: FormBuilder, private notifications: NotificationService, private dialogRef: MatDialogRef<DatedFlightUldAwbModalComponent>) {}

ngOnInit(): void {
this.form = this.formBuilder.group({
datedFlightUldDatedFlightCompanyIataCode:[null, Validators.required],
datedFlightUldDatedFlightFlightNumber:[null, Validators.required],
datedFlightUldDatedFlightDepartureDate:[null, Validators.required],
datedFlightUldUldTypeCode:[null, Validators.required],
datedFlightUldUldCode:[null, Validators.required],
datedFlightUldUldOwnerCode:[null, Validators.required],
airWaybillAirWaybillNumber:[null, Validators.required],
numberOfPieces:[null],
grossWeight:[null],
grossWeightUnitOfMeasureCode:[null],
grossVolume:[null],
grossVolumeUnitOfMeasureCode:[null]});
this.form.controls['datedFlightUldDatedFlightCompanyIataCode'].valueChanges.subscribe(value=>{this.searchOptionsForDatedFlightUldDatedFlightCompanyIataCode(value)});
this.loadOptionsForDatedFlightUldUldTypeCode();
this.form.controls['airWaybillAirWaybillNumber'].valueChanges.subscribe(value=>{this.searchOptionsForAirWaybillAirWaybillNumber(value)});
this.loadOptionsForGrossWeightUnitOfMeasureCode();
this.loadOptionsForGrossVolumeUnitOfMeasureCode();
this.restoreForm();
}
restoreForm(): void {
this.form.patchValue({
datedFlightUldDatedFlightCompanyIataCode: this.view.form.datedFlightUldDatedFlightCompanyIataCode,
datedFlightUldDatedFlightFlightNumber: this.view.form.datedFlightUldDatedFlightFlightNumber,
datedFlightUldDatedFlightDepartureDate: this.view.form.datedFlightUldDatedFlightDepartureDate,
datedFlightUldUldTypeCode: this.view.form.datedFlightUldUldTypeCode,
datedFlightUldUldCode: this.view.form.datedFlightUldUldCode,
datedFlightUldUldOwnerCode: this.view.form.datedFlightUldUldOwnerCode,
airWaybillAirWaybillNumber: this.view.form.airWaybillAirWaybillNumber,
numberOfPieces: this.view.form.numberOfPieces,
grossWeight: this.view.form.grossWeight,
grossWeightUnitOfMeasureCode: this.view.form.grossWeightUnitOfMeasureCode,
grossVolume: this.view.form.grossVolume,
grossVolumeUnitOfMeasureCode: this.view.form.grossVolumeUnitOfMeasureCode
})
}

applyForm(): void {
this.view.form.datedFlightUldDatedFlightCompanyIataCode = StringUtils.emptyToNull(this.form.get('datedFlightUldDatedFlightCompanyIataCode').value);
this.view.form.datedFlightUldDatedFlightFlightNumber = StringUtils.emptyToNull(this.form.get('datedFlightUldDatedFlightFlightNumber').value);
this.view.form.datedFlightUldDatedFlightDepartureDate = StringUtils.emptyToNull(this.form.get('datedFlightUldDatedFlightDepartureDate').value);
this.view.form.datedFlightUldUldTypeCode = StringUtils.emptyToNull(this.form.get('datedFlightUldUldTypeCode').value);
this.view.form.datedFlightUldUldCode = StringUtils.emptyToNull(this.form.get('datedFlightUldUldCode').value);
this.view.form.datedFlightUldUldOwnerCode = StringUtils.emptyToNull(this.form.get('datedFlightUldUldOwnerCode').value);
this.view.form.airWaybillAirWaybillNumber = StringUtils.emptyToNull(this.form.get('airWaybillAirWaybillNumber').value);
this.view.form.numberOfPieces = StringUtils.emptyToNull(this.form.get('numberOfPieces').value);
this.view.form.grossWeight = StringUtils.emptyToNull(this.form.get('grossWeight').value);
this.view.form.grossWeightUnitOfMeasureCode = StringUtils.emptyToNull(this.form.get('grossWeightUnitOfMeasureCode').value);
this.view.form.grossVolume = StringUtils.emptyToNull(this.form.get('grossVolume').value);
this.view.form.grossVolumeUnitOfMeasureCode = StringUtils.emptyToNull(this.form.get('grossVolumeUnitOfMeasureCode').value);
}

searchOptionsForDatedFlightUldDatedFlightCompanyIataCode(value:string) {
if (value) {
this.datedFlightUldDatedFlightCompanyIataCodeOptions = this.airlineCompanyService.searchOptions(value);
}
}

loadOptionsForDatedFlightUldUldTypeCode() {
this.uldTypeService.getOptions().subscribe((t) => {this.datedFlightUldUldTypeCodeOptions=t;});
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
