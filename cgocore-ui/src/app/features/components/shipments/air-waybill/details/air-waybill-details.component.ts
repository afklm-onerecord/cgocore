import { ActivatedRoute } from '@angular/router';
import { AirWaybillFullView } from 'src/app/features/models/shipments/views/full/AirWaybillFullView';
import { AirWaybillRestClient } from 'src/app/features/services/shipments/AirWaybillRestClient';
import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NavLink } from 'src/app/core/models/nav-link';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { Observable } from 'rxjs';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StationRestClient } from 'src/app/features/services/reference/localization/StationRestClient';
import { StringUtils } from 'src/app/core/services/StringUtils';
import { UnitOfMeasureRestClient } from 'src/app/features/services/reference/commodities/UnitOfMeasureRestClient';
/**
 * auto generated details component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-air-waybill-details',
templateUrl: './air-waybill-details.component.html',
styleUrls: ['./air-waybill-details.component.scss']
})
export class AirWaybillDetailsComponent implements OnInit {

id:number;
activePath:string;
view: AirWaybillFullView = new AirWaybillFullView();
form: FormGroup;
originIataCodeOptions: Observable<SelectItem[]>;
destinationIataCodeOptions: Observable<SelectItem[]>;
grossWeightUnitOfMeasureCodeOptions: SelectItem[];
grossVolumeUnitOfMeasureCodeOptions: SelectItem[];

constructor(private service:AirWaybillRestClient, private stationService:StationRestClient, private unitOfMeasureService:UnitOfMeasureRestClient, private route: ActivatedRoute, private formBuilder: FormBuilder, private notifications: NotificationService) {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.activePath = '/air-waybill/' + this.id.toString();
}

ngOnInit(): void {
this.form = this.formBuilder.group({
airWaybillNumber:[null, Validators.required],
forwarderName:[null],
originIataCode:[null],
destinationIataCode:[null],
goddsDescription:[null],
hsCode:[null],
numberOfPieces:[null],
grossWeight:[null],
chargeableWeight:[null],
grossWeightUnitOfMeasureCode:[null],
grossVolume:[null],
grossVolumeUnitOfMeasureCode:[null]})
this.form.controls['originIataCode'].valueChanges.subscribe(value=>{this.searchOptionsForOriginIataCode(value)});
this.form.controls['destinationIataCode'].valueChanges.subscribe(value=>{this.searchOptionsForDestinationIataCode(value)});
this.load();
}
restoreForm(): void {
this.form.patchValue({
airWaybillNumber: this.view.form.airWaybillNumber,
forwarderName: this.view.form.forwarderName,
originIataCode: this.view.form.originIataCode,
destinationIataCode: this.view.form.destinationIataCode,
goddsDescription: this.view.form.goddsDescription,
hsCode: this.view.form.hsCode,
numberOfPieces: this.view.form.numberOfPieces,
grossWeight: this.view.form.grossWeight,
chargeableWeight: this.view.form.chargeableWeight,
grossWeightUnitOfMeasureCode: this.view.form.grossWeightUnitOfMeasureCode,
grossVolume: this.view.form.grossVolume,
grossVolumeUnitOfMeasureCode: this.view.form.grossVolumeUnitOfMeasureCode
})
}

applyForm(): void {
this.view.form.airWaybillNumber = StringUtils.emptyToNull(this.form.get('airWaybillNumber').value);
this.view.form.forwarderName = StringUtils.emptyToNull(this.form.get('forwarderName').value);
this.view.form.originIataCode = StringUtils.emptyToNull(this.form.get('originIataCode').value);
this.view.form.destinationIataCode = StringUtils.emptyToNull(this.form.get('destinationIataCode').value);
this.view.form.goddsDescription = StringUtils.emptyToNull(this.form.get('goddsDescription').value);
this.view.form.hsCode = StringUtils.emptyToNull(this.form.get('hsCode').value);
this.view.form.numberOfPieces = StringUtils.emptyToNull(this.form.get('numberOfPieces').value);
this.view.form.grossWeight = StringUtils.emptyToNull(this.form.get('grossWeight').value);
this.view.form.chargeableWeight = StringUtils.emptyToNull(this.form.get('chargeableWeight').value);
this.view.form.grossWeightUnitOfMeasureCode = StringUtils.emptyToNull(this.form.get('grossWeightUnitOfMeasureCode').value);
this.view.form.grossVolume = StringUtils.emptyToNull(this.form.get('grossVolume').value);
this.view.form.grossVolumeUnitOfMeasureCode = StringUtils.emptyToNull(this.form.get('grossVolumeUnitOfMeasureCode').value);
}

load(): void {
this.service.load(this.id).subscribe((t) => {this.view=t;this.restoreForm();});
this.loadOptionsForGrossWeightUnitOfMeasureCode();
this.loadOptionsForGrossVolumeUnitOfMeasureCode();
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

update(): void {
this.applyForm();
this.service.update(this.id, this.view.form).subscribe(success => {this.notifications.info("Operation completed");this.load();}, error => {this.notifications.error("Operation failed")});
}
/* Specific Code Start */
/* Specific Code End */
}
