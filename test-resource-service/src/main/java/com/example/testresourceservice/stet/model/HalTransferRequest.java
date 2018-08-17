package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * HYPERMEDIA structure used for returning the original Transfer Request to the PISP
 */
@ApiModel(description = "HYPERMEDIA structure used for returning the original Transfer Request to the PISP")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class HalTransferRequest   {
  @JsonProperty("transferRequest")
  private TransferRequestResource transferRequest = null;

  @JsonProperty("_links")
  private PaymentTransferRequestLinks links = null;

  public HalTransferRequest transferRequest(TransferRequestResource transferRequest) {
    this.transferRequest = transferRequest;
    return this;
  }

   /**
   * Get transferRequest
   * @return transferRequest
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TransferRequestResource getTransferRequest() {
    return transferRequest;
  }

  public void setTransferRequest(TransferRequestResource transferRequest) {
    this.transferRequest = transferRequest;
  }

  public HalTransferRequest links(PaymentTransferRequestLinks links) {
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

  public PaymentTransferRequestLinks getLinks() {
    return links;
  }

  public void setLinks(PaymentTransferRequestLinks links) {
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
    HalTransferRequest halTransferRequest = (HalTransferRequest) o;
    return Objects.equals(this.transferRequest, halTransferRequest.transferRequest) &&
        Objects.equals(this.links, halTransferRequest.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferRequest, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HalTransferRequest {\n");

    sb.append("    transferRequest: ").append(toIndentedString(transferRequest)).append("\n");
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

