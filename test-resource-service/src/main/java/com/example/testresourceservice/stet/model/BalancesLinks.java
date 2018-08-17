package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * links that can be used for further navigation when browsing Account Information at one account level - self: link to the balances of a given account - parent-list: link to the list of all available accounts - transactions: link to the transactions of a given account 
 */
@ApiModel(description = "links that can be used for further navigation when browsing Account Information at one account level - self: link to the balances of a given account - parent-list: link to the list of all available accounts - transactions: link to the transactions of a given account ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class BalancesLinks   {
  @JsonProperty("self")
  private GenericLink self = null;

  @JsonProperty("parent-list")
  private GenericLink parentList = null;

  @JsonProperty("transactions")
  private GenericLink transactions = null;

  public BalancesLinks self(GenericLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GenericLink getSelf() {
    return self;
  }

  public void setSelf(GenericLink self) {
    this.self = self;
  }

  public BalancesLinks parentList(GenericLink parentList) {
    this.parentList = parentList;
    return this;
  }

   /**
   * Get parentList
   * @return parentList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericLink getParentList() {
    return parentList;
  }

  public void setParentList(GenericLink parentList) {
    this.parentList = parentList;
  }

  public BalancesLinks transactions(GenericLink transactions) {
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
    BalancesLinks balancesLinks = (BalancesLinks) o;
    return Objects.equals(this.self, balancesLinks.self) &&
        Objects.equals(this.parentList, balancesLinks.parentList) &&
        Objects.equals(this.transactions, balancesLinks.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, parentList, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalancesLinks {\n");

    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    parentList: ").append(toIndentedString(parentList)).append("\n");
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

