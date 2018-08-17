package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of Transaction - BOOK: (ISO20022 ClosingBooked) Accounted transaction - PDNG: (ISO20022 Expected) Instant Balance Transaction - OTHR: Other 
 */
public enum TransactionStatus {
  
  BOOK("BOOK"),
  
  PDNG("PDNG"),
  
  OTHR("OTHR");

  private String value;

  TransactionStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TransactionStatus fromValue(String text) {
    for (TransactionStatus b : TransactionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

