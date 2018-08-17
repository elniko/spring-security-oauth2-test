package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Links that can be used for further navigation when browsing Account Information at top level - self: link to the list of all available accounts 
 */
@ApiModel(description = "Links that can be used for further navigation when browsing Account Information at top level - self: link to the list of all available accounts ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class PaginationLinks   {
  @JsonProperty("self")
  private GenericLink self = null;

  @JsonProperty("first")
  private GenericLink first = null;

  @JsonProperty("last")
  private GenericLink last = null;

  @JsonProperty("next")
  private GenericLink next = null;

  @JsonProperty("prev")
  private GenericLink prev = null;

  public PaginationLinks self(GenericLink self) {
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

  public PaginationLinks first(GenericLink first) {
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

  public PaginationLinks last(GenericLink last) {
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

  public PaginationLinks next(GenericLink next) {
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

  public PaginationLinks prev(GenericLink prev) {
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
    PaginationLinks paginationLinks = (PaginationLinks) o;
    return Objects.equals(this.self, paginationLinks.self) &&
        Objects.equals(this.first, paginationLinks.first) &&
        Objects.equals(this.last, paginationLinks.last) &&
        Objects.equals(this.next, paginationLinks.next) &&
        Objects.equals(this.prev, paginationLinks.prev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, last, next, prev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationLinks {\n");

    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

