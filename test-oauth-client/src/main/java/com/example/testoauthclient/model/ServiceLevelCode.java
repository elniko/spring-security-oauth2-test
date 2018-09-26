package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ISO20022: Agreement under which or rules under which the transaction should be processed. Specifies a pre-agreed service or level of service between the parties, as published in an external service level code list. API: Only \"SEPA\" (SEPA Credit Transfer) or \"NURG\" (Other Credit Transfer) values are allowed 
 */
public enum ServiceLevelCode {
  
  NURG("NURG"),
  
  SEPA("SEPA");

  private String value;

  ServiceLevelCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ServiceLevelCode fromValue(String text) {
    for (ServiceLevelCode b : ServiceLevelCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

