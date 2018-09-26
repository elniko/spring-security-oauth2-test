package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * ISO20022: Set of elements used to reference a payment instruction. 
 */
public class PaymentIdentification   {
  @JsonProperty("ResourceId")
  private String resourceId = null;

  @JsonProperty("instructionId")
  private String instructionId = null;

  @JsonProperty("endToEndId")
  private String endToEndId = null;

  public PaymentIdentification resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * API: Identifier assigned by the ASPSP for further use of the created resource through API calls 
   * @return resourceId
  **/

 @Pattern(regexp="^([a-zA-Z0-9 /\\-?:\\()\\.,']{1,35})$")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public PaymentIdentification instructionId(String instructionId) {
    this.instructionId = instructionId;
    return this;
  }

   /**
   * ISO20022: Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction.  API: Unique identification shared between the PISP and the ASPSP 
   * @return instructionId
  **/
  @NotNull

 @Pattern(regexp="^([a-zA-Z0-9 /\\-?:\\()\\.,']{1,35})$")
  public String getInstructionId() {
    return instructionId;
  }

  public void setInstructionId(String instructionId) {
    this.instructionId = instructionId;
  }

  public PaymentIdentification endToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
    return this;
  }

   /**
   * ISO20022: Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.  API: Unique identification shared between the merchant and the PSU 
   * @return endToEndId
  **/
  @NotNull

 @Pattern(regexp="^([a-zA-Z0-9 /\\-?:\\()\\.,']{1,35})$")
  public String getEndToEndId() {
    return endToEndId;
  }

  public void setEndToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentIdentification paymentIdentification = (PaymentIdentification) o;
    return Objects.equals(this.resourceId, paymentIdentification.resourceId) &&
        Objects.equals(this.instructionId, paymentIdentification.instructionId) &&
        Objects.equals(this.endToEndId, paymentIdentification.endToEndId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, instructionId, endToEndId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentIdentification {\n");

    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    instructionId: ").append(toIndentedString(instructionId)).append("\n");
    sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
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

