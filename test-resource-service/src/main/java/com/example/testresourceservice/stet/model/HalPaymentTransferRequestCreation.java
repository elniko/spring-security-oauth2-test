package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * data forwarded by the ASPSP top the PISP after creation of the Payment or Transfer Request resource creation 
 */
@ApiModel(description = "data forwarded by the ASPSP top the PISP after creation of the Payment or Transfer Request resource creation ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class HalPaymentTransferRequestCreation   {
  @JsonProperty("appliedScaApproach")
  private AppliedScaApproach appliedScaApproach = null;

  @JsonProperty("_links")
  private PaymentTransferRequestResourceCreationLinks links = null;

  public HalPaymentTransferRequestCreation appliedScaApproach(AppliedScaApproach appliedScaApproach) {
    this.appliedScaApproach = appliedScaApproach;
    return this;
  }

   /**
   * Get appliedScaApproach
   * @return appliedScaApproach
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AppliedScaApproach getAppliedScaApproach() {
    return appliedScaApproach;
  }

  public void setAppliedScaApproach(AppliedScaApproach appliedScaApproach) {
    this.appliedScaApproach = appliedScaApproach;
  }

  public HalPaymentTransferRequestCreation links(PaymentTransferRequestResourceCreationLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentTransferRequestResourceCreationLinks getLinks() {
    return links;
  }

  public void setLinks(PaymentTransferRequestResourceCreationLinks links) {
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
    HalPaymentTransferRequestCreation halPaymentTransferRequestCreation = (HalPaymentTransferRequestCreation) o;
    return Objects.equals(this.appliedScaApproach, halPaymentTransferRequestCreation.appliedScaApproach) &&
        Objects.equals(this.links, halPaymentTransferRequestCreation.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedScaApproach, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HalPaymentTransferRequestCreation {\n");

    sb.append("    appliedScaApproach: ").append(toIndentedString(appliedScaApproach)).append("\n");
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

