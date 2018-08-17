package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of balance - CLBD: (ISO20022 ClosingBooked) Accounting Balance - XPCD: (ISO20022 Expected) Instant Balance - VALU: Value-date balance - OTHR: Other Balance 
 */
public enum BalanceStatus {
  
  CLBD("CLBD"),
  
  XPCD("XPCD"),
  
  VALU("VALU"),
  
  OTHR("OTHR");

  private String value;

  BalanceStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BalanceStatus fromValue(String text) {
    for (BalanceStatus b : BalanceStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

