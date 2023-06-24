import { ActivatedRoute } from '@angular/router';
import { AirlineCompanyRestClient } from 'src/app/features/services/reference/airlines/AirlineCompanyRestClient';
import { Component, OnInit, ViewChild } from '@angular/core';
import { DatedFlightFullView } from 'src/app/features/models/schedule/views/full/DatedFlightFullView';
import { DatedFlightRestClient } from 'src/app/features/services/schedule/DatedFlightRestClient';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NavLink } from 'src/app/core/models/nav-link';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StationRestClient } from 'src/app/features/services/reference/localization/StationRestClient';
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated details component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-dated-flight-details',
templateUrl: './dated-flight-details.component.html',
styleUrls: ['./dated-flight-details.component.scss']
})
export class DatedFlightDetailsComponent implements OnInit {

id:number;
activePath:string;
view: DatedFlightFullView = new DatedFlightFullView();
form: FormGroup;
companyIataCodeOptions: Observable<SelectItem[]>;
originIataCodeOptions: Observable<SelectItem[]>;
destinationIataCodeOptions: Observable<SelectItem[]>;

constructor(private service:DatedFlightRestClient, private stationService:StationRestClient, private airlineCompanyService:AirlineCompanyRestClient, private route: ActivatedRoute, private formBuilder: FormBuilder, private notifications: NotificationService) {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.activePath = '/dated-flight/' + this.id.toString();
}

ngOnInit(): void {
this.form = this.formBuilder.group({
companyIataCode:[null, Validators.required],
flightNumber:[null, Validators.required],
departureDate:[null, Validators.required],
originIataCode:[null],
departureTime:[null],
destinationIataCode:[null],
arrivalDate:[null],
arrivalTime:[null]})
this.form.controls['companyIataCode'].valueChanges.subscribe(value=>{this.searchOptionsForCompanyIataCode(value)});
this.form.controls['originIataCode'].valueChanges.subscribe(value=>{this.searchOptionsForOriginIataCode(value)});
this.form.controls['destinationIataCode'].valueChanges.subscribe(value=>{this.searchOptionsForDestinationIataCode(value)});
this.load();
}
restoreForm(): void {
this.form.patchValue({
companyIataCode: this.view.form.companyIataCode,
flightNumber: this.view.form.flightNumber,
departureDate: this.view.form.departureDate,
originIataCode: this.view.form.originIataCode,
departureTime: this.view.form.departureTime,
destinationIataCode: this.view.form.destinationIataCode,
arrivalDate: this.view.form.arrivalDate,
arrivalTime: this.view.form.arrivalTime
})
}

applyForm(): void {
this.view.form.companyIataCode = StringUtils.emptyToNull(this.form.get('companyIataCode').value);
this.view.form.flightNumber = StringUtils.emptyToNull(this.form.get('flightNumber').value);
this.view.form.departureDate = StringUtils.emptyToNull(this.form.get('departureDate').value);
this.view.form.originIataCode = StringUtils.emptyToNull(this.form.get('originIataCode').value);
this.view.form.departureTime = StringUtils.emptyToNull(this.form.get('departureTime').value);
this.view.form.destinationIataCode = StringUtils.emptyToNull(this.form.get('destinationIataCode').value);
this.view.form.arrivalDate = StringUtils.emptyToNull(this.form.get('arrivalDate').value);
this.view.form.arrivalTime = StringUtils.emptyToNull(this.form.get('arrivalTime').value);
}

load(): void {
this.service.load(this.id).subscribe((t) => {this.view=t;this.restoreForm();});
}

searchOptionsForCompanyIataCode(value:string) {
if (value) {
this.companyIataCodeOptions = this.airlineCompanyService.searchOptions(value);
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

update(): void {
this.applyForm();
this.service.update(this.id, this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.load();}, error => {this.notifications.error("Operation failed")});
}
/* Specific Code Start */
/* Specific Code End */
}
