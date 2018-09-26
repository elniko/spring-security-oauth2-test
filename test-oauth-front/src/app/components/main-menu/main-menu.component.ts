import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';

@Component({
  selector: 'app-main-menu',
  templateUrl: './main-menu.component.html',
  styleUrls: ['./main-menu.component.css']
})
export class MainMenuComponent implements OnInit {

  constructor(private location: Location) { }

  ngOnInit() {


  }

  public isPayment() : Boolean {
    return this.location.path().indexOf("payment") > 0;
  }

}
