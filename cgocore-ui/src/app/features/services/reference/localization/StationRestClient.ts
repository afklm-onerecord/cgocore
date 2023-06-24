import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ScrollForm } from 'src/app/core/models/ScrollForm';
import { ScrollView } from 'src/app/core/models/ScrollView';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { StationBasicView } from 'src/app/features/models/reference/localization/views/basic/StationBasicView';
import { StationFilter } from 'src/app/features/models/reference/localization/filters/StationFilter';
import { StationForm } from 'src/app/features/models/reference/localization/forms/StationForm';
import { StationFullView } from 'src/app/features/models/reference/localization/views/full/StationFullView';
import { StationSorting } from 'src/app/features/models/reference/localization/sortings/StationSorting';
import { environment } from 'src/environments/environment';

/**
 * auto generated rest client ts file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Injectable({providedIn:'root'})
export class StationRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * get options
 */
public searchOptions(arg:string) {
return this.http.post<SelectItem[]>(environment.restApiUrl + '/station/options/search', arg, this.httpOptions);
}

/**
 * load object list
 */
public loadList() {
return this.http.get<StationBasicView[]>(environment.restApiUrl + '/station/list');
}

/**
 * load object list from country
 */
public loadListFromCountry (countryId: number) {
return this.http.get<StationBasicView[]>(environment.restApiUrl + '/country/' + countryId + '/station/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<StationFilter, StationSorting>) {
return this.http.post<ScrollView<StationBasicView>>(environment.restApiUrl + '/station/scroll', form, this.httpOptions);
}

/**
 * scroll object list from country
 */
public scrollFromCountry (countryId: number, form: ScrollForm<StationFilter, StationSorting>) {
return this.http.post<ScrollView<StationBasicView>>(environment.restApiUrl + '/country/' + countryId + '/station/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<StationFullView>(environment.restApiUrl + '/station/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<StationFullView>(environment.restApiUrl + '/station/new');
}

/**
 * save object
 */
public save(form: StationForm) {
return this.http.post<number>(environment.restApiUrl + '/station', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: StationForm) {
return this.http.put(environment.restApiUrl + '/station/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/station/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
