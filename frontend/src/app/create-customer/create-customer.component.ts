import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerDetails } from '../customer-details';
import{ CustomerServiceService } from '../customer-service.service';

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {

  customer:CustomerDetails = new CustomerDetails();
  constructor(private createService: CustomerServiceService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveMedicine(){
    this.createService.createCustomer(this.customer).subscribe(data=>{
      console.log(data);
      this.goToCustomerList();
    },
    error => console.error(error));
  }

  goToCustomerList(){
    this.router.navigate(['/customer'])
  }
  onSubmit(){
    console.log(this.customer);
    this.saveMedicine();
  }


}
