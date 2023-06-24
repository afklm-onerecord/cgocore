import { ActivatedRoute } from '@angular/router';
import { AirlineCompanyFullView } from 'src/app/features/models/reference/airlines/views/full/AirlineCompanyFullView';
import { AirlineCompanyRestClient } from 'src/app/features/services/reference/airlines/AirlineCompanyRestClient';
import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NavLink } from 'src/app/core/models/nav-link';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated details component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-airline-company-details',
templateUrl: './airline-company-details.component.html',
styleUrls: ['./airline-company-details.component.scss']
})
export class AirlineCompanyDetailsComponent implements OnInit {

id:number;
activePath:string;
view: AirlineCompanyFullView = new AirlineCompanyFullView();
form: FormGroup;

constructor(private service:AirlineCompanyRestClient, private route: ActivatedRoute, private formBuilder: FormBuilder, private notifications: NotificationService) {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.activePath = '/airline-company/' + this.id.toString();
}

ngOnInit(): void {
this.form = this.formBuilder.group({
iataCode:[null, Validators.required],
label:[null],
prefix:[null]})
this.load();
}
restoreForm(): void {
this.form.patchValue({
iataCode: this.view.form.iataCode,
label: this.view.form.label,
prefix: this.view.form.prefix
})
}

applyForm(): void {
this.view.form.iataCode = StringUtils.emptyToNull(this.form.get('iataCode').value);
this.view.form.label = StringUtils.emptyToNull(this.form.get('label').value);
this.view.form.prefix = StringUtils.emptyToNull(this.form.get('prefix').value);
}

load(): void {
this.service.load(this.id).subscribe((t) => {this.view=t;this.restoreForm();});
}

update(): void {
this.applyForm();
this.service.update(this.id, this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.load();}, error => {this.notifications.error("Operation failed")});
}
/* Specific Code Start */
/* Specific Code End */
}
