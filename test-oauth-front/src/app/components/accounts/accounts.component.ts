import { Component, OnInit, Inject } from '@angular/core';
import {ServerService} from "../../services/server.service";
import {UserService} from "../../services/user.service";
import {AccountResource} from "../../model/account.resource";
import {MatTableDataSource} from '@angular/material';
import {MatDialog, MAT_DIALOG_DATA} from '@angular/material';


@Component({
  selector: 'dialog-data-example-dialog',
  template:
  '<div><h2>Details</h2>' +
    '<pre>{{data}}</pre>' +
  '<button mat-dialog-close mat-button>Close</button></div>',

})
export class DialogDataExampleDialog {
  constructor(@Inject(MAT_DIALOG_DATA) public data: number) {
    console.log(data);
  }
}

@Component({
  selector: 'app-accounts',
  templateUrl: './accounts.component.html',
  styleUrls: ['./accounts.component.css']
})
export class AccountsComponent implements OnInit {

  constructor(private server: ServerService, public userService:UserService, public dialog: MatDialog) { }

  accounts: AccountResource[] =  [];
  dataSource = null ;
  columnsToDisplay : string[] = ['name', 'resourceId', 'bicFi', 'details', 'usage', 'cashAccountType', 'product', 'currency', 'psuStatus', 'buttons'];

  ngOnInit() {
    this.server.getAccounts().subscribe(response => {
        this.accounts = response.accounts.map(obj=> new AccountResource(obj));
        this.dataSource = new MatTableDataSource(this.accounts);
    }
    );
  }

  showDetails(element: Object) {
      this.dialog.open(DialogDataExampleDialog, {data : JSON.stringify(element, null, "\t")});
  }

}


