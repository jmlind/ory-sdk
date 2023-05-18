/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.31
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiCallback;
import sh.ory.ApiClient;
import sh.ory.ApiException;
import sh.ory.ApiResponse;
import sh.ory.Configuration;
import sh.ory.Pair;
import sh.ory.ProgressRequestBody;
import sh.ory.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import sh.ory.model.ErrorOAuth2;
import sh.ory.model.JsonWebKeySet;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WellknownApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WellknownApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WellknownApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for discoverJsonWebKeys
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> jsonWebKeySet </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorOAuth2 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call discoverJsonWebKeysCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/.well-known/jwks.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call discoverJsonWebKeysValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return discoverJsonWebKeysCall(_callback);

    }

    /**
     * Discover Well-Known JSON Web Keys
     * This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
     * @return JsonWebKeySet
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> jsonWebKeySet </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorOAuth2 </td><td>  -  </td></tr>
     </table>
     */
    public JsonWebKeySet discoverJsonWebKeys() throws ApiException {
        ApiResponse<JsonWebKeySet> localVarResp = discoverJsonWebKeysWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Discover Well-Known JSON Web Keys
     * This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
     * @return ApiResponse&lt;JsonWebKeySet&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> jsonWebKeySet </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorOAuth2 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<JsonWebKeySet> discoverJsonWebKeysWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = discoverJsonWebKeysValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<JsonWebKeySet>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Discover Well-Known JSON Web Keys (asynchronously)
     * This endpoint returns JSON Web Keys required to verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> jsonWebKeySet </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> errorOAuth2 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call discoverJsonWebKeysAsync(final ApiCallback<JsonWebKeySet> _callback) throws ApiException {

        okhttp3.Call localVarCall = discoverJsonWebKeysValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<JsonWebKeySet>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
