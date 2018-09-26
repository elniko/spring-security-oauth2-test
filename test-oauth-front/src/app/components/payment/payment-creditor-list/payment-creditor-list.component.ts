import { Component, OnInit } from '@angular/core';
import {Input} from '@angular/core';
import {MatTableDataSource} from '@angular/material';
import {DataSource} from '@angular/cdk/collections';
import {SelectionModel} from '@angular/cdk/collections';
import {AccountService} from "../../../services/account.service";
import {PaymentService} from "../../../services/payment.service";
import {AccountIdentification} from "../../../model/account.identification";

@Component({
  selector: 'app-payment-creditor-list',
  templateUrl: './payment-creditor-list.component.html',
  styleUrls: ['./payment-creditor-list.component.css']
})
export class PaymentCreditorListComponent implements OnInit {

  dataSource = null;
  selection = new SelectionModel<Object>(false, null);
  columnsToDisplay =['iban', 'identification', 'schema', 'issuer'];

  constructor(private accountIdentificationService: AccountService, private paymentService: PaymentService) { }

  ngOnInit() {
    this.dataSource = new MatTableDataSource(this.accountIdentificationService.getAccountIdentifications());
  }

  select(rowData: AccountIdentification) {
    this.paymentService.creditorAccountIdentification = rowData;
    this.selection.select(rowData);
  }

}
