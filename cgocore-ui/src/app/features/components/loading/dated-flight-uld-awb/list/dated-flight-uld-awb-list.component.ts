import { Component, OnInit, AfterViewInit, ViewChild } from '@angular/core';
import { ConfirmationModalComponent } from 'src/app/core/components/confirmation-modal/confirmation-modal.component';
import { DatedFlightUldAwbBasicView } from 'src/app/features/models/loading/views/basic/DatedFlightUldAwbBasicView';
import { DatedFlightUldAwbFilter } from 'src/app/features/models/loading/filters/DatedFlightUldAwbFilter';
import { DatedFlightUldAwbForm } from 'src/app/features/models/loading/forms/DatedFlightUldAwbForm';
import { DatedFlightUldAwbFullView } from 'src/app/features/models/loading/views/full/DatedFlightUldAwbFullView';
import { DatedFlightUldAwbModalComponent } from './../modal/dated-flight-uld-awb-modal.component';
import { DatedFlightUldAwbRestClient } from 'src/app/features/services/loading/DatedFlightUldAwbRestClient';
import { DatedFlightUldAwbSorting } from 'src/app/features/models/loading/sortings/DatedFlightUldAwbSorting';
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
selector: 'app-dated-flight-uld-awb-list',
templateUrl: './dated-flight-uld-awb-list.component.html',
styleUrls: ['./dated-flight-uld-awb-list.component.scss']
})
export class DatedFlightUldAwbListComponent implements OnInit, AfterViewInit {

scrollForm: ScrollForm<DatedFlightUldAwbFilter, DatedFlightUldAwbSorting> = new ScrollForm();
scrollView: ScrollView<DatedFlightUldAwbBasicView> = new ScrollView();
dataSource:MatTableDataSource<DatedFlightUldAwbBasicView>;
@ViewChild(MatPaginator) paginator: MatPaginator;
@ViewChild(MatSort) sort: MatSort
pageSizeOptions: number[] = [10, 20, 50, 100];
displayedColumns: string[] = ['datedFlightUldDatedFlightCompanyIataCode','datedFlightUldDatedFlightFlightNumber','datedFlightUldDatedFlightDepartureDate','datedFlightUldUldTypeCode','datedFlightUldUldCode','datedFlightUldUldOwnerCode','airWaybillAirWaybillNumber','numberOfPieces','grossWeight','grossWeightUnitOfMeasureCode','grossVolume','grossVolumeUnitOfMeasureCode','Actions'];
filter: FormGroup;

constructor(private service:DatedFlightUldAwbRestClient, private formBuilder: FormBuilder, private dialog: MatDialog, private notifications: NotificationService) { }
ngOnInit(): void {
this.filter = this.formBuilder.group({
datedFlightUldDatedFlightCompanyIataCode:[null],
datedFlightUldDatedFlightFlightNumber:[null],
datedFlightUldDatedFlightDepartureDateMinValue:[null],
datedFlightUldDatedFlightDepartureDateMaxValue:[null],
datedFlightUldUldTypeCode:[null],
datedFlightUldUldCode:[null],
datedFlightUldUldOwnerCode:[null],
airWaybillAirWaybillNumber:[null]})
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
this.scrollForm.sorting = new DatedFlightUldAwbSorting();
switch (this.sort.active) {
case 'datedFlightUldDatedFlightCompanyIataCode': this.scrollForm.sorting.datedFlightUldDatedFlightCompanyIataCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'datedFlightUldDatedFlightFlightNumber': this.scrollForm.sorting.datedFlightUldDatedFlightFlightNumberOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'datedFlightUldDatedFlightDepartureDate': this.scrollForm.sorting.datedFlightUldDatedFlightDepartureDateOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'datedFlightUldUldTypeCode': this.scrollForm.sorting.datedFlightUldUldTypeCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'datedFlightUldUldCode': this.scrollForm.sorting.datedFlightUldUldCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'datedFlightUldUldOwnerCode': this.scrollForm.sorting.datedFlightUldUldOwnerCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'airWaybillAirWaybillNumber': this.scrollForm.sorting.airWaybillAirWaybillNumberOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'numberOfPieces': this.scrollForm.sorting.numberOfPiecesOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossWeight': this.scrollForm.sorting.grossWeightOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossWeightUnitOfMeasureCode': this.scrollForm.sorting.grossWeightUnitOfMeasureCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossVolume': this.scrollForm.sorting.grossVolumeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossVolumeUnitOfMeasureCode': this.scrollForm.sorting.grossVolumeUnitOfMeasureCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
}
this.refresh();
});

this.filter.controls['datedFlightUldDatedFlightCompanyIataCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.datedFlightUldDatedFlightCompanyIataCode=value;
this.refresh();
});
this.filter.controls['datedFlightUldDatedFlightFlightNumber'].valueChanges.subscribe(value=>{
this.scrollForm.filter.datedFlightUldDatedFlightFlightNumber=value;
this.refresh();
});
this.filter.controls['datedFlightUldDatedFlightDepartureDateMinValue'].valueChanges.subscribe(value=>{
this.scrollForm.filter.datedFlightUldDatedFlightDepartureDateMinValue=value;
this.refresh();
});
this.filter.controls['datedFlightUldDatedFlightDepartureDateMaxValue'].valueChanges.subscribe(value=>{
this.scrollForm.filter.datedFlightUldDatedFlightDepartureDateMaxValue=value;
this.refresh();
});
this.filter.controls['datedFlightUldUldTypeCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.datedFlightUldUldTypeCode=value;
this.refresh();
});
this.filter.controls['datedFlightUldUldCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.datedFlightUldUldCode=value;
this.refresh();
});
this.filter.controls['datedFlightUldUldOwnerCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.datedFlightUldUldOwnerCode=value;
this.refresh();
});
this.filter.controls['airWaybillAirWaybillNumber'].valueChanges.subscribe(value=>{
this.scrollForm.filter.airWaybillAirWaybillNumber=value;
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
this.scrollForm.filter = new DatedFlightUldAwbFilter();
this.scrollForm.sorting = new DatedFlightUldAwbSorting();
this.scrollForm.page=1;
this.scrollForm.elementsPerPage=10;
this.filter.patchValue({
datedFlightUldDatedFlightCompanyIataCode: [null],
datedFlightUldDatedFlightFlightNumber: [null],
datedFlightUldDatedFlightDepartureDateMinValue: [null],
datedFlightUldDatedFlightDepartureDateMaxValue: [null],
datedFlightUldUldTypeCode: [null],
datedFlightUldUldCode: [null],
datedFlightUldUldOwnerCode: [null],
airWaybillAirWaybillNumber: [null]
})
this.refresh();
}

create(): void {
this.service.create().subscribe((t) => {
let ref = this.dialog.open(DatedFlightUldAwbModalComponent);
ref.componentInstance.view = t;
ref.afterClosed().subscribe(result => {this.refresh();});
});
}

edit(id: number): void {
this.service.load(id).subscribe((t) => {
let ref = this.dialog.open(DatedFlightUldAwbModalComponent);
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
