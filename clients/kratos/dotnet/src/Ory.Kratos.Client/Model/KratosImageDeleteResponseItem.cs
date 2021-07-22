/*
 * Ory Kratos API
 *
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.7.1-alpha.1
 * Contact: hi@ory.sh
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
using OpenAPIDateConverter = Ory.Kratos.Client.Client.OpenAPIDateConverter;

namespace Ory.Kratos.Client.Model
{
    /// <summary>
    /// ImageDeleteResponseItem image delete response item
    /// </summary>
    [DataContract(Name = "ImageDeleteResponseItem")]
    public partial class KratosImageDeleteResponseItem : IEquatable<KratosImageDeleteResponseItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosImageDeleteResponseItem" /> class.
        /// </summary>
        /// <param name="deleted">The image ID of an image that was deleted.</param>
        /// <param name="untagged">The image ID of an image that was untagged.</param>
        public KratosImageDeleteResponseItem(string deleted = default(string), string untagged = default(string))
        {
            this.Deleted = deleted;
            this.Untagged = untagged;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The image ID of an image that was deleted
        /// </summary>
        /// <value>The image ID of an image that was deleted</value>
        [DataMember(Name = "Deleted", EmitDefaultValue = false)]
        public string Deleted { get; set; }

        /// <summary>
        /// The image ID of an image that was untagged
        /// </summary>
        /// <value>The image ID of an image that was untagged</value>
        [DataMember(Name = "Untagged", EmitDefaultValue = false)]
        public string Untagged { get; set; }

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
            var sb = new StringBuilder();
            sb.Append("class KratosImageDeleteResponseItem {\n");
            sb.Append("  Deleted: ").Append(Deleted).Append("\n");
            sb.Append("  Untagged: ").Append(Untagged).Append("\n");
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
            return this.Equals(input as KratosImageDeleteResponseItem);
        }

        /// <summary>
        /// Returns true if KratosImageDeleteResponseItem instances are equal
        /// </summary>
        /// <param name="input">Instance of KratosImageDeleteResponseItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KratosImageDeleteResponseItem input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Deleted == input.Deleted ||
                    (this.Deleted != null &&
                    this.Deleted.Equals(input.Deleted))
                ) && 
                (
                    this.Untagged == input.Untagged ||
                    (this.Untagged != null &&
                    this.Untagged.Equals(input.Untagged))
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
                if (this.Deleted != null)
                    hashCode = hashCode * 59 + this.Deleted.GetHashCode();
                if (this.Untagged != null)
                    hashCode = hashCode * 59 + this.Untagged.GetHashCode();
                if (this.AdditionalProperties != null)
                    hashCode = hashCode * 59 + this.AdditionalProperties.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
