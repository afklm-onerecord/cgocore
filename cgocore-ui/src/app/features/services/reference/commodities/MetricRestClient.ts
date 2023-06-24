import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MetricBasicView } from 'src/app/features/models/reference/commodities/views/basic/MetricBasicView';
import { MetricFilter } from 'src/app/features/models/reference/commodities/filters/MetricFilter';
import { MetricForm } from 'src/app/features/models/reference/commodities/forms/MetricForm';
import { MetricFullView } from 'src/app/features/models/reference/commodities/views/full/MetricFullView';
import { MetricSorting } from 'src/app/features/models/reference/commodities/sortings/MetricSorting';
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
export class MetricRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * get options
 */
public getOptions() {
return this.http.get<SelectItem[]>(environment.restApiUrl + '/metric/options');
}

/**
 * load object list
 */
public loadList() {
return this.http.get<MetricBasicView[]>(environment.restApiUrl + '/metric/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<MetricFilter, MetricSorting>) {
return this.http.post<ScrollView<MetricBasicView>>(environment.restApiUrl + '/metric/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<MetricFullView>(environment.restApiUrl + '/metric/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<MetricFullView>(environment.restApiUrl + '/metric/new');
}

/**
 * save object
 */
public save(form: MetricForm) {
return this.http.post<number>(environment.restApiUrl + '/metric', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: MetricForm) {
return this.http.put(environment.restApiUrl + '/metric/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/metric/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
