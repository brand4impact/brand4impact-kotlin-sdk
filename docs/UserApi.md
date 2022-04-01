# UserApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeUserPassword**](UserApi.md#changeUserPassword) | **PUT** /rest/platform/user/{token}/changepassword | Change user&#39;s password
[**confirmUser**](UserApi.md#confirmUser) | **POST** /rest/platform/user/{token} | Activate a user
[**getUser**](UserApi.md#getUser) | **GET** /rest/platform/user/{token} | Get a single user
[**getUsers**](UserApi.md#getUsers) | **GET** /rest/platform/user | Get a set of users
[**inviteUser**](UserApi.md#inviteUser) | **POST** /rest/platform/user/invite | Invite a new user
[**resetUserPassword**](UserApi.md#resetUserPassword) | **PUT** /rest/platform/user/resetpassword | Reset user&#39;s password
[**switchUser**](UserApi.md#switchUser) | **PUT** /rest/platform/user/{token}/switch | Switch user&#39;s status
[**updateUser**](UserApi.md#updateUser) | **PUT** /rest/platform/user/{token} | Update user data
[**updateUserExt**](UserApi.md#updateUserExt) | **PUT** /rest/platform/user/{token}/ext | Update sensitive user data


<a name="changeUserPassword"></a>
# **changeUserPassword**
> PlatformUser changeUserPassword(token, user)

Change user&#39;s password

This method updates the password of a specific user  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UserApi()
val token : kotlin.String = token_example // kotlin.String | 
val user : PlatformUserChangePassword =  // PlatformUserChangePassword | 
try {
    val result : PlatformUser = apiInstance.changeUserPassword(token, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#changeUserPassword")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#changeUserPassword")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |
 **user** | [**PlatformUserChangePassword**](PlatformUserChangePassword.md)|  |

### Return type

[**PlatformUser**](PlatformUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="confirmUser"></a>
# **confirmUser**
> PlatformUser confirmUser(token, user)

Activate a user

This method activate an invited user in the Company/NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UserApi()
val token : kotlin.String = token_example // kotlin.String | 
val user : PlatformUserConfirm =  // PlatformUserConfirm | 
try {
    val result : PlatformUser = apiInstance.confirmUser(token, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#confirmUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#confirmUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |
 **user** | [**PlatformUserConfirm**](PlatformUserConfirm.md)|  |

### Return type

[**PlatformUser**](PlatformUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> PlatformUser getUser(token)

Get a single user

This method returns a specific user within your tenant  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UserApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : PlatformUser = apiInstance.getUser(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |

### Return type

[**PlatformUser**](PlatformUser.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> PlatformUserItemWrapper getUsers(firstnameLike, page, size, sort)

Get a set of users

This method returns a set of users within your tenant    [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)[![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UserApi()
val firstnameLike : kotlin.String = firstnameLike_example // kotlin.String | The name of the filter
val page : kotlin.Int = 56 // kotlin.Int | The number of the page. Possible values: 0 to unlimited
val size : kotlin.Int = 56 // kotlin.Int | The number of items inside a page. Possible values: 1 to 100
val sort : kotlin.String = sort_example // kotlin.String | The order direction for sorted results. Possible values: ASC or DESC
try {
    val result : PlatformUserItemWrapper = apiInstance.getUsers(firstnameLike, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstnameLike** | **kotlin.String**| The name of the filter | [optional]
 **page** | **kotlin.Int**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **kotlin.Int**| The number of items inside a page. Possible values: 1 to 100 | [optional]
 **sort** | **kotlin.String**| The order direction for sorted results. Possible values: ASC or DESC | [optional]

### Return type

[**PlatformUserItemWrapper**](PlatformUserItemWrapper.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="inviteUser"></a>
# **inviteUser**
> PlatformUser inviteUser(user)

Invite a new user

This method invites a user to join a Company/NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UserApi()
val user : PlatformUserInvite =  // PlatformUserInvite | 
try {
    val result : PlatformUser = apiInstance.inviteUser(user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#inviteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#inviteUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**PlatformUserInvite**](PlatformUserInvite.md)|  |

### Return type

[**PlatformUser**](PlatformUser.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="resetUserPassword"></a>
# **resetUserPassword**
> PlatformUser resetUserPassword(user)

Reset user&#39;s password

This method reset the password of a specific user by sending an email to the user with a link to reset the password  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UserApi()
val user : PlatformUserResetPassword =  // PlatformUserResetPassword | 
try {
    val result : PlatformUser = apiInstance.resetUserPassword(user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#resetUserPassword")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#resetUserPassword")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**PlatformUserResetPassword**](PlatformUserResetPassword.md)|  |

### Return type

[**PlatformUser**](PlatformUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="switchUser"></a>
# **switchUser**
> PlatformUser switchUser(token)

Switch user&#39;s status

This method updates the user status, possible values are: active|inactive  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UserApi()
val token : kotlin.String = token_example // kotlin.String | 
try {
    val result : PlatformUser = apiInstance.switchUser(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#switchUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#switchUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |

### Return type

[**PlatformUser**](PlatformUser.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> PlatformUser updateUser(token, user)

Update user data

This method updates personal data for a user  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UserApi()
val token : kotlin.String = token_example // kotlin.String | 
val user : PlatformUserUpdate =  // PlatformUserUpdate | 
try {
    val result : PlatformUser = apiInstance.updateUser(token, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#updateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |
 **user** | [**PlatformUserUpdate**](PlatformUserUpdate.md)|  |

### Return type

[**PlatformUser**](PlatformUser.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="updateUserExt"></a>
# **updateUserExt**
> PlatformUser updateUserExt(token, user)

Update sensitive user data

This method updates sensitive user data  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UserApi()
val token : kotlin.String = token_example // kotlin.String | 
val user : PlatformUserUpdateExt =  // PlatformUserUpdateExt | 
try {
    val result : PlatformUser = apiInstance.updateUserExt(token, user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#updateUserExt")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#updateUserExt")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**|  |
 **user** | [**PlatformUserUpdateExt**](PlatformUserUpdateExt.md)|  |

### Return type

[**PlatformUser**](PlatformUser.md)

### Authorization


Configure BearerAuthentication:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

