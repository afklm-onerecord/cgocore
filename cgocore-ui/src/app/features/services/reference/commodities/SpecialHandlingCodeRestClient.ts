import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ScrollForm } from 'src/app/core/models/ScrollForm';
import { ScrollView } from 'src/app/core/models/ScrollView';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { SpecialHandlingCodeBasicView } from 'src/app/features/models/reference/commodities/views/basic/SpecialHandlingCodeBasicView';
import { SpecialHandlingCodeFilter } from 'src/app/features/models/reference/commodities/filters/SpecialHandlingCodeFilter';
import { SpecialHandlingCodeForm } from 'src/app/features/models/reference/commodities/forms/SpecialHandlingCodeForm';
import { SpecialHandlingCodeFullView } from 'src/app/features/models/reference/commodities/views/full/SpecialHandlingCodeFullView';
import { SpecialHandlingCodeSorting } from 'src/app/features/models/reference/commodities/sortings/SpecialHandlingCodeSorting';
import { environment } from 'src/environments/environment';

/**
 * auto generated rest client ts file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Injectable({providedIn:'root'})
export class SpecialHandlingCodeRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * get options
 */
public getOptions() {
return this.http.get<SelectItem[]>(environment.restApiUrl + '/special-handling-code/options');
}

/**
 * load object list
 */
public loadList() {
return this.http.get<SpecialHandlingCodeBasicView[]>(environment.restApiUrl + '/special-handling-code/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<SpecialHandlingCodeFilter, SpecialHandlingCodeSorting>) {
return this.http.post<ScrollView<SpecialHandlingCodeBasicView>>(environment.restApiUrl + '/special-handling-code/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<SpecialHandlingCodeFullView>(environment.restApiUrl + '/special-handling-code/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<SpecialHandlingCodeFullView>(environment.restApiUrl + '/special-handling-code/new');
}

/**
 * save object
 */
public save(form: SpecialHandlingCodeForm) {
return this.http.post<number>(environment.restApiUrl + '/special-handling-code', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: SpecialHandlingCodeForm) {
return this.http.put(environment.restApiUrl + '/special-handling-code/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/special-handling-code/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
