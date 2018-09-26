package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ISO20022: Specifies the high level purpose of the instruction based on a set of pre-defined categories. This is used by the initiating party to provide information concerning the processing of the payment. It is likely to trigger special processing by any of the agents involved in the payment chain. API: The following values are allowed:   - CASH (CashManagementTransfer): Transaction is a general cash management instruction.   - DVPM (DeliverAgainstPayment): Code used to pre-advise the account servicer of a forthcoming deliver against payment instruction. 
 */
public enum CategoryPurposeCode {
  
  CASH("CASH"),
  
  DVPM("DVPM");

  private String value;

  CategoryPurposeCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CategoryPurposeCode fromValue(String text) {
    for (CategoryPurposeCode b : CategoryPurposeCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

