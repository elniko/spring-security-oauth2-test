package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * HYPERMEDIA structure used for returning the payment coverage report to the PIISP
 */
@ApiModel(description = "HYPERMEDIA structure used for returning the payment coverage report to the PIISP")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class HalPaymentCoverageReport   {
  @JsonProperty("request")
  private PaymentCoverageRequestResource request = null;

  @JsonProperty("result")
  private Boolean result = null;

  @JsonProperty("_links")
  private PaymentCoverageReportLinks links = null;

  public HalPaymentCoverageReport request(PaymentCoverageRequestResource request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PaymentCoverageRequestResource getRequest() {
    return request;
  }

  public void setRequest(PaymentCoverageRequestResource request) {
    this.request = request;
  }

  public HalPaymentCoverageReport result(Boolean result) {
    this.result = result;
    return this;
  }

   /**
   * Result of the coverage check : - true: the payment can be covered - false: the payment cannot be covered 
   * @return result
  **/
  @ApiModelProperty(required = true, value = "Result of the coverage check : - true: the payment can be covered - false: the payment cannot be covered ")
  @NotNull


  public Boolean getResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  public HalPaymentCoverageReport links(PaymentCoverageReportLinks links) {
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

  public PaymentCoverageReportLinks getLinks() {
    return links;
  }

  public void setLinks(PaymentCoverageReportLinks links) {
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
    HalPaymentCoverageReport halPaymentCoverageReport = (HalPaymentCoverageReport) o;
    return Objects.equals(this.request, halPaymentCoverageReport.request) &&
        Objects.equals(this.result, halPaymentCoverageReport.result) &&
        Objects.equals(this.links, halPaymentCoverageReport.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, result, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HalPaymentCoverageReport {\n");

    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

