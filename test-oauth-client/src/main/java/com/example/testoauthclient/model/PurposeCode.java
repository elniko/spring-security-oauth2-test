package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ISO20022: Underlying reason for the payment transaction, as published in an external purpose code list. API: The following values are allowed for Payment  Request   - ACCT (Funds moved between 2 accounts of same account holder at the same bank)   - CASH (general cash management instruction) may be used for Transfer Initiation   - COMC Transaction is related to a payment of commercial credit or debit.   - CPKC General Carpark Charges Transaction is related to carpark charges.   - TRPT Transport RoadPricing Transaction is for the payment to top-up pre-paid card and electronic road pricing for the purpose of transportation 
 */
public enum PurposeCode {
  
  ACCT("ACCT"),
  
  CASH("CASH"),
  
  COMC("COMC"),
  
  CPKC("CPKC"),
  
  TRPT("TRPT");

  private String value;

  PurposeCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PurposeCode fromValue(String text) {
    for (PurposeCode b : PurposeCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

