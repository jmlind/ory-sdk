# IdentityWithCredentialsPasswordConfig

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**HashedPassword** | Pointer to **string** | The hashed password in [PHC format]( https://www.ory.sh/docs/kratos/concepts/credentials/username-email-password#hashed-password-format) | [optional] 
**Password** | Pointer to **string** | The password in plain text if no hash is available. | [optional] 

## Methods

### NewIdentityWithCredentialsPasswordConfig

`func NewIdentityWithCredentialsPasswordConfig() *IdentityWithCredentialsPasswordConfig`

NewIdentityWithCredentialsPasswordConfig instantiates a new IdentityWithCredentialsPasswordConfig object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIdentityWithCredentialsPasswordConfigWithDefaults

`func NewIdentityWithCredentialsPasswordConfigWithDefaults() *IdentityWithCredentialsPasswordConfig`

NewIdentityWithCredentialsPasswordConfigWithDefaults instantiates a new IdentityWithCredentialsPasswordConfig object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHashedPassword

`func (o *IdentityWithCredentialsPasswordConfig) GetHashedPassword() string`

GetHashedPassword returns the HashedPassword field if non-nil, zero value otherwise.

### GetHashedPasswordOk

`func (o *IdentityWithCredentialsPasswordConfig) GetHashedPasswordOk() (*string, bool)`

GetHashedPasswordOk returns a tuple with the HashedPassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHashedPassword

`func (o *IdentityWithCredentialsPasswordConfig) SetHashedPassword(v string)`

SetHashedPassword sets HashedPassword field to given value.

### HasHashedPassword

`func (o *IdentityWithCredentialsPasswordConfig) HasHashedPassword() bool`

HasHashedPassword returns a boolean if a field has been set.

### GetPassword

`func (o *IdentityWithCredentialsPasswordConfig) GetPassword() string`

GetPassword returns the Password field if non-nil, zero value otherwise.

### GetPasswordOk

`func (o *IdentityWithCredentialsPasswordConfig) GetPasswordOk() (*string, bool)`

GetPasswordOk returns a tuple with the Password field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassword

`func (o *IdentityWithCredentialsPasswordConfig) SetPassword(v string)`

SetPassword sets Password field to given value.

### HasPassword

`func (o *IdentityWithCredentialsPasswordConfig) HasPassword() bool`

HasPassword returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


