import { ActivatedRoute } from '@angular/router';
import { AirlineCompanyRestClient } from 'src/app/features/services/reference/airlines/AirlineCompanyRestClient';
import { Component, OnInit, ViewChild } from '@angular/core';
import { DatedFlightUldFullView } from 'src/app/features/models/loading/views/full/DatedFlightUldFullView';
import { DatedFlightUldRestClient } from 'src/app/features/services/loading/DatedFlightUldRestClient';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NavLink } from 'src/app/core/models/nav-link';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StringUtils } from 'src/app/core/services/StringUtils';
import { UldTypeRestClient } from 'src/app/features/services/reference/containers/UldTypeRestClient';
import { UnitOfMeasureRestClient } from 'src/app/features/services/reference/commodities/UnitOfMeasureRestClient';
/**
 * auto generated details component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-dated-flight-uld-details',
templateUrl: './dated-flight-uld-details.component.html',
styleUrls: ['./dated-flight-uld-details.component.scss']
})
export class DatedFlightUldDetailsComponent implements OnInit {

id:number;
activePath:string;
view: DatedFlightUldFullView = new DatedFlightUldFullView();
form: FormGroup;
datedFlightCompanyIataCodeOptions: Observable<SelectItem[]>;
uldTypeCodeOptions: SelectItem[];
grossWeightUnitOfMeasureCodeOptions: SelectItem[];

constructor(private service:DatedFlightUldRestClient, private uldTypeService:UldTypeRestClient, private unitOfMeasureService:UnitOfMeasureRestClient, private airlineCompanyService:AirlineCompanyRestClient, private route: ActivatedRoute, private formBuilder: FormBuilder, private notifications: NotificationService) {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.activePath = '/dated-flight-uld/' + this.id.toString();
}

ngOnInit(): void {
this.form = this.formBuilder.group({
datedFlightCompanyIataCode:[null, Validators.required],
datedFlightFlightNumber:[null, Validators.required],
datedFlightDepartureDate:[null, Validators.required],
uldTypeCode:[null, Validators.required],
uldCode:[null, Validators.required],
uldOwnerCode:[null, Validators.required],
grossWeight:[null],
grossWeightUnitOfMeasureCode:[null]})
this.form.controls['datedFlightCompanyIataCode'].valueChanges.subscribe(value=>{this.searchOptionsForDatedFlightCompanyIataCode(value)});
this.load();
}
restoreForm(): void {
this.form.patchValue({
datedFlightCompanyIataCode: this.view.form.datedFlightCompanyIataCode,
datedFlightFlightNumber: this.view.form.datedFlightFlightNumber,
datedFlightDepartureDate: this.view.form.datedFlightDepartureDate,
uldTypeCode: this.view.form.uldTypeCode,
uldCode: this.view.form.uldCode,
uldOwnerCode: this.view.form.uldOwnerCode,
grossWeight: this.view.form.grossWeight,
grossWeightUnitOfMeasureCode: this.view.form.grossWeightUnitOfMeasureCode
})
}

applyForm(): void {
this.view.form.datedFlightCompanyIataCode = StringUtils.emptyToNull(this.form.get('datedFlightCompanyIataCode').value);
this.view.form.datedFlightFlightNumber = StringUtils.emptyToNull(this.form.get('datedFlightFlightNumber').value);
this.view.form.datedFlightDepartureDate = StringUtils.emptyToNull(this.form.get('datedFlightDepartureDate').value);
this.view.form.uldTypeCode = StringUtils.emptyToNull(this.form.get('uldTypeCode').value);
this.view.form.uldCode = StringUtils.emptyToNull(this.form.get('uldCode').value);
this.view.form.uldOwnerCode = StringUtils.emptyToNull(this.form.get('uldOwnerCode').value);
this.view.form.grossWeight = StringUtils.emptyToNull(this.form.get('grossWeight').value);
this.view.form.grossWeightUnitOfMeasureCode = StringUtils.emptyToNull(this.form.get('grossWeightUnitOfMeasureCode').value);
}

load(): void {
this.service.load(this.id).subscribe((t) => {this.view=t;this.restoreForm();});
this.loadOptionsForUldTypeCode();
this.loadOptionsForGrossWeightUnitOfMeasureCode();
}

searchOptionsForDatedFlightCompanyIataCode(value:string) {
if (value) {
this.datedFlightCompanyIataCodeOptions = this.airlineCompanyService.searchOptions(value);
}
}

loadOptionsForUldTypeCode() {
this.uldTypeService.getOptions().subscribe((t) => {this.uldTypeCodeOptions=t;});
}

loadOptionsForGrossWeightUnitOfMeasureCode() {
this.unitOfMeasureService.getOptions().subscribe((t) => {this.grossWeightUnitOfMeasureCodeOptions=t;});
}

update(): void {
this.applyForm();
this.service.update(this.id, this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.load();}, error => {this.notifications.error("Operation failed")});
}
/* Specific Code Start */
/* Specific Code End */
}
