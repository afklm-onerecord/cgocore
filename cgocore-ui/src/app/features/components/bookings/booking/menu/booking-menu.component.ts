import { Component, Input, OnInit } from '@angular/core';
import { NavLink } from 'src/app/core/models/nav-link';
/**
 * auto generated menu component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-booking-menu',
templateUrl: './booking-menu.component.html',
styleUrls: ['./booking-menu.component.scss']
})
export class BookingMenuComponent implements OnInit {

links:NavLink[];
@Input() id:number;
@Input() activePath:string;

ngOnInit(): void {
this.links=[{text:'Details',path:'/booking/' + this.id.toString()},{text:'Dated Flight bookings',path:'/booking/' + this.id.toString() + '/dated-flight-booking/list'}];
}
}
