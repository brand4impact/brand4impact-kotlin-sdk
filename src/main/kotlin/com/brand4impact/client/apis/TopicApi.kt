/**
 * Total API Reference
 *
 * Este contrato se usara para generar los clientes con todos los servicios necesarios.  `!Uso exclusivo interno!`               --- 
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: support@brand4impact.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.brand4impact.client.apis

import com.brand4impact.client.models.PlatformTopic
import com.brand4impact.client.models.PlatformTopicItemWrapper
import com.brand4impact.client.models.RestError

import com.brand4impact.client.infrastructure.ApiClient
import com.brand4impact.client.infrastructure.ClientException
import com.brand4impact.client.infrastructure.ClientError
import com.brand4impact.client.infrastructure.ServerException
import com.brand4impact.client.infrastructure.ServerError
import com.brand4impact.client.infrastructure.MultiValueMap
import com.brand4impact.client.infrastructure.RequestConfig
import com.brand4impact.client.infrastructure.RequestMethod
import com.brand4impact.client.infrastructure.ResponseType
import com.brand4impact.client.infrastructure.Success
import com.brand4impact.client.infrastructure.toMultiValue

class TopicApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.brand4impact.client.baseUrl", "http://localhost:8080/backend")
        }
    }

    /**
    * Get a single topic
    * This method returns a specific topic  A topic refers to the 17th SDG objectives [(United Nations)](https://sdgs.un.org/goals)  
    * @param token The unique token for the topic. 
    * @return PlatformTopic
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getTopic(token: kotlin.String) : PlatformTopic {
        val localVariableConfig = getTopicRequestConfig(token = token)

        val localVarResponse = request<Unit, PlatformTopic>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlatformTopic
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation getTopic
    *
    * @param token The unique token for the topic. 
    * @return RequestConfig
    */
    fun getTopicRequestConfig(token: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/rest/platform/topic/{token}".replace("{"+"token"+"}", "$token"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get a set of topics
    * This method returns all the topics according the filters  A topic refers to the 17th SDG objectives [(United Nations)](https://sdgs.un.org/goals)    [![pagination](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/brackets.png &#39;pagination&#39;)](http://localhost:8080/backend/blog/home#pagination)
    * @param titleLike The name of the filter (optional)
    * @param page The number of the page. Possible values: 0 to unlimited (optional)
    * @param size The number of items inside a page. Possible values: 1 to 100 (optional)
    * @param sort The order direction for sorted results. Possible values: ASC or DESC (optional)
    * @return PlatformTopicItemWrapper
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getTopics(titleLike: kotlin.String?, page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?) : PlatformTopicItemWrapper {
        val localVariableConfig = getTopicsRequestConfig(titleLike = titleLike, page = page, size = size, sort = sort)

        val localVarResponse = request<Unit, PlatformTopicItemWrapper>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlatformTopicItemWrapper
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation getTopics
    *
    * @param titleLike The name of the filter (optional)
    * @param page The number of the page. Possible values: 0 to unlimited (optional)
    * @param size The number of items inside a page. Possible values: 1 to 100 (optional)
    * @param sort The order direction for sorted results. Possible values: ASC or DESC (optional)
    * @return RequestConfig
    */
    fun getTopicsRequestConfig(titleLike: kotlin.String?, page: kotlin.Int?, size: kotlin.Int?, sort: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (titleLike != null) {
                    put("titleLike", listOf(titleLike.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (size != null) {
                    put("size", listOf(size.toString()))
                }
                if (sort != null) {
                    put("sort", listOf(sort.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/rest/platform/topic",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
