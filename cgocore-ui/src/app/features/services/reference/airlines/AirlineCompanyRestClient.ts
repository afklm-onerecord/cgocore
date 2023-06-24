import { AirlineCompanyBasicView } from 'src/app/features/models/reference/airlines/views/basic/AirlineCompanyBasicView';
import { AirlineCompanyFilter } from 'src/app/features/models/reference/airlines/filters/AirlineCompanyFilter';
import { AirlineCompanyForm } from 'src/app/features/models/reference/airlines/forms/AirlineCompanyForm';
import { AirlineCompanyFullView } from 'src/app/features/models/reference/airlines/views/full/AirlineCompanyFullView';
import { AirlineCompanySorting } from 'src/app/features/models/reference/airlines/sortings/AirlineCompanySorting';
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
export class AirlineCompanyRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * get options
 */
public searchOptions(arg:string) {
return this.http.post<SelectItem[]>(environment.restApiUrl + '/airline-company/options/search', arg, this.httpOptions);
}

/**
 * load object list
 */
public loadList() {
return this.http.get<AirlineCompanyBasicView[]>(environment.restApiUrl + '/airline-company/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<AirlineCompanyFilter, AirlineCompanySorting>) {
return this.http.post<ScrollView<AirlineCompanyBasicView>>(environment.restApiUrl + '/airline-company/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<AirlineCompanyFullView>(environment.restApiUrl + '/airline-company/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<AirlineCompanyFullView>(environment.restApiUrl + '/airline-company/new');
}

/**
 * save object
 */
public save(form: AirlineCompanyForm) {
return this.http.post<number>(environment.restApiUrl + '/airline-company', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: AirlineCompanyForm) {
return this.http.put(environment.restApiUrl + '/airline-company/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/airline-company/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
