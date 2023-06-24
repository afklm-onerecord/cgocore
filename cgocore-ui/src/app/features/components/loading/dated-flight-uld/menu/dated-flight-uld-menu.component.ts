import { Component, Input, OnInit } from '@angular/core';
import { NavLink } from 'src/app/core/models/nav-link';
/**
 * auto generated menu component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-dated-flight-uld-menu',
templateUrl: './dated-flight-uld-menu.component.html',
styleUrls: ['./dated-flight-uld-menu.component.scss']
})
export class DatedFlightUldMenuComponent implements OnInit {

links:NavLink[];
@Input() id:number;
@Input() activePath:string;

ngOnInit(): void {
this.links=[{text:'Details',path:'/dated-flight-uld/' + this.id.toString()},{text:'Dated Flight ULD AWBs',path:'/dated-flight-uld/' + this.id.toString() + '/dated-flight-uld-awb/list'}];
}
}
