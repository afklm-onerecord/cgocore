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
import { StationBasicView } from 'src/app/features/models/reference/localization/views/basic/StationBasicView';
import { StationFilter } from 'src/app/features/models/reference/localization/filters/StationFilter';
import { StationForm } from 'src/app/features/models/reference/localization/forms/StationForm';
import { StationFullView } from 'src/app/features/models/reference/localization/views/full/StationFullView';
import { StationModalComponent } from './../modal/station-modal.component';
import { StationRestClient } from 'src/app/features/services/reference/localization/StationRestClient';
import { StationSorting } from 'src/app/features/models/reference/localization/sortings/StationSorting';
import { StringUtils } from 'src/app/core/services/StringUtils';
/**
 * auto generated list component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-station-list',
templateUrl: './station-list.component.html',
styleUrls: ['./station-list.component.scss']
})
export class StationListComponent implements OnInit, AfterViewInit {

scrollForm: ScrollForm<StationFilter, StationSorting> = new ScrollForm();
scrollView: ScrollView<StationBasicView> = new ScrollView();
dataSource:MatTableDataSource<StationBasicView>;
@ViewChild(MatPaginator) paginator: MatPaginator;
@ViewChild(MatSort) sort: MatSort
pageSizeOptions: number[] = [10, 20, 50, 100];
displayedColumns: string[] = ['iataCode','label','countryIataCode','Actions'];
filter: FormGroup;

constructor(private service:StationRestClient, private formBuilder: FormBuilder, private dialog: MatDialog, private notifications: NotificationService) { }
ngOnInit(): void {
this.filter = this.formBuilder.group({
iataCode:[null],
label:[null],
countryIataCode:[null]})
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
this.scrollForm.sorting = new StationSorting();
switch (this.sort.active) {
case 'iataCode': this.scrollForm.sorting.iataCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'label': this.scrollForm.sorting.labelOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'countryIataCode': this.scrollForm.sorting.countryIataCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
}
this.refresh();
});

this.filter.controls['iataCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.iataCode=value;
this.refresh();
});
this.filter.controls['label'].valueChanges.subscribe(value=>{
this.scrollForm.filter.label=value;
this.refresh();
});
this.filter.controls['countryIataCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.countryIataCode=value;
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
this.scrollForm.filter = new StationFilter();
this.scrollForm.sorting = new StationSorting();
this.scrollForm.page=1;
this.scrollForm.elementsPerPage=10;
this.filter.patchValue({
iataCode: [null],
label: [null],
countryIataCode: [null]
})
this.refresh();
}

create(): void {
this.service.create().subscribe((t) => {
let ref = this.dialog.open(StationModalComponent);
ref.componentInstance.view = t;
ref.afterClosed().subscribe(result => {this.refresh();});
});
}

edit(id: number): void {
this.service.load(id).subscribe((t) => {
let ref = this.dialog.open(StationModalComponent);
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
