/*
 * Ory Kratos API
 *
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.7.1-alpha.1
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(tag = "method")]
pub enum SubmitSelfServiceRegistrationFlowBody {
    #[serde(rename="oidc")]
    SubmitSelfServiceRegistrationFlowWithOidcMethodBody {
        /// The CSRF Token
        #[serde(rename = "csrf_token", skip_serializing_if = "Option::is_none")]
        csrf_token: Option<String>,
        /// The provider to register with
        #[serde(rename = "traits")]
        traits: String,
    },
    #[serde(rename="password")]
    SubmitSelfServiceRegistrationFlowWithPasswordMethodBody {
        /// The CSRF Token
        #[serde(rename = "csrf_token", skip_serializing_if = "Option::is_none")]
        csrf_token: Option<String>,
        /// Password to sign the user up with
        #[serde(rename = "password")]
        password: String,
        /// The identity's traits
        #[serde(rename = "traits")]
        traits: serde_json::Value,
    },
}



/// Method to use  This field must be set to `password` when using the password method.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Method {
    #[serde(rename = "password")]
    Password,
    #[serde(rename = "oidc")]
    Oidc,
}

