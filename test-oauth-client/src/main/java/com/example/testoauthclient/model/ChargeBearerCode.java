package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ISO20022: Specifies which party/parties will bear the charges associated with the processing of the payment transaction. API: The following values are allowed for Payment  Request   - SLEV:  Charges are to be applied following the rules agreed in the service level and/or scheme. 
 */
public enum ChargeBearerCode {
  
  SLEV("SLEV");

  private String value;

  ChargeBearerCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChargeBearerCode fromValue(String text) {
    for (ChargeBearerCode b : ChargeBearerCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

