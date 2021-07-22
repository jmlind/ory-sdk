/*
 * Ory Kratos API
 *
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * API version: v0.7.1-alpha.1
 * Contact: hi@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// ContainerWaitOKBodyError ContainerWaitOKBodyError container waiting error, if any
type ContainerWaitOKBodyError struct {
	// Details of an error
	Message *string `json:"Message,omitempty"`
}

// NewContainerWaitOKBodyError instantiates a new ContainerWaitOKBodyError object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewContainerWaitOKBodyError() *ContainerWaitOKBodyError {
	this := ContainerWaitOKBodyError{}
	return &this
}

// NewContainerWaitOKBodyErrorWithDefaults instantiates a new ContainerWaitOKBodyError object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewContainerWaitOKBodyErrorWithDefaults() *ContainerWaitOKBodyError {
	this := ContainerWaitOKBodyError{}
	return &this
}

// GetMessage returns the Message field value if set, zero value otherwise.
func (o *ContainerWaitOKBodyError) GetMessage() string {
	if o == nil || o.Message == nil {
		var ret string
		return ret
	}
	return *o.Message
}

// GetMessageOk returns a tuple with the Message field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ContainerWaitOKBodyError) GetMessageOk() (*string, bool) {
	if o == nil || o.Message == nil {
		return nil, false
	}
	return o.Message, true
}

// HasMessage returns a boolean if a field has been set.
func (o *ContainerWaitOKBodyError) HasMessage() bool {
	if o != nil && o.Message != nil {
		return true
	}

	return false
}

// SetMessage gets a reference to the given string and assigns it to the Message field.
func (o *ContainerWaitOKBodyError) SetMessage(v string) {
	o.Message = &v
}

func (o ContainerWaitOKBodyError) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Message != nil {
		toSerialize["Message"] = o.Message
	}
	return json.Marshal(toSerialize)
}

type NullableContainerWaitOKBodyError struct {
	value *ContainerWaitOKBodyError
	isSet bool
}

func (v NullableContainerWaitOKBodyError) Get() *ContainerWaitOKBodyError {
	return v.value
}

func (v *NullableContainerWaitOKBodyError) Set(val *ContainerWaitOKBodyError) {
	v.value = val
	v.isSet = true
}

func (v NullableContainerWaitOKBodyError) IsSet() bool {
	return v.isSet
}

func (v *NullableContainerWaitOKBodyError) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableContainerWaitOKBodyError(val *ContainerWaitOKBodyError) *NullableContainerWaitOKBodyError {
	return &NullableContainerWaitOKBodyError{value: val, isSet: true}
}

func (v NullableContainerWaitOKBodyError) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableContainerWaitOKBodyError) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


