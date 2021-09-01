/*
 * Ory Kratos API
 *
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.7.3-alpha.6
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// ServiceUpdateResponse : ServiceUpdateResponse service update response



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct ServiceUpdateResponse {
    /// Optional warning messages
    #[serde(rename = "Warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<String>>,
}

impl ServiceUpdateResponse {
    /// ServiceUpdateResponse service update response
    pub fn new() -> ServiceUpdateResponse {
        ServiceUpdateResponse {
            warnings: None,
        }
    }
}


