# SecurityApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJWTToken**](SecurityApi.md#getJWTToken) | **GET** /security/jwt | get JWT token


<a name="getJWTToken"></a>
# **getJWTToken**
> SecurityUser getJWTToken()

get JWT token

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = SecurityApi()
try {
    val result : SecurityUser = apiInstance.getJWTToken()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityApi#getJWTToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityApi#getJWTToken")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SecurityUser**](SecurityUser.md)

### Authorization


Configure BasicAuthentication:
    ApiClient.username = ""
    ApiClient.password = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

