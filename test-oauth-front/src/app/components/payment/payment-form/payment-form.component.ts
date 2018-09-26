import { Component, OnInit } from '@angular/core';
import {Amount} from "../../../model/balance";
import {FormControl, Validators} from '@angular/forms';
import {PaymentService} from "../../../services/payment.service";
import {MatSnackBar, MatDialog} from '@angular/material';

export interface Currency {
  value: string;
  viewValue: string;
}


@Component({
  selector: 'dialog-data-example-dialog',
  template:
  '<div><h2>Details</h2>' +
  '<iframe src="api/redirect"></iframe>' +

  '<button mat-dialog-close mat-button>Close</button></div>',

})
export class DialogDataExampleDialog2 {
  constructor() {
  }
}



@Component({
  selector: 'app-payment-form',
  templateUrl: './payment-form.component.html',
  styleUrls: ['./payment-form.component.css']
})
export class PaymentFormComponent implements OnInit {

  isPaymentDisabled = true;

  currencies: Currency[] = [
    {value: 'EUR', viewValue: 'EUR'},
    {value: 'USD', viewValue: 'USD'},
    {value: 'RUB', viewValue: 'RUB'}
  ];

  amountControl = new FormControl('', [Validators.required]);
  currencyControl = new FormControl('', [Validators.required]);

  constructor(private paymentService: PaymentService, public snackBar: MatSnackBar, public dialog: MatDialog) { }


  ngOnInit() {
  }

  pay() {
    let amount = new Amount();
    amount.amount = this.amountControl.value;
    amount.currency = this.currencyControl.value;
    this.paymentService.amount = amount;




    this.paymentService.pay()
      .subscribe(resp=> {
        this.snackBar.open(JSON.stringify(resp, null, "\t"), "", {
          duration: 2000,
        } )
      },
          error => {
            console.log("Pay error", error);
            if(error.status === 401) {
              this.dialog.open(DialogDataExampleDialog2);
            } else {
              this.snackBar.open(
                JSON.stringify(error.message, null, "\t"),
                "",
                {
                  duration: 5000,
                } );
            }



          });

  }

}
