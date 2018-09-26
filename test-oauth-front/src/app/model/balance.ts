export class Balance {
  name: string;
  balanceAmount: Amount;
  balanceType: string;
  lastChangeDateTime: Date;
  referenceDate: Date;
  lastCommittedTransaction: string;
}

export class Amount {
  currency: string;
  amount: string;
}
