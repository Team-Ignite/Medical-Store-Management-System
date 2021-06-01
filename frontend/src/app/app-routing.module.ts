import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateMedicineComponent } from './create-medicine/create-medicine.component';
import { MedicineListComponent } from './medicine-list/medicine-list.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { GuardService } from './service/guard.service';
import { UpdateMedicineComponent } from './update-medicine/update-medicine.component';
import { CustomerViewMedicineComponent } from './customer-view-medicine/customer-view-medicine.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { ViewCustomerDetailsComponent } from './view-customer-details/view-customer-details.component';
import {HomeComponent} from './home/home.component';
import { OrderToBePlacedComponent } from './order-to-be-placed/order-to-be-placed.component';
import { from } from 'rxjs';

const routes: Routes = [
  {path:'medicine', component:MedicineListComponent,canActivate:[GuardService]},
  {path:'createMedicine', component:CreateMedicineComponent,canActivate:[GuardService]},
  {path:'customer', component:ViewCustomerDetailsComponent,canActivate:[GuardService]},
  {path:'createCustomer', component:CreateCustomerComponent,canActivate:[GuardService]},
  {path:'', redirectTo:'medicine', pathMatch:'full'},
  { path: 'login', component: LoginComponent },
  { path: 'update-medicine/:id', component: UpdateMedicineComponent,canActivate:[GuardService]},
  { path: 'logout', component: LogoutComponent,canActivate:[GuardService] },
  { path: 'viewMedicine', component: CustomerViewMedicineComponent},
  { path: 'home', component:HomeComponent},
  { path: 'order', component:OrderToBePlacedComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
