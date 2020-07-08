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
 * SSLKeyRSAParams
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class SSLKeyRSAParams {
  @JsonProperty("exponent")
  private Integer exponent = 65537;

  @JsonProperty("key_size")
  private String keySize = "SSL_KEY_2048_BITS";

  public SSLKeyRSAParams exponent(Integer exponent) {
    this.exponent = exponent;
    return this;
  }

   /**
   * Number of exponent.
   * @return exponent
  **/
  @Schema(description = "Number of exponent.")
  public Integer getExponent() {
    return exponent;
  }

  public void setExponent(Integer exponent) {
    this.exponent = exponent;
  }

  public SSLKeyRSAParams keySize(String keySize) {
    this.keySize = keySize;
    return this;
  }

   /**
   *  Enum options - SSL_KEY_1024_BITS, SSL_KEY_2048_BITS, SSL_KEY_3072_BITS, SSL_KEY_4096_BITS.
   * @return keySize
  **/
  @Schema(description = " Enum options - SSL_KEY_1024_BITS, SSL_KEY_2048_BITS, SSL_KEY_3072_BITS, SSL_KEY_4096_BITS.")
  public String getKeySize() {
    return keySize;
  }

  public void setKeySize(String keySize) {
    this.keySize = keySize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSLKeyRSAParams ssLKeyRSAParams = (SSLKeyRSAParams) o;
    return Objects.equals(this.exponent, ssLKeyRSAParams.exponent) &&
        Objects.equals(this.keySize, ssLKeyRSAParams.keySize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exponent, keySize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSLKeyRSAParams {\n");
    
    sb.append("    exponent: ").append(toIndentedString(exponent)).append("\n");
    sb.append("    keySize: ").append(toIndentedString(keySize)).append("\n");
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