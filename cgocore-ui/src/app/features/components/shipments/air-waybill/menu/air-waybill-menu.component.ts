import { Component, Input, OnInit } from '@angular/core';
import { NavLink } from 'src/app/core/models/nav-link';
/**
 * auto generated menu component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-air-waybill-menu',
templateUrl: './air-waybill-menu.component.html',
styleUrls: ['./air-waybill-menu.component.scss']
})
export class AirWaybillMenuComponent implements OnInit {

links:NavLink[];
@Input() id:number;
@Input() activePath:string;

ngOnInit(): void {
this.links=[{text:'Details',path:'/air-waybill/' + this.id.toString()}];
}
}
