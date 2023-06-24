import { AirWaybillRestClient } from 'src/app/features/services/shipments/AirWaybillRestClient';
import { BookingFullView } from 'src/app/features/models/bookings/views/full/BookingFullView';
import { BookingRestClient } from 'src/app/features/services/bookings/BookingRestClient';
import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StationRestClient } from 'src/app/features/services/reference/localization/StationRestClient';
import { StringUtils } from 'src/app/core/services/StringUtils';
import { UnitOfMeasureRestClient } from 'src/app/features/services/reference/commodities/UnitOfMeasureRestClient';
/**
 * auto generated modal component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-booking-modal',
templateUrl: './booking-modal.component.html',
styleUrls: ['./booking-modal.component.scss']
})
export class BookingModalComponent implements OnInit {

view: BookingFullView;
form: FormGroup;
airWaybillAirWaybillNumberOptions: Observable<SelectItem[]>;
originIataCodeOptions: Observable<SelectItem[]>;
destinationIataCodeOptions: Observable<SelectItem[]>;
grossWeightUnitOfMeasureCodeOptions: SelectItem[];
grossVolumeUnitOfMeasureCodeOptions: SelectItem[];

constructor(private service:BookingRestClient, private stationService:StationRestClient, private airWaybillService:AirWaybillRestClient, private unitOfMeasureService:UnitOfMeasureRestClient, private formBuilder: FormBuilder, private notifications: NotificationService, private dialogRef: MatDialogRef<BookingModalComponent>) {}

ngOnInit(): void {
this.form = this.formBuilder.group({
airWaybillAirWaybillNumber:[null, Validators.required],
originIataCode:[null],
destinationIataCode:[null],
numberOfPieces:[null],
grossWeight:[null],
grossWeightUnitOfMeasureCode:[null],
grossVolume:[null],
grossVolumeUnitOfMeasureCode:[null]});
this.form.controls['airWaybillAirWaybillNumber'].valueChanges.subscribe(value=>{this.searchOptionsForAirWaybillAirWaybillNumber(value)});
this.form.controls['originIataCode'].valueChanges.subscribe(value=>{this.searchOptionsForOriginIataCode(value)});
this.form.controls['destinationIataCode'].valueChanges.subscribe(value=>{this.searchOptionsForDestinationIataCode(value)});
this.loadOptionsForGrossWeightUnitOfMeasureCode();
this.loadOptionsForGrossVolumeUnitOfMeasureCode();
this.restoreForm();
}
restoreForm(): void {
this.form.patchValue({
airWaybillAirWaybillNumber: this.view.form.airWaybillAirWaybillNumber,
originIataCode: this.view.form.originIataCode,
destinationIataCode: this.view.form.destinationIataCode,
numberOfPieces: this.view.form.numberOfPieces,
grossWeight: this.view.form.grossWeight,
grossWeightUnitOfMeasureCode: this.view.form.grossWeightUnitOfMeasureCode,
grossVolume: this.view.form.grossVolume,
grossVolumeUnitOfMeasureCode: this.view.form.grossVolumeUnitOfMeasureCode
})
}

applyForm(): void {
this.view.form.airWaybillAirWaybillNumber = StringUtils.emptyToNull(this.form.get('airWaybillAirWaybillNumber').value);
this.view.form.originIataCode = StringUtils.emptyToNull(this.form.get('originIataCode').value);
this.view.form.destinationIataCode = StringUtils.emptyToNull(this.form.get('destinationIataCode').value);
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

searchOptionsForOriginIataCode(value:string) {
if (value) {
this.originIataCodeOptions = this.stationService.searchOptions(value);
}
}

searchOptionsForDestinationIataCode(value:string) {
if (value) {
this.destinationIataCodeOptions = this.stationService.searchOptions(value);
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
