import { AirWaybillRestClient } from 'src/app/features/services/shipments/AirWaybillRestClient';
import { Component, OnInit, ViewChild } from '@angular/core';
import { DatedFlightBookingFullView } from 'src/app/features/models/bookings/views/full/DatedFlightBookingFullView';
import { DatedFlightBookingRestClient } from 'src/app/features/services/bookings/DatedFlightBookingRestClient';
import { DatedFlightFullView } from 'src/app/features/models/schedule/views/full/DatedFlightFullView';
import { DatedFlightRestClient } from 'src/app/features/services/schedule/DatedFlightRestClient';
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
selector: 'app-dated-flight-bookingfrom-dated-flight-modal',
templateUrl: './dated-flight-booking-modal.component.html',
styleUrls: ['./dated-flight-booking-modal.component.scss']
})
export class DatedFlightBookingModalComponent implements OnInit {

parentId: number;
view: DatedFlightBookingFullView;
form: FormGroup;
bookingAirWaybillAirWaybillNumberOptions: Observable<SelectItem[]>;
grossWeightUnitOfMeasureCodeOptions: SelectItem[];
grossVolumeUnitOfMeasureCodeOptions: SelectItem[];

constructor(private service:DatedFlightBookingRestClient, private datedFlightService:DatedFlightRestClient, private airWaybillService:AirWaybillRestClient, private unitOfMeasureService:UnitOfMeasureRestClient, private formBuilder: FormBuilder, private notifications: NotificationService, private dialogRef: MatDialogRef<DatedFlightBookingModalComponent>) {}

ngOnInit(): void {
this.form = this.formBuilder.group({
bookingAirWaybillAirWaybillNumber:[null, Validators.required],
numberOfPieces:[null],
grossWeight:[null],
grossWeightUnitOfMeasureCode:[null],
grossVolume:[null],
grossVolumeUnitOfMeasureCode:[null]});
this.form.controls['bookingAirWaybillAirWaybillNumber'].valueChanges.subscribe(value=>{this.searchOptionsForBookingAirWaybillAirWaybillNumber(value)});
this.loadOptionsForGrossWeightUnitOfMeasureCode();
this.loadOptionsForGrossVolumeUnitOfMeasureCode();
this.restoreForm();
}
restoreForm(): void {
this.form.patchValue({
bookingAirWaybillAirWaybillNumber: this.view.form.bookingAirWaybillAirWaybillNumber,
numberOfPieces: this.view.form.numberOfPieces,
grossWeight: this.view.form.grossWeight,
grossWeightUnitOfMeasureCode: this.view.form.grossWeightUnitOfMeasureCode,
grossVolume: this.view.form.grossVolume,
grossVolumeUnitOfMeasureCode: this.view.form.grossVolumeUnitOfMeasureCode
})
}

applyForm(): void {
this.view.form.bookingAirWaybillAirWaybillNumber = StringUtils.emptyToNull(this.form.get('bookingAirWaybillAirWaybillNumber').value);
this.view.form.numberOfPieces = StringUtils.emptyToNull(this.form.get('numberOfPieces').value);
this.view.form.grossWeight = StringUtils.emptyToNull(this.form.get('grossWeight').value);
this.view.form.grossWeightUnitOfMeasureCode = StringUtils.emptyToNull(this.form.get('grossWeightUnitOfMeasureCode').value);
this.view.form.grossVolume = StringUtils.emptyToNull(this.form.get('grossVolume').value);
this.view.form.grossVolumeUnitOfMeasureCode = StringUtils.emptyToNull(this.form.get('grossVolumeUnitOfMeasureCode').value);
}

searchOptionsForBookingAirWaybillAirWaybillNumber(value:string) {
if (value) {
this.bookingAirWaybillAirWaybillNumberOptions = this.airWaybillService.searchOptions(value);
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
