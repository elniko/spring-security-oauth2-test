import { Injectable } from '@angular/core';
import {AccountIdentification} from "../model/account.identification";

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  constructor() { }

  accountIdentifications: AccountIdentification[] = [
    {
      "iban": "LOL000001",
      "other": {
        "identification" : "some identification",
        "issuer": "some issuer",
        "schemeName": "Scheme"
      }
    },
    {
      "iban": "LOL000002",
      "other": {
        "identification" : "some identification 2",
        "issuer": "some issuer 2",
        "schemeName": "Scheme 2"
      }
    }
  ];

  getAccountIdentifications():AccountIdentification[] {
    return this.accountIdentifications;
  }


}
