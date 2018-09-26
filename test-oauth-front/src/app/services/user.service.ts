import { Injectable } from '@angular/core';
import {User} from "../model/user";

@Injectable({
  providedIn: 'root'
})
export class UserService {
  user: User = null;
  constructor() { }

  getUser():User {
    return this.user;
  }

  setUser(user: User) {
    this.user = user;
  }

  isAdmin():boolean{
    if(this.user)
      return this.user.roles.includes("ROLE_ADMIN");
    return false;
  }

}
