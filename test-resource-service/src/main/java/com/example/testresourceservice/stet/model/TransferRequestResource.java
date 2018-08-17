package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Transfer Request Structure 
 */
@ApiModel(description = "Transfer Request Structure ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class TransferRequestResource   {
  @JsonProperty("resourceId")
  private String resourceId = null;

  @JsonProperty("debtor")
  private PartyIdentification debtor = null;

  @JsonProperty("debtorAccount")
  private AccountIdentification debtorAccount = null;

  @JsonProperty("creditor")
  private PartyIdentification creditor = null;

  @JsonProperty("creditorAccount")
  private AccountIdentification creditorAccount = null;

  @JsonProperty("transferInformationStatus")
  private PaymentTransferInformationStatusCode transferInformationStatus = null;

  @JsonProperty("statusReasonInformation")
  private StatusReasonInformation statusReasonInformation = null;

  @JsonProperty("instructedAmount")
  private AmountType instructedAmount = null;

  @JsonProperty("remittanceInformation")
  private UnstructuredRemittanceInformation remittanceInformation = null;

  @JsonProperty("supplementaryData")
  private SupplementaryData supplementaryData = null;

  public TransferRequestResource resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * API: Identifier assigned by the ASPSP for further use of the created resource through API calls 
   * @return resourceId
  **/
  @ApiModelProperty(value = "API: Identifier assigned by the ASPSP for further use of the created resource through API calls ")

 @Pattern(regexp="^([a-zA-Z0-9 /\\-?:\\()\\.,']{1,35})$")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public TransferRequestResource debtor(PartyIdentification debtor) {
    this.debtor = debtor;
    return this;
  }

   /**
   * Get debtor
   * @return debtor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PartyIdentification getDebtor() {
    return debtor;
  }

  public void setDebtor(PartyIdentification debtor) {
    this.debtor = debtor;
  }

  public TransferRequestResource debtorAccount(AccountIdentification debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

   /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountIdentification getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(AccountIdentification debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public TransferRequestResource creditor(PartyIdentification creditor) {
    this.creditor = creditor;
    return this;
  }

   /**
   * Get creditor
   * @return creditor
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PartyIdentification getCreditor() {
    return creditor;
  }

  public void setCreditor(PartyIdentification creditor) {
    this.creditor = creditor;
  }

  public TransferRequestResource creditorAccount(AccountIdentification creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

   /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AccountIdentification getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(AccountIdentification creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public TransferRequestResource transferInformationStatus(PaymentTransferInformationStatusCode transferInformationStatus) {
    this.transferInformationStatus = transferInformationStatus;
    return this;
  }

   /**
   * Get transferInformationStatus
   * @return transferInformationStatus
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentTransferInformationStatusCode getTransferInformationStatus() {
    return transferInformationStatus;
  }

  public void setTransferInformationStatus(PaymentTransferInformationStatusCode transferInformationStatus) {
    this.transferInformationStatus = transferInformationStatus;
  }

  public TransferRequestResource statusReasonInformation(StatusReasonInformation statusReasonInformation) {
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

  public TransferRequestResource instructedAmount(AmountType instructedAmount) {
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

  public TransferRequestResource remittanceInformation(UnstructuredRemittanceInformation remittanceInformation) {
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

  public TransferRequestResource supplementaryData(SupplementaryData supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

   /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SupplementaryData getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(SupplementaryData supplementaryData) {
    this.supplementaryData = supplementaryData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRequestResource transferRequestResource = (TransferRequestResource) o;
    return Objects.equals(this.resourceId, transferRequestResource.resourceId) &&
        Objects.equals(this.debtor, transferRequestResource.debtor) &&
        Objects.equals(this.debtorAccount, transferRequestResource.debtorAccount) &&
        Objects.equals(this.creditor, transferRequestResource.creditor) &&
        Objects.equals(this.creditorAccount, transferRequestResource.creditorAccount) &&
        Objects.equals(this.transferInformationStatus, transferRequestResource.transferInformationStatus) &&
        Objects.equals(this.statusReasonInformation, transferRequestResource.statusReasonInformation) &&
        Objects.equals(this.instructedAmount, transferRequestResource.instructedAmount) &&
        Objects.equals(this.remittanceInformation, transferRequestResource.remittanceInformation) &&
        Objects.equals(this.supplementaryData, transferRequestResource.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, debtor, debtorAccount, creditor, creditorAccount, transferInformationStatus, statusReasonInformation, instructedAmount, remittanceInformation, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRequestResource {\n");

    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    transferInformationStatus: ").append(toIndentedString(transferInformationStatus)).append("\n");
    sb.append("    statusReasonInformation: ").append(toIndentedString(statusReasonInformation)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

