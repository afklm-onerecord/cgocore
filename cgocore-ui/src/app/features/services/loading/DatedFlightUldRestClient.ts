import { DatedFlightUldBasicView } from 'src/app/features/models/loading/views/basic/DatedFlightUldBasicView';
import { DatedFlightUldFilter } from 'src/app/features/models/loading/filters/DatedFlightUldFilter';
import { DatedFlightUldForm } from 'src/app/features/models/loading/forms/DatedFlightUldForm';
import { DatedFlightUldFullView } from 'src/app/features/models/loading/views/full/DatedFlightUldFullView';
import { DatedFlightUldSorting } from 'src/app/features/models/loading/sortings/DatedFlightUldSorting';
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
export class DatedFlightUldRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * load object list
 */
public loadList() {
return this.http.get<DatedFlightUldBasicView[]>(environment.restApiUrl + '/dated-flight-uld/list');
}

/**
 * load object list from datedFlight
 */
public loadListFromDatedFlight (datedFlightId: number) {
return this.http.get<DatedFlightUldBasicView[]>(environment.restApiUrl + '/dated-flight/' + datedFlightId + '/dated-flight-uld/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<DatedFlightUldFilter, DatedFlightUldSorting>) {
return this.http.post<ScrollView<DatedFlightUldBasicView>>(environment.restApiUrl + '/dated-flight-uld/scroll', form, this.httpOptions);
}

/**
 * scroll object list from datedFlight
 */
public scrollFromDatedFlight (datedFlightId: number, form: ScrollForm<DatedFlightUldFilter, DatedFlightUldSorting>) {
return this.http.post<ScrollView<DatedFlightUldBasicView>>(environment.restApiUrl + '/dated-flight/' + datedFlightId + '/dated-flight-uld/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<DatedFlightUldFullView>(environment.restApiUrl + '/dated-flight-uld/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<DatedFlightUldFullView>(environment.restApiUrl + '/dated-flight-uld/new');
}

/**
 * save object
 */
public save(form: DatedFlightUldForm) {
return this.http.post<number>(environment.restApiUrl + '/dated-flight-uld', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: DatedFlightUldForm) {
return this.http.put(environment.restApiUrl + '/dated-flight-uld/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/dated-flight-uld/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
