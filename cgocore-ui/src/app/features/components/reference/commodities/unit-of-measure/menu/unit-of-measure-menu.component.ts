import { Component, Input, OnInit } from '@angular/core';
import { NavLink } from 'src/app/core/models/nav-link';
/**
 * auto generated menu component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-unit-of-measure-menu',
templateUrl: './unit-of-measure-menu.component.html',
styleUrls: ['./unit-of-measure-menu.component.scss']
})
export class UnitOfMeasureMenuComponent implements OnInit {

links:NavLink[];
@Input() id:number;
@Input() activePath:string;

ngOnInit(): void {
this.links=[{text:'Details',path:'/unit-of-measure/' + this.id.toString()}];
}
}
