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
import com.vmware.avi.sdk.model.IpAddr;
import com.vmware.avi.sdk.model.OperationalStatus;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SCServerStateInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class SCServerStateInfo {
  @JsonProperty("oper_status")
  private OperationalStatus operStatus = null;

  @JsonProperty("server_ip")
  private IpAddr serverIp = null;

  @JsonProperty("server_port")
  private Integer serverPort = null;

  public SCServerStateInfo operStatus(OperationalStatus operStatus) {
    this.operStatus = operStatus;
    return this;
  }

   /**
   * Get operStatus
   * @return operStatus
  **/
  @Schema(description = "")
  public OperationalStatus getOperStatus() {
    return operStatus;
  }

  public void setOperStatus(OperationalStatus operStatus) {
    this.operStatus = operStatus;
  }

  public SCServerStateInfo serverIp(IpAddr serverIp) {
    this.serverIp = serverIp;
    return this;
  }

   /**
   * Get serverIp
   * @return serverIp
  **/
  @Schema(description = "")
  public IpAddr getServerIp() {
    return serverIp;
  }

  public void setServerIp(IpAddr serverIp) {
    this.serverIp = serverIp;
  }

  public SCServerStateInfo serverPort(Integer serverPort) {
    this.serverPort = serverPort;
    return this;
  }

   /**
   *  Allowed values are 1-65535. Field introduced in 17.1.1.
   * @return serverPort
  **/
  @Schema(description = " Allowed values are 1-65535. Field introduced in 17.1.1.")
  public Integer getServerPort() {
    return serverPort;
  }

  public void setServerPort(Integer serverPort) {
    this.serverPort = serverPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SCServerStateInfo scServerStateInfo = (SCServerStateInfo) o;
    return Objects.equals(this.operStatus, scServerStateInfo.operStatus) &&
        Objects.equals(this.serverIp, scServerStateInfo.serverIp) &&
        Objects.equals(this.serverPort, scServerStateInfo.serverPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operStatus, serverIp, serverPort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SCServerStateInfo {\n");
    
    sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
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