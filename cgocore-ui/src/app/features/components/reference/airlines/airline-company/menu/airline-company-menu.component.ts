import { Component, Input, OnInit } from '@angular/core';
import { NavLink } from 'src/app/core/models/nav-link';
/**
 * auto generated menu component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-airline-company-menu',
templateUrl: './airline-company-menu.component.html',
styleUrls: ['./airline-company-menu.component.scss']
})
export class AirlineCompanyMenuComponent implements OnInit {

links:NavLink[];
@Input() id:number;
@Input() activePath:string;

ngOnInit(): void {
this.links=[{text:'Details',path:'/airline-company/' + this.id.toString()}];
}
}
