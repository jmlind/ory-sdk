/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.17
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// SessionDevice : Device corresponding to a Session



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SessionDevice {
    /// Device record ID
    #[serde(rename = "id")]
    pub id: String,
    /// IPAddress of the client
    #[serde(rename = "ip_address", skip_serializing_if = "Option::is_none")]
    pub ip_address: Option<String>,
    /// Geo Location corresponding to the IP Address
    #[serde(rename = "location", skip_serializing_if = "Option::is_none")]
    pub location: Option<String>,
    /// UserAgent of the client
    #[serde(rename = "user_agent", skip_serializing_if = "Option::is_none")]
    pub user_agent: Option<String>,
}


impl SessionDevice {
    /// Device corresponding to a Session
    pub fn new(id: String) -> SessionDevice {
        SessionDevice {
                id,
                ip_address: None,
                location: None,
                user_agent: None,
        }
    }
}


