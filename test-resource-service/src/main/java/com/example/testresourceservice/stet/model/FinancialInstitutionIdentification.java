package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * ISO20022: Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.  API: Only &lt;Bicfi&gt; element is allowed 
 */
@ApiModel(description = "ISO20022: Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.  API: Only <Bicfi> element is allowed ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class FinancialInstitutionIdentification   {
  @JsonProperty("bicFi")
  private String bicFi = null;

  public FinancialInstitutionIdentification bicFi(String bicFi) {
    this.bicFi = bicFi;
    return this;
  }

   /**
   * ISO20022: Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identification code (BIC)\". 
   * @return bicFi
  **/
  @ApiModelProperty(required = true, value = "ISO20022: Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identification code (BIC)\". ")
  @NotNull

 @Pattern(regexp="^[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}$")
  public String getBicFi() {
    return bicFi;
  }

  public void setBicFi(String bicFi) {
    this.bicFi = bicFi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialInstitutionIdentification financialInstitutionIdentification = (FinancialInstitutionIdentification) o;
    return Objects.equals(this.bicFi, financialInstitutionIdentification.bicFi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bicFi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialInstitutionIdentification {\n");

    sb.append("    bicFi: ").append(toIndentedString(bicFi)).append("\n");
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

