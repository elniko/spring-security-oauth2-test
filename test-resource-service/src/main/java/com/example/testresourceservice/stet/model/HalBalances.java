package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * HYPERMEDIA structure used for returning the list of the relevant balances for a given account to the AISP
 */
@ApiModel(description = "HYPERMEDIA structure used for returning the list of the relevant balances for a given account to the AISP")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class HalBalances   {
  @JsonProperty("balances")
  private List<BalanceResource> balances = new ArrayList<BalanceResource>();

  @JsonProperty("_links")
  private BalancesLinks links = null;

  public HalBalances balances(List<BalanceResource> balances) {
    this.balances = balances;
    return this;
  }

  public HalBalances addBalancesItem(BalanceResource balancesItem) {
    this.balances.add(balancesItem);
    return this;
  }

   /**
   * List of account balances
   * @return balances
  **/
  @ApiModelProperty(required = true, value = "List of account balances")
  @NotNull

  @Valid
 @Size(min=1)
  public List<BalanceResource> getBalances() {
    return balances;
  }

  public void setBalances(List<BalanceResource> balances) {
    this.balances = balances;
  }

  public HalBalances links(BalancesLinks links) {
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

  public BalancesLinks getLinks() {
    return links;
  }

  public void setLinks(BalancesLinks links) {
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
    HalBalances halBalances = (HalBalances) o;
    return Objects.equals(this.balances, halBalances.balances) &&
        Objects.equals(this.links, halBalances.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HalBalances {\n");

    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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

