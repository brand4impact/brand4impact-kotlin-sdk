# AssetApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAsset**](AssetApi.md#getAsset) | **GET** /rest/platform/asset/{token} | Get a single asset
[**getAssets**](AssetApi.md#getAssets) | **GET** /rest/platform/asset | Get a set of assets


<a name="getAsset"></a>
# **getAsset**
> PlatformAsset getAsset(token)

Get a single asset

This method returns a specific asset within your tenant (asset refers to static files, like images, pdf, ...)  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = AssetApi()
val token : kotlin.String = token_example // kotlin.String | The unique token for the asset.
try {
    val result : PlatformAsset = apiInstance.getAsset(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetApi#getAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetApi#getAsset")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| The unique token for the asset. |

### Return type

[**PlatformAsset**](PlatformAsset.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssets"></a>
# **getAssets**
> PlatformAssetItemWrapper getAssets(page, size, sort)

Get a set of assets

This method returns a set of assets within your tenant (asset refers to static files, like images, pdf, ...)    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = AssetApi()
val page : kotlin.Int = 56 // kotlin.Int | The number of the page. Possible values: 0 to unlimited
val size : kotlin.Int = 56 // kotlin.Int | The number of items inside a page. Possible values: 1 to 100
val sort : kotlin.String = sort_example // kotlin.String | The order direction for sorted results. Possible values: ASC or DESC
try {
    val result : PlatformAssetItemWrapper = apiInstance.getAssets(page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetApi#getAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetApi#getAssets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **kotlin.Int**| The number of items inside a page. Possible values: 1 to 100 | [optional]
 **sort** | **kotlin.String**| The order direction for sorted results. Possible values: ASC or DESC | [optional]

### Return type

[**PlatformAssetItemWrapper**](PlatformAssetItemWrapper.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

