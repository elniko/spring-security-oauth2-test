package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Confirmation request resource
 */
@ApiModel(description = "Confirmation request resource")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class PaymentTransferRequestConfirmationResource   {
  @JsonProperty("psuAuthenticationFactor")
  private String psuAuthenticationFactor = null;

  public PaymentTransferRequestConfirmationResource psuAuthenticationFactor(String psuAuthenticationFactor) {
    this.psuAuthenticationFactor = psuAuthenticationFactor;
    return this;
  }

   /**
   * authentication factor forwarded by the TPP to the ASPSP in order to fulfill the strong customer authentication process
   * @return psuAuthenticationFactor
  **/
  @ApiModelProperty(value = "authentication factor forwarded by the TPP to the ASPSP in order to fulfill the strong customer authentication process")


  public String getPsuAuthenticationFactor() {
    return psuAuthenticationFactor;
  }

  public void setPsuAuthenticationFactor(String psuAuthenticationFactor) {
    this.psuAuthenticationFactor = psuAuthenticationFactor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransferRequestConfirmationResource paymentTransferRequestConfirmationResource = (PaymentTransferRequestConfirmationResource) o;
    return Objects.equals(this.psuAuthenticationFactor, paymentTransferRequestConfirmationResource.psuAuthenticationFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(psuAuthenticationFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransferRequestConfirmationResource {\n");

    sb.append("    psuAuthenticationFactor: ").append(toIndentedString(psuAuthenticationFactor)).append("\n");
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

