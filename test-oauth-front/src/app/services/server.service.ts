import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {User} from "../model/user";
import {catchError, map, tap} from 'rxjs/operators';
import {Observable, of, throwError} from 'rxjs';
import {AccountResource} from "../model/account.resource";
import {UserService} from "./user.service";
import {AccountWrapper} from "../model/account.wrapper";
import {AccountIdentification} from "../model/account.identification";
import {Amount} from "../model/balance";

//import { }

@Injectable({
  providedIn: 'root'
})
export class ServerService {

  constructor(private http: HttpClient, public userService: UserService) {
  }


  getUser(redirect: boolean = true): Observable<User> {
    return this.http.get<User>("api/currentUser", {observe: 'response'})
      .pipe(
        tap(resp => console.log(resp.body)),
        map(resp => {
          if (resp.status === 200)
            return resp.body;
        }),
        catchError((err, cc) => {

          if (err.status === 401) {
            this.userService.setUser(null);
            if(redirect)
              window.location.href = "api/redirect";
          }

          return of(null);
        })
      );
  }

  logout() {
    return this.http.get("api/logout")
  }

  getAccounts(): Observable<AccountWrapper> {
    return this.http.get<AccountWrapper>("api/getAccounts", {observe: 'response'})
      .pipe(
        tap(resp => console.log("resp acc", resp.body)),
        map(resp => resp.body),
        catchError((err, cc) => {
          if (err.status === 401)
            this.userService.setUser(null);
          return [];
        })
      );
  }


  getActiveUsers(): Observable<User[]> {
     return this.http.get<User[]>("api/activeUsers", {observe: 'response'})
       .pipe(
         map(resp => resp.body),
         catchError((err, cc) => {
           if (err.status === 401)
             this.userService.setUser(null);
           return [];
         })
       )
  }

  pay(debtor:AccountResource, creditor: AccountIdentification, amount: Amount): Observable<Object> {
    let body = {
      debtor: debtor,
      creditor:creditor,
      amount: amount
    };

   return this.http.post<any>("api/payment", body)
     .pipe(
       tap(lol=> console.log('check', lol)),
       catchError((err) => {
         if (err.status === 401) {
           this.userService.setUser(null);
           return throwError(err);
         }
         else {
           return throwError(err);
         }
       })
     );
  }

}
