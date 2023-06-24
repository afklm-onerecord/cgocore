import { Component, Input, OnInit } from '@angular/core';
import { NavLink } from 'src/app/core/models/nav-link';
/**
 * auto generated menu component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-uld-type-menu',
templateUrl: './uld-type-menu.component.html',
styleUrls: ['./uld-type-menu.component.scss']
})
export class UldTypeMenuComponent implements OnInit {

links:NavLink[];
@Input() id:number;
@Input() activePath:string;

ngOnInit(): void {
this.links=[{text:'Details',path:'/uld-type/' + this.id.toString()}];
}
}
