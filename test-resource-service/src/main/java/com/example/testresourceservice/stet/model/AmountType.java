package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * ISO20022: structure aiming to carry either an instructed amount or equivalent amount. Both structures embed the amount and the currency to be used.  API: only instructed amount can be used 
 */
@ApiModel(description = "ISO20022: structure aiming to carry either an instructed amount or equivalent amount. Both structures embed the amount and the currency to be used.  API: only instructed amount can be used ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class AmountType   {
  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("amount")
  private String amount = null;

  public AmountType currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * ISO20022: Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account. A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\". 
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "ISO20022: Specifies the currency of the to be transferred amount, which is different from the currency of the debtor's account. A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\". ")
  @NotNull

 @Pattern(regexp="^[A-Z]{3,3}$")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AmountType amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * ISO20022: Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party. 
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "ISO20022: Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party. ")
  @NotNull

 @Pattern(regexp="^\\-{0,1}[0-9]{1,13}(\\.[0-9]{0,5}){0,1}$")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmountType amountType = (AmountType) o;
    return Objects.equals(this.currency, amountType.currency) &&
        Objects.equals(this.amount, amountType.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountType {\n");

    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

