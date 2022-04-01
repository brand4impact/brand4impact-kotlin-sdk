# NgoApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNgo**](NgoApi.md#createNgo) | **POST** /rest/platform/ngo | Create a new NGO
[**getNgo**](NgoApi.md#getNgo) | **GET** /rest/platform/ngo | Get your NGO
[**updateNgo**](NgoApi.md#updateNgo) | **PUT** /rest/platform/ngo | Update NGO data
[**updateNgoBank**](NgoApi.md#updateNgoBank) | **PUT** /rest/platform/ngo/bank | Update bank NGO info
[**updateNgoLegal**](NgoApi.md#updateNgoLegal) | **PUT** /rest/platform/ngo/legal | Update legal NGO info
[**uploadNgoFiles**](NgoApi.md#uploadNgoFiles) | **PUT** /rest/platform/ngo/upload | Upload NGO files


<a name="createNgo"></a>
# **createNgo**
> PlatformNgo createNgo(ngo, legal, admin)

Create a new NGO

Register a new NGO allows you to have visibiliy that your NGO deserves, being visible to brand4impact users, and opting for their donations

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = NgoApi()
val ngo : PlatformNgoCreate =  // PlatformNgoCreate | 
val legal : PlatformNgoCreateLegal =  // PlatformNgoCreateLegal | 
val admin : PlatformNgoCreateAdmin =  // PlatformNgoCreateAdmin | 
try {
    val result : PlatformNgo = apiInstance.createNgo(ngo, legal, admin)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NgoApi#createNgo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NgoApi#createNgo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ngo** | [**PlatformNgoCreate**](PlatformNgoCreate.md)|  |
 **legal** | [**PlatformNgoCreateLegal**](PlatformNgoCreateLegal.md)|  |
 **admin** | [**PlatformNgoCreateAdmin**](PlatformNgoCreateAdmin.md)|  |

### Return type

[**PlatformNgo**](PlatformNgo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="getNgo"></a>
# **getNgo**
> PlatformNgo getNgo()

Get your NGO

This method returns the NGO inside your tenant (theres no need to know the NGO token)  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = NgoApi()
try {
    val result : PlatformNgo = apiInstance.getNgo()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NgoApi#getNgo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NgoApi#getNgo")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PlatformNgo**](PlatformNgo.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateNgo"></a>
# **updateNgo**
> PlatformNgo updateNgo(ngo, logo)

Update NGO data

This method updates any data for the NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = NgoApi()
val ngo : PlatformNgoUpdate =  // PlatformNgoUpdate | 
val logo : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : PlatformNgo = apiInstance.updateNgo(ngo, logo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NgoApi#updateNgo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NgoApi#updateNgo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ngo** | [**PlatformNgoUpdate**](PlatformNgoUpdate.md)|  |
 **logo** | **java.io.File**|  |

### Return type

[**PlatformNgo**](PlatformNgo.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateNgoBank"></a>
# **updateNgoBank**
> PlatformNgo updateNgoBank(bank)

Update bank NGO info

This method updates the bank info for your NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = NgoApi()
val bank : PlatformNgoUpdateBank =  // PlatformNgoUpdateBank | 
try {
    val result : PlatformNgo = apiInstance.updateNgoBank(bank)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NgoApi#updateNgoBank")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NgoApi#updateNgoBank")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bank** | [**PlatformNgoUpdateBank**](PlatformNgoUpdateBank.md)|  |

### Return type

[**PlatformNgo**](PlatformNgo.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateNgoLegal"></a>
# **updateNgoLegal**
> PlatformNgo updateNgoLegal(legal)

Update legal NGO info

This method updates the legal info for your NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = NgoApi()
val legal : PlatformNgoUpdateLegal =  // PlatformNgoUpdateLegal | 
try {
    val result : PlatformNgo = apiInstance.updateNgoLegal(legal)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NgoApi#updateNgoLegal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NgoApi#updateNgoLegal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legal** | [**PlatformNgoUpdateLegal**](PlatformNgoUpdateLegal.md)|  |

### Return type

[**PlatformNgo**](PlatformNgo.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="uploadNgoFiles"></a>
# **uploadNgoFiles**
> PlatformNgo uploadNgoFiles(file)

Upload NGO files

This method uploads documentation (files, images, ...) of a NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = NgoApi()
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : PlatformNgo = apiInstance.uploadNgoFiles(file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NgoApi#uploadNgoFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NgoApi#uploadNgoFiles")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**|  |

### Return type

[**PlatformNgo**](PlatformNgo.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

