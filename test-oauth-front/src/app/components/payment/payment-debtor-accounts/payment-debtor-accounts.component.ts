import { Component, OnInit } from '@angular/core';
import {ServerService} from "../../../services/server.service";
import {AccountResource} from "../../../model/account.resource";
import {MatTableDataSource} from '@angular/material';
import {SelectionModel} from '@angular/cdk/collections';
import {PaymentService} from "../../../services/payment.service";

@Component({
  selector: 'app-payment-debtor-accounts',
  templateUrl: './payment-debtor-accounts.component.html',
  styleUrls: ['./payment-debtor-accounts.component.css']
})
export class PaymentDebtorAccountsComponent implements OnInit {

  constructor(private server: ServerService, private paymentService: PaymentService) {
  }

  accounts: AccountResource[] = [];
  dataSource = null;
  columnsToDisplay : string[] = ['iban','bicFi', 'product', 'details', 'cashAccountType', 'amount', 'currency'];
  selection = new SelectionModel<Object>(false, null);


  select(rowData: AccountResource) {
    this.paymentService.debtorAccountResource = rowData;
    this.selection.select(rowData);
  }


  ngOnInit() {
    this.server.getAccounts().subscribe(response => {
        this.accounts = response.accounts.map(obj => new AccountResource(obj));
        this.dataSource = new MatTableDataSource(this.accounts);
      }
    );
  }
}
