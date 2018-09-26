import { Component, OnInit } from '@angular/core';
import {AccountService} from "../../services/account.service";
import {AccountIdentification} from "../../model/account.identification";
import {MatTableDataSource} from '@angular/material';
import {UserService} from "../../services/user.service";


@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {

  constructor(public userService:UserService) { }

  ngOnInit() {

  }


}
