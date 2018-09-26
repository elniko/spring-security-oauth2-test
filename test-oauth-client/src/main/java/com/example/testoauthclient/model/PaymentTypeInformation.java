package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ISO20022: Set of elements used to further specify the type of transaction. 
 */

public class PaymentTypeInformation   {
  @JsonProperty("instructionPriority")
  private PriorityCode instructionPriority = null;

  @JsonProperty("serviceLevel")
  private ServiceLevelCode serviceLevel = null;

  @JsonProperty("localInstrument")
  private LocalInstrumentCode localInstrument = null;

  @JsonProperty("categoryPurpose")
  private CategoryPurposeCode categoryPurpose = null;

  public PaymentTypeInformation instructionPriority(PriorityCode instructionPriority) {
    this.instructionPriority = instructionPriority;
    return this;
  }

   /**
   * Get instructionPriority
   * @return instructionPriority
  **/


  public PriorityCode getInstructionPriority() {
    return instructionPriority;
  }

  public void setInstructionPriority(PriorityCode instructionPriority) {
    this.instructionPriority = instructionPriority;
  }

  public PaymentTypeInformation serviceLevel(ServiceLevelCode serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }

   /**
   * Get serviceLevel
   * @return serviceLevel
  **/
  @NotNull

  public ServiceLevelCode getServiceLevel() {
    return serviceLevel;
  }

  public void setServiceLevel(ServiceLevelCode serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  public PaymentTypeInformation localInstrument(LocalInstrumentCode localInstrument) {
    this.localInstrument = localInstrument;
    return this;
  }

   /**
   * Get localInstrument
   * @return localInstrument
  **/

  public LocalInstrumentCode getLocalInstrument() {
    return localInstrument;
  }

  public void setLocalInstrument(LocalInstrumentCode localInstrument) {
    this.localInstrument = localInstrument;
  }

  public PaymentTypeInformation categoryPurpose(CategoryPurposeCode categoryPurpose) {
    this.categoryPurpose = categoryPurpose;
    return this;
  }

   /**
   * Get categoryPurpose
   * @return categoryPurpose
  **/

  public CategoryPurposeCode getCategoryPurpose() {
    return categoryPurpose;
  }

  public void setCategoryPurpose(CategoryPurposeCode categoryPurpose) {
    this.categoryPurpose = categoryPurpose;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTypeInformation paymentTypeInformation = (PaymentTypeInformation) o;
    return Objects.equals(this.instructionPriority, paymentTypeInformation.instructionPriority) &&
        Objects.equals(this.serviceLevel, paymentTypeInformation.serviceLevel) &&
        Objects.equals(this.localInstrument, paymentTypeInformation.localInstrument) &&
        Objects.equals(this.categoryPurpose, paymentTypeInformation.categoryPurpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionPriority, serviceLevel, localInstrument, categoryPurpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTypeInformation {\n");

    sb.append("    instructionPriority: ").append(toIndentedString(instructionPriority)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    localInstrument: ").append(toIndentedString(localInstrument)).append("\n");
    sb.append("    categoryPurpose: ").append(toIndentedString(categoryPurpose)).append("\n");
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

