# CampaignApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCampaign**](CampaignApi.md#createCampaign) | **POST** /rest/platform/campaign | Create a new campaign
[**getCampaign**](CampaignApi.md#getCampaign) | **GET** /rest/platform/campaign/{token} | Get a single campaign
[**getCampaigns**](CampaignApi.md#getCampaigns) | **GET** /rest/platform/campaign | Get a set of campaigns
[**switchCampaign**](CampaignApi.md#switchCampaign) | **PUT** /rest/platform/campaign/{token}/switch | Switch campaign status
[**updateCampaign**](CampaignApi.md#updateCampaign) | **PUT** /rest/platform/campaign/{token} | Update a campaign


<a name="createCampaign"></a>
# **createCampaign**
> PlatformCampaign createCampaign(campaign, primaryImage, secondaryImage)

Create a new campaign

This method creates a new campaign within a Company  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = CampaignApi()
val campaign : PlatformCampaignCreate =  // PlatformCampaignCreate | 
val primaryImage : java.io.File = BINARY_DATA_HERE // java.io.File | 
val secondaryImage : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : PlatformCampaign = apiInstance.createCampaign(campaign, primaryImage, secondaryImage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignApi#createCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignApi#createCampaign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign** | [**PlatformCampaignCreate**](PlatformCampaignCreate.md)|  |
 **primaryImage** | **java.io.File**|  |
 **secondaryImage** | **java.io.File**|  |

### Return type

[**PlatformCampaign**](PlatformCampaign.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="getCampaign"></a>
# **getCampaign**
> PlatformCampaign getCampaign(token)

Get a single campaign

This method returns a specific campaign within your tenant  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = CampaignApi()
val token : kotlin.String = token_example // kotlin.String | The unique token for the campaign.
try {
    val result : PlatformCampaign = apiInstance.getCampaign(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignApi#getCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignApi#getCampaign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| The unique token for the campaign. |

### Return type

[**PlatformCampaign**](PlatformCampaign.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCampaigns"></a>
# **getCampaigns**
> PlatformCampaignItemWrapper getCampaigns(titleFilter, page, size, sort)

Get a set of campaigns

This method returns a set of campaigns within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = CampaignApi()
val titleFilter : kotlin.String = titleFilter_example // kotlin.String | The name of the filter
val page : kotlin.Int = 56 // kotlin.Int | The number of the page. Possible values: 0 to unlimited
val size : kotlin.Int = 56 // kotlin.Int | The number of items inside a page. Possible values: 1 to 100
val sort : kotlin.String = sort_example // kotlin.String | The order direction for sorted results. Possible values: ASC or DESC
try {
    val result : PlatformCampaignItemWrapper = apiInstance.getCampaigns(titleFilter, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignApi#getCampaigns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignApi#getCampaigns")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **titleFilter** | **kotlin.String**| The name of the filter | [optional]
 **page** | **kotlin.Int**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **kotlin.Int**| The number of items inside a page. Possible values: 1 to 100 | [optional]
 **sort** | **kotlin.String**| The order direction for sorted results. Possible values: ASC or DESC | [optional]

### Return type

[**PlatformCampaignItemWrapper**](PlatformCampaignItemWrapper.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="switchCampaign"></a>
# **switchCampaign**
> PlatformCampaign switchCampaign(token)

Switch campaign status

This method switch the status of a specific campaign  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = CampaignApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : PlatformCampaign = apiInstance.switchCampaign(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignApi#switchCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignApi#switchCampaign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |

### Return type

[**PlatformCampaign**](PlatformCampaign.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCampaign"></a>
# **updateCampaign**
> PlatformCampaign updateCampaign(token, campaign, primaryImage, secondaryImage)

Update a campaign

This method updates an existing campaign  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = CampaignApi()
val token : kotlin.String = token_example // kotlin.String | 
val campaign : PlatformCampaignUpdate =  // PlatformCampaignUpdate | 
val primaryImage : java.io.File = BINARY_DATA_HERE // java.io.File | 
val secondaryImage : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : PlatformCampaign = apiInstance.updateCampaign(token, campaign, primaryImage, secondaryImage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignApi#updateCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignApi#updateCampaign")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |
 **campaign** | [**PlatformCampaignUpdate**](PlatformCampaignUpdate.md)|  |
 **primaryImage** | **java.io.File**|  |
 **secondaryImage** | **java.io.File**|  |

### Return type

[**PlatformCampaign**](PlatformCampaign.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

