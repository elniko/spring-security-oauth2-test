import { Component, OnInit } from '@angular/core';
import {ServerService} from "../../services/server.service";
import {User} from "../../model/user";

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  users: User[];

  constructor(private serverService: ServerService) { }

  ngOnInit() {
    this.serverService.getActiveUsers()
      .subscribe(users => console.log(users));
  }

}
