import { ActivatedRoute } from '@angular/router';
import { Component, OnInit, ViewChild } from '@angular/core';
import { CountryRestClient } from 'src/app/features/services/reference/localization/CountryRestClient';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NavLink } from 'src/app/core/models/nav-link';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StationFullView } from 'src/app/features/models/reference/localization/views/full/StationFullView';
import { StationRestClient } from 'src/app/features/services/reference/localization/StationRestClient';
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated details component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-station-details',
templateUrl: './station-details.component.html',
styleUrls: ['./station-details.component.scss']
})
export class StationDetailsComponent implements OnInit {

id:number;
activePath:string;
view: StationFullView = new StationFullView();
form: FormGroup;
countryIataCodeOptions: Observable<SelectItem[]>;

constructor(private service:StationRestClient, private countryService:CountryRestClient, private route: ActivatedRoute, private formBuilder: FormBuilder, private notifications: NotificationService) {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.activePath = '/station/' + this.id.toString();
}

ngOnInit(): void {
this.form = this.formBuilder.group({
iataCode:[null, Validators.required],
label:[null, Validators.required],
countryIataCode:[null]})
this.form.controls['countryIataCode'].valueChanges.subscribe(value=>{this.searchOptionsForCountryIataCode(value)});
this.load();
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

load(): void {
this.service.load(this.id).subscribe((t) => {this.view=t;this.restoreForm();});
}

searchOptionsForCountryIataCode(value:string) {
if (value) {
this.countryIataCodeOptions = this.countryService.searchOptions(value);
}
}

update(): void {
this.applyForm();
this.service.update(this.id, this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.load();}, error => {this.notifications.error("Operation failed")});
}
/* Specific Code Start */
/* Specific Code End */
}
