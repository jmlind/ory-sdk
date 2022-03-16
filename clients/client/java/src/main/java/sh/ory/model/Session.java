/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.130
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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import sh.ory.model.AuthenticatorAssuranceLevel;
import sh.ory.model.Identity;
import sh.ory.model.SessionAuthenticationMethod;

/**
 * A Session
 */
@ApiModel(description = "A Session")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-16T14:18:24.638830787Z[Etc/UTC]")
public class Session {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_AUTHENTICATED_AT = "authenticated_at";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATED_AT)
  private OffsetDateTime authenticatedAt;

  public static final String SERIALIZED_NAME_AUTHENTICATION_METHODS = "authentication_methods";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_METHODS)
  private List<SessionAuthenticationMethod> authenticationMethods = null;

  public static final String SERIALIZED_NAME_AUTHENTICATOR_ASSURANCE_LEVEL = "authenticator_assurance_level";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATOR_ASSURANCE_LEVEL)
  private AuthenticatorAssuranceLevel authenticatorAssuranceLevel;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private Identity identity;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private OffsetDateTime issuedAt;

  public Session() { 
  }

  public Session active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Active state. If false the session is no longer active.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Active state. If false the session is no longer active.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Session authenticatedAt(OffsetDateTime authenticatedAt) {
    
    this.authenticatedAt = authenticatedAt;
    return this;
  }

   /**
   * The Session Authentication Timestamp  When this session was authenticated at. If multi-factor authentication was used this is the time when the last factor was authenticated (e.g. the TOTP code challenge was completed).
   * @return authenticatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Session Authentication Timestamp  When this session was authenticated at. If multi-factor authentication was used this is the time when the last factor was authenticated (e.g. the TOTP code challenge was completed).")

  public OffsetDateTime getAuthenticatedAt() {
    return authenticatedAt;
  }


  public void setAuthenticatedAt(OffsetDateTime authenticatedAt) {
    this.authenticatedAt = authenticatedAt;
  }


  public Session authenticationMethods(List<SessionAuthenticationMethod> authenticationMethods) {
    
    this.authenticationMethods = authenticationMethods;
    return this;
  }

  public Session addAuthenticationMethodsItem(SessionAuthenticationMethod authenticationMethodsItem) {
    if (this.authenticationMethods == null) {
      this.authenticationMethods = new ArrayList<>();
    }
    this.authenticationMethods.add(authenticationMethodsItem);
    return this;
  }

   /**
   * A list of authenticators which were used to authenticate the session.
   * @return authenticationMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of authenticators which were used to authenticate the session.")

  public List<SessionAuthenticationMethod> getAuthenticationMethods() {
    return authenticationMethods;
  }


  public void setAuthenticationMethods(List<SessionAuthenticationMethod> authenticationMethods) {
    this.authenticationMethods = authenticationMethods;
  }


  public Session authenticatorAssuranceLevel(AuthenticatorAssuranceLevel authenticatorAssuranceLevel) {
    
    this.authenticatorAssuranceLevel = authenticatorAssuranceLevel;
    return this;
  }

   /**
   * Get authenticatorAssuranceLevel
   * @return authenticatorAssuranceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthenticatorAssuranceLevel getAuthenticatorAssuranceLevel() {
    return authenticatorAssuranceLevel;
  }


  public void setAuthenticatorAssuranceLevel(AuthenticatorAssuranceLevel authenticatorAssuranceLevel) {
    this.authenticatorAssuranceLevel = authenticatorAssuranceLevel;
  }


  public Session expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The Session Expiry  When this session expires at.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Session Expiry  When this session expires at.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public Session id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Session identity(Identity identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Identity getIdentity() {
    return identity;
  }


  public void setIdentity(Identity identity) {
    this.identity = identity;
  }


  public Session issuedAt(OffsetDateTime issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * The Session Issuance Timestamp  When this session was issued at. Usually equal or close to &#x60;authenticated_at&#x60;.
   * @return issuedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Session Issuance Timestamp  When this session was issued at. Usually equal or close to `authenticated_at`.")

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Session session = (Session) o;
    return Objects.equals(this.active, session.active) &&
        Objects.equals(this.authenticatedAt, session.authenticatedAt) &&
        Objects.equals(this.authenticationMethods, session.authenticationMethods) &&
        Objects.equals(this.authenticatorAssuranceLevel, session.authenticatorAssuranceLevel) &&
        Objects.equals(this.expiresAt, session.expiresAt) &&
        Objects.equals(this.id, session.id) &&
        Objects.equals(this.identity, session.identity) &&
        Objects.equals(this.issuedAt, session.issuedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, authenticatedAt, authenticationMethods, authenticatorAssuranceLevel, expiresAt, id, identity, issuedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    authenticatedAt: ").append(toIndentedString(authenticatedAt)).append("\n");
    sb.append("    authenticationMethods: ").append(toIndentedString(authenticationMethods)).append("\n");
    sb.append("    authenticatorAssuranceLevel: ").append(toIndentedString(authenticatorAssuranceLevel)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
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

