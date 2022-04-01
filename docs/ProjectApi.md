# ProjectApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProject**](ProjectApi.md#createProject) | **POST** /rest/platform/project | Create a new project
[**getProject**](ProjectApi.md#getProject) | **GET** /rest/platform/project/{token} | Get a single project
[**getProjects**](ProjectApi.md#getProjects) | **GET** /rest/platform/project | Get a set of projects
[**switchProject**](ProjectApi.md#switchProject) | **PUT** /rest/platform/project/{token}/switch | Switch project status
[**updateProject**](ProjectApi.md#updateProject) | **PUT** /rest/platform/project/{token} | Update a project


<a name="createProject"></a>
# **createProject**
> PlatformProject createProject(project, primaryImage, secondaryImage)

Create a new project

This method creates a new project within a NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = ProjectApi()
val project : PlatformProjectCreate =  // PlatformProjectCreate | 
val primaryImage : java.io.File = BINARY_DATA_HERE // java.io.File | 
val secondaryImage : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : PlatformProject = apiInstance.createProject(project, primaryImage, secondaryImage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#createProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#createProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | [**PlatformProjectCreate**](PlatformProjectCreate.md)|  |
 **primaryImage** | **java.io.File**|  |
 **secondaryImage** | **java.io.File**|  |

### Return type

[**PlatformProject**](PlatformProject.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="getProject"></a>
# **getProject**
> PlatformProject getProject(token)

Get a single project

This method returns a specific project within your tenant  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = ProjectApi()
val token : kotlin.String = token_example // kotlin.String | The unique token for the campaign.
try {
    val result : PlatformProject = apiInstance.getProject(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#getProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#getProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| The unique token for the campaign. |

### Return type

[**PlatformProject**](PlatformProject.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProjects"></a>
# **getProjects**
> PlatformProjectItemWrapper getProjects(descriptionLike, country, topicToken, page, size, sort)

Get a set of projects

This method returns a set of projects within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = ProjectApi()
val descriptionLike : kotlin.String = descriptionLike_example // kotlin.String | 
val country : kotlin.String = country_example // kotlin.String | The country
val topicToken : kotlin.String = topicToken_example // kotlin.String | The topicToken
val page : kotlin.Int = 56 // kotlin.Int | The number of the page. Possible values: 0 to unlimited
val size : kotlin.Int = 56 // kotlin.Int | The number of items inside a page. Possible values: 1 to 100
val sort : kotlin.String = sort_example // kotlin.String | The order direction for sorted results. Possible values: ASC or DESC
try {
    val result : PlatformProjectItemWrapper = apiInstance.getProjects(descriptionLike, country, topicToken, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#getProjects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#getProjects")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **descriptionLike** | **kotlin.String**|  | [optional]
 **country** | **kotlin.String**| The country | [optional]
 **topicToken** | **kotlin.String**| The topicToken | [optional]
 **page** | **kotlin.Int**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **kotlin.Int**| The number of items inside a page. Possible values: 1 to 100 | [optional]
 **sort** | **kotlin.String**| The order direction for sorted results. Possible values: ASC or DESC | [optional]

### Return type

[**PlatformProjectItemWrapper**](PlatformProjectItemWrapper.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="switchProject"></a>
# **switchProject**
> PlatformProject switchProject(token)

Switch project status

This method switch the status of a specific project  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = ProjectApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : PlatformProject = apiInstance.switchProject(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#switchProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#switchProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |

### Return type

[**PlatformProject**](PlatformProject.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProject"></a>
# **updateProject**
> PlatformProject updateProject(token, project, primaryImage, secondaryImage)

Update a project

This method updates an existing project  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = ProjectApi()
val token : kotlin.String = token_example // kotlin.String | 
val project : PlatformProjectUpdate =  // PlatformProjectUpdate | 
val primaryImage : java.io.File = BINARY_DATA_HERE // java.io.File | 
val secondaryImage : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : PlatformProject = apiInstance.updateProject(token, project, primaryImage, secondaryImage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectApi#updateProject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectApi#updateProject")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |
 **project** | [**PlatformProjectUpdate**](PlatformProjectUpdate.md)|  |
 **primaryImage** | **java.io.File**|  |
 **secondaryImage** | **java.io.File**|  |

### Return type

[**PlatformProject**](PlatformProject.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

