/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.31
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

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
import java.time.OffsetDateTime;
import sh.ory.model.GenericError;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * Is sent when a flow is expired
 */
@ApiModel(description = "Is sent when a flow is expired")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-18T09:12:02.473307167Z[Etc/UTC]")
public class SelfServiceFlowExpiredError {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private GenericError error;

  public static final String SERIALIZED_NAME_EXPIRED_AT = "expired_at";
  @SerializedName(SERIALIZED_NAME_EXPIRED_AT)
  private OffsetDateTime expiredAt;

  public static final String SERIALIZED_NAME_SINCE = "since";
  @SerializedName(SERIALIZED_NAME_SINCE)
  private Long since;

  public static final String SERIALIZED_NAME_USE_FLOW_ID = "use_flow_id";
  @SerializedName(SERIALIZED_NAME_USE_FLOW_ID)
  private String useFlowId;

  public SelfServiceFlowExpiredError() {
  }

  public SelfServiceFlowExpiredError error(GenericError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GenericError getError() {
    return error;
  }


  public void setError(GenericError error) {
    this.error = error;
  }


  public SelfServiceFlowExpiredError expiredAt(OffsetDateTime expiredAt) {
    
    this.expiredAt = expiredAt;
    return this;
  }

   /**
   * When the flow has expired
   * @return expiredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the flow has expired")

  public OffsetDateTime getExpiredAt() {
    return expiredAt;
  }


  public void setExpiredAt(OffsetDateTime expiredAt) {
    this.expiredAt = expiredAt;
  }


  public SelfServiceFlowExpiredError since(Long since) {
    
    this.since = since;
    return this;
  }

   /**
   * A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years.
   * @return since
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years.")

  public Long getSince() {
    return since;
  }


  public void setSince(Long since) {
    this.since = since;
  }


  public SelfServiceFlowExpiredError useFlowId(String useFlowId) {
    
    this.useFlowId = useFlowId;
    return this;
  }

   /**
   * The flow ID that should be used for the new flow as it contains the correct messages.
   * @return useFlowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The flow ID that should be used for the new flow as it contains the correct messages.")

  public String getUseFlowId() {
    return useFlowId;
  }


  public void setUseFlowId(String useFlowId) {
    this.useFlowId = useFlowId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfServiceFlowExpiredError selfServiceFlowExpiredError = (SelfServiceFlowExpiredError) o;
    return Objects.equals(this.error, selfServiceFlowExpiredError.error) &&
        Objects.equals(this.expiredAt, selfServiceFlowExpiredError.expiredAt) &&
        Objects.equals(this.since, selfServiceFlowExpiredError.since) &&
        Objects.equals(this.useFlowId, selfServiceFlowExpiredError.useFlowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, expiredAt, since, useFlowId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfServiceFlowExpiredError {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    useFlowId: ").append(toIndentedString(useFlowId)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("error");
    openapiFields.add("expired_at");
    openapiFields.add("since");
    openapiFields.add("use_flow_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SelfServiceFlowExpiredError
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SelfServiceFlowExpiredError.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SelfServiceFlowExpiredError is not found in the empty JSON string", SelfServiceFlowExpiredError.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SelfServiceFlowExpiredError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SelfServiceFlowExpiredError` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `error`
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) {
        GenericError.validateJsonObject(jsonObj.getAsJsonObject("error"));
      }
      if ((jsonObj.get("use_flow_id") != null && !jsonObj.get("use_flow_id").isJsonNull()) && !jsonObj.get("use_flow_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `use_flow_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("use_flow_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SelfServiceFlowExpiredError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SelfServiceFlowExpiredError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SelfServiceFlowExpiredError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SelfServiceFlowExpiredError.class));

       return (TypeAdapter<T>) new TypeAdapter<SelfServiceFlowExpiredError>() {
           @Override
           public void write(JsonWriter out, SelfServiceFlowExpiredError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SelfServiceFlowExpiredError read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SelfServiceFlowExpiredError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SelfServiceFlowExpiredError
  * @throws IOException if the JSON string is invalid with respect to SelfServiceFlowExpiredError
  */
  public static SelfServiceFlowExpiredError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SelfServiceFlowExpiredError.class);
  }

 /**
  * Convert an instance of SelfServiceFlowExpiredError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

