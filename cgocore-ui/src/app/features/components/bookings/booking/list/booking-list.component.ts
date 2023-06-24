import { BookingBasicView } from 'src/app/features/models/bookings/views/basic/BookingBasicView';
import { BookingFilter } from 'src/app/features/models/bookings/filters/BookingFilter';
import { BookingForm } from 'src/app/features/models/bookings/forms/BookingForm';
import { BookingFullView } from 'src/app/features/models/bookings/views/full/BookingFullView';
import { BookingModalComponent } from './../modal/booking-modal.component';
import { BookingRestClient } from 'src/app/features/services/bookings/BookingRestClient';
import { BookingSorting } from 'src/app/features/models/bookings/sortings/BookingSorting';
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
selector: 'app-booking-list',
templateUrl: './booking-list.component.html',
styleUrls: ['./booking-list.component.scss']
})
export class BookingListComponent implements OnInit, AfterViewInit {

scrollForm: ScrollForm<BookingFilter, BookingSorting> = new ScrollForm();
scrollView: ScrollView<BookingBasicView> = new ScrollView();
dataSource:MatTableDataSource<BookingBasicView>;
@ViewChild(MatPaginator) paginator: MatPaginator;
@ViewChild(MatSort) sort: MatSort
pageSizeOptions: number[] = [10, 20, 50, 100];
displayedColumns: string[] = ['airWaybillAirWaybillNumber','originIataCode','destinationIataCode','numberOfPieces','grossWeight','grossWeightUnitOfMeasureCode','grossVolume','grossVolumeUnitOfMeasureCode','Actions'];
filter: FormGroup;

constructor(private service:BookingRestClient, private formBuilder: FormBuilder, private dialog: MatDialog, private notifications: NotificationService) { }
ngOnInit(): void {
this.filter = this.formBuilder.group({
airWaybillAirWaybillNumber:[null],
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
this.scrollForm.sorting = new BookingSorting();
switch (this.sort.active) {
case 'airWaybillAirWaybillNumber': this.scrollForm.sorting.airWaybillAirWaybillNumberOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'originIataCode': this.scrollForm.sorting.originIataCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'destinationIataCode': this.scrollForm.sorting.destinationIataCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'numberOfPieces': this.scrollForm.sorting.numberOfPiecesOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossWeight': this.scrollForm.sorting.grossWeightOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossWeightUnitOfMeasureCode': this.scrollForm.sorting.grossWeightUnitOfMeasureCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossVolume': this.scrollForm.sorting.grossVolumeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossVolumeUnitOfMeasureCode': this.scrollForm.sorting.grossVolumeUnitOfMeasureCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
}
this.refresh();
});

this.filter.controls['airWaybillAirWaybillNumber'].valueChanges.subscribe(value=>{
this.scrollForm.filter.airWaybillAirWaybillNumber=value;
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
this.scrollForm.filter = new BookingFilter();
this.scrollForm.sorting = new BookingSorting();
this.scrollForm.page=1;
this.scrollForm.elementsPerPage=10;
this.filter.patchValue({
airWaybillAirWaybillNumber: [null],
originIataCode: [null],
destinationIataCode: [null]
})
this.refresh();
}

create(): void {
this.service.create().subscribe((t) => {
let ref = this.dialog.open(BookingModalComponent);
ref.componentInstance.view = t;
ref.afterClosed().subscribe(result => {this.refresh();});
});
}

edit(id: number): void {
this.service.load(id).subscribe((t) => {
let ref = this.dialog.open(BookingModalComponent);
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
