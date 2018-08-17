package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * hypertext reference
 */
@ApiModel(description = "hypertext reference")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class GenericLink   {
  @JsonProperty("href")
  private String href = null;

  @JsonProperty("templated")
  private Boolean templated = null;

  public GenericLink href(String href) {
    this.href = href;
    return this;
  }

   /**
   * URI to be used
   * @return href
  **/
  @ApiModelProperty(required = true, value = "URI to be used")
  @NotNull

 @Size(max=140)
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public GenericLink templated(Boolean templated) {
    this.templated = templated;
    return this;
  }

   /**
   * specifies \"true\" if href is a URI template, i.e. with parameters. Otherwise, this property is absent or set to false
   * @return templated
  **/
  @ApiModelProperty(value = "specifies \"true\" if href is a URI template, i.e. with parameters. Otherwise, this property is absent or set to false")


  public Boolean getTemplated() {
    return templated;
  }

  public void setTemplated(Boolean templated) {
    this.templated = templated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericLink genericLink = (GenericLink) o;
    return Objects.equals(this.href, genericLink.href) &&
        Objects.equals(this.templated, genericLink.templated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, templated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericLink {\n");

    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    templated: ").append(toIndentedString(templated)).append("\n");
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

