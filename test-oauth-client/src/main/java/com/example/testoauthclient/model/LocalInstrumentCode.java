package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ISO20022: User community specific instrument. Usage: This element is used to specify a local instrument, local clearing option and/or further qualify the service or service level. API: Only \"INST\" value is allowed in order to ask for an SEPA instant Payment. Can only be used if ServiceLevel is equal to \"SEPA\" 
 */
public enum LocalInstrumentCode {
  
  INST("INST");

  private String value;

  LocalInstrumentCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static LocalInstrumentCode fromValue(String text) {
    for (LocalInstrumentCode b : LocalInstrumentCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

