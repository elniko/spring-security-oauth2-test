package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * HYPERMEDIA structure used for returning the original Payment Request to the PISP
 */
@ApiModel(description = "HYPERMEDIA structure used for returning the original Payment Request to the PISP")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class HalPaymentRequest   {
  @JsonProperty("paymentRequest")
  private PaymentRequestResource paymentRequest = null;

  @JsonProperty("_links")
  private PaymentTransferRequestLinks links = null;

  public HalPaymentRequest paymentRequest(PaymentRequestResource paymentRequest) {
    this.paymentRequest = paymentRequest;
    return this;
  }

   /**
   * Get paymentRequest
   * @return paymentRequest
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PaymentRequestResource getPaymentRequest() {
    return paymentRequest;
  }

  public void setPaymentRequest(PaymentRequestResource paymentRequest) {
    this.paymentRequest = paymentRequest;
  }

  public HalPaymentRequest links(PaymentTransferRequestLinks links) {
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
    HalPaymentRequest halPaymentRequest = (HalPaymentRequest) o;
    return Objects.equals(this.paymentRequest, halPaymentRequest.paymentRequest) &&
        Objects.equals(this.links, halPaymentRequest.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentRequest, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HalPaymentRequest {\n");

    sb.append("    paymentRequest: ").append(toIndentedString(paymentRequest)).append("\n");
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

