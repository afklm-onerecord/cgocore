import { BookingBasicView } from 'src/app/features/models/bookings/views/basic/BookingBasicView';
import { BookingFilter } from 'src/app/features/models/bookings/filters/BookingFilter';
import { BookingForm } from 'src/app/features/models/bookings/forms/BookingForm';
import { BookingFullView } from 'src/app/features/models/bookings/views/full/BookingFullView';
import { BookingSorting } from 'src/app/features/models/bookings/sortings/BookingSorting';
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
export class BookingRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * load object list
 */
public loadList() {
return this.http.get<BookingBasicView[]>(environment.restApiUrl + '/booking/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<BookingFilter, BookingSorting>) {
return this.http.post<ScrollView<BookingBasicView>>(environment.restApiUrl + '/booking/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<BookingFullView>(environment.restApiUrl + '/booking/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<BookingFullView>(environment.restApiUrl + '/booking/new');
}

/**
 * save object
 */
public save(form: BookingForm) {
return this.http.post<number>(environment.restApiUrl + '/booking', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: BookingForm) {
return this.http.put(environment.restApiUrl + '/booking/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/booking/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
