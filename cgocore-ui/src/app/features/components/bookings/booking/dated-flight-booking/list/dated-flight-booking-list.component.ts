import { ActivatedRoute } from '@angular/router';
import { Component, OnInit, AfterViewInit, ViewChild } from '@angular/core';
import { ConfirmationModalComponent } from 'src/app/core/components/confirmation-modal/confirmation-modal.component';
import { DatedFlightBookingBasicView } from 'src/app/features/models/bookings/views/basic/DatedFlightBookingBasicView';
import { DatedFlightBookingFilter } from 'src/app/features/models/bookings/filters/DatedFlightBookingFilter';
import { DatedFlightBookingForm } from 'src/app/features/models/bookings/forms/DatedFlightBookingForm';
import { DatedFlightBookingFullView } from 'src/app/features/models/bookings/views/full/DatedFlightBookingFullView';
import { DatedFlightBookingModalComponent } from './../modal/dated-flight-booking-modal.component';
import { DatedFlightBookingRestClient } from 'src/app/features/services/bookings/DatedFlightBookingRestClient';
import { DatedFlightBookingSorting } from 'src/app/features/models/bookings/sortings/DatedFlightBookingSorting';
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
 * auto generated one to many list component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-dated-flight-booking-list',
templateUrl: './dated-flight-booking-list.component.html',
styleUrls: ['./dated-flight-booking-list.component.scss']
})
export class DatedFlightBookingListComponent implements OnInit, AfterViewInit {

id:number;
activePath:string;
scrollForm: ScrollForm<DatedFlightBookingFilter, DatedFlightBookingSorting> = new ScrollForm();
scrollView: ScrollView<DatedFlightBookingBasicView> = new ScrollView();
dataSource:MatTableDataSource<DatedFlightBookingBasicView>;
@ViewChild(MatPaginator) paginator: MatPaginator;
@ViewChild(MatSort) sort: MatSort
pageSizeOptions: number[] = [10, 20, 50, 100];
displayedColumns: string[] = ['datedFlightCompanyIataCode','datedFlightFlightNumber','datedFlightDepartureDate','numberOfPieces','grossWeight','grossWeightUnitOfMeasureCode','grossVolume','grossVolumeUnitOfMeasureCode','Actions'];
filter: FormGroup;

constructor(private service:DatedFlightBookingRestClient, private route: ActivatedRoute, private formBuilder: FormBuilder, private dialog: MatDialog, private notifications: NotificationService) {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.activePath = '/booking/' + this.id.toString() + '/dated-flight-booking/list';
}
ngOnInit(): void {
this.filter = this.formBuilder.group({
datedFlightCompanyIataCode:[null],
datedFlightFlightNumber:[null],
datedFlightDepartureDateMinValue:[null],
datedFlightDepartureDateMaxValue:[null]})
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
this.scrollForm.sorting = new DatedFlightBookingSorting();
switch (this.sort.active) {
case 'datedFlightCompanyIataCode': this.scrollForm.sorting.datedFlightCompanyIataCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'datedFlightFlightNumber': this.scrollForm.sorting.datedFlightFlightNumberOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'datedFlightDepartureDate': this.scrollForm.sorting.datedFlightDepartureDateOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'numberOfPieces': this.scrollForm.sorting.numberOfPiecesOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossWeight': this.scrollForm.sorting.grossWeightOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossWeightUnitOfMeasureCode': this.scrollForm.sorting.grossWeightUnitOfMeasureCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossVolume': this.scrollForm.sorting.grossVolumeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossVolumeUnitOfMeasureCode': this.scrollForm.sorting.grossVolumeUnitOfMeasureCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
}
this.refresh();
});

this.filter.controls['datedFlightCompanyIataCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.datedFlightCompanyIataCode=value;
this.refresh();
});
this.filter.controls['datedFlightFlightNumber'].valueChanges.subscribe(value=>{
this.scrollForm.filter.datedFlightFlightNumber=value;
this.refresh();
});
this.filter.controls['datedFlightDepartureDateMinValue'].valueChanges.subscribe(value=>{
this.scrollForm.filter.datedFlightDepartureDateMinValue=value;
this.refresh();
});
this.filter.controls['datedFlightDepartureDateMaxValue'].valueChanges.subscribe(value=>{
this.scrollForm.filter.datedFlightDepartureDateMaxValue=value;
this.refresh();
});
}

refresh(): void {
this.service.scrollFromBooking(this.id, this.scrollForm).subscribe((t) => {
this.scrollView=t;
this.dataSource = new MatTableDataSource(this.scrollView.elements);
});
}

reset(): void {
this.scrollForm = new ScrollForm();
this.scrollForm.filter = new DatedFlightBookingFilter();
this.scrollForm.sorting = new DatedFlightBookingSorting();
this.scrollForm.page=1;
this.scrollForm.elementsPerPage=10;
this.filter.patchValue({
datedFlightCompanyIataCode: [null],
datedFlightFlightNumber: [null],
datedFlightDepartureDateMinValue: [null],
datedFlightDepartureDateMaxValue: [null]
})
this.refresh();
}

create(): void {
this.service.create().subscribe((t) => {
let ref = this.dialog.open(DatedFlightBookingModalComponent);
ref.componentInstance.view = t;
ref.componentInstance.parentId = this.id;
ref.afterClosed().subscribe(result => {this.refresh();});
});
}

edit(id: number): void {
this.service.load(id).subscribe((t) => {
let ref = this.dialog.open(DatedFlightBookingModalComponent);
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
