package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Structure of an account balance
 */
@ApiModel(description = "Structure of an account balance")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class BalanceResource   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("balanceAmount")
  private AmountType balanceAmount = null;

  @JsonProperty("balanceType")
  private BalanceStatus balanceType = null;

  @JsonProperty("lastChangeDateTime")
  private DateTime lastChangeDateTime = null;

  @JsonProperty("referenceDate")
  private LocalDate referenceDate = null;

  @JsonProperty("lastCommittedTransaction")
  private String lastCommittedTransaction = null;

  public BalanceResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Label of the balance
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Label of the balance")
  @NotNull

 @Size(max=70)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BalanceResource balanceAmount(AmountType balanceAmount) {
    this.balanceAmount = balanceAmount;
    return this;
  }

   /**
   * Get balanceAmount
   * @return balanceAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AmountType getBalanceAmount() {
    return balanceAmount;
  }

  public void setBalanceAmount(AmountType balanceAmount) {
    this.balanceAmount = balanceAmount;
  }

  public BalanceResource balanceType(BalanceStatus balanceType) {
    this.balanceType = balanceType;
    return this;
  }

   /**
   * Get balanceType
   * @return balanceType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BalanceStatus getBalanceType() {
    return balanceType;
  }

  public void setBalanceType(BalanceStatus balanceType) {
    this.balanceType = balanceType;
  }

  public BalanceResource lastChangeDateTime(DateTime lastChangeDateTime) {
    this.lastChangeDateTime = lastChangeDateTime;
    return this;
  }

   /**
   * Timestamp of the last change of the balance amount
   * @return lastChangeDateTime
  **/
  @ApiModelProperty(value = "Timestamp of the last change of the balance amount")

  @Valid

  public DateTime getLastChangeDateTime() {
    return lastChangeDateTime;
  }

  public void setLastChangeDateTime(DateTime lastChangeDateTime) {
    this.lastChangeDateTime = lastChangeDateTime;
  }

  public BalanceResource referenceDate(LocalDate referenceDate) {
    this.referenceDate = referenceDate;
    return this;
  }

   /**
   * Reference date for the balance
   * @return referenceDate
  **/
  @ApiModelProperty(value = "Reference date for the balance")

  @Valid

  public LocalDate getReferenceDate() {
    return referenceDate;
  }

  public void setReferenceDate(LocalDate referenceDate) {
    this.referenceDate = referenceDate;
  }

  public BalanceResource lastCommittedTransaction(String lastCommittedTransaction) {
    this.lastCommittedTransaction = lastCommittedTransaction;
    return this;
  }

   /**
   * Identification of the last committed transaction. This is actually useful for instant balance. 
   * @return lastCommittedTransaction
  **/
  @ApiModelProperty(value = "Identification of the last committed transaction. This is actually useful for instant balance. ")

 @Size(max=16)
  public String getLastCommittedTransaction() {
    return lastCommittedTransaction;
  }

  public void setLastCommittedTransaction(String lastCommittedTransaction) {
    this.lastCommittedTransaction = lastCommittedTransaction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceResource balanceResource = (BalanceResource) o;
    return Objects.equals(this.name, balanceResource.name) &&
        Objects.equals(this.balanceAmount, balanceResource.balanceAmount) &&
        Objects.equals(this.balanceType, balanceResource.balanceType) &&
        Objects.equals(this.lastChangeDateTime, balanceResource.lastChangeDateTime) &&
        Objects.equals(this.referenceDate, balanceResource.referenceDate) &&
        Objects.equals(this.lastCommittedTransaction, balanceResource.lastCommittedTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, balanceAmount, balanceType, lastChangeDateTime, referenceDate, lastCommittedTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceResource {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    balanceAmount: ").append(toIndentedString(balanceAmount)).append("\n");
    sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
    sb.append("    lastChangeDateTime: ").append(toIndentedString(lastChangeDateTime)).append("\n");
    sb.append("    referenceDate: ").append(toIndentedString(referenceDate)).append("\n");
    sb.append("    lastCommittedTransaction: ").append(toIndentedString(lastCommittedTransaction)).append("\n");
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

