package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Unique and unambiguous identification for the account between the account owner and the account servicer.
 */
@ApiModel(description = "Unique and unambiguous identification for the account between the account owner and the account servicer.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class AccountIdentification   {
  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("other")
  private GenericIdentification other = null;

  public AccountIdentification iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * ISO20022: International Bank Account Number (IBAN) - identification used internationally by financial institutions to uniquely identify the account of a customer.  Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions. 
   * @return iban
  **/
  @ApiModelProperty(value = "ISO20022: International Bank Account Number (IBAN) - identification used internationally by financial institutions to uniquely identify the account of a customer.  Further specifications of the format and content of the IBAN can be found in the standard ISO 13616 \"Banking and related financial services - International Bank Account Number (IBAN)\" version 1997-10-01, or later revisions. ")

 @Pattern(regexp="^[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}$")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public AccountIdentification other(GenericIdentification other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericIdentification getOther() {
    return other;
  }

  public void setOther(GenericIdentification other) {
    this.other = other;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountIdentification accountIdentification = (AccountIdentification) o;
    return Objects.equals(this.iban, accountIdentification.iban) &&
        Objects.equals(this.other, accountIdentification.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, other);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountIdentification {\n");

    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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

