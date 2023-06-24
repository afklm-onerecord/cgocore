import { ActivatedRoute } from '@angular/router';
import { Component, OnInit, AfterViewInit, ViewChild } from '@angular/core';
import { ConfirmationModalComponent } from 'src/app/core/components/confirmation-modal/confirmation-modal.component';
import { DatedFlightUldBasicView } from 'src/app/features/models/loading/views/basic/DatedFlightUldBasicView';
import { DatedFlightUldFilter } from 'src/app/features/models/loading/filters/DatedFlightUldFilter';
import { DatedFlightUldForm } from 'src/app/features/models/loading/forms/DatedFlightUldForm';
import { DatedFlightUldFullView } from 'src/app/features/models/loading/views/full/DatedFlightUldFullView';
import { DatedFlightUldModalComponent } from './../modal/dated-flight-uld-modal.component';
import { DatedFlightUldRestClient } from 'src/app/features/services/loading/DatedFlightUldRestClient';
import { DatedFlightUldSorting } from 'src/app/features/models/loading/sortings/DatedFlightUldSorting';
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
selector: 'app-dated-flight-uld-list',
templateUrl: './dated-flight-uld-list.component.html',
styleUrls: ['./dated-flight-uld-list.component.scss']
})
export class DatedFlightUldListComponent implements OnInit, AfterViewInit {

id:number;
activePath:string;
scrollForm: ScrollForm<DatedFlightUldFilter, DatedFlightUldSorting> = new ScrollForm();
scrollView: ScrollView<DatedFlightUldBasicView> = new ScrollView();
dataSource:MatTableDataSource<DatedFlightUldBasicView>;
@ViewChild(MatPaginator) paginator: MatPaginator;
@ViewChild(MatSort) sort: MatSort
pageSizeOptions: number[] = [10, 20, 50, 100];
displayedColumns: string[] = ['uldTypeCode','uldCode','uldOwnerCode','grossWeight','grossWeightUnitOfMeasureCode','Actions'];
filter: FormGroup;

constructor(private service:DatedFlightUldRestClient, private route: ActivatedRoute, private formBuilder: FormBuilder, private dialog: MatDialog, private notifications: NotificationService) {
this.id = parseInt(this.route.snapshot.paramMap.get('id'));
this.activePath = '/dated-flight/' + this.id.toString() + '/dated-flight-uld/list';
}
ngOnInit(): void {
this.filter = this.formBuilder.group({
uldTypeCode:[null],
uldCode:[null],
uldOwnerCode:[null]})
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
this.scrollForm.sorting = new DatedFlightUldSorting();
switch (this.sort.active) {
case 'uldTypeCode': this.scrollForm.sorting.uldTypeCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'uldCode': this.scrollForm.sorting.uldCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'uldOwnerCode': this.scrollForm.sorting.uldOwnerCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossWeight': this.scrollForm.sorting.grossWeightOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'grossWeightUnitOfMeasureCode': this.scrollForm.sorting.grossWeightUnitOfMeasureCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
}
this.refresh();
});

this.filter.controls['uldTypeCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.uldTypeCode=value;
this.refresh();
});
this.filter.controls['uldCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.uldCode=value;
this.refresh();
});
this.filter.controls['uldOwnerCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.uldOwnerCode=value;
this.refresh();
});
}

refresh(): void {
this.service.scrollFromDatedFlight(this.id, this.scrollForm).subscribe((t) => {
this.scrollView=t;
this.dataSource = new MatTableDataSource(this.scrollView.elements);
});
}

reset(): void {
this.scrollForm = new ScrollForm();
this.scrollForm.filter = new DatedFlightUldFilter();
this.scrollForm.sorting = new DatedFlightUldSorting();
this.scrollForm.page=1;
this.scrollForm.elementsPerPage=10;
this.filter.patchValue({
uldTypeCode: [null],
uldCode: [null],
uldOwnerCode: [null]
})
this.refresh();
}

create(): void {
this.service.create().subscribe((t) => {
let ref = this.dialog.open(DatedFlightUldModalComponent);
ref.componentInstance.view = t;
ref.componentInstance.parentId = this.id;
ref.afterClosed().subscribe(result => {this.refresh();});
});
}

edit(id: number): void {
this.service.load(id).subscribe((t) => {
let ref = this.dialog.open(DatedFlightUldModalComponent);
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
