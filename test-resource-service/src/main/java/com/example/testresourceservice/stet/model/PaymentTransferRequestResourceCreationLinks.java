package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * links that can be used for further navigation, especially in REDIRECT approach 
 */
@ApiModel(description = "links that can be used for further navigation, especially in REDIRECT approach ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class PaymentTransferRequestResourceCreationLinks   {
  @JsonProperty("consentApproval")
  private GenericLink consentApproval = null;

  public PaymentTransferRequestResourceCreationLinks consentApproval(GenericLink consentApproval) {
    this.consentApproval = consentApproval;
    return this;
  }

   /**
   * URL to be used by the PISP in order to start the ASPSP SCA and consent management process
   * @return consentApproval
  **/
  @ApiModelProperty(value = "URL to be used by the PISP in order to start the ASPSP SCA and consent management process")

  @Valid

  public GenericLink getConsentApproval() {
    return consentApproval;
  }

  public void setConsentApproval(GenericLink consentApproval) {
    this.consentApproval = consentApproval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransferRequestResourceCreationLinks paymentTransferRequestResourceCreationLinks = (PaymentTransferRequestResourceCreationLinks) o;
    return Objects.equals(this.consentApproval, paymentTransferRequestResourceCreationLinks.consentApproval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentApproval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransferRequestResourceCreationLinks {\n");

    sb.append("    consentApproval: ").append(toIndentedString(consentApproval)).append("\n");
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

