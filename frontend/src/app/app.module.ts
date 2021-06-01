import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MedicineListComponent } from './medicine-list/medicine-list.component';
import { CreateMedicineComponent } from './create-medicine/create-medicine.component';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { UpdateMedicineComponent } from './update-medicine/update-medicine.component';
import { NgxPaginationModule } from 'ngx-pagination';
import { HomeComponent } from './home/home.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { CustomerViewMedicineComponent } from './customer-view-medicine/customer-view-medicine.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { ViewCustomerDetailsComponent } from './view-customer-details/view-customer-details.component';
import { OrderToBePlacedComponent } from './order-to-be-placed/order-to-be-placed.component';

@NgModule({
  declarations: [
    AppComponent,
    MedicineListComponent,
    CreateMedicineComponent,
    LoginComponent,
    LogoutComponent,
    UpdateMedicineComponent,
    HomeComponent,
    CustomerViewMedicineComponent,
    CreateCustomerComponent,
    ViewCustomerDetailsComponent,
    OrderToBePlacedComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgxPaginationModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
