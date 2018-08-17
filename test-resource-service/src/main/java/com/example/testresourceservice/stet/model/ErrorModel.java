package com.example.testresourceservice.stet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Generic error report structure
 */
@ApiModel(description = "Generic error report structure")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-13T16:28:50.109+02:00")

public class ErrorModel   {
  @JsonProperty("timestamp")
  private DateTime timestamp = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("path")
  private String path = null;

  public ErrorModel timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * current timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "current timestamp")

  @Valid

  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ErrorModel status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * HTTP error code
   * @return status
  **/
  @ApiModelProperty(required = true, value = "HTTP error code")
  @NotNull


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ErrorModel error(String error) {
    this.error = error;
    return this;
  }

   /**
   * HTTP error text
   * @return error
  **/
  @ApiModelProperty(value = "HTTP error text")

 @Size(max=140)
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ErrorModel message(String message) {
    this.message = message;
    return this;
  }

   /**
   * HTTP textual reason phrase
   * @return message
  **/
  @ApiModelProperty(required = true, value = "HTTP textual reason phrase")
  @NotNull

 @Size(max=140)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorModel path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Relevant path that was used
   * @return path
  **/
  @ApiModelProperty(value = "Relevant path that was used")

 @Size(max=140)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(this.timestamp, errorModel.timestamp) &&
        Objects.equals(this.status, errorModel.status) &&
        Objects.equals(this.error, errorModel.error) &&
        Objects.equals(this.message, errorModel.message) &&
        Objects.equals(this.path, errorModel.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, status, error, message, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");

    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

