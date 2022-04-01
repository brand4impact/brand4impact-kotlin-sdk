# VoucherApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadVoucherQr**](VoucherApi.md#downloadVoucherQr) | **GET** /rest/platform/voucher/{token}/qr | Download the voucher QR image
[**downloadVouchersFile**](VoucherApi.md#downloadVouchersFile) | **GET** /rest/platform/voucher/campaign/{campaignToken}/file | Download a set of voucher&#39;s links file
[**downloadVouchersQr**](VoucherApi.md#downloadVouchersQr) | **GET** /rest/platform/voucher/campaign/{campaignToken}/qr | Download a set of voucher QR images
[**getVoucher**](VoucherApi.md#getVoucher) | **GET** /rest/platform/voucher/{token} | Get a single voucher
[**getVouchers**](VoucherApi.md#getVouchers) | **GET** /rest/platform/voucher/campaign/{campaignToken} | Get a set of vouchers


<a name="downloadVoucherQr"></a>
# **downloadVoucherQr**
> kotlin.String downloadVoucherQr(token)

Download the voucher QR image

This method returns a QR image of the voucher within your tenant to be able to access the donation graphically  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = VoucherApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.downloadVoucherQr(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoucherApi#downloadVoucherQr")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoucherApi#downloadVoucherQr")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |

### Return type

**kotlin.String**

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadVouchersFile"></a>
# **downloadVouchersFile**
> kotlin.String downloadVouchersFile(campaignToken, status, min, max)

Download a set of voucher&#39;s links file

This method returns a set of voucher&#39;s links file within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = VoucherApi()
val campaignToken : kotlin.String = campaignToken_example // kotlin.String | The unique token for the campaign.
val status : kotlin.String = status_example // kotlin.String | The status of the voucher. Possible values: Active or Inactive
val min : kotlin.Int = 56 // kotlin.Int | Min value of the voucher
val max : kotlin.Int = 56 // kotlin.Int | Max value of the voucher
try {
    val result : kotlin.String = apiInstance.downloadVouchersFile(campaignToken, status, min, max)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoucherApi#downloadVouchersFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoucherApi#downloadVouchersFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignToken** | **kotlin.String**| The unique token for the campaign. |
 **status** | **kotlin.String**| The status of the voucher. Possible values: Active or Inactive | [optional]
 **min** | **kotlin.Int**| Min value of the voucher | [optional]
 **max** | **kotlin.Int**| Max value of the voucher | [optional]

### Return type

**kotlin.String**

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadVouchersQr"></a>
# **downloadVouchersQr**
> kotlin.String downloadVouchersQr(campaignToken, status, min, max)

Download a set of voucher QR images

This method returns a set of voucher QR images within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = VoucherApi()
val campaignToken : kotlin.String = campaignToken_example // kotlin.String | The unique token for the campaign.
val status : kotlin.String = status_example // kotlin.String | The status of the voucher. Possible values: Active or Inactive
val min : kotlin.Int = 56 // kotlin.Int | Min value of the voucher
val max : kotlin.Int = 56 // kotlin.Int | Max value of the voucher
try {
    val result : kotlin.String = apiInstance.downloadVouchersQr(campaignToken, status, min, max)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoucherApi#downloadVouchersQr")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoucherApi#downloadVouchersQr")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignToken** | **kotlin.String**| The unique token for the campaign. |
 **status** | **kotlin.String**| The status of the voucher. Possible values: Active or Inactive | [optional]
 **min** | **kotlin.Int**| Min value of the voucher | [optional]
 **max** | **kotlin.Int**| Max value of the voucher | [optional]

### Return type

**kotlin.String**

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVoucher"></a>
# **getVoucher**
> PlatformVoucher getVoucher(token)

Get a single voucher

This method returns a specific voucher within your tenant  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = VoucherApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : PlatformVoucher = apiInstance.getVoucher(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoucherApi#getVoucher")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoucherApi#getVoucher")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |

### Return type

[**PlatformVoucher**](PlatformVoucher.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVouchers"></a>
# **getVouchers**
> PlatformVoucherItemWrapper getVouchers(campaignToken, status, min, max, page, size)

Get a set of vouchers

This method returns a set of vouchers within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = VoucherApi()
val campaignToken : kotlin.String = campaignToken_example // kotlin.String | The unique token for the campaign.
val status : kotlin.String = status_example // kotlin.String | The status of the voucher. Possible values: Active or Inactive
val min : kotlin.Int = 56 // kotlin.Int | Min value of the voucher
val max : kotlin.Int = 56 // kotlin.Int | Max value of the voucher
val page : kotlin.Int = 56 // kotlin.Int | The number of the page. Possible values: 0 to unlimited
val size : kotlin.Int = 56 // kotlin.Int | The number of items inside a page. Possible values: 1 to 100
try {
    val result : PlatformVoucherItemWrapper = apiInstance.getVouchers(campaignToken, status, min, max, page, size)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoucherApi#getVouchers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoucherApi#getVouchers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignToken** | **kotlin.String**| The unique token for the campaign. |
 **status** | **kotlin.String**| The status of the voucher. Possible values: Active or Inactive | [optional]
 **min** | **kotlin.Int**| Min value of the voucher | [optional]
 **max** | **kotlin.Int**| Max value of the voucher | [optional]
 **page** | **kotlin.Int**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **kotlin.Int**| The number of items inside a page. Possible values: 1 to 100 | [optional]

### Return type

[**PlatformVoucherItemWrapper**](PlatformVoucherItemWrapper.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

