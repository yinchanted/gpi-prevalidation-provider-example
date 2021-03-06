/*
 * Beneficiary account pre-validation for SDK consumers
 * Move your app forward with the account pre-validation API.
 *
 * OpenAPI spec version: 1.0.7-oas3-sdk
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.swift.gpi.preval.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.swift.gpi.preval.model.ValidationCheckReponse1;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;

/**
 * Beneficiary account verification response.
 */
@Schema(description = "Beneficiary account verification response.")
public class AccountVerificationResponse1   {
  @JsonProperty("correlation_identifier")
  private String correlationIdentifier = null;

  @JsonProperty("response")
  private ValidationCheckReponse1 response = null;

  public AccountVerificationResponse1 correlationIdentifier(String correlationIdentifier) {
    this.correlationIdentifier = correlationIdentifier;
    return this;
  }

  /**
   * Get correlationIdentifier
   * @return correlationIdentifier
   **/
  @JsonProperty("correlation_identifier")
  @Schema(description = "")
 @Size(min=1,max=50)  public String getCorrelationIdentifier() {
    return correlationIdentifier;
  }

  public void setCorrelationIdentifier(String correlationIdentifier) {
    this.correlationIdentifier = correlationIdentifier;
  }

  public AccountVerificationResponse1 response(ValidationCheckReponse1 response) {
    this.response = response;
    return this;
  }

  /**
   * Get response
   * @return response
   **/
  @JsonProperty("response")
  @Schema(required = true, description = "")
  @NotNull
  public ValidationCheckReponse1 getResponse() {
    return response;
  }

  public void setResponse(ValidationCheckReponse1 response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountVerificationResponse1 accountVerificationResponse1 = (AccountVerificationResponse1) o;
    return Objects.equals(this.correlationIdentifier, accountVerificationResponse1.correlationIdentifier) &&
        Objects.equals(this.response, accountVerificationResponse1.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationIdentifier, response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountVerificationResponse1 {\n");
    
    sb.append("    correlationIdentifier: ").append(toIndentedString(correlationIdentifier)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
