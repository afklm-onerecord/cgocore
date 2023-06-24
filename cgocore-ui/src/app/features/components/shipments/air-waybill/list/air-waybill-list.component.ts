import { AirWaybillBasicView } from 'src/app/features/models/shipments/views/basic/AirWaybillBasicView';
import { AirWaybillFilter } from 'src/app/features/models/shipments/filters/AirWaybillFilter';
import { AirWaybillForm } from 'src/app/features/models/shipments/forms/AirWaybillForm';
import { AirWaybillFullView } from 'src/app/features/models/shipments/views/full/AirWaybillFullView';
import { AirWaybillModalComponent } from './../modal/air-waybill-modal.component';
import { AirWaybillRestClient } from 'src/app/features/services/shipments/AirWaybillRestClient';
import { AirWaybillSorting } from 'src/app/features/models/shipments/sortings/AirWaybillSorting';
import { Component, OnInit, AfterViewInit, ViewChild } from '@angular/core';
import { ConfirmationModalComponent } from 'src/app/core/components/confirmation-modal/confirmation-modal.component';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { NotificationService } from 'src/app/core/services/NotificationService';
import { ScrollForm } from "src/app/core/models/ScrollForm";
import { ScrollView } from "src/app/core/models/ScrollView";
import { SelectItem } from "src/app/core/models/SelectItem";
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated list component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-air-waybill-list',
templateUrl: './air-waybill-list.component.html',
styleUrls: ['./air-waybill-list.component.scss']
})
export class AirWaybillListComponent implements OnInit, AfterViewInit {

scrollForm: ScrollForm<AirWaybillFilter, AirWaybillSorting> = new ScrollForm();
scrollView: ScrollView<AirWaybillBasicView> = new ScrollView();
dataSource:MatTableDataSource<AirWaybillBasicView>;
@ViewChild(MatPaginator) paginator: MatPaginator;
@ViewChild(MatSort) sort: MatSort
pageSizeOptions: number[] = [10, 20, 50, 100];
displayedColumns: string[] = ['airWaybillNumber','forwarderName','originIataCode','destinationIataCode','goddsDescription','hsCode','numberOfPieces','grossWeight','chargeableWeight','grossWeightUnitOfMeasureCode','grossVolume','grossVolumeUnitOfMeasureCode','Actions'];
filter: FormGroup;

constructor(private service:AirWaybillRestClient, private formBuilder: FormBuilder, private dialog: MatDialog, private notifications: NotificationService) { }
ngOnInit(): void {
this.filter = this.formBuilder.group({
airWaybillNumber:[null],
forwarderName:[null],
originIataCode:[null],
destinationIataCode:[null],
goddsDescription:[null],
hsCode:[null]})
this.reset();
}

ngAfterViewInit(): void {
this.paginator.page.subscribe(
(event) => {
this.scrollForm.page=event.pageIndex+1;
this.scrollForm.elementsPerPage=event.pageSize;
this.refresh();
});

this.sort.sortChange.subscribe(
(event) => {
this.scrollForm.sorting = new AirWaybillSorting();
switch (this.sort.active) {
case 'airWaybillNumber': this.scrollForm.sorting.airWaybillNumberOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'forwarderName': this.scrollForm.sorting.forwarderNameOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'originIataCode': this.scrollForm.sorting.originIataCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'destinationIataCode': this.scrollForm.sorting.destinationIataCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'goddsDescription': this.scrollForm.sorting.goddsDescriptionOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'hsCode': this.scrollForm.sorting.hsCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'numberOfPieces': this.scrollForm.sorting.numberOfPiecesOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossWeight': this.scrollForm.sorting.grossWeightOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'chargeableWeight': this.scrollForm.sorting.chargeableWeightOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossWeightUnitOfMeasureCode': this.scrollForm.sorting.grossWeightUnitOfMeasureCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossVolume': this.scrollForm.sorting.grossVolumeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossVolumeUnitOfMeasureCode': this.scrollForm.sorting.grossVolumeUnitOfMeasureCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
}
this.refresh();
});

this.filter.controls['airWaybillNumber'].valueChanges.subscribe(value=>{
this.scrollForm.filter.airWaybillNumber=value;
this.refresh();
});
this.filter.controls['forwarderName'].valueChanges.subscribe(value=>{
this.scrollForm.filter.forwarderName=value;
this.refresh();
});
this.filter.controls['originIataCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.originIataCode=value;
this.refresh();
});
this.filter.controls['destinationIataCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.destinationIataCode=value;
this.refresh();
});
this.filter.controls['goddsDescription'].valueChanges.subscribe(value=>{
this.scrollForm.filter.goddsDescription=value;
this.refresh();
});
this.filter.controls['hsCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.hsCode=value;
this.refresh();
});
}

refresh(): void {
this.service.scroll(this.scrollForm).subscribe((t) => {
this.scrollView=t;
this.dataSource = new MatTableDataSource(this.scrollView.elements);
});
}

reset(): void {
this.scrollForm = new ScrollForm();
this.scrollForm.filter = new AirWaybillFilter();
this.scrollForm.sorting = new AirWaybillSorting();
this.scrollForm.page=1;
this.scrollForm.elementsPerPage=10;
this.filter.patchValue({
airWaybillNumber: [null],
forwarderName: [null],
originIataCode: [null],
destinationIataCode: [null],
goddsDescription: [null],
hsCode: [null]
})
this.refresh();
}

create(): void {
this.service.create().subscribe((t) => {
let ref = this.dialog.open(AirWaybillModalComponent);
ref.componentInstance.view = t;
ref.afterClosed().subscribe(result => {this.refresh();});
});
}

edit(id: number): void {
this.service.load(id).subscribe((t) => {
let ref = this.dialog.open(AirWaybillModalComponent);
ref.componentInstance.view = t;
ref.afterClosed().subscribe(result => {this.refresh();});
});
}

delete(id: number): void {
this.dialog.open(ConfirmationModalComponent).afterClosed().subscribe(result => {
if (result) {
this.service.delete(id).subscribe(success => {this.notifications.info("Operation completed");this.refresh()}, error => {this.notifications.error("Operation failed")});
}
});
}

/* Specific Code Start */
/* Specific Code End */
}
