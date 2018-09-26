package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * ISO20022: Unique identification of an account, a person or an organisation, as assigned by an issuer. 
 */

public class GenericIdentification   {
  @JsonProperty("identification")
  private String identification = null;

  @JsonProperty("schemeName")
  private String schemeName = null;

  @JsonProperty("issuer")
  private String issuer = null;

  public GenericIdentification identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * API: alias of an account 
   * @return identification
  **/
  @NotNull

 @Size(max=70)
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public GenericIdentification schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

   /**
   * Name of the identification scheme. Possible values for the scheme name, partially based on ISO20022 external code list, are the following: - BANK (BankPartyIdentification): Unique and unambiguous assignment made by a specific bank or similar financial institution to identify a relationship as defined between the bank and its client. - COID (CountryIdentificationCode) : Country authority given organisation identification (e.g., corporate registration number) - SREN (SIREN): The SIREN number is a 9 digit code assigned by INSEE, the French National Institute for Statistics and Economic Studies, to identify an organisation in France. - SRET (SIRET): The SIRET number is a 14 digit code assigned by INSEE, the French National Institute for Statistics and Economic Studies, to identify an organisation unit in France. It consists of the SIREN number, followed by a five digit classification number, to identify the local geographical unit of that entity. - NIDN (NationalIdentityNumber): Number assigned by an authority to identify the national identity number of a person. Other values are also permitted, for instance: - OAUT (OAUTH2): OAUTH2 access token that is owned by the PISP being also an AISP and that can be used in order to identify the PSU - CPAN (CardPan): Card PAN 
   * @return schemeName
  **/
  @NotNull
 @Size(max=70)
  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public GenericIdentification issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * ISO20022: Entity that assigns the identification. this could a country code or any organisation name or identifier that can be recognized by both parties 
   * @return issuer
  **/
  @NotNull

 @Size(max=35)
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericIdentification genericIdentification = (GenericIdentification) o;
    return Objects.equals(this.identification, genericIdentification.identification) &&
        Objects.equals(this.schemeName, genericIdentification.schemeName) &&
        Objects.equals(this.issuer, genericIdentification.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, schemeName, issuer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericIdentification {\n");

    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

