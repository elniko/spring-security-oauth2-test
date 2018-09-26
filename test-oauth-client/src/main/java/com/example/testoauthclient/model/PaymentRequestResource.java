package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ISO20022: The PaymentRequestResource message is sent by the Creditor sending party to the Debtor receiving party, directly or through agents. It is used by a Creditor to request movement of funds from the debtor account to a creditor. 
 */

public class PaymentRequestResource {
  @JsonProperty("resourceId")
  private String resourceId = null;

  @JsonProperty("paymentInformationId")
  private String paymentInformationId = null;

  @JsonProperty("creationDateTime")
  private LocalDateTime creationDateTime = null;

  @JsonProperty("numberOfTransactions")
  private Integer numberOfTransactions = null;

  @JsonProperty("initiatingParty")
  private PartyIdentification initiatingParty = null;

  @JsonProperty("paymentTypeInformation")
  private PaymentTypeInformation paymentTypeInformation = null;

  @JsonProperty("debtor")
  private PartyIdentification debtor = null;

  @JsonProperty("debtorAccount")
  private AccountIdentification debtorAccount = null;

  @JsonProperty("debtorAgent")
  private FinancialInstitutionIdentification debtorAgent = null;

  @JsonProperty("creditorAgent")
  private FinancialInstitutionIdentification creditorAgent = null;

  @JsonProperty("creditor")
  private PartyIdentification creditor = null;

  @JsonProperty("creditorAccount")
  private AccountIdentification creditorAccount = null;

  @JsonProperty("ultimateCreditor")
  private PartyIdentification ultimateCreditor = null;

  @JsonProperty("purpose")
  private PurposeCode purpose = null;

  @JsonProperty("chargeBearer")
  private ChargeBearerCode chargeBearer = null;

  @JsonProperty("paymentInformationStatus")
  private PaymentTransferInformationStatusCode paymentInformationStatus = null;

  @JsonProperty("statusReasonInformation")
  private StatusReasonInformation statusReasonInformation = null;

  @JsonProperty("creditTransferTransaction")
  private List<CreditTransferTransaction> creditTransferTransaction = new ArrayList<CreditTransferTransaction>();

  @JsonProperty("supplementaryData")
  private SupplementaryData supplementaryData = null;

  public PaymentRequestResource resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * API: Identifier assigned by the ASPSP for further use of the created resource through API calls 
   * @return resourceId
  **/

 @Pattern(regexp="^([a-zA-Z0-9 /\\-?:\\()\\.,']{1,35})$")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public PaymentRequestResource paymentInformationId(String paymentInformationId) {
    this.paymentInformationId = paymentInformationId;
    return this;
  }

   /**
   * ISO20022 : Reference assigned by a sending party to unambiguously identify the payment information block within the message. 
   * @return paymentInformationId
  **/
  @NotNull
  @Pattern(regexp="^([a-zA-Z0-9 /\\-?:\\()\\.,']{1,35})$")
  public String getPaymentInformationId() {
    return paymentInformationId;
  }

  public void setPaymentInformationId(String paymentInformationId) {
    this.paymentInformationId = paymentInformationId;
  }

