import { Component, Input, OnInit } from '@angular/core';
import { NavLink } from 'src/app/core/models/nav-link';
/**
 * auto generated menu component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-dated-flight-menu',
templateUrl: './dated-flight-menu.component.html',
styleUrls: ['./dated-flight-menu.component.scss']
})
export class DatedFlightMenuComponent implements OnInit {

links:NavLink[];
@Input() id:number;
@Input() activePath:string;

ngOnInit(): void {
this.links=[{text:'Details',path:'/dated-flight/' + this.id.toString()},{text:'Dated Flight bookings',path:'/dated-flight/' + this.id.toString() + '/dated-flight-booking/list'},{text:'Dated Flight ULDs',path:'/dated-flight/' + this.id.toString() + '/dated-flight-uld/list'}];
}
}
