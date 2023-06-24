import { ActivatedRoute } from '@angular/router';
import { AirWaybillRestClient } from 'src/app/features/services/shipments/AirWaybillRestClient';
import { AirlineCompanyRestClient } from 'src/app/features/services/reference/airlines/AirlineCompanyRestClient';
import { Component, OnInit, ViewChild } from '@angular/core';
import { DatedFlightBookingFullView } from 'src/app/features/models/bookings/views/full/DatedFlightBookingFullView';
import { DatedFlightBookingRestClient } from 'src/app/features/services/bookings/DatedFlightBookingRestClient';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NavLink } from 'src/app/core/models/nav-link';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StringUtils } from 'src/app/core/services/StringUtils';
import { UnitOfMeasureRestClient } from 'src/app/features/services/reference/commodities/UnitOfMeasureRestClient';
/**
 * auto generated details component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-dated-flight-booking-details',
templateUrl: './dated-flight-booking-details.component.html',
styleUrls: ['./dated-flight-booking-details.component.scss']
})
export class DatedFlightBookingDetailsComponent implements OnInit {

id:number;
activePath:string;
view: DatedFlightBookingFullView = new DatedFlightBookingFullView();
form: FormGroup;
datedFlightCompanyIataCodeOptions: Observable<SelectItem[]>;
bookingAirWaybillAirWaybillNumberOptions: Observable<SelectItem[]>;
grossWeightUnitOfMeasureCodeOptions: SelectItem[];
grossVolumeUnitOfMeasureCodeOptions: SelectItem[];

constructor(private service:DatedFlightBookingRestClient, private airWaybillService:AirWaybillRestClient, private unitOfMeasureService:UnitOfMeasureRestClient, private airlineCompanyService:AirlineCompanyRestClient, private route: ActivatedRoute, private formBuilder: FormBuilder, private notifications: NotificationService) {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.activePath = '/dated-flight-booking/' + this.id.toString();
}

ngOnInit(): void {
this.form = this.formBuilder.group({
datedFlightCompanyIataCode:[null, Validators.required],
datedFlightFlightNumber:[null, Validators.required],
datedFlightDepartureDate:[null, Validators.required],
bookingAirWaybillAirWaybillNumber:[null, Validators.required],
numberOfPieces:[null],
grossWeight:[null],
grossWeightUnitOfMeasureCode:[null],
grossVolume:[null],
grossVolumeUnitOfMeasureCode:[null]})
this.form.controls['datedFlightCompanyIataCode'].valueChanges.subscribe(value=>{this.searchOptionsForDatedFlightCompanyIataCode(value)});
this.form.controls['bookingAirWaybillAirWaybillNumber'].valueChanges.subscribe(value=>{this.searchOptionsForBookingAirWaybillAirWaybillNumber(value)});
this.load();
}
restoreForm(): void {
this.form.patchValue({
datedFlightCompanyIataCode: this.view.form.datedFlightCompanyIataCode,
datedFlightFlightNumber: this.view.form.datedFlightFlightNumber,
datedFlightDepartureDate: this.view.form.datedFlightDepartureDate,
bookingAirWaybillAirWaybillNumber: this.view.form.bookingAirWaybillAirWaybillNumber,
numberOfPieces: this.view.form.numberOfPieces,
grossWeight: this.view.form.grossWeight,
grossWeightUnitOfMeasureCode: this.view.form.grossWeightUnitOfMeasureCode,
grossVolume: this.view.form.grossVolume,
grossVolumeUnitOfMeasureCode: this.view.form.grossVolumeUnitOfMeasureCode
})
}

applyForm(): void {
this.view.form.datedFlightCompanyIataCode = StringUtils.emptyToNull(this.form.get('datedFlightCompanyIataCode').value);
this.view.form.datedFlightFlightNumber = StringUtils.emptyToNull(this.form.get('datedFlightFlightNumber').value);
this.view.form.datedFlightDepartureDate = StringUtils.emptyToNull(this.form.get('datedFlightDepartureDate').value);
this.view.form.bookingAirWaybillAirWaybillNumber = StringUtils.emptyToNull(this.form.get('bookingAirWaybillAirWaybillNumber').value);
this.view.form.numberOfPieces = StringUtils.emptyToNull(this.form.get('numberOfPieces').value);
this.view.form.grossWeight = StringUtils.emptyToNull(this.form.get('grossWeight').value);
this.view.form.grossWeightUnitOfMeasureCode = StringUtils.emptyToNull(this.form.get('grossWeightUnitOfMeasureCode').value);
this.view.form.grossVolume = StringUtils.emptyToNull(this.form.get('grossVolume').value);
this.view.form.grossVolumeUnitOfMeasureCode = StringUtils.emptyToNull(this.form.get('grossVolumeUnitOfMeasureCode').value);
}

load(): void {
this.service.load(this.id).subscribe((t) => {this.view=t;this.restoreForm();});
this.loadOptionsForGrossWeightUnitOfMeasureCode();
this.loadOptionsForGrossVolumeUnitOfMeasureCode();
}

searchOptionsForDatedFlightCompanyIataCode(value:string) {
if (value) {
this.datedFlightCompanyIataCodeOptions = this.airlineCompanyService.searchOptions(value);
}
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

update(): void {
this.applyForm();
this.service.update(this.id, this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.load();}, error => {this.notifications.error("Operation failed")});
}
/* Specific Code Start */
/* Specific Code End */
}
