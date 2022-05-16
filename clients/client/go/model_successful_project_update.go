/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.176
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// SuccessfulProjectUpdate struct for SuccessfulProjectUpdate
type SuccessfulProjectUpdate struct {
	Project Project `json:"project"`
	// Import Warnings  Not all configuration items can be imported to Ory Cloud. For example, setting the port does not make sense because Ory Cloud provides the runtime and networking.  This field contains warnings where configuration keys were found but can not be imported. These keys will be ignored by Ory Cloud. This field will help you understand why certain configuration keys might not be respected!
	Warnings []Warning `json:"warnings"`
}

// NewSuccessfulProjectUpdate instantiates a new SuccessfulProjectUpdate object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSuccessfulProjectUpdate(project Project, warnings []Warning) *SuccessfulProjectUpdate {
	this := SuccessfulProjectUpdate{}
	this.Project = project
	this.Warnings = warnings
	return &this
}

// NewSuccessfulProjectUpdateWithDefaults instantiates a new SuccessfulProjectUpdate object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSuccessfulProjectUpdateWithDefaults() *SuccessfulProjectUpdate {
	this := SuccessfulProjectUpdate{}
	return &this
}

// GetProject returns the Project field value
func (o *SuccessfulProjectUpdate) GetProject() Project {
	if o == nil {
		var ret Project
		return ret
	}

	return o.Project
}

// GetProjectOk returns a tuple with the Project field value
// and a boolean to check if the value has been set.
func (o *SuccessfulProjectUpdate) GetProjectOk() (*Project, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Project, true
}

// SetProject sets field value
func (o *SuccessfulProjectUpdate) SetProject(v Project) {
	o.Project = v
}

// GetWarnings returns the Warnings field value
func (o *SuccessfulProjectUpdate) GetWarnings() []Warning {
	if o == nil {
		var ret []Warning
		return ret
	}

	return o.Warnings
}

// GetWarningsOk returns a tuple with the Warnings field value
// and a boolean to check if the value has been set.
func (o *SuccessfulProjectUpdate) GetWarningsOk() ([]Warning, bool) {
	if o == nil  {
		return nil, false
	}
	return o.Warnings, true
}

// SetWarnings sets field value
func (o *SuccessfulProjectUpdate) SetWarnings(v []Warning) {
	o.Warnings = v
}

func (o SuccessfulProjectUpdate) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["project"] = o.Project
	}
	if true {
		toSerialize["warnings"] = o.Warnings
	}
	return json.Marshal(toSerialize)
}

type NullableSuccessfulProjectUpdate struct {
	value *SuccessfulProjectUpdate
	isSet bool
}

func (v NullableSuccessfulProjectUpdate) Get() *SuccessfulProjectUpdate {
	return v.value
}

func (v *NullableSuccessfulProjectUpdate) Set(val *SuccessfulProjectUpdate) {
	v.value = val
	v.isSet = true
}

func (v NullableSuccessfulProjectUpdate) IsSet() bool {
	return v.isSet
}

func (v *NullableSuccessfulProjectUpdate) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSuccessfulProjectUpdate(val *SuccessfulProjectUpdate) *NullableSuccessfulProjectUpdate {
	return &NullableSuccessfulProjectUpdate{value: val, isSet: true}
}

func (v NullableSuccessfulProjectUpdate) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSuccessfulProjectUpdate) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


