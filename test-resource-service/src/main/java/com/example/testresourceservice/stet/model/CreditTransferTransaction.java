package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * ISO20022: Payment processes required to transfer cash from the debtor to the creditor. 
 */
@ApiModel(description = "ISO20022: Payment processes required to transfer cash from the debtor to the creditor. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class CreditTransferTransaction   {
  @JsonProperty("paymentId")
  private PaymentIdentification paymentId = null;

  @JsonProperty("requestedExecutionDate")
  private DateTime requestedExecutionDate = null;

  @JsonProperty("instructedAmount")
  private AmountType instructedAmount = null;

  @JsonProperty("regulatoryReportingCode")
  private String regulatoryReportingCode = null;

  @JsonProperty("remittanceInformation")
  private UnstructuredRemittanceInformation remittanceInformation = null;

  @JsonProperty("transactionStatus")
  private TransactionIndividualStatusCode transactionStatus = null;

  @JsonProperty("statusReasonInformation")
  private StatusReasonInformation statusReasonInformation = null;

  public CreditTransferTransaction paymentId(PaymentIdentification paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * Get paymentId
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PaymentIdentification getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(PaymentIdentification paymentId) {
    this.paymentId = paymentId;
  }

  public CreditTransferTransaction requestedExecutionDate(DateTime requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
    return this;
  }

   /**
   * ISO20022: Date at which the initiating party requests the clearing agent to process the payment. 
   * @return requestedExecutionDate
  **/
  @ApiModelProperty(required = true, value = "ISO20022: Date at which the initiating party requests the clearing agent to process the payment. ")
  @NotNull

  @Valid

  public DateTime getRequestedExecutionDate() {
    return requestedExecutionDate;
  }

  public void setRequestedExecutionDate(DateTime requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
  }

  public CreditTransferTransaction instructedAmount(AmountType instructedAmount) {
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

  public CreditTransferTransaction regulatoryReportingCode(String regulatoryReportingCode) {
    this.regulatoryReportingCode = regulatoryReportingCode;
    return this;
  }

   /**
   * Information needed due to regulatory and statutory requirements. Economical codes to be used are provided by the National Competent Authority 
   * @return regulatoryReportingCode
  **/
  @ApiModelProperty(value = "Information needed due to regulatory and statutory requirements. Economical codes to be used are provided by the National Competent Authority ")

 @Size(max=10)
  public String getRegulatoryReportingCode() {
    return regulatoryReportingCode;
  }

  public void setRegulatoryReportingCode(String regulatoryReportingCode) {
    this.regulatoryReportingCode = regulatoryReportingCode;
  }

  public CreditTransferTransaction remittanceInformation(UnstructuredRemittanceInformation remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
    return this;
  }

   /**
   * Get remittanceInformation
   * @return remittanceInformation
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UnstructuredRemittanceInformation getRemittanceInformation() {
    return remittanceInformation;
  }

  public void setRemittanceInformation(UnstructuredRemittanceInformation remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
  }

  public CreditTransferTransaction transactionStatus(TransactionIndividualStatusCode transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Get transactionStatus
   * @return transactionStatus
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionIndividualStatusCode getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(TransactionIndividualStatusCode transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public CreditTransferTransaction statusReasonInformation(StatusReasonInformation statusReasonInformation) {
    this.statusReasonInformation = statusReasonInformation;
    return this;
  }

   /**
   * Get statusReasonInformation
   * @return statusReasonInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StatusReasonInformation getStatusReasonInformation() {
    return statusReasonInformation;
  }

  public void setStatusReasonInformation(StatusReasonInformation statusReasonInformation) {
    this.statusReasonInformation = statusReasonInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditTransferTransaction creditTransferTransaction = (CreditTransferTransaction) o;
    return Objects.equals(this.paymentId, creditTransferTransaction.paymentId) &&
        Objects.equals(this.requestedExecutionDate, creditTransferTransaction.requestedExecutionDate) &&
        Objects.equals(this.instructedAmount, creditTransferTransaction.instructedAmount) &&
        Objects.equals(this.regulatoryReportingCode, creditTransferTransaction.regulatoryReportingCode) &&
        Objects.equals(this.remittanceInformation, creditTransferTransaction.remittanceInformation) &&
        Objects.equals(this.transactionStatus, creditTransferTransaction.transactionStatus) &&
        Objects.equals(this.statusReasonInformation, creditTransferTransaction.statusReasonInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, requestedExecutionDate, instructedAmount, regulatoryReportingCode, remittanceInformation, transactionStatus, statusReasonInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditTransferTransaction {\n");

    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    requestedExecutionDate: ").append(toIndentedString(requestedExecutionDate)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    regulatoryReportingCode: ").append(toIndentedString(regulatoryReportingCode)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    statusReasonInformation: ").append(toIndentedString(statusReasonInformation)).append("\n");
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

