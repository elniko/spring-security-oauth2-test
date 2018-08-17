package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * HYPERMEDIA structure used for returning the list of the transactions for a given account to the AISP
 */
@ApiModel(description = "HYPERMEDIA structure used for returning the list of the transactions for a given account to the AISP")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class HalTransactions   {
  @JsonProperty("transactions")
  private List<Transaction> transactions = new ArrayList<Transaction>();

  @JsonProperty("_links")
  private TransactionsLinks links = null;

  public HalTransactions transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public HalTransactions addTransactionsItem(Transaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * List of transactions
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "List of transactions")
  @NotNull

  @Valid

  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }

  public HalTransactions links(TransactionsLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TransactionsLinks getLinks() {
    return links;
  }

  public void setLinks(TransactionsLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HalTransactions halTransactions = (HalTransactions) o;
    return Objects.equals(this.transactions, halTransactions.transactions) &&
        Objects.equals(this.links, halTransactions.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HalTransactions {\n");

    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

