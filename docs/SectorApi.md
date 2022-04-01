# SectorApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSector**](SectorApi.md#getSector) | **GET** /rest/platform/sector/{token} | Get a single sector
[**getSectors**](SectorApi.md#getSectors) | **GET** /rest/platform/sector | Get a set of sectors


<a name="getSector"></a>
# **getSector**
> PlatformSector getSector(token)

Get a single sector

This method returns a specific sector and represents principals industries  

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = SectorApi()
val token : kotlin.String = token_example // kotlin.String | The unique token for the sector.
try {
    val result : PlatformSector = apiInstance.getSector(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SectorApi#getSector")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SectorApi#getSector")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| The unique token for the sector. |

### Return type

[**PlatformSector**](PlatformSector.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSectors"></a>
# **getSectors**
> PlatformSectorItemWrapper getSectors(page, size, sort)

Get a set of sectors

This method returns all the sectors according the filters and represents principals industries    [![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = SectorApi()
val page : kotlin.Int = 56 // kotlin.Int | The number of the page. Possible values: 0 to unlimited
val size : kotlin.Int = 56 // kotlin.Int | The number of items inside a page. Possible values: 1 to 100
val sort : kotlin.String = sort_example // kotlin.String | The order direction for sorted results. Possible values: ASC or DESC
try {
    val result : PlatformSectorItemWrapper = apiInstance.getSectors(page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SectorApi#getSectors")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SectorApi#getSectors")
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

[**PlatformSectorItemWrapper**](PlatformSectorItemWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

