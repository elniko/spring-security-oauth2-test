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
 * HYPERMEDIA structure used for returning the list of the available accounts to the AISP
 */
@ApiModel(description = "HYPERMEDIA structure used for returning the list of the available accounts to the AISP")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class HalAccounts   {
  @JsonProperty("accounts")
  private List<AccountResource> accounts = new ArrayList<AccountResource>();

  @JsonProperty("_links")
  private PaginationLinks links = null;

  public HalAccounts accounts(List<AccountResource> accounts) {
    this.accounts = accounts;
    return this;
  }

  public HalAccounts addAccountsItem(AccountResource accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * List of PSU account that are made available to the TPP 
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "List of PSU account that are made available to the TPP ")
  @NotNull

  @Valid

  public List<AccountResource> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<AccountResource> accounts) {
    this.accounts = accounts;
  }

  public HalAccounts links(PaginationLinks links) {
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

  public PaginationLinks getLinks() {
    return links;
  }

  public void setLinks(PaginationLinks links) {
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
    HalAccounts halAccounts = (HalAccounts) o;
    return Objects.equals(this.accounts, halAccounts.accounts) &&
        Objects.equals(this.links, halAccounts.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HalAccounts {\n");

    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

