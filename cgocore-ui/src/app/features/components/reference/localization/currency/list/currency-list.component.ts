import { Component, OnInit, AfterViewInit, ViewChild } from '@angular/core';
import { ConfirmationModalComponent } from 'src/app/core/components/confirmation-modal/confirmation-modal.component';
import { CurrencyBasicView } from 'src/app/features/models/reference/localization/views/basic/CurrencyBasicView';
import { CurrencyFilter } from 'src/app/features/models/reference/localization/filters/CurrencyFilter';
import { CurrencyForm } from 'src/app/features/models/reference/localization/forms/CurrencyForm';
import { CurrencyFullView } from 'src/app/features/models/reference/localization/views/full/CurrencyFullView';
import { CurrencyModalComponent } from './../modal/currency-modal.component';
import { CurrencyRestClient } from 'src/app/features/services/reference/localization/CurrencyRestClient';
import { CurrencySorting } from 'src/app/features/models/reference/localization/sortings/CurrencySorting';
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
selector: 'app-currency-list',
templateUrl: './currency-list.component.html',
styleUrls: ['./currency-list.component.scss']
})
export class CurrencyListComponent implements OnInit, AfterViewInit {

scrollForm: ScrollForm<CurrencyFilter, CurrencySorting> = new ScrollForm();
scrollView: ScrollView<CurrencyBasicView> = new ScrollView();
dataSource:MatTableDataSource<CurrencyBasicView>;
@ViewChild(MatPaginator) paginator: MatPaginator;
@ViewChild(MatSort) sort: MatSort
pageSizeOptions: number[] = [10, 20, 50, 100];
displayedColumns: string[] = ['isoCode','label','Actions'];
filter: FormGroup;

constructor(private service:CurrencyRestClient, private formBuilder: FormBuilder, private dialog: MatDialog, private notifications: NotificationService) { }
ngOnInit(): void {
this.filter = this.formBuilder.group({
isoCode:[null],
label:[null]})
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
this.scrollForm.sorting = new CurrencySorting();
switch (this.sort.active) {
case 'isoCode': this.scrollForm.sorting.isoCodeOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
case 'label': this.scrollForm.sorting.labelOrderType = StringUtils.emptyToNull(this.sort.direction.toUpperCase());break;
}
this.refresh();
});

this.filter.controls['isoCode'].valueChanges.subscribe(value=>{
this.scrollForm.filter.isoCode=value;
this.refresh();
});
this.filter.controls['label'].valueChanges.subscribe(value=>{
this.scrollForm.filter.label=value;
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
this.scrollForm.filter = new CurrencyFilter();
this.scrollForm.sorting = new CurrencySorting();
this.scrollForm.page=1;
this.scrollForm.elementsPerPage=10;
this.filter.patchValue({
isoCode: [null],
label: [null]
})
this.refresh();
}

create(): void {
this.service.create().subscribe((t) => {
let ref = this.dialog.open(CurrencyModalComponent);
ref.componentInstance.view = t;
ref.afterClosed().subscribe(result => {this.refresh();});
});
}

edit(id: number): void {
this.service.load(id).subscribe((t) => {
let ref = this.dialog.open(CurrencyModalComponent);
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
