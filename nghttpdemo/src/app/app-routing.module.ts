import { NgModule } from '@angular/core';
import {RouterModule, Routes} from "@angular/router";
import {ModeComponent} from "./mode/mode.component";
import {RemoteComponent} from "./remote/remote.component";
import {ShopComponent} from "./shop/shop.component";

const routes: Routes = [
  {path: '', redirectTo: '/mode', pathMatch: 'full'}
  , {path: 'mode', component: ModeComponent}
  , {path: 'remote', component: RemoteComponent}
  , {path: 'shop', component: ShopComponent}];


@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports:[RouterModule]
})
export class AppRoutingModule { }
