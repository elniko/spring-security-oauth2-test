package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Payment coverage request structure. The request must rely either on a cash account or a payment card.
 */
@ApiModel(description = "Payment coverage request structure. The request must rely either on a cash account or a payment card.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class PaymentCoverageRequestResource   {
  @JsonProperty("paymentCoverageRequestId")
  private String paymentCoverageRequestId = null;

  @JsonProperty("payee")
  private String payee = null;

  @JsonProperty("instructedAmount")
  private AmountType instructedAmount = null;

  @JsonProperty("accountId")
  private AccountIdentification accountId = null;

  public PaymentCoverageRequestResource paymentCoverageRequestId(String paymentCoverageRequestId) {
    this.paymentCoverageRequestId = paymentCoverageRequestId;
    return this;
  }

   /**
   * Identification of the payment Coverage Request
   * @return paymentCoverageRequestId
  **/
  @ApiModelProperty(required = true, value = "Identification of the payment Coverage Request")
  @NotNull

 @Size(max=35)
  public String getPaymentCoverageRequestId() {
    return paymentCoverageRequestId;
  }

  public void setPaymentCoverageRequestId(String paymentCoverageRequestId) {
    this.paymentCoverageRequestId = paymentCoverageRequestId;
  }

  public PaymentCoverageRequestResource payee(String payee) {
    this.payee = payee;
    return this;
  }

   /**
   * The merchant where the card is accepted as an information to the PSU.
   * @return payee
  **/
  @ApiModelProperty(value = "The merchant where the card is accepted as an information to the PSU.")

 @Size(max=70)
  public String getPayee() {
    return payee;
  }

  public void setPayee(String payee) {
    this.payee = payee;
  }

  public PaymentCoverageRequestResource instructedAmount(AmountType instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

   /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AmountType getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(AmountType instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public PaymentCoverageRequestResource accountId(AccountIdentification accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AccountIdentification getAccountId() {
    return accountId;
  }

  public void setAccountId(AccountIdentification accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCoverageRequestResource paymentCoverageRequestResource = (PaymentCoverageRequestResource) o;
    return Objects.equals(this.paymentCoverageRequestId, paymentCoverageRequestResource.paymentCoverageRequestId) &&
        Objects.equals(this.payee, paymentCoverageRequestResource.payee) &&
        Objects.equals(this.instructedAmount, paymentCoverageRequestResource.instructedAmount) &&
        Objects.equals(this.accountId, paymentCoverageRequestResource.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentCoverageRequestId, payee, instructedAmount, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCoverageRequestResource {\n");

    sb.append("    paymentCoverageRequestId: ").append(toIndentedString(paymentCoverageRequestId)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

