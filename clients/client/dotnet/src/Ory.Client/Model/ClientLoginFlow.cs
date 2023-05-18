/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.31
 * Contact: support@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Client.Client.OpenAPIDateConverter;

namespace Ory.Client.Model
{
    /// <summary>
    /// This object represents a login flow. A login flow is initiated at the \&quot;Initiate Login API / Browser Flow\&quot; endpoint by a client.  Once a login flow is completed successfully, a session cookie or session token will be issued.
    /// </summary>
    [DataContract(Name = "loginFlow")]
    public partial class ClientLoginFlow : IEquatable<ClientLoginFlow>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientLoginFlow" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientLoginFlow()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientLoginFlow" /> class.
        /// </summary>
        /// <param name="active">active.</param>
        /// <param name="createdAt">CreatedAt is a helper struct field for gobuffalo.pop..</param>
        /// <param name="expiresAt">ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated. (required).</param>
        /// <param name="id">ID represents the flow&#39;s unique ID. When performing the login flow, this represents the id in the login UI&#39;s query parameter: http://&lt;selfservice.flows.login.ui_url&gt;/?flow&#x3D;&lt;flow_id&gt; (required).</param>
        /// <param name="issuedAt">IssuedAt is the time (UTC) when the flow started. (required).</param>
        /// <param name="oauth2LoginChallenge">oauth2LoginChallenge.</param>
        /// <param name="oauth2LoginRequest">oauth2LoginRequest.</param>
        /// <param name="refresh">Refresh stores whether this login flow should enforce re-authentication..</param>
        /// <param name="requestUrl">RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example. (required).</param>
        /// <param name="requestedAal">requestedAal.</param>
        /// <param name="returnTo">ReturnTo contains the requested return_to URL..</param>
        /// <param name="sessionTokenExchangeCode">SessionTokenExchangeCode holds the secret code that the client can use to retrieve a session token after the login flow has been completed. This is only set if the client has requested a session token exchange code, and if the flow is of type \&quot;api\&quot;, and only on creating the login flow..</param>
        /// <param name="type">The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;. (required).</param>
        /// <param name="ui">ui (required).</param>
        /// <param name="updatedAt">UpdatedAt is a helper struct field for gobuffalo.pop..</param>
        public ClientLoginFlow(ClientIdentityCredentialsType active = default(ClientIdentityCredentialsType), DateTime createdAt = default(DateTime), DateTime expiresAt = default(DateTime), string id = default(string), DateTime issuedAt = default(DateTime), string oauth2LoginChallenge = default(string), ClientOAuth2LoginRequest oauth2LoginRequest = default(ClientOAuth2LoginRequest), bool refresh = default(bool), string requestUrl = default(string), ClientAuthenticatorAssuranceLevel requestedAal = default(ClientAuthenticatorAssuranceLevel), string returnTo = default(string), string sessionTokenExchangeCode = default(string), string type = default(string), ClientUiContainer ui = default(ClientUiContainer), DateTime updatedAt = default(DateTime))
        {
            this.ExpiresAt = expiresAt;
            // to ensure "id" is required (not null)
            if (id == null) {
                throw new ArgumentNullException("id is a required property for ClientLoginFlow and cannot be null");
            }
            this.Id = id;
            this.IssuedAt = issuedAt;
            // to ensure "requestUrl" is required (not null)
            if (requestUrl == null) {
                throw new ArgumentNullException("requestUrl is a required property for ClientLoginFlow and cannot be null");
            }
            this.RequestUrl = requestUrl;
            // to ensure "type" is required (not null)
            if (type == null) {
                throw new ArgumentNullException("type is a required property for ClientLoginFlow and cannot be null");
            }
            this.Type = type;
            // to ensure "ui" is required (not null)
            if (ui == null) {
                throw new ArgumentNullException("ui is a required property for ClientLoginFlow and cannot be null");
            }
            this.Ui = ui;
            this.Active = active;
            this.CreatedAt = createdAt;
            this.Oauth2LoginChallenge = oauth2LoginChallenge;
            this.Oauth2LoginRequest = oauth2LoginRequest;
            this.Refresh = refresh;
            this.RequestedAal = requestedAal;
            this.ReturnTo = returnTo;
            this.SessionTokenExchangeCode = sessionTokenExchangeCode;
            this.UpdatedAt = updatedAt;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Active
        /// </summary>
        [DataMember(Name = "active", EmitDefaultValue = false)]
        public ClientIdentityCredentialsType Active { get; set; }

        /// <summary>
        /// CreatedAt is a helper struct field for gobuffalo.pop.
        /// </summary>
        /// <value>CreatedAt is a helper struct field for gobuffalo.pop.</value>
        [DataMember(Name = "created_at", EmitDefaultValue = false)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.
        /// </summary>
        /// <value>ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.</value>
        [DataMember(Name = "expires_at", IsRequired = true, EmitDefaultValue = false)]
        public DateTime ExpiresAt { get; set; }

        /// <summary>
        /// ID represents the flow&#39;s unique ID. When performing the login flow, this represents the id in the login UI&#39;s query parameter: http://&lt;selfservice.flows.login.ui_url&gt;/?flow&#x3D;&lt;flow_id&gt;
        /// </summary>
        /// <value>ID represents the flow&#39;s unique ID. When performing the login flow, this represents the id in the login UI&#39;s query parameter: http://&lt;selfservice.flows.login.ui_url&gt;/?flow&#x3D;&lt;flow_id&gt;</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// IssuedAt is the time (UTC) when the flow started.
        /// </summary>
        /// <value>IssuedAt is the time (UTC) when the flow started.</value>
        [DataMember(Name = "issued_at", IsRequired = true, EmitDefaultValue = false)]
        public DateTime IssuedAt { get; set; }

        /// <summary>
        /// Gets or Sets Oauth2LoginChallenge
        /// </summary>
        [DataMember(Name = "oauth2_login_challenge", EmitDefaultValue = true)]
        public string Oauth2LoginChallenge { get; set; }

        /// <summary>
        /// Gets or Sets Oauth2LoginRequest
        /// </summary>
        [DataMember(Name = "oauth2_login_request", EmitDefaultValue = false)]
        public ClientOAuth2LoginRequest Oauth2LoginRequest { get; set; }

        /// <summary>
        /// Refresh stores whether this login flow should enforce re-authentication.
        /// </summary>
        /// <value>Refresh stores whether this login flow should enforce re-authentication.</value>
        [DataMember(Name = "refresh", EmitDefaultValue = true)]
        public bool Refresh { get; set; }

        /// <summary>
        /// RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.
        /// </summary>
        /// <value>RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.</value>
        [DataMember(Name = "request_url", IsRequired = true, EmitDefaultValue = false)]
        public string RequestUrl { get; set; }

        /// <summary>
        /// Gets or Sets RequestedAal
        /// </summary>
        [DataMember(Name = "requested_aal", EmitDefaultValue = false)]
        public ClientAuthenticatorAssuranceLevel RequestedAal { get; set; }

        /// <summary>
        /// ReturnTo contains the requested return_to URL.
        /// </summary>
        /// <value>ReturnTo contains the requested return_to URL.</value>
        [DataMember(Name = "return_to", EmitDefaultValue = false)]
        public string ReturnTo { get; set; }

        /// <summary>
        /// SessionTokenExchangeCode holds the secret code that the client can use to retrieve a session token after the login flow has been completed. This is only set if the client has requested a session token exchange code, and if the flow is of type \&quot;api\&quot;, and only on creating the login flow.
        /// </summary>
        /// <value>SessionTokenExchangeCode holds the secret code that the client can use to retrieve a session token after the login flow has been completed. This is only set if the client has requested a session token exchange code, and if the flow is of type \&quot;api\&quot;, and only on creating the login flow.</value>
        [DataMember(Name = "session_token_exchange_code", EmitDefaultValue = false)]
        public string SessionTokenExchangeCode { get; set; }

        /// <summary>
        /// The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;.
        /// </summary>
        /// <value>The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Ui
        /// </summary>
        [DataMember(Name = "ui", IsRequired = true, EmitDefaultValue = false)]
        public ClientUiContainer Ui { get; set; }

        /// <summary>
        /// UpdatedAt is a helper struct field for gobuffalo.pop.
        /// </summary>
        /// <value>UpdatedAt is a helper struct field for gobuffalo.pop.</value>
        [DataMember(Name = "updated_at", EmitDefaultValue = false)]
        public DateTime UpdatedAt { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ClientLoginFlow {\n");
            sb.Append("  Active: ").Append(Active).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  ExpiresAt: ").Append(ExpiresAt).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IssuedAt: ").Append(IssuedAt).Append("\n");
            sb.Append("  Oauth2LoginChallenge: ").Append(Oauth2LoginChallenge).Append("\n");
            sb.Append("  Oauth2LoginRequest: ").Append(Oauth2LoginRequest).Append("\n");
            sb.Append("  Refresh: ").Append(Refresh).Append("\n");
            sb.Append("  RequestUrl: ").Append(RequestUrl).Append("\n");
            sb.Append("  RequestedAal: ").Append(RequestedAal).Append("\n");
            sb.Append("  ReturnTo: ").Append(ReturnTo).Append("\n");
            sb.Append("  SessionTokenExchangeCode: ").Append(SessionTokenExchangeCode).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Ui: ").Append(Ui).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ClientLoginFlow);
        }

        /// <summary>
        /// Returns true if ClientLoginFlow instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientLoginFlow to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientLoginFlow input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Active == input.Active ||
                    (this.Active != null &&
                    this.Active.Equals(input.Active))
                ) && 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.ExpiresAt == input.ExpiresAt ||
                    (this.ExpiresAt != null &&
                    this.ExpiresAt.Equals(input.ExpiresAt))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.IssuedAt == input.IssuedAt ||
                    (this.IssuedAt != null &&
                    this.IssuedAt.Equals(input.IssuedAt))
                ) && 
                (
                    this.Oauth2LoginChallenge == input.Oauth2LoginChallenge ||
                    (this.Oauth2LoginChallenge != null &&
                    this.Oauth2LoginChallenge.Equals(input.Oauth2LoginChallenge))
                ) && 
                (
                    this.Oauth2LoginRequest == input.Oauth2LoginRequest ||
                    (this.Oauth2LoginRequest != null &&
                    this.Oauth2LoginRequest.Equals(input.Oauth2LoginRequest))
                ) && 
                (
                    this.Refresh == input.Refresh ||
                    this.Refresh.Equals(input.Refresh)
                ) && 
                (
                    this.RequestUrl == input.RequestUrl ||
                    (this.RequestUrl != null &&
                    this.RequestUrl.Equals(input.RequestUrl))
                ) && 
                (
                    this.RequestedAal == input.RequestedAal ||
                    (this.RequestedAal != null &&
                    this.RequestedAal.Equals(input.RequestedAal))
                ) && 
                (
                    this.ReturnTo == input.ReturnTo ||
                    (this.ReturnTo != null &&
                    this.ReturnTo.Equals(input.ReturnTo))
                ) && 
                (
                    this.SessionTokenExchangeCode == input.SessionTokenExchangeCode ||
                    (this.SessionTokenExchangeCode != null &&
                    this.SessionTokenExchangeCode.Equals(input.SessionTokenExchangeCode))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Ui == input.Ui ||
                    (this.Ui != null &&
                    this.Ui.Equals(input.Ui))
                ) && 
                (
                    this.UpdatedAt == input.UpdatedAt ||
                    (this.UpdatedAt != null &&
                    this.UpdatedAt.Equals(input.UpdatedAt))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Active != null)
                {
                    hashCode = (hashCode * 59) + this.Active.GetHashCode();
                }
                if (this.CreatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAt.GetHashCode();
                }
                if (this.ExpiresAt != null)
                {
                    hashCode = (hashCode * 59) + this.ExpiresAt.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.IssuedAt != null)
                {
                    hashCode = (hashCode * 59) + this.IssuedAt.GetHashCode();
                }
                if (this.Oauth2LoginChallenge != null)
                {
                    hashCode = (hashCode * 59) + this.Oauth2LoginChallenge.GetHashCode();
                }
                if (this.Oauth2LoginRequest != null)
                {
                    hashCode = (hashCode * 59) + this.Oauth2LoginRequest.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Refresh.GetHashCode();
                if (this.RequestUrl != null)
                {
                    hashCode = (hashCode * 59) + this.RequestUrl.GetHashCode();
                }
                if (this.RequestedAal != null)
                {
                    hashCode = (hashCode * 59) + this.RequestedAal.GetHashCode();
                }
                if (this.ReturnTo != null)
                {
                    hashCode = (hashCode * 59) + this.ReturnTo.GetHashCode();
                }
                if (this.SessionTokenExchangeCode != null)
                {
                    hashCode = (hashCode * 59) + this.SessionTokenExchangeCode.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.Ui != null)
                {
                    hashCode = (hashCode * 59) + this.Ui.GetHashCode();
                }
                if (this.UpdatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.UpdatedAt.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
