package com.example.testoauthclient.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ISO20022: Additional information that cannot be captured in the structured elements and/or any other specific block.  API: This structure is used to embed the relevant URLs for returning the status report to the PISP and to specify which SCA approaches are accepted by the PISP and which has been chosen by the ASPSP 
 */
public class SupplementaryData   {
  /**
   * combination of possible values for SCA models
   */
  public enum AcceptedScaApproachEnum {
    REDIRECT("REDIRECT"),
    
    DECOUPLED("DECOUPLED"),
    
    EMBEDDED("EMBEDDED");

    private String value;

    AcceptedScaApproachEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AcceptedScaApproachEnum fromValue(String text) {
      for (AcceptedScaApproachEnum b : AcceptedScaApproachEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("acceptedScaApproach")
  private List<AcceptedScaApproachEnum> acceptedScaApproach = null;

  @JsonProperty("appliedScaApproach")
  private AppliedScaApproach appliedScaApproach = null;

  @JsonProperty("successfulReportUrl")
  private String successfulReportUrl = null;

  @JsonProperty("unsuccessfulReportUrl")
  private String unsuccessfulReportUrl = null;

  public SupplementaryData acceptedScaApproach(List<AcceptedScaApproachEnum> acceptedScaApproach) {
    this.acceptedScaApproach = acceptedScaApproach;
    return this;
  }

  public SupplementaryData addAcceptedScaApproachItem(AcceptedScaApproachEnum acceptedScaApproachItem) {
    if (this.acceptedScaApproach == null) {
      this.acceptedScaApproach = new ArrayList<AcceptedScaApproachEnum>();
    }
    this.acceptedScaApproach.add(acceptedScaApproachItem);
    return this;
  }

   /**
   * can only be set by the PISP SCA approaches that are supported by the PISP. The PISP can provide several choices separated by commas. REDIRECT: the PSU is redirected by the TPP to the ASPSP which processes identification and authentication DECOUPLED: the TPP identifies the PSU and forwards the identification to the ASPSP which processes the authentication through a decoupled device EMBEDDED: the TPP identifies the PSU and forwards the identification to the ASPSP which starts the authentication. The TPP forwards one authentication factor of the PSU (e.g. OTP or response to a challenge) 
   * @return acceptedScaApproach
  **/

  public List<AcceptedScaApproachEnum> getAcceptedScaApproach() {
    return acceptedScaApproach;
  }

  public void setAcceptedScaApproach(List<AcceptedScaApproachEnum> acceptedScaApproach) {
    this.acceptedScaApproach = acceptedScaApproach;
  }

  public SupplementaryData appliedScaApproach(AppliedScaApproach appliedScaApproach) {
    this.appliedScaApproach = appliedScaApproach;
    return this;
  }

   /**
   * Get appliedScaApproach
   * @return appliedScaApproach
  **/

  public AppliedScaApproach getAppliedScaApproach() {
    return appliedScaApproach;
  }

  public void setAppliedScaApproach(AppliedScaApproach appliedScaApproach) {
    this.appliedScaApproach = appliedScaApproach;
  }

  public SupplementaryData successfulReportUrl(String successfulReportUrl) {
    this.successfulReportUrl = successfulReportUrl;
    return this;
  }

   /**
   * URL to be used by the ASPSP in order to notify the PISP of the finalisation of the SCA and consent process in REDIRECT and DECOUPLED approach 
   * @return successfulReportUrl
  **/

  public String getSuccessfulReportUrl() {
    return successfulReportUrl;
  }

  public void setSuccessfulReportUrl(String successfulReportUrl) {
    this.successfulReportUrl = successfulReportUrl;
  }

  public SupplementaryData unsuccessfulReportUrl(String unsuccessfulReportUrl) {
    this.unsuccessfulReportUrl = unsuccessfulReportUrl;
    return this;
  }

   /**
   * URL to be used by the ASPSP in order to notify the PISP of the failure of the SCA and consent process in REDIRECT and DECOUPLED approach If this URL is not provided by the PISP, the ASPSP will use the \"successfulReportUrl\" even in case of failure of the Payment or Transfer Request processing 
   * @return unsuccessfulReportUrl
  **/
  public String getUnsuccessfulReportUrl() {
    return unsuccessfulReportUrl;
  }

  public void setUnsuccessfulReportUrl(String unsuccessfulReportUrl) {
    this.unsuccessfulReportUrl = unsuccessfulReportUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplementaryData supplementaryData = (SupplementaryData) o;
    return Objects.equals(this.acceptedScaApproach, supplementaryData.acceptedScaApproach) &&
        Objects.equals(this.appliedScaApproach, supplementaryData.appliedScaApproach) &&
        Objects.equals(this.successfulReportUrl, supplementaryData.successfulReportUrl) &&
        Objects.equals(this.unsuccessfulReportUrl, supplementaryData.unsuccessfulReportUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedScaApproach, appliedScaApproach, successfulReportUrl, unsuccessfulReportUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplementaryData {\n");

    sb.append("    acceptedScaApproach: ").append(toIndentedString(acceptedScaApproach)).append("\n");
    sb.append("    appliedScaApproach: ").append(toIndentedString(appliedScaApproach)).append("\n");
    sb.append("    successfulReportUrl: ").append(toIndentedString(successfulReportUrl)).append("\n");
    sb.append("    unsuccessfulReportUrl: ").append(toIndentedString(unsuccessfulReportUrl)).append("\n");
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

