package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ISO20022: Specifies the status of the payment information group.  API: Only the following values are allowed to provide the status of the subsequent CREDIT TRANSFER to the Payment Request - RJCT: Payment request or individual transaction included in the Payment Request has been rejected. - PDNG: (Pending): Payment request or individual transaction included in the Payment Request is pending. Further checks and status update will be performed. - ACSP: All preceding checks such as technical validation and customer profile were successful and therefore the Payment Request has been accepted for execution. - ACSC: Settlement on the debtor's account has been completed 
 */
public enum TransactionIndividualStatusCode {
  
  RJCT("RJCT"),
  
  PDNG("PDNG"),
  
  ACSP("ACSP"),
  
  ACSC("ACSC");

  private String value;

  TransactionIndividualStatusCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TransactionIndividualStatusCode fromValue(String text) {
    for (TransactionIndividualStatusCode b : TransactionIndividualStatusCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

