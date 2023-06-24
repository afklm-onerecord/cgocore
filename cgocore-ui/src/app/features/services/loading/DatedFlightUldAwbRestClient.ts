import { DatedFlightUldAwbBasicView } from 'src/app/features/models/loading/views/basic/DatedFlightUldAwbBasicView';
import { DatedFlightUldAwbFilter } from 'src/app/features/models/loading/filters/DatedFlightUldAwbFilter';
import { DatedFlightUldAwbForm } from 'src/app/features/models/loading/forms/DatedFlightUldAwbForm';
import { DatedFlightUldAwbFullView } from 'src/app/features/models/loading/views/full/DatedFlightUldAwbFullView';
import { DatedFlightUldAwbSorting } from 'src/app/features/models/loading/sortings/DatedFlightUldAwbSorting';
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
export class DatedFlightUldAwbRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * load object list
 */
public loadList() {
return this.http.get<DatedFlightUldAwbBasicView[]>(environment.restApiUrl + '/dated-flight-uld-awb/list');
}

/**
 * load object list from datedFlightUld
 */
public loadListFromDatedFlightUld (datedFlightUldId: number) {
return this.http.get<DatedFlightUldAwbBasicView[]>(environment.restApiUrl + '/dated-flight-uld/' + datedFlightUldId + '/dated-flight-uld-awb/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<DatedFlightUldAwbFilter, DatedFlightUldAwbSorting>) {
return this.http.post<ScrollView<DatedFlightUldAwbBasicView>>(environment.restApiUrl + '/dated-flight-uld-awb/scroll', form, this.httpOptions);
}

/**
 * scroll object list from datedFlightUld
 */
public scrollFromDatedFlightUld (datedFlightUldId: number, form: ScrollForm<DatedFlightUldAwbFilter, DatedFlightUldAwbSorting>) {
return this.http.post<ScrollView<DatedFlightUldAwbBasicView>>(environment.restApiUrl + '/dated-flight-uld/' + datedFlightUldId + '/dated-flight-uld-awb/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<DatedFlightUldAwbFullView>(environment.restApiUrl + '/dated-flight-uld-awb/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<DatedFlightUldAwbFullView>(environment.restApiUrl + '/dated-flight-uld-awb/new');
}

/**
 * save object
 */
public save(form: DatedFlightUldAwbForm) {
return this.http.post<number>(environment.restApiUrl + '/dated-flight-uld-awb', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: DatedFlightUldAwbForm) {
return this.http.put(environment.restApiUrl + '/dated-flight-uld-awb/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/dated-flight-uld-awb/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
