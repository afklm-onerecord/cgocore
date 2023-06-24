import { Component, Input, OnInit } from '@angular/core';
import { NavLink } from 'src/app/core/models/nav-link';
/**
 * auto generated menu component ts file
 * <br/>write modifications between specific code marks
 * <br/>processed by skeleton-generator
 */

@Component({
selector: 'app-special-handling-code-menu',
templateUrl: './special-handling-code-menu.component.html',
styleUrls: ['./special-handling-code-menu.component.scss']
})
export class SpecialHandlingCodeMenuComponent implements OnInit {

links:NavLink[];
@Input() id:number;
@Input() activePath:string;

ngOnInit(): void {
this.links=[{text:'Details',path:'/special-handling-code/' + this.id.toString()}];
}
}
