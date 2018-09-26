package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ISO20022: Specifies the status of the payment information. API: Mandatory. The following values are allowed to provide the status of the Payment or Transfer Request   - ACCP (AcceptedCustomerProfile): Preceding check of technical validation was successful. Customer profile check was also successful.   - ACSC (AcceptedSettlementCompleted): Settlement on the debtor's account has been completed.   - ACSP (AcceptedSettlementInProcess): All preceding checks such as technical validation and customer profile were successful. Dynamic risk assessment is now also successful and therefore the Payment or Transfer Request has been accepted for execution.   - ACTC (AcceptedTechnicalValidation): Authentication and syntactical and semantical validation are successful.   - ACWC (AcceptedWithChange): Instruction is accepted but a change will be made, such as date or remittance not sent.   - ACWP (AcceptedWithoutPosting): Payment instruction included in the credit transfer is accepted without being posted to the creditor customerâ€™s account.   - RCVD (Received): Payment initiation has been received by the receiving agent.   - PDNG (Pending): Payment request or individual transaction included in the Payment or Transfer Request is pending. Further checks and status update will be performed.   - RJCT (Rejected): Payment request  has been rejected. 
 */
public enum PaymentTransferInformationStatusCode {
  
  ACCP("ACCP"),
  
  ACSC("ACSC"),
  
  ACSP("ACSP"),
  
  ACTC("ACTC"),
  
  ACWC("ACWC"),
  
  ACWP("ACWP"),
  
  RCVD("RCVD"),
  
  PNDG("PNDG"),
  
  RJCT("RJCT");

  private String value;

  PaymentTransferInformationStatusCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentTransferInformationStatusCode fromValue(String text) {
    for (PaymentTransferInformationStatusCode b : PaymentTransferInformationStatusCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

