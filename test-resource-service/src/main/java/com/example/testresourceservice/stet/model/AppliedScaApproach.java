package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The ASPSP, based on the SCA approaches proposed by the PISP, choose the one that it can processed, in respect with the preferences and constraints of the PSU and indicates in this field which approach has been chosen 
 */
public enum AppliedScaApproach {
  
  REDIRECT("REDIRECT"),
  
  DECOUPLED("DECOUPLED"),
  
  EMBEDDED("EMBEDDED");

  private String value;

  AppliedScaApproach(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AppliedScaApproach fromValue(String text) {
    for (AppliedScaApproach b : AppliedScaApproach.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

