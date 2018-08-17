package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ISO20022: Provides detailed information on the status reason.  API: Can only be used in status equal to \"RJCT\". Only the following values are allowed: - AC01 (IncorectAccountNumber): the account number is either invalid or does not exist - AC04 (ClosedAccountNumber): the account is closed and cannot be used - AC06 (BlockedAccount): the account is blocked and cannot be used - AG01 (Transaction forbidden): Transaction forbidden on this type of account - CUST (RequestedByCustomer): The reject is due to the debtor: refusal or lack of liquidity - FF01 (InvalidFileFormat): The reject is due to the original Payment or Transfer Request which is invalid (syntax, structure or values) - FRAD (FraudulentOriginated): the Payment or Transfer Request is considered as fraudulent - MS03 (NotSpecifiedReasonAgentGenerated): No reason specified by the ASPSP - NOAS (NoAnswerFromCustomer): The PSU has neither accepted nor rejected the Payment or Transfer Request and a time-out has occurred - RR01 (MissingDebtorAccountOrIdentification): The Debtor account and/or Identification are missing or inconsistent - RR03 (MissingCreditorNameOrAddress): Specification of the creditorâ€™s name and/or address needed for regulatory requirements is insufficient or missing. - RR04 (RegulatoryReason): Reject from regulatory reason - RR12 (InvalidPartyID): Invalid or missing identification required within a particular country or payment type. 
 */
public enum StatusReasonInformation {
  
  AC01("AC01"),
  
  AC04("AC04"),
  
  AC06("AC06"),
  
  AG01("AG01"),
  
  CUST("CUST"),
  
  FF01("FF01"),
  
  FRAD("FRAD"),
  
  MS03("MS03"),
  
  NOAS("NOAS"),
  
  RR01("RR01"),
  
  RR03("RR03"),
  
  RR04("RR04"),
  
  RR12("RR12");

  private String value;

  StatusReasonInformation(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StatusReasonInformation fromValue(String text) {
    for (StatusReasonInformation b : StatusReasonInformation.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

