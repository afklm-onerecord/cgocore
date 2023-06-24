import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ScrollForm } from 'src/app/core/models/ScrollForm';
import { ScrollView } from 'src/app/core/models/ScrollView';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { UldTypeBasicView } from 'src/app/features/models/reference/containers/views/basic/UldTypeBasicView';
import { UldTypeFilter } from 'src/app/features/models/reference/containers/filters/UldTypeFilter';
import { UldTypeForm } from 'src/app/features/models/reference/containers/forms/UldTypeForm';
import { UldTypeFullView } from 'src/app/features/models/reference/containers/views/full/UldTypeFullView';
import { UldTypeSorting } from 'src/app/features/models/reference/containers/sortings/UldTypeSorting';
import { environment } from 'src/environments/environment';

/**
 * auto generated rest client ts file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Injectable({providedIn:'root'})
export class UldTypeRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * get options
 */
public getOptions() {
return this.http.get<SelectItem[]>(environment.restApiUrl + '/uld-type/options');
}

/**
 * load object list
 */
public loadList() {
return this.http.get<UldTypeBasicView[]>(environment.restApiUrl + '/uld-type/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<UldTypeFilter, UldTypeSorting>) {
return this.http.post<ScrollView<UldTypeBasicView>>(environment.restApiUrl + '/uld-type/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<UldTypeFullView>(environment.restApiUrl + '/uld-type/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<UldTypeFullView>(environment.restApiUrl + '/uld-type/new');
}

/**
 * save object
 */
public save(form: UldTypeForm) {
return this.http.post<number>(environment.restApiUrl + '/uld-type', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: UldTypeForm) {
return this.http.put(environment.restApiUrl + '/uld-type/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/uld-type/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
