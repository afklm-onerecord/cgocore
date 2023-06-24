import { CurrencyBasicView } from 'src/app/features/models/reference/localization/views/basic/CurrencyBasicView';
import { CurrencyFilter } from 'src/app/features/models/reference/localization/filters/CurrencyFilter';
import { CurrencyForm } from 'src/app/features/models/reference/localization/forms/CurrencyForm';
import { CurrencyFullView } from 'src/app/features/models/reference/localization/views/full/CurrencyFullView';
import { CurrencySorting } from 'src/app/features/models/reference/localization/sortings/CurrencySorting';
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
export class CurrencyRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * get options
 */
public searchOptions(arg:string) {
return this.http.post<SelectItem[]>(environment.restApiUrl + '/currency/options/search', arg, this.httpOptions);
}

/**
 * load object list
 */
public loadList() {
return this.http.get<CurrencyBasicView[]>(environment.restApiUrl + '/currency/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<CurrencyFilter, CurrencySorting>) {
return this.http.post<ScrollView<CurrencyBasicView>>(environment.restApiUrl + '/currency/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<CurrencyFullView>(environment.restApiUrl + '/currency/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<CurrencyFullView>(environment.restApiUrl + '/currency/new');
}

/**
 * save object
 */
public save(form: CurrencyForm) {
return this.http.post<number>(environment.restApiUrl + '/currency', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: CurrencyForm) {
return this.http.put(environment.restApiUrl + '/currency/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/currency/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
