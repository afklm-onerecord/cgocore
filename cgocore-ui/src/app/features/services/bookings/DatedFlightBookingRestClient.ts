import { DatedFlightBookingBasicView } from 'src/app/features/models/bookings/views/basic/DatedFlightBookingBasicView';
import { DatedFlightBookingFilter } from 'src/app/features/models/bookings/filters/DatedFlightBookingFilter';
import { DatedFlightBookingForm } from 'src/app/features/models/bookings/forms/DatedFlightBookingForm';
import { DatedFlightBookingFullView } from 'src/app/features/models/bookings/views/full/DatedFlightBookingFullView';
import { DatedFlightBookingSorting } from 'src/app/features/models/bookings/sortings/DatedFlightBookingSorting';
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
export class DatedFlightBookingRestClient {

private httpOptions = {headers:new HttpHeaders({'Content-Type':'application/json'})};

constructor(private http: HttpClient) { }
/**
 * load object list
 */
public loadList() {
return this.http.get<DatedFlightBookingBasicView[]>(environment.restApiUrl + '/dated-flight-booking/list');
}

/**
 * load object list from datedFlight
 */
public loadListFromDatedFlight (datedFlightId: number) {
return this.http.get<DatedFlightBookingBasicView[]>(environment.restApiUrl + '/dated-flight/' + datedFlightId + '/dated-flight-booking/list');
}

/**
 * load object list from booking
 */
public loadListFromBooking (bookingId: number) {
return this.http.get<DatedFlightBookingBasicView[]>(environment.restApiUrl + '/booking/' + bookingId + '/dated-flight-booking/list');
}

/**
 * scroll object list
 */
public scroll(form: ScrollForm<DatedFlightBookingFilter, DatedFlightBookingSorting>) {
return this.http.post<ScrollView<DatedFlightBookingBasicView>>(environment.restApiUrl + '/dated-flight-booking/scroll', form, this.httpOptions);
}

/**
 * scroll object list from datedFlight
 */
public scrollFromDatedFlight (datedFlightId: number, form: ScrollForm<DatedFlightBookingFilter, DatedFlightBookingSorting>) {
return this.http.post<ScrollView<DatedFlightBookingBasicView>>(environment.restApiUrl + '/dated-flight/' + datedFlightId + '/dated-flight-booking/scroll', form, this.httpOptions);
}

/**
 * scroll object list from booking
 */
public scrollFromBooking (bookingId: number, form: ScrollForm<DatedFlightBookingFilter, DatedFlightBookingSorting>) {
return this.http.post<ScrollView<DatedFlightBookingBasicView>>(environment.restApiUrl + '/booking/' + bookingId + '/dated-flight-booking/scroll', form, this.httpOptions);
}

/**
 * load object
 */
public load(id:number) {
return this.http.get<DatedFlightBookingFullView>(environment.restApiUrl + '/dated-flight-booking/' + id);
}

/**
 * create object
 */
public create() {
return this.http.get<DatedFlightBookingFullView>(environment.restApiUrl + '/dated-flight-booking/new');
}

/**
 * save object
 */
public save(form: DatedFlightBookingForm) {
return this.http.post<number>(environment.restApiUrl + '/dated-flight-booking', form, this.httpOptions);
}

/**
 * update object
 */
public update(id: number, form: DatedFlightBookingForm) {
return this.http.put(environment.restApiUrl + '/dated-flight-booking/' + id, form, this.httpOptions);
}

/**
 * delete object
 */
public delete(id: number) {
return this.http.delete(environment.restApiUrl + '/dated-flight-booking/' + id);
}


/* Specific Code Start */
/* Specific Code End */

}
