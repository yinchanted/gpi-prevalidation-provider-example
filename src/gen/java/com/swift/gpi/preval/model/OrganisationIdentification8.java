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
import com.swift.gpi.preval.model.GenericOrganisationIdentification1;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Unique and unambiguous way to identify an organisation.
 */
@Schema(description = "Unique and unambiguous way to identify an organisation.")
public class OrganisationIdentification8   {
  @JsonProperty("any_bic")
  private String anyBic = null;

  @JsonProperty("other")
  private List<GenericOrganisationIdentification1> other = null;

  public OrganisationIdentification8 anyBic(String anyBic) {
    this.anyBic = anyBic;
    return this;
  }

  /**
   * Get anyBic
   * @return anyBic
   **/
  @JsonProperty("any_bic")
  @Schema(description = "")
 @Pattern(regexp="^[A-Z]{6,6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3,3}){0,1}$")  public String getAnyBic() {
    return anyBic;
  }

  public void setAnyBic(String anyBic) {
    this.anyBic = anyBic;
  }

  public OrganisationIdentification8 other(List<GenericOrganisationIdentification1> other) {
    this.other = other;
    return this;
  }

  public OrganisationIdentification8 addOtherItem(GenericOrganisationIdentification1 otherItem) {
    if (this.other == null) {
      this.other = new ArrayList<GenericOrganisationIdentification1>();
    }
    this.other.add(otherItem);
    return this;
  }

  /**
   * Unique identification of an organisation, as assigned by an institution, using an identification scheme.
   * @return other
   **/
  @JsonProperty("other")
  @Schema(description = "Unique identification of an organisation, as assigned by an institution, using an identification scheme.")
  public List<GenericOrganisationIdentification1> getOther() {
    return other;
  }

  public void setOther(List<GenericOrganisationIdentification1> other) {
    this.other = other;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganisationIdentification8 organisationIdentification8 = (OrganisationIdentification8) o;
    return Objects.equals(this.anyBic, organisationIdentification8.anyBic) &&
        Objects.equals(this.other, organisationIdentification8.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyBic, other);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationIdentification8 {\n");
    
    sb.append("    anyBic: ").append(toIndentedString(anyBic)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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
