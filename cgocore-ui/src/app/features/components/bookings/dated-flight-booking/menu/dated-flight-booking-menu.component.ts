import { Component, Input, OnInit } from '@angular/core';
import { NavLink } from 'src/app/core/models/nav-link';
/**
 * auto generated menu component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-dated-flight-booking-menu',
templateUrl: './dated-flight-booking-menu.component.html',
styleUrls: ['./dated-flight-booking-menu.component.scss']
})
export class DatedFlightBookingMenuComponent implements OnInit {

links:NavLink[];
@Input() id:number;
@Input() activePath:string;

ngOnInit(): void {
this.links=[{text:'Details',path:'/dated-flight-booking/' + this.id.toString()}];
}
}