  public PaymentRequestResource creationDateTime(LocalDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

   /**
   * ISO20022: Date and time at which a (group of) payment instruction(s) was created by the instructing party. 
   * @return creationDateTime
  **/
  @NotNull
  public LocalDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(LocalDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public PaymentRequestResource numberOfTransactions(Integer numberOfTransactions) {
    this.numberOfTransactions = numberOfTransactions;
    return this;
  }

   /**
   * ISO20022: Number of individual transactions contained in the message. 
   * minimum: 1
   * maximum: 1
   * @return numberOfTransactions
  **/
  @NotNull
  @Min(1) @Max(1)
  public Integer getNumberOfTransactions() {
    return numberOfTransactions;
  }

  public void setNumberOfTransactions(Integer numberOfTransactions) {
    this.numberOfTransactions = numberOfTransactions;
  }

  public PaymentRequestResource initiatingParty(PartyIdentification initiatingParty) {
    this.initiatingParty = initiatingParty;
    return this;
  }

   /**
   * Get initiatingParty
   * @return initiatingParty
  **/
  @NotNull
  @Valid
  public PartyIdentification getInitiatingParty() {
    return initiatingParty;
  }

  public void setInitiatingParty(PartyIdentification initiatingParty) {
    this.initiatingParty = initiatingParty;
  }

  public PaymentRequestResource paymentTypeInformation(PaymentTypeInformation paymentTypeInformation) {
    this.paymentTypeInformation = paymentTypeInformation;
    return this;
  }

   /**
   * Get paymentTypeInformation
   * @return paymentTypeInformation
  **/
  @NotNull
  @Valid
  public PaymentTypeInformation getPaymentTypeInformation() {
    return paymentTypeInformation;
  }

  public void setPaymentTypeInformation(PaymentTypeInformation paymentTypeInformation) {
    this.paymentTypeInformation = paymentTypeInformation;
  }

  public PaymentRequestResource debtor(PartyIdentification debtor) {
    this.debtor = debtor;
    return this;
  }

   /**
   * Get debtor
   * @return debtor
  **/

  @Valid
  public PartyIdentification getDebtor() {
    return debtor;
  }

  public void setDebtor(PartyIdentification debtor) {
    this.debtor = debtor;
  }

  public PaymentRequestResource debtorAccount(AccountIdentification debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

   /**
   * Get debtorAccount
   * @return debtorAccount
  **/

  @Valid
  public AccountIdentification getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(AccountIdentification debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public PaymentRequestResource debtorAgent(FinancialInstitutionIdentification debtorAgent) {
    this.debtorAgent = debtorAgent;
    return this;
  }

   /**
   * Get debtorAgent
   * @return debtorAgent
  **/

  @Valid
  public FinancialInstitutionIdentification getDebtorAgent() {
    return debtorAgent;
  }

  public void setDebtorAgent(FinancialInstitutionIdentification debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  public PaymentRequestResource creditorAgent(FinancialInstitutionIdentification creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

   /**
   * Get creditorAgent
   * @return creditorAgent
  **/

  @Valid
  public FinancialInstitutionIdentification getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(FinancialInstitutionIdentification creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public PaymentRequestResource creditor(PartyIdentification creditor) {
    this.creditor = creditor;
    return this;
  }

   /**
   * Get creditor
   * @return creditor
  **/
  @NotNull
  @Valid
  public PartyIdentification getCreditor() {
    return creditor;
  }

  public void setCreditor(PartyIdentification creditor) {
    this.creditor = creditor;
  }

  public PaymentRequestResource creditorAccount(AccountIdentification creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

   /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @NotNull
  @Valid
  public AccountIdentification getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(AccountIdentification creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public PaymentRequestResource ultimateCreditor(PartyIdentification ultimateCreditor) {
    this.ultimateCreditor = ultimateCreditor;
    return this;
  }

   /**
   * Get ultimateCreditor
   * @return ultimateCreditor
  **/

  @Valid
  public PartyIdentification getUltimateCreditor() {
    return ultimateCreditor;
  }

  public void setUltimateCreditor(PartyIdentification ultimateCreditor) {
    this.ultimateCreditor = ultimateCreditor;
  }

  public PaymentRequestResource purpose(PurposeCode purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  public PurposeCode getPurpose() {
    return purpose;
  }

  public void setPurpose(PurposeCode purpose) {
    this.purpose = purpose;
  }

  public PaymentRequestResource chargeBearer(ChargeBearerCode chargeBearer) {
    this.chargeBearer = chargeBearer;
    return this;
  }

   /**
   * - ISO2002: Specifies which party/parties will bear the charges associated with the processing of the payment transaction. - API: Set to \"SLEV\" or omitted 
   * @return chargeBearer
  **/

  public ChargeBearerCode getChargeBearer() {
    return chargeBearer;
  }

  public void setChargeBearer(ChargeBearerCode chargeBearer) {
    this.chargeBearer = chargeBearer;
  }

  public PaymentRequestResource paymentInformationStatus(PaymentTransferInformationStatusCode paymentInformationStatus) {
    this.paymentInformationStatus = paymentInformationStatus;
    return this;
  }

   /**
   * Get paymentInformationStatus
   * @return paymentInformationStatus
  **/

  public PaymentTransferInformationStatusCode getPaymentInformationStatus() {
    return paymentInformationStatus;
  }

  public void setPaymentInformationStatus(PaymentTransferInformationStatusCode paymentInformationStatus) {
    this.paymentInformationStatus = paymentInformationStatus;
  }

  public PaymentRequestResource statusReasonInformation(StatusReasonInformation statusReasonInformation) {
    this.statusReasonInformation = statusReasonInformation;
    return this;
  }

   /**
   * Get statusReasonInformation
   * @return statusReasonInformation
  **/

  public StatusReasonInformation getStatusReasonInformation() {
    return statusReasonInformation;
  }

  public void setStatusReasonInformation(StatusReasonInformation statusReasonInformation) {
    this.statusReasonInformation = statusReasonInformation;
  }

  public PaymentRequestResource creditTransferTransaction(List<CreditTransferTransaction> creditTransferTransaction) {
    this.creditTransferTransaction = creditTransferTransaction;
    return this;
  }

  public PaymentRequestResource addCreditTransferTransactionItem(CreditTransferTransaction creditTransferTransactionItem) {
    this.creditTransferTransaction.add(creditTransferTransactionItem);
    return this;
  }

   /**
   * ISO20022: Payment processes required to transfer cash from the debtor to the creditor. 
   * @return creditTransferTransaction
  **/
  @NotNull
  @Valid
  @Size(min=1,max=1)
  public List<CreditTransferTransaction> getCreditTransferTransaction() {
    return creditTransferTransaction;
  }

  public void setCreditTransferTransaction(List<CreditTransferTransaction> creditTransferTransaction) {
    this.creditTransferTransaction = creditTransferTransaction;
  }

  public PaymentRequestResource supplementaryData(SupplementaryData supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

   /**
   * Get supplementaryData
   * @return supplementaryData
  **/
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
    PaymentRequestResource paymentRequestResource = (PaymentRequestResource) o;
    return Objects.equals(this.resourceId, paymentRequestResource.resourceId) &&
        Objects.equals(this.paymentInformationId, paymentRequestResource.paymentInformationId) &&
        Objects.equals(this.creationDateTime, paymentRequestResource.creationDateTime) &&
        Objects.equals(this.numberOfTransactions, paymentRequestResource.numberOfTransactions) &&
        Objects.equals(this.initiatingParty, paymentRequestResource.initiatingParty) &&
        Objects.equals(this.paymentTypeInformation, paymentRequestResource.paymentTypeInformation) &&
        Objects.equals(this.debtor, paymentRequestResource.debtor) &&
        Objects.equals(this.debtorAccount, paymentRequestResource.debtorAccount) &&
        Objects.equals(this.debtorAgent, paymentRequestResource.debtorAgent) &&
        Objects.equals(this.creditorAgent, paymentRequestResource.creditorAgent) &&
        Objects.equals(this.creditor, paymentRequestResource.creditor) &&
        Objects.equals(this.creditorAccount, paymentRequestResource.creditorAccount) &&
        Objects.equals(this.ultimateCreditor, paymentRequestResource.ultimateCreditor) &&
        Objects.equals(this.purpose, paymentRequestResource.purpose) &&
        Objects.equals(this.chargeBearer, paymentRequestResource.chargeBearer) &&
        Objects.equals(this.paymentInformationStatus, paymentRequestResource.paymentInformationStatus) &&
        Objects.equals(this.statusReasonInformation, paymentRequestResource.statusReasonInformation) &&
        Objects.equals(this.creditTransferTransaction, paymentRequestResource.creditTransferTransaction) &&
        Objects.equals(this.supplementaryData, paymentRequestResource.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, paymentInformationId, creationDateTime, numberOfTransactions, initiatingParty, paymentTypeInformation, debtor, debtorAccount, debtorAgent, creditorAgent, creditor, creditorAccount, ultimateCreditor, purpose, chargeBearer, paymentInformationStatus, statusReasonInformation, creditTransferTransaction, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequestResource {\n");

    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    paymentInformationId: ").append(toIndentedString(paymentInformationId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    numberOfTransactions: ").append(toIndentedString(numberOfTransactions)).append("\n");
    sb.append("    initiatingParty: ").append(toIndentedString(initiatingParty)).append("\n");
    sb.append("    paymentTypeInformation: ").append(toIndentedString(paymentTypeInformation)).append("\n");
    sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    ultimateCreditor: ").append(toIndentedString(ultimateCreditor)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
    sb.append("    paymentInformationStatus: ").append(toIndentedString(paymentInformationStatus)).append("\n");
    sb.append("    statusReasonInformation: ").append(toIndentedString(statusReasonInformation)).append("\n");
    sb.append("    creditTransferTransaction: ").append(toIndentedString(creditTransferTransaction)).append("\n");
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

