import { AirWaybillBasicView } from 'src/app/features/models/shipments/views/basic/AirWaybillBasicView';
import { AirWaybillFilter } from 'src/app/features/models/shipments/filters/AirWaybillFilter';
import { AirWaybillForm } from 'src/app/features/models/shipments/forms/AirWaybillForm';
import { AirWaybillFullView } from 'src/app/features/models/shipments/views/full/AirWaybillFullView';
import { AirWaybillSorting } from 'src/app/features/models/shipments/sortings/AirWaybillSorting';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ScrollForm } from 'src/app/core/models/ScrollForm';
import { ScrollView } from 'src/app/core/models/ScrollView';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { environment } from 'src/environments/environment';

/**
 * auto generated rest client ts file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Injectable({providedIn:'root'})
export class AirWaybillRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * get options
 */
public searchOptions(arg:string) {
return this.http.post<SelectItem[]>(environment.restApiUrl + '/air-waybill/options/search', arg, this.httpOptions);
}

/**
 * load object list
 */
public loadList() {
return this.http.get<AirWaybillBasicView[]>(environment.restApiUrl + '/air-waybill/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<AirWaybillFilter, AirWaybillSorting>) {
return this.http.post<ScrollView<AirWaybillBasicView>>(environment.restApiUrl + '/air-waybill/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<AirWaybillFullView>(environment.restApiUrl + '/air-waybill/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<AirWaybillFullView>(environment.restApiUrl + '/air-waybill/new');
}

/**
 * save object
 */
public save(form: AirWaybillForm) {
return this.http.post<number>(environment.restApiUrl + '/air-waybill', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: AirWaybillForm) {
return this.http.put(environment.restApiUrl + '/air-waybill/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/air-waybill/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
