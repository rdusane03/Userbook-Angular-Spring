import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HeaderComponent } from './core/header/header.component';
import { ViewUserComponent } from './user/view-user/view-user.component';
import { AddUserComponent } from './user/add-user/add-user.component';

const routes: Routes = [
    
  { path: 'header', component: HeaderComponent },
  { path:'view-user', component: ViewUserComponent},
  {path:'add-user', component:AddUserComponent}
];

export const routing = RouterModule.forRoot(routes);
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
