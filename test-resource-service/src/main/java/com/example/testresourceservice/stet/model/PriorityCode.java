package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ISO20022: Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the instruction. 
 */
public enum PriorityCode {
  
  HIGH("HIGH"),
  
  NORM("NORM");

  private String value;

  PriorityCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PriorityCode fromValue(String text) {
    for (PriorityCode b : PriorityCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

