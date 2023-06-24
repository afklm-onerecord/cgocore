import { Component, OnInit, AfterViewInit, ViewChild } from '@angular/core';
import { ConfirmationModalComponent } from 'src/app/core/components/confirmation-modal/confirmation-modal.component';
import { DatedFlightBasicView } from 'src/app/features/models/schedule/views/basic/DatedFlightBasicView';
import { DatedFlightFilter } from 'src/app/features/models/schedule/filters/DatedFlightFilter';
import { DatedFlightForm } from 'src/app/features/models/schedule/forms/DatedFlightForm';
import { DatedFlightFullView } from 'src/app/features/models/schedule/views/full/DatedFlightFullView';
import { DatedFlightModalComponent } from './../modal/dated-flight-modal.component';
import { DatedFlightRestClient } from 'src/app/features/services/schedule/DatedFlightRestClient';
import { DatedFlightSorting } from 'src/app/features/models/schedule/sortings/DatedFlightSorting';
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
selector: 'app-dated-flight-list',
templateUrl: './dated-flight-list.component.html',
styleUrls: ['./dated-flight-list.component.scss']
})
export class DatedFlightListComponent implements OnInit, AfterViewInit {

scrollForm: ScrollForm<DatedFlightFilter, DatedFlightSorting> = new ScrollForm();
scrollView: ScrollView<DatedFlightBasicView> = new ScrollView();
dataSource:MatTableDataSource<DatedFlightBasicView>;
@ViewChild(MatPaginator) paginator: MatPaginator;
@ViewChild(MatSort) sort: MatSort
pageSizeOptions: number[] = [10, 20, 50, 100];
displayedColumns: string[] = ['companyIataCode','flightNumber','departureDate','originIataCode','departureTime','destinationIataCode','arrivalDate','arrivalTime','Actions'];
filter: FormGroup;

constructor(private service:DatedFlightRestClient, private formBuilder: FormBuilder, private dialog: MatDialog, private notifications: NotificationService) { }
ngOnInit(): void {
this.filter = this.formBuilder.group({
companyIataCode:[null],
flightNumber:[null],
departureDateMinValue:[null],
departureDateMaxValue:[null],
originIataCode:[null],
destinationIataCode:[null]})
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
this.scrollForm.sorting = new DatedFlightSorting();
switch (this.sort.active) {
case 'companyIataCode': this.scrollForm.sorting.companyIataCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'flightNumber': this.scrollForm.sorting.flightNumberOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'departureDate': this.scrollForm.sorting.departureDateOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'originIataCode': this.scrollForm.sorting.originIataCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'departureTime': this.scrollForm.sorting.departureTimeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'destinationIataCode': this.scrollForm.sorting.destinationIataCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'arrivalDate': this.scrollForm.sorting.arrivalDateOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'arrivalTime': this.scrollForm.sorting.arrivalTimeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
}
this.refresh();
});

this.filter.controls['companyIataCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.companyIataCode=value;
this.refresh();
});
this.filter.controls['flightNumber'].valueChanges.subscribe(value=>{
this.scrollForm.filter.flightNumber=value;
this.refresh();
});
this.filter.controls['departureDateMinValue'].valueChanges.subscribe(value=>{
this.scrollForm.filter.departureDateMinValue=value;
this.refresh();
});
this.filter.controls['departureDateMaxValue'].valueChanges.subscribe(value=>{
this.scrollForm.filter.departureDateMaxValue=value;
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
}

refresh(): void {
this.service.scroll(this.scrollForm).subscribe((t) => {
this.scrollView=t;
this.dataSource = new MatTableDataSource(this.scrollView.elements);
});
}

reset(): void {
this.scrollForm = new ScrollForm();
this.scrollForm.filter = new DatedFlightFilter();
this.scrollForm.sorting = new DatedFlightSorting();
this.scrollForm.page=1;
this.scrollForm.elementsPerPage=10;
this.filter.patchValue({
companyIataCode: [null],
flightNumber: [null],
departureDateMinValue: [null],
departureDateMaxValue: [null],
originIataCode: [null],
destinationIataCode: [null]
})
this.refresh();
}

create(): void {
this.service.create().subscribe((t) => {
let ref = this.dialog.open(DatedFlightModalComponent);
ref.componentInstance.view = t;
ref.afterClosed().subscribe(result => {this.refresh();});
});
}

edit(id: number): void {
this.service.load(id).subscribe((t) => {
let ref = this.dialog.open(DatedFlightModalComponent);
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
