package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.Objects;

/**
 * links that can be used for further navigation when having post a Payment Request in order to get the relevant status report. 
 */
@ApiModel(description = "links that can be used for further navigation when having post a Payment Request in order to get the relevant status report. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class PaymentTransferRequestLinks   {
  @JsonProperty("self")
  private GenericLink self = null;

  @JsonProperty("confirmation")
  private GenericLink confirmation = null;

  public PaymentTransferRequestLinks self(GenericLink self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericLink getSelf() {
    return self;
  }

  public void setSelf(GenericLink self) {
    this.self = self;
  }

  public PaymentTransferRequestLinks confirmation(GenericLink confirmation) {
    this.confirmation = confirmation;
    return this;
  }

   /**
   * This link shall not been provided when then confirmation has already been posted. 
   * @return confirmation
  **/
  @ApiModelProperty(value = "This link shall not been provided when then confirmation has already been posted. ")

  @Valid

  public GenericLink getConfirmation() {
    return confirmation;
  }

  public void setConfirmation(GenericLink confirmation) {
    this.confirmation = confirmation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransferRequestLinks paymentTransferRequestLinks = (PaymentTransferRequestLinks) o;
    return Objects.equals(this.self, paymentTransferRequestLinks.self) &&
        Objects.equals(this.confirmation, paymentTransferRequestLinks.confirmation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, confirmation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransferRequestLinks {\n");

    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
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

