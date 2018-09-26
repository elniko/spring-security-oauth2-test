package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PSU account that is made available to the TPP 
 */
public class AccountResource {
  @JsonProperty("resourceId")
  private String resourceId = null;

  @JsonProperty("bicFi")
  private String bicFi = null;

  @JsonProperty("accountId")
  private AccountIdentification accountId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("details")
  private String details = null;

  @JsonProperty("linkedAccount")
  private String linkedAccount = null;

  /**
   * Specifies the usage of the account - PRIV: private personal account - ORGA: professional account 
   */
  public enum UsageEnum {
    PRIV("PRIV"),
    
    ORGA("ORGA");

    private String value;

    UsageEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UsageEnum fromValue(String text) {
      for (UsageEnum b : UsageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("usage")
  private UsageEnum usage = null;

  /**
   * Specifies the type of the account - CACC: Cash account 
   */
  public enum CashAccountTypeEnum {
    CACC("CACC");

    private String value;

    CashAccountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CashAccountTypeEnum fromValue(String text) {
      for (CashAccountTypeEnum b : CashAccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("cashAccountType")
  private CashAccountTypeEnum cashAccountType = null;

  @JsonProperty("product")
  private String product = null;

  @JsonProperty("currency")
  private String currency = null;

  //@JsonProperty("balances")
  //private List<BalanceResource> balances = null;

  @JsonProperty("psuStatus")
  private String psuStatus = null;

  //@JsonProperty("_links")
  //private AccountLinks links = null;

  public AccountResource resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Identification of the account as defined as a resource by the ASPSP
   * @return resourceId
  **/
  @NotNull

 @Size(max=70)
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public AccountResource bicFi(String bicFi) {
    this.bicFi = bicFi;
    return this;
  }

   /**
   * ISO20022: Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identification code (BIC)\". 
   * @return bicFi
  **/

 @Pattern(regexp="^[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}$")
  public String getBicFi() {
    return bicFi;
  }

  public void setBicFi(String bicFi) {
    this.bicFi = bicFi;
  }

  public AccountResource accountId(AccountIdentification accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/

  @Valid

  public AccountIdentification getAccountId() {
    return accountId;
  }

  public void setAccountId(AccountIdentification accountId) {
    this.accountId = accountId;
  }

  public AccountResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Label of the PSU account In case of a delayed debit card transaction set, the name shall specify the holder name and the imputation date 
   * @return name
  **/
  @NotNull

 @Size(max=70)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountResource details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Specifications that might be provided by the ASPSP - characteristics of the account - characteristics of the relevant card 
   * @return details
  **/

 @Size(max=140)
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public AccountResource linkedAccount(String linkedAccount) {
    this.linkedAccount = linkedAccount;
    return this;
  }

   /**
   * Case of a set of pending card transactions, the APSP will provide the relevant cash account the card is set up on.
   * @return linkedAccount
  **/

 @Size(max=70)
  public String getLinkedAccount() {
    return linkedAccount;
  }

  public void setLinkedAccount(String linkedAccount) {
    this.linkedAccount = linkedAccount;
  }

  public AccountResource usage(UsageEnum usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Specifies the usage of the account - PRIV: private personal account - ORGA: professional account 
   * @return usage
  **/


  public UsageEnum getUsage() {
    return usage;
  }

  public void setUsage(UsageEnum usage) {
    this.usage = usage;
  }

  public AccountResource cashAccountType(CashAccountTypeEnum cashAccountType) {
    this.cashAccountType = cashAccountType;
    return this;
  }

   /**
   * Specifies the type of the account - CACC: Cash account 
   * @return cashAccountType
  **/
  @NotNull


  public CashAccountTypeEnum getCashAccountType() {
    return cashAccountType;
  }

  public void setCashAccountType(CashAccountTypeEnum cashAccountType) {
    this.cashAccountType = cashAccountType;
  }

  public AccountResource product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Product Name of the Bank for this account, proprietary definition 
   * @return product
  **/

 @Size(max=35)
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public AccountResource currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency used for the account
   * @return currency
  **/
  @NotNull

 @Size(max=3)
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

//  public AccountResource balances(List<BalanceResource> balances) {
//    this.balances = balances;
//    return this;
//  }

//  public AccountResource addBalancesItem(BalanceResource balancesItem) {
//    if (this.balances == null) {
//      this.balances = new ArrayList<BalanceResource>();
//    }
//    this.balances.add(balancesItem);
//    return this;
//  }

   /**
   * list of balances provided by the ASPSP
   * @return balances
  **/

//  @Valid
// @Size(min=1)
//  public List<BalanceResource> getBalances() {
//    return balances;
//  }

//  public void setBalances(List<BalanceResource> balances) {
//    this.balances = balances;
//  }

  public AccountResource psuStatus(String psuStatus) {
    this.psuStatus = psuStatus;
    return this;
  }

   /**
   * Relationship between the PSU and the account - Account Holder - Co-account Holder - Attorney
   * @return psuStatus
  **/

 @Size(max=35)
  public String getPsuStatus() {
    return psuStatus;
  }

  public void setPsuStatus(String psuStatus) {
    this.psuStatus = psuStatus;
  }

//  public AccountResource links(AccountLinks links) {
//    this.links = links;
//    return this;
//  }

   /**
   * Get links
   * @return links
  **/
//  @NotNull
//
//  @Valid
//
//  public AccountLinks getLinks() {
//    return links;
//  }

//  public void setLinks(AccountLinks links) {
//    this.links = links;
//  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountResource accountResource = (AccountResource) o;
    return Objects.equals(this.resourceId, accountResource.resourceId) &&
        Objects.equals(this.bicFi, accountResource.bicFi) &&
        Objects.equals(this.accountId, accountResource.accountId) &&
        Objects.equals(this.name, accountResource.name) &&
        Objects.equals(this.details, accountResource.details) &&
        Objects.equals(this.linkedAccount, accountResource.linkedAccount) &&
        Objects.equals(this.usage, accountResource.usage) &&
        Objects.equals(this.cashAccountType, accountResource.cashAccountType) &&
        Objects.equals(this.product, accountResource.product) &&
        Objects.equals(this.currency, accountResource.currency) &&
       // Objects.equals(this.balances, accountResource.balances) &&
        Objects.equals(this.psuStatus, accountResource.psuStatus) ;//&&
       // Objects.equals(this.links, accountResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, bicFi, accountId, name, details, linkedAccount, usage, cashAccountType, product, currency, /*balances,*/ psuStatus/*, links*/);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountResource {\n");

    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    bicFi: ").append(toIndentedString(bicFi)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    linkedAccount: ").append(toIndentedString(linkedAccount)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    cashAccountType: ").append(toIndentedString(cashAccountType)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
  //  sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    psuStatus: ").append(toIndentedString(psuStatus)).append("\n");
    //sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

