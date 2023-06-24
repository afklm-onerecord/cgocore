import { ActivatedRoute } from '@angular/router';
import { Component, OnInit, ViewChild } from '@angular/core';
import { CurrencyFullView } from 'src/app/features/models/reference/localization/views/full/CurrencyFullView';
import { CurrencyRestClient } from 'src/app/features/services/reference/localization/CurrencyRestClient';
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
selector: 'app-currency-details',
templateUrl: './currency-details.component.html',
styleUrls: ['./currency-details.component.scss']
})
export class CurrencyDetailsComponent implements OnInit {

id:number;
activePath:string;
view: CurrencyFullView = new CurrencyFullView();
form: FormGroup;

constructor(private service:CurrencyRestClient, private route: ActivatedRoute, private formBuilder: FormBuilder, private notifications: NotificationService) {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.activePath = '/currency/' + this.id.toString();
}

ngOnInit(): void {
this.form = this.formBuilder.group({
isoCode:[null, Validators.required],
label:[null, Validators.required]})
this.load();
}
restoreForm(): void {
this.form.patchValue({
isoCode: this.view.form.isoCode,
label: this.view.form.label
})
}

applyForm(): void {
this.view.form.isoCode = StringUtils.emptyToNull(this.form.get('isoCode').value);
this.view.form.label = StringUtils.emptyToNull(this.form.get('label').value);
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
