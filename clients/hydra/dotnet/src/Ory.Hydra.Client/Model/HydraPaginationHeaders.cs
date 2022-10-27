/*
 * Ory Hydra API
 *
 * Documentation for all of Ory Hydra's APIs. 
 *
 * The version of the OpenAPI document: v2.0.1
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
using OpenAPIDateConverter = Ory.Hydra.Client.Client.OpenAPIDateConverter;

namespace Ory.Hydra.Client.Model
{
    /// <summary>
    /// HydraPaginationHeaders
    /// </summary>
    [DataContract(Name = "paginationHeaders")]
    public partial class HydraPaginationHeaders : IEquatable<HydraPaginationHeaders>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HydraPaginationHeaders" /> class.
        /// </summary>
        /// <param name="link">The link header contains pagination links.  For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).  in: header.</param>
        /// <param name="xTotalCount">The total number of clients.  in: header.</param>
        public HydraPaginationHeaders(string link = default(string), string xTotalCount = default(string))
        {
            this.Link = link;
            this.XTotalCount = xTotalCount;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The link header contains pagination links.  For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).  in: header
        /// </summary>
        /// <value>The link header contains pagination links.  For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).  in: header</value>
        [DataMember(Name = "link", EmitDefaultValue = false)]
        public string Link { get; set; }

        /// <summary>
        /// The total number of clients.  in: header
        /// </summary>
        /// <value>The total number of clients.  in: header</value>
        [DataMember(Name = "x-total-count", EmitDefaultValue = false)]
        public string XTotalCount { get; set; }

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
            sb.Append("class HydraPaginationHeaders {\n");
            sb.Append("  Link: ").Append(Link).Append("\n");
            sb.Append("  XTotalCount: ").Append(XTotalCount).Append("\n");
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
            return this.Equals(input as HydraPaginationHeaders);
        }

        /// <summary>
        /// Returns true if HydraPaginationHeaders instances are equal
        /// </summary>
        /// <param name="input">Instance of HydraPaginationHeaders to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HydraPaginationHeaders input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Link == input.Link ||
                    (this.Link != null &&
                    this.Link.Equals(input.Link))
                ) && 
                (
                    this.XTotalCount == input.XTotalCount ||
                    (this.XTotalCount != null &&
                    this.XTotalCount.Equals(input.XTotalCount))
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
                if (this.Link != null)
                {
                    hashCode = (hashCode * 59) + this.Link.GetHashCode();
                }
                if (this.XTotalCount != null)
                {
                    hashCode = (hashCode * 59) + this.XTotalCount.GetHashCode();
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
