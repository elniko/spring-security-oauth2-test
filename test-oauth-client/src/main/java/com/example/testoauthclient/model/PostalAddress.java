package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ISO20022 : Information that locates and identifies a specific address, as defined by postal services. 
 */

public class PostalAddress   {
  @JsonProperty("country")
  private String country = null;

  @JsonProperty("addressLine")
  private List<String> addressLine = new ArrayList<String>();

  public PostalAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * ISO20022: Country in which a person resides (the place of a person's home). In the case of a company, it is the country from which the affairs of that company are directed. 
   * @return country
  **/
  @NotNull

 @Pattern(regexp="^([A-Z]{2,2})$")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PostalAddress addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public PostalAddress addAddressLineItem(String addressLineItem) {
    this.addressLine.add(addressLineItem);
    return this;
  }

   /**
   * Unstructured address. The two lines must embed zip code and town name
   * @return addressLine
  **/
  @NotNull
  public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostalAddress postalAddress = (PostalAddress) o;
    return Objects.equals(this.country, postalAddress.country) &&
        Objects.equals(this.addressLine, postalAddress.addressLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, addressLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostalAddress {\n");

    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
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

