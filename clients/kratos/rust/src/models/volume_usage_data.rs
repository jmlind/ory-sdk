/*
 * Ory Kratos API
 *
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.7.1-alpha.1
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// VolumeUsageData : VolumeUsageData Usage details about the volume. This information is used by the `GET /system/df` endpoint, and omitted in other endpoints.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct VolumeUsageData {
    /// The number of containers referencing this volume. This field is set to `-1` if the reference-count is not available.
    #[serde(rename = "RefCount")]
    pub ref_count: i64,
    /// Amount of disk space used by the volume (in bytes). This information is only available for volumes created with the `\"local\"` volume driver. For volumes created with other volume drivers, this field is set to `-1` (\"not available\")
    #[serde(rename = "Size")]
    pub size: i64,
}

impl VolumeUsageData {
    /// VolumeUsageData Usage details about the volume. This information is used by the `GET /system/df` endpoint, and omitted in other endpoints.
    pub fn new(ref_count: i64, size: i64) -> VolumeUsageData {
        VolumeUsageData {
            ref_count,
            size,
        }
    }
}


