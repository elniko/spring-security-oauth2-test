import {AccountIdentification} from "./account.identification";
import {Balance} from "./balance";

export class AccountResource {
  resourceId:string;
  bicFi:string;
  name:string;
  details:string;
  usage:string;
  cashAccountType:string;
  product:string;
  currency:string;
  psuStatus:string;
  rawObject: Object;
  accountId: AccountIdentification;
  balances: Balance[];

  constructor (obj: Object) {
    Object.assign(this, obj);
    this.rawObject = obj;
  }
}
