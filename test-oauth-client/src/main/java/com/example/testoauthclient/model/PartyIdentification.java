package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * API : Description of a Party which can be either a person or an organization. 
 */

public class PartyIdentification {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("postalAddress")
  private PostalAddress postalAddress = null;

  @JsonProperty("organisationId")
  private GenericIdentification organisationId = null;

  @JsonProperty("privateId")
  private GenericIdentification privateId = null;

  public PartyIdentification name(String name) {
    this.name = name;
    return this;
  }

   /**
   * ISO20022: Name by which a party is known and which is usually used to identify that party. 
   * @return name
  **/
  @NotNull

 @Size(max=140)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PartyIdentification postalAddress(PostalAddress postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

   /**
   * Get postalAddress
   * @return postalAddress
  **/

  @Valid
  public PostalAddress getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(PostalAddress postalAddress) {
    this.postalAddress = postalAddress;
  }

  public PartyIdentification organisationId(GenericIdentification organisationId) {
    this.organisationId = organisationId;
    return this;
  }

   /**
   * Unique and unambiguous way to identify an organisation.
   * @return organisationId
  **/

  @Valid
  public GenericIdentification getOrganisationId() {
    return organisationId;
  }

  public void setOrganisationId(GenericIdentification organisationId) {
    this.organisationId = organisationId;
  }

  public PartyIdentification privateId(GenericIdentification privateId) {
    this.privateId = privateId;
    return this;
  }

   /**
   * Unique and unambiguous identification of a person.
   * @return privateId
  **/

  @Valid
  public GenericIdentification getPrivateId() {
    return privateId;
  }

  public void setPrivateId(GenericIdentification privateId) {
    this.privateId = privateId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyIdentification partyIdentification = (PartyIdentification) o;
    return Objects.equals(this.name, partyIdentification.name) &&
        Objects.equals(this.postalAddress, partyIdentification.postalAddress) &&
        Objects.equals(this.organisationId, partyIdentification.organisationId) &&
        Objects.equals(this.privateId, partyIdentification.privateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, postalAddress, organisationId, privateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyIdentification {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    organisationId: ").append(toIndentedString(organisationId)).append("\n");
    sb.append("    privateId: ").append(toIndentedString(privateId)).append("\n");
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

