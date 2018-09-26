import { Injectable } from '@angular/core';
import {AccountResource} from "../model/account.resource";
import {AccountIdentification} from "../model/account.identification";
import {Amount} from "../model/balance";
import {ServerService} from "./server.service";
import {MatSnackBar} from '@angular/material';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {

  constructor(private server: ServerService) { }

  debtorAccountResource: AccountResource = null;
  creditorAccountIdentification: AccountIdentification = null;
  amount: Amount = null;

  pay(): Observable<Object> {

    //this.server.logout().subscribe(lol=> console.log(lol));


    return this.server.pay(this.debtorAccountResource, this.creditorAccountIdentification, this.amount);
      //.subscribe(lol=>console.log(lol));
  }


}
