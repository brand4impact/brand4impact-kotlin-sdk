# InvoiceApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInvoice**](InvoiceApi.md#getInvoice) | **GET** /rest/platform/invoice/{token} | Get a single invoice
[**getInvoices**](InvoiceApi.md#getInvoices) | **GET** /rest/platform/invoice | Get a set of invoices


<a name="getInvoice"></a>
# **getInvoice**
> PlatformInvoice getInvoice(token)

Get a single invoice

This method returns a specific invoice within your tenant  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = InvoiceApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : PlatformInvoice = apiInstance.getInvoice(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoiceApi#getInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoiceApi#getInvoice")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |

### Return type

[**PlatformInvoice**](PlatformInvoice.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInvoices"></a>
# **getInvoices**
> PlatformInvoiceItemWrapper getInvoices(numberLike, page, size, sort)

Get a set of invoices

This method returns a set of invoices within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = InvoiceApi()
val numberLike : kotlin.String = numberLike_example // kotlin.String | The name of the filter
val page : kotlin.Int = 56 // kotlin.Int | The number of the page. Possible values: 0 to unlimited
val size : kotlin.Int = 56 // kotlin.Int | The number of items inside a page. Possible values: 1 to 100
val sort : kotlin.String = sort_example // kotlin.String | The order direction for sorted results. Possible values: ASC or DESC
try {
    val result : PlatformInvoiceItemWrapper = apiInstance.getInvoices(numberLike, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoiceApi#getInvoices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoiceApi#getInvoices")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **numberLike** | **kotlin.String**| The name of the filter | [optional]
 **page** | **kotlin.Int**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **kotlin.Int**| The number of items inside a page. Possible values: 1 to 100 | [optional]
 **sort** | **kotlin.String**| The order direction for sorted results. Possible values: ASC or DESC | [optional]

### Return type

[**PlatformInvoiceItemWrapper**](PlatformInvoiceItemWrapper.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

