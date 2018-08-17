package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * structure of a transaction
 */
@ApiModel(description = "structure of a transaction")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class Transaction   {
  @JsonProperty("resourceId")
  private String resourceId = null;

  @JsonProperty("entryReference")
  private String entryReference = null;

  @JsonProperty("transactionAmount")
  private AmountType transactionAmount = null;

  /**
   * Accounting flow of the transaction - CRDT: Credit type transaction - DBIT: Debit type transaction 
   */
  public enum CreditDebitIndicatorEnum {
    CRDT("CRDT"),
    
    DBIT("DBIT");

    private String value;

    CreditDebitIndicatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CreditDebitIndicatorEnum fromValue(String text) {
      for (CreditDebitIndicatorEnum b : CreditDebitIndicatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("creditDebitIndicator")
  private CreditDebitIndicatorEnum creditDebitIndicator = null;

  @JsonProperty("status")
  private TransactionStatus status = null;

  @JsonProperty("bookingDate")
  private String bookingDate = null;

  @JsonProperty("remittanceInformation")
  private UnstructuredRemittanceInformation remittanceInformation = null;

  public Transaction resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Identification of the transaction as defined as a resource by the ASPSP
   * @return resourceId
  **/
  @ApiModelProperty(value = "Identification of the transaction as defined as a resource by the ASPSP")

 @Size(max=70)
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public Transaction entryReference(String entryReference) {
    this.entryReference = entryReference;
    return this;
  }

   /**
   * Technical incremental identification of the transaction. 
   * @return entryReference
  **/
  @ApiModelProperty(value = "Technical incremental identification of the transaction. ")


  public String getEntryReference() {
    return entryReference;
  }

  public void setEntryReference(String entryReference) {
    this.entryReference = entryReference;
  }

  public Transaction transactionAmount(AmountType transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

   /**
   * Get transactionAmount
   * @return transactionAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AmountType getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(AmountType transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public Transaction creditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

   /**
   * Accounting flow of the transaction - CRDT: Credit type transaction - DBIT: Debit type transaction 
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(required = true, value = "Accounting flow of the transaction - CRDT: Credit type transaction - DBIT: Debit type transaction ")
  @NotNull


  public CreditDebitIndicatorEnum getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public Transaction status(TransactionStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TransactionStatus getStatus() {
    return status;
  }

  public void setStatus(TransactionStatus status) {
    this.status = status;
  }

  public Transaction bookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

   /**
   * Booking date of the transaction on the account
   * @return bookingDate
  **/
  @ApiModelProperty(required = true, value = "Booking date of the transaction on the account")
  @NotNull


  public String getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
  }

  public Transaction remittanceInformation(UnstructuredRemittanceInformation remittanceInformation) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.resourceId, transaction.resourceId) &&
        Objects.equals(this.entryReference, transaction.entryReference) &&
        Objects.equals(this.transactionAmount, transaction.transactionAmount) &&
        Objects.equals(this.creditDebitIndicator, transaction.creditDebitIndicator) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.bookingDate, transaction.bookingDate) &&
        Objects.equals(this.remittanceInformation, transaction.remittanceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, entryReference, transactionAmount, creditDebitIndicator, status, bookingDate, remittanceInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");

    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    entryReference: ").append(toIndentedString(entryReference)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
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

