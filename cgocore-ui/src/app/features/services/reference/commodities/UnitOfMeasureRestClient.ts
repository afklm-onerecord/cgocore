import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ScrollForm } from 'src/app/core/models/ScrollForm';
import { ScrollView } from 'src/app/core/models/ScrollView';
import { SelectItem } from 'src/app/core/models/SelectItem';
import { UnitOfMeasureBasicView } from 'src/app/features/models/reference/commodities/views/basic/UnitOfMeasureBasicView';
import { UnitOfMeasureFilter } from 'src/app/features/models/reference/commodities/filters/UnitOfMeasureFilter';
import { UnitOfMeasureForm } from 'src/app/features/models/reference/commodities/forms/UnitOfMeasureForm';
import { UnitOfMeasureFullView } from 'src/app/features/models/reference/commodities/views/full/UnitOfMeasureFullView';
import { UnitOfMeasureSorting } from 'src/app/features/models/reference/commodities/sortings/UnitOfMeasureSorting';
import { environment } from 'src/environments/environment';

/**
 * auto generated rest client ts file
 * <br/>no modification should be done to this file
 * <br/>processed by skeleton-generator
 */
@Injectable({providedIn:'root'})
export class UnitOfMeasureRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * get options
 */
public getOptions() {
return this.http.get<SelectItem[]>(environment.restApiUrl + '/unit-of-measure/options');
}

/**
 * load object list
 */
public loadList() {
return this.http.get<UnitOfMeasureBasicView[]>(environment.restApiUrl + '/unit-of-measure/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<UnitOfMeasureFilter, UnitOfMeasureSorting>) {
return this.http.post<ScrollView<UnitOfMeasureBasicView>>(environment.restApiUrl + '/unit-of-measure/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<UnitOfMeasureFullView>(environment.restApiUrl + '/unit-of-measure/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<UnitOfMeasureFullView>(environment.restApiUrl + '/unit-of-measure/new');
}

/**
 * save object
 */
public save(form: UnitOfMeasureForm) {
return this.http.post<number>(environment.restApiUrl + '/unit-of-measure', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: UnitOfMeasureForm) {
return this.http.put(environment.restApiUrl + '/unit-of-measure/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/unit-of-measure/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
