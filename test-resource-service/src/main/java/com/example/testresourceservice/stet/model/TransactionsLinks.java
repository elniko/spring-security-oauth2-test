package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * links that can be used for further navigation when browsing Account Information at one account level - self: link to the transactions of a given account - parent-list: link to the list of all available accounts - balances: link to the balances of a given account - first: link to the first page of the transactions result - last: link to the last page of the transactions result - next: link to the next page of the transactions result - prev: link to the previous page of the transactions result 
 */
@ApiModel(description = "links that can be used for further navigation when browsing Account Information at one account level - self: link to the transactions of a given account - parent-list: link to the list of all available accounts - balances: link to the balances of a given account - first: link to the first page of the transactions result - last: link to the last page of the transactions result - next: link to the next page of the transactions result - prev: link to the previous page of the transactions result ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class TransactionsLinks   {
  @JsonProperty("self")
  private GenericLink self = null;

  @JsonProperty("parent-list")
  private GenericLink parentList = null;

  @JsonProperty("balances")
  private GenericLink balances = null;

  @JsonProperty("first")
  private GenericLink first = null;

  @JsonProperty("last")
  private GenericLink last = null;

  @JsonProperty("next")
  private GenericLink next = null;

  @JsonProperty("prev")
  private GenericLink prev = null;

  public TransactionsLinks self(GenericLink self) {
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

  public TransactionsLinks parentList(GenericLink parentList) {
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

  public TransactionsLinks balances(GenericLink balances) {
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

  public TransactionsLinks first(GenericLink first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericLink getFirst() {
    return first;
  }

  public void setFirst(GenericLink first) {
    this.first = first;
  }

  public TransactionsLinks last(GenericLink last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericLink getLast() {
    return last;
  }

  public void setLast(GenericLink last) {
    this.last = last;
  }

  public TransactionsLinks next(GenericLink next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericLink getNext() {
    return next;
  }

  public void setNext(GenericLink next) {
    this.next = next;
  }

  public TransactionsLinks prev(GenericLink prev) {
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericLink getPrev() {
    return prev;
  }

  public void setPrev(GenericLink prev) {
    this.prev = prev;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsLinks transactionsLinks = (TransactionsLinks) o;
    return Objects.equals(this.self, transactionsLinks.self) &&
        Objects.equals(this.parentList, transactionsLinks.parentList) &&
        Objects.equals(this.balances, transactionsLinks.balances) &&
        Objects.equals(this.first, transactionsLinks.first) &&
        Objects.equals(this.last, transactionsLinks.last) &&
        Objects.equals(this.next, transactionsLinks.next) &&
        Objects.equals(this.prev, transactionsLinks.prev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, parentList, balances, first, last, next, prev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsLinks {\n");

    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    parentList: ").append(toIndentedString(parentList)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
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

