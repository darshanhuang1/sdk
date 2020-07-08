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
import com.vmware.avi.sdk.model.RoutingService;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * NetworkService
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class NetworkService {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("cloud_ref")
  private String cloudRef = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("routing_service")
  private RoutingService routingService = null;

  @JsonProperty("se_group_ref")
  private String seGroupRef = null;

  @JsonProperty("service_type")
  private String serviceType = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("vrf_ref")
  private String vrfRef = null;

   /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return _lastModified
  **/
  @Schema(description = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")
  public String getLastModified() {
    return _lastModified;
  }

  public NetworkService cloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Cloud. Field introduced in 18.2.5.
   * @return cloudRef
  **/
  @Schema(description = " It is a reference to an object of type Cloud. Field introduced in 18.2.5.")
  public String getCloudRef() {
    return cloudRef;
  }

  public void setCloudRef(String cloudRef) {
    this.cloudRef = cloudRef;
  }

  public NetworkService name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the NetworkService. Field introduced in 18.2.5.
   * @return name
  **/
  @Schema(required = true, description = "Name of the NetworkService. Field introduced in 18.2.5.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NetworkService routingService(RoutingService routingService) {
    this.routingService = routingService;
    return this;
  }

   /**
   * Get routingService
   * @return routingService
  **/
  @Schema(description = "")
  public RoutingService getRoutingService() {
    return routingService;
  }

  public void setRoutingService(RoutingService routingService) {
    this.routingService = routingService;
  }

  public NetworkService seGroupRef(String seGroupRef) {
    this.seGroupRef = seGroupRef;
    return this;
  }

   /**
   * Service Engine Group to which the service is applied. It is a reference to an object of type ServiceEngineGroup. Field introduced in 18.2.5.
   * @return seGroupRef
  **/
  @Schema(required = true, description = "Service Engine Group to which the service is applied. It is a reference to an object of type ServiceEngineGroup. Field introduced in 18.2.5.")
  public String getSeGroupRef() {
    return seGroupRef;
  }

  public void setSeGroupRef(String seGroupRef) {
    this.seGroupRef = seGroupRef;
  }

  public NetworkService serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Indicates the type of NetworkService. Enum options - ROUTING_SERVICE. Field introduced in 18.2.5.
   * @return serviceType
  **/
  @Schema(required = true, description = "Indicates the type of NetworkService. Enum options - ROUTING_SERVICE. Field introduced in 18.2.5.")
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public NetworkService tenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Tenant. Field introduced in 18.2.5.
   * @return tenantRef
  **/
  @Schema(description = " It is a reference to an object of type Tenant. Field introduced in 18.2.5.")
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

  public NetworkService uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of the NetworkService. Field introduced in 18.2.5.
   * @return uuid
  **/
  @Schema(description = "UUID of the NetworkService. Field introduced in 18.2.5.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public NetworkService vrfRef(String vrfRef) {
    this.vrfRef = vrfRef;
    return this;
  }

   /**
   * VRF context to which the service is scoped. It is a reference to an object of type VrfContext. Field introduced in 18.2.5.
   * @return vrfRef
  **/
  @Schema(required = true, description = "VRF context to which the service is scoped. It is a reference to an object of type VrfContext. Field introduced in 18.2.5.")
  public String getVrfRef() {
    return vrfRef;
  }

  public void setVrfRef(String vrfRef) {
    this.vrfRef = vrfRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkService networkService = (NetworkService) o;
    return Objects.equals(this._lastModified, networkService._lastModified) &&
        Objects.equals(this.cloudRef, networkService.cloudRef) &&
        Objects.equals(this.name, networkService.name) &&
        Objects.equals(this.routingService, networkService.routingService) &&
        Objects.equals(this.seGroupRef, networkService.seGroupRef) &&
        Objects.equals(this.serviceType, networkService.serviceType) &&
        Objects.equals(this.tenantRef, networkService.tenantRef) &&
        Objects.equals(this.url, networkService.url) &&
        Objects.equals(this.uuid, networkService.uuid) &&
        Objects.equals(this.vrfRef, networkService.vrfRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, cloudRef, name, routingService, seGroupRef, serviceType, tenantRef, url, uuid, vrfRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkService {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    routingService: ").append(toIndentedString(routingService)).append("\n");
    sb.append("    seGroupRef: ").append(toIndentedString(seGroupRef)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    vrfRef: ").append(toIndentedString(vrfRef)).append("\n");
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