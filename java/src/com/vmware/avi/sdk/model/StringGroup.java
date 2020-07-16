package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The StringGroup is a POJO class extends AviRestResource that used for creating
 * StringGroup.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StringGroup extends AviRestResource  {
    @JsonProperty("description")
    private String description = null;

    @JsonProperty("kv")
    private List<KeyValue> kv = null;

    @JsonProperty("longest_match")
    private Boolean longestMatch = false;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("tenant_ref")
    private String tenantRef = null;

    @JsonProperty("type")
    private String type = "SG_TYPE_STRING";

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * User defined description for the object.
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * This is the setter method to the attribute.
   * User defined description for the object.
   * @param description set the description.
   */
  public void setDescription(String  description) {
    this.description = description;
  }
  /**
   * This is the getter method this will return the attribute value.
   * Configure key value in the string group.
   * @return kv
   */
  public List<KeyValue> getKv() {
    return kv;
  }

  /**
   * This is the setter method. this will set the kv
   * Configure key value in the string group.
   * @return kv
   */
  public void setKv(List<KeyValue>  kv) {
    this.kv = kv;
  }

  /**
   * This is the setter method this will set the kv
   * Configure key value in the string group.
   * @return kv
   */
  public StringGroup addKvItem(KeyValue kvItem) {
    if (this.kv == null) {
      this.kv = new ArrayList<KeyValue>();
    }
    this.kv.add(kvItem);
    return this;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable the longest match, default is the shortest match.
   * Field introduced in 18.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @return longestMatch
   */
  public Boolean getLongestMatch() {
    return longestMatch;
  }

  /**
   * This is the setter method to the attribute.
   * Enable the longest match, default is the shortest match.
   * Field introduced in 18.2.8.
   * Default value when not specified in API or module is interpreted by Avi Controller as false.
   * @param longestMatch set the longestMatch.
   */
  public void setLongestMatch(Boolean  longestMatch) {
    this.longestMatch = longestMatch;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of the string group.
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the string group.
   * @param name set the name.
   */
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * It is a reference to an object of type tenant.
   * @return tenantRef
   */
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * It is a reference to an object of type tenant.
   * @param tenantRef set the tenantRef.
   */
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of stringgroup.
   * Enum options - SG_TYPE_STRING, SG_TYPE_KEYVAL.
   * Default value when not specified in API or module is interpreted by Avi Controller as SG_TYPE_STRING.
   * @return type
   */
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of stringgroup.
   * Enum options - SG_TYPE_STRING, SG_TYPE_KEYVAL.
   * Default value when not specified in API or module is interpreted by Avi Controller as SG_TYPE_STRING.
   * @param type set the type.
   */
  public void setType(String  type) {
    this.type = type;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the string group.
   * @return uuid
   */
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the string group.
   * @param uuid set the uuid.
   */
  public void setUuid(String  uuid) {
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
  StringGroup objStringGroup = (StringGroup) o;
  return   Objects.equals(this.uuid, objStringGroup.uuid)&&
  Objects.equals(this.description, objStringGroup.description)&&
  Objects.equals(this.kv, objStringGroup.kv)&&
  Objects.equals(this.longestMatch, objStringGroup.longestMatch)&&
  Objects.equals(this.type, objStringGroup.type)&&
  Objects.equals(this.tenantRef, objStringGroup.tenantRef)&&
  Objects.equals(this.name, objStringGroup.name);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class StringGroup {\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    kv: ").append(toIndentedString(kv)).append("\n");
        sb.append("    longestMatch: ").append(toIndentedString(longestMatch)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

