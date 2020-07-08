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
import java.util.ArrayList;
import java.util.List;
/**
 * MicroServiceGroup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class MicroServiceGroup {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("service_refs")
  private List<String> serviceRefs = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

   /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return _lastModified
  **/
  @Schema(description = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")
  public String getLastModified() {
    return _lastModified;
  }

  public MicroServiceGroup createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Creator name.
   * @return createdBy
  **/
  @Schema(description = "Creator name.")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public MicroServiceGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * User defined description for the object.
   * @return description
  **/
  @Schema(description = "User defined description for the object.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MicroServiceGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the MicroService group.
   * @return name
  **/
  @Schema(required = true, description = "Name of the MicroService group.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MicroServiceGroup serviceRefs(List<String> serviceRefs) {
    this.serviceRefs = serviceRefs;
    return this;
  }

  public MicroServiceGroup addServiceRefsItem(String serviceRefsItem) {
    if (this.serviceRefs == null) {
      this.serviceRefs = new ArrayList<String>();
    }
    this.serviceRefs.add(serviceRefsItem);
    return this;
  }

   /**
   * Configure MicroService(es). It is a reference to an object of type MicroService.
   * @return serviceRefs
  **/
  @Schema(description = "Configure MicroService(es). It is a reference to an object of type MicroService.")
  public List<String> getServiceRefs() {
    return serviceRefs;
  }

  public void setServiceRefs(List<String> serviceRefs) {
    this.serviceRefs = serviceRefs;
  }

  public MicroServiceGroup tenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @Schema(description = " It is a reference to an object of type Tenant.")
  public String getTenantRef() {
    return tenantRef;
  }

  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

   /**
   * url
   * @return url
  **/
  @Schema(description = "url")
  public String getUrl() {
    return url;
  }

  public MicroServiceGroup uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of the MicroService group.
   * @return uuid
  **/
  @Schema(description = "UUID of the MicroService group.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicroServiceGroup microServiceGroup = (MicroServiceGroup) o;
    return Objects.equals(this._lastModified, microServiceGroup._lastModified) &&
        Objects.equals(this.createdBy, microServiceGroup.createdBy) &&
        Objects.equals(this.description, microServiceGroup.description) &&
        Objects.equals(this.name, microServiceGroup.name) &&
        Objects.equals(this.serviceRefs, microServiceGroup.serviceRefs) &&
        Objects.equals(this.tenantRef, microServiceGroup.tenantRef) &&
        Objects.equals(this.url, microServiceGroup.url) &&
        Objects.equals(this.uuid, microServiceGroup.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, createdBy, description, name, serviceRefs, tenantRef, url, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicroServiceGroup {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceRefs: ").append(toIndentedString(serviceRefs)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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