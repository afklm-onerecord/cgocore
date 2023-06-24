import { Component, Input, OnInit } from '@angular/core';
import { NavLink } from 'src/app/core/models/nav-link';
/**
 * auto generated menu component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-dated-flight-uld-awb-menu',
templateUrl: './dated-flight-uld-awb-menu.component.html',
styleUrls: ['./dated-flight-uld-awb-menu.component.scss']
})
export class DatedFlightUldAwbMenuComponent implements OnInit {

links:NavLink[];
@Input() id:number;
@Input() activePath:string;

ngOnInit(): void {
this.links=[{text:'Details',path:'/dated-flight-uld-awb/' + this.id.toString()}];
}
}
