import { DatedFlightBasicView } from 'src/app/features/models/schedule/views/basic/DatedFlightBasicView';
import { DatedFlightFilter } from 'src/app/features/models/schedule/filters/DatedFlightFilter';
import { DatedFlightForm } from 'src/app/features/models/schedule/forms/DatedFlightForm';
import { DatedFlightFullView } from 'src/app/features/models/schedule/views/full/DatedFlightFullView';
import { DatedFlightSorting } from 'src/app/features/models/schedule/sortings/DatedFlightSorting';
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
export class DatedFlightRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * load object list
 */
public loadList() {
return this.http.get<DatedFlightBasicView[]>(environment.restApiUrl + '/dated-flight/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<DatedFlightFilter, DatedFlightSorting>) {
return this.http.post<ScrollView<DatedFlightBasicView>>(environment.restApiUrl + '/dated-flight/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<DatedFlightFullView>(environment.restApiUrl + '/dated-flight/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<DatedFlightFullView>(environment.restApiUrl + '/dated-flight/new');
}

/**
 * save object
 */
public save(form: DatedFlightForm) {
return this.http.post<number>(environment.restApiUrl + '/dated-flight', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: DatedFlightForm) {
return this.http.put(environment.restApiUrl + '/dated-flight/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/dated-flight/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
