/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.2.15
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct NormalizedProjectRevisionIdentitySchema {
    /// The Project's Revision Creation Date
    #[serde(rename = "created_at", skip_serializing_if = "Option::is_none")]
    pub created_at: Option<String>,
    /// The unique ID of this entry.
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    #[serde(rename = "identity_schema", skip_serializing_if = "Option::is_none")]
    pub identity_schema: Option<Box<crate::models::ManagedIdentitySchema>>,
    #[serde(rename = "identity_schema_id", skip_serializing_if = "Option::is_none")]
    pub identity_schema_id: Option<String>,
    /// The imported (named) ID of the Identity Schema referenced in the Ory Kratos config.
    #[serde(rename = "import_id", skip_serializing_if = "Option::is_none")]
    pub import_id: Option<String>,
    /// The ImportURL can be used to import an Identity Schema from a bse64 encoded string. In the future, this key also support HTTPS and other sources!  If you import an Ory Kratos configuration, this would be akin to the `identity.schemas.#.url` key.  The configuration will always return the import URL when you fetch it from the API.
    #[serde(rename = "import_url", skip_serializing_if = "Option::is_none")]
    pub import_url: Option<String>,
    /// If true sets the default schema for identities  Only one schema can ever be the default schema. If you try to add two schemas with default to true, the request will fail.
    #[serde(rename = "is_default", skip_serializing_if = "Option::is_none")]
    pub is_default: Option<bool>,
    /// Use a preset instead of a custom identity schema.
    #[serde(rename = "preset", skip_serializing_if = "Option::is_none")]
    pub preset: Option<String>,
    /// The Revision's ID this schema belongs to
    #[serde(rename = "project_revision_id", skip_serializing_if = "Option::is_none")]
    pub project_revision_id: Option<String>,
    /// Last Time Project's Revision was Updated
    #[serde(rename = "updated_at", skip_serializing_if = "Option::is_none")]
    pub updated_at: Option<String>,
}

impl Default for NormalizedProjectRevisionIdentitySchema {
    fn default() -> Self {
        Self::new()
    }
}

impl NormalizedProjectRevisionIdentitySchema {
    pub fn new() -> NormalizedProjectRevisionIdentitySchema {
        NormalizedProjectRevisionIdentitySchema {
                created_at: None,
                id: None,
                identity_schema: None,
                identity_schema_id: None,
                import_id: None,
                import_url: None,
                is_default: None,
                preset: None,
                project_revision_id: None,
                updated_at: None,
        }
    }
}


