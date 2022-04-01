# CompanyApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompany**](CompanyApi.md#createCompany) | **POST** /rest/platform/company | Create a new Company
[**getCompany**](CompanyApi.md#getCompany) | **GET** /rest/platform/company | Get your Company
[**updateCompany**](CompanyApi.md#updateCompany) | **PUT** /rest/platform/company | Update Company data
[**updateCompanyLegal**](CompanyApi.md#updateCompanyLegal) | **PUT** /rest/platform/company/legal | Update legal Company info
[**updateCompanyTopic**](CompanyApi.md#updateCompanyTopic) | **PUT** /rest/platform/company/topic | Update selected topics for your Company


<a name="createCompany"></a>
# **createCompany**
> PlatformCompany createCompany(company, legal, admin)

Create a new Company

Register a new company allows you to start to have visibility that your deserves, being visible to brand4impact users and opting to donate among a bunch of projects

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = CompanyApi()
val company : PlatformCompanyCreate =  // PlatformCompanyCreate | 
val legal : PlatformCompanyCreateLegal =  // PlatformCompanyCreateLegal | 
val admin : PlatformCompanyCreateAdmin =  // PlatformCompanyCreateAdmin | 
try {
    val result : PlatformCompany = apiInstance.createCompany(company, legal, admin)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyApi#createCompany")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyApi#createCompany")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | [**PlatformCompanyCreate**](PlatformCompanyCreate.md)|  |
 **legal** | [**PlatformCompanyCreateLegal**](PlatformCompanyCreateLegal.md)|  |
 **admin** | [**PlatformCompanyCreateAdmin**](PlatformCompanyCreateAdmin.md)|  |

### Return type

[**PlatformCompany**](PlatformCompany.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="getCompany"></a>
# **getCompany**
> PlatformCompany getCompany()

Get your Company

This method returns the Company inside your tenant (theres no need to know the Company token)  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = CompanyApi()
try {
    val result : PlatformCompany = apiInstance.getCompany()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyApi#getCompany")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyApi#getCompany")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PlatformCompany**](PlatformCompany.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCompany"></a>
# **updateCompany**
> PlatformCompany updateCompany(company, logo)

Update Company data

This method updates any data for the Company  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = CompanyApi()
val company : PlatformCompanyUpdate =  // PlatformCompanyUpdate | 
val logo : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : PlatformCompany = apiInstance.updateCompany(company, logo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyApi#updateCompany")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyApi#updateCompany")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **company** | [**PlatformCompanyUpdate**](PlatformCompanyUpdate.md)|  |
 **logo** | **java.io.File**|  |

### Return type

[**PlatformCompany**](PlatformCompany.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateCompanyLegal"></a>
# **updateCompanyLegal**
> PlatformCompany updateCompanyLegal(legal)

Update legal Company info

This method updates the legal info for your Company  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = CompanyApi()
val legal : PlatformCompanyUpdateLegal =  // PlatformCompanyUpdateLegal | 
try {
    val result : PlatformCompany = apiInstance.updateCompanyLegal(legal)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyApi#updateCompanyLegal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyApi#updateCompanyLegal")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legal** | [**PlatformCompanyUpdateLegal**](PlatformCompanyUpdateLegal.md)|  |

### Return type

[**PlatformCompany**](PlatformCompany.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateCompanyTopic"></a>
# **updateCompanyTopic**
> PlatformCompany updateCompanyTopic(sdg)

Update selected topics for your Company

This method updates to which topics they can donate the vouchers of their campaigns  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = CompanyApi()
val sdg : PlatformCompanyUpdateTopic =  // PlatformCompanyUpdateTopic | 
try {
    val result : PlatformCompany = apiInstance.updateCompanyTopic(sdg)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompanyApi#updateCompanyTopic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompanyApi#updateCompanyTopic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sdg** | [**PlatformCompanyUpdateTopic**](PlatformCompanyUpdateTopic.md)|  |

### Return type

[**PlatformCompany**](PlatformCompany.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

