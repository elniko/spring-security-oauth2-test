import { Component, OnInit } from '@angular/core';
import {ServerService} from "../../services/server.service";
import {User} from "../../model/user";
import {UserService} from "../../services/user.service";

@Component({
  selector: 'app-current-user',
  templateUrl: './current-user.component.html',
  styleUrls: ['./current-user.component.css']
})
export class CurrentUserComponent implements OnInit {

  constructor(private serverService: ServerService, public userService: UserService) { }

  user: User = null;

  ngOnInit() {
    this.serverService.getUser(false).subscribe(user => this.userService.setUser(user));
  }

  login() {
    this.serverService.getUser()
      .subscribe(user => {
        console.log(user);
        this.userService.setUser(user)
      });
  }

  logout() {
      this.serverService.logout().subscribe(resp=> this.userService.setUser(null));
     // window.location.href = "api/redirectLogout"
  }

}
