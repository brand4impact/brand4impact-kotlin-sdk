# TopicApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTopic**](TopicApi.md#getTopic) | **GET** /rest/platform/topic/{token} | Get a single topic
[**getTopics**](TopicApi.md#getTopics) | **GET** /rest/platform/topic | Get a set of topics


<a name="getTopic"></a>
# **getTopic**
> PlatformTopic getTopic(token)

Get a single topic

This method returns a specific topic  A topic refers to the 17th SDG objectives [(United Nations)](https://sdgs.un.org/goals)  

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = TopicApi()
val token : kotlin.String = token_example // kotlin.String | The unique token for the topic.
try {
    val result : PlatformTopic = apiInstance.getTopic(token)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TopicApi#getTopic")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TopicApi#getTopic")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **kotlin.String**| The unique token for the topic. |

### Return type

[**PlatformTopic**](PlatformTopic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTopics"></a>
# **getTopics**
> PlatformTopicItemWrapper getTopics(titleLike, page, size, sort)

Get a set of topics

This method returns all the topics according the filters  A topic refers to the 17th SDG objectives [(United Nations)](https://sdgs.un.org/goals)    [![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = TopicApi()
val titleLike : kotlin.String = titleLike_example // kotlin.String | The name of the filter
val page : kotlin.Int = 56 // kotlin.Int | The number of the page. Possible values: 0 to unlimited
val size : kotlin.Int = 56 // kotlin.Int | The number of items inside a page. Possible values: 1 to 100
val sort : kotlin.String = sort_example // kotlin.String | The order direction for sorted results. Possible values: ASC or DESC
try {
    val result : PlatformTopicItemWrapper = apiInstance.getTopics(titleLike, page, size, sort)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TopicApi#getTopics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TopicApi#getTopics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **titleLike** | **kotlin.String**| The name of the filter | [optional]
 **page** | **kotlin.Int**| The number of the page. Possible values: 0 to unlimited | [optional]
 **size** | **kotlin.Int**| The number of items inside a page. Possible values: 1 to 100 | [optional]
 **sort** | **kotlin.String**| The order direction for sorted results. Possible values: ASC or DESC | [optional]

### Return type

[**PlatformTopicItemWrapper**](PlatformTopicItemWrapper.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

