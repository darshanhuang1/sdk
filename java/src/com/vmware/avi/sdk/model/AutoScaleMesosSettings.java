/*
 * Avi avi_global_spec Object API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 20.1.1
 * Contact: support@avinetworks.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.avi.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * AutoScaleMesosSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class AutoScaleMesosSettings {
  @JsonProperty("force")
  private Boolean force = true;

  public AutoScaleMesosSettings force(Boolean force) {
    this.force = force;
    return this;
  }

   /**
   * Apply scaleout even when there are deployments inprogress.
   * @return force
  **/
  @Schema(description = "Apply scaleout even when there are deployments inprogress.")
  public Boolean isForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoScaleMesosSettings autoScaleMesosSettings = (AutoScaleMesosSettings) o;
    return Objects.equals(this.force, autoScaleMesosSettings.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScaleMesosSettings {\n");
    
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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