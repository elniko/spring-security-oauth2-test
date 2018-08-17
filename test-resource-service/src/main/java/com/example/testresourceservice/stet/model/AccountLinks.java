package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * links that can be used for further navigation when browsing Account Information at one account level - balances: link to the balances of a given account - transactions: link to the transactions of a given account 
 */
@ApiModel(description = "links that can be used for further navigation when browsing Account Information at one account level - balances: link to the balances of a given account - transactions: link to the transactions of a given account ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class AccountLinks   {
  @JsonProperty("balances")
  private GenericLink balances = null;

  @JsonProperty("transactions")
  private GenericLink transactions = null;

  public AccountLinks balances(GenericLink balances) {
    this.balances = balances;
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericLink getBalances() {
    return balances;
  }

  public void setBalances(GenericLink balances) {
    this.balances = balances;
  }

  public AccountLinks transactions(GenericLink transactions) {
    this.transactions = transactions;
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericLink getTransactions() {
    return transactions;
  }

  public void setTransactions(GenericLink transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountLinks accountLinks = (AccountLinks) o;
    return Objects.equals(this.balances, accountLinks.balances) &&
        Objects.equals(this.transactions, accountLinks.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountLinks {\n");

    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

