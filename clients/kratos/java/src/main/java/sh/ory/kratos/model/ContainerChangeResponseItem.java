/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.7.1-alpha.1
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ContainerChangeResponseItem change item in response to ContainerChanges operation
 */
@ApiModel(description = "ContainerChangeResponseItem change item in response to ContainerChanges operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-22T18:06:07.711120196Z[Etc/UTC]")
public class ContainerChangeResponseItem {
  public static final String SERIALIZED_NAME_KIND = "Kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private Integer kind;

  public static final String SERIALIZED_NAME_PATH = "Path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;


  public ContainerChangeResponseItem kind(Integer kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind of change
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "Kind of change")

  public Integer getKind() {
    return kind;
  }


  public void setKind(Integer kind) {
    this.kind = kind;
  }


  public ContainerChangeResponseItem path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path to file that has changed
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Path to file that has changed")

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
    ContainerChangeResponseItem containerChangeResponseItem = (ContainerChangeResponseItem) o;
    return Objects.equals(this.kind, containerChangeResponseItem.kind) &&
        Objects.equals(this.path, containerChangeResponseItem.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerChangeResponseItem {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

