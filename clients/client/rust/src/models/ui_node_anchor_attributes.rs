/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.31
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct UiNodeAnchorAttributes {
    /// The link's href (destination) URL.  format: uri
    #[serde(rename = "href")]
    pub href: String,
    /// A unique identifier
    #[serde(rename = "id")]
    pub id: String,
    /// NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \"a\".
    #[serde(rename = "node_type")]
    pub node_type: String,
    #[serde(rename = "title")]
    pub title: Box<crate::models::UiText>,
}


impl UiNodeAnchorAttributes {
    pub fn new(href: String, id: String, node_type: String, title: crate::models::UiText) -> UiNodeAnchorAttributes {
        UiNodeAnchorAttributes {
                href,
                id,
                node_type,
                title: Box::new(title),
        }
    }
}


