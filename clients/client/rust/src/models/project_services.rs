/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.178
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct ProjectServices {
    #[serde(rename = "identity", skip_serializing_if = "Option::is_none")]
    pub identity: Option<Box<crate::models::ProjectServiceIdentity>>,
    #[serde(rename = "permission", skip_serializing_if = "Option::is_none")]
    pub permission: Option<Box<crate::models::ProjectServicePermission>>,
}

impl ProjectServices {
    pub fn new() -> ProjectServices {
        ProjectServices {
            identity: None,
            permission: None,
        }
    }
}


