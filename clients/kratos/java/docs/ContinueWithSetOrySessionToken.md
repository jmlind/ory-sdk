

# ContinueWithSetOrySessionToken

Indicates that a session was issued, and the application should use this token for authenticated requests

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Action will always be &#x60;set_ory_session_token&#x60; set_ory_session_token ContinueWithActionSetOrySessionToken show_verification_ui ContinueWithActionShowVerificationUI |  |
|**orySessionToken** | **String** | Token is the token of the session |  |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| SET_ORY_SESSION_TOKEN | &quot;set_ory_session_token&quot; |
| SHOW_VERIFICATION_UI | &quot;show_verification_ui&quot; |



