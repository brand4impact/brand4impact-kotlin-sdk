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

import com.brand4impact.client.models.PlatformCompany
import com.brand4impact.client.models.PlatformCompanyCreate
import com.brand4impact.client.models.PlatformCompanyCreateAdmin
import com.brand4impact.client.models.PlatformCompanyCreateLegal
import com.brand4impact.client.models.PlatformCompanyUpdate
import com.brand4impact.client.models.PlatformCompanyUpdateLegal
import com.brand4impact.client.models.PlatformCompanyUpdateTopic
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

class CompanyApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.brand4impact.client.baseUrl", "http://localhost:8080/backend")
        }
    }

    /**
    * Create a new Company
    * Register a new company allows you to start to have visibility that your deserves, being visible to brand4impact users and opting to donate among a bunch of projects
    * @param company  
    * @param legal  
    * @param admin  
    * @return PlatformCompany
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createCompany(company: PlatformCompanyCreate, legal: PlatformCompanyCreateLegal, admin: PlatformCompanyCreateAdmin) : PlatformCompany {
        val localVariableConfig = createCompanyRequestConfig(company = company, legal = legal, admin = admin)

        val localVarResponse = request<Map<String, Any?>, PlatformCompany>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlatformCompany
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
    * To obtain the request config of the operation createCompany
    *
    * @param company  
    * @param legal  
    * @param admin  
    * @return RequestConfig
    */
    fun createCompanyRequestConfig(company: PlatformCompanyCreate, legal: PlatformCompanyCreateLegal, admin: PlatformCompanyCreateAdmin) : RequestConfig<Map<String, Any?>> {
        val localVariableBody = mapOf("company" to company, "legal" to legal, "admin" to admin)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/rest/platform/company",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get your Company
    * This method returns the Company inside your tenant (theres no need to know the Company token)  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)
    * @return PlatformCompany
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getCompany() : PlatformCompany {
        val localVariableConfig = getCompanyRequestConfig()

        val localVarResponse = request<Unit, PlatformCompany>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlatformCompany
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
    * To obtain the request config of the operation getCompany
    *
    * @return RequestConfig
    */
    fun getCompanyRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/rest/platform/company",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Update Company data
    * This method updates any data for the Company  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)
    * @param company  
    * @param logo  
    * @return PlatformCompany
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateCompany(company: PlatformCompanyUpdate, logo: java.io.File) : PlatformCompany {
        val localVariableConfig = updateCompanyRequestConfig(company = company, logo = logo)

        val localVarResponse = request<Map<String, Any?>, PlatformCompany>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlatformCompany
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
    * To obtain the request config of the operation updateCompany
    *
    * @param company  
    * @param logo  
    * @return RequestConfig
    */
    fun updateCompanyRequestConfig(company: PlatformCompanyUpdate, logo: java.io.File) : RequestConfig<Map<String, Any?>> {
        val localVariableBody = mapOf("company" to company, "logo" to logo)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/rest/platform/company",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Update legal Company info
    * This method updates the legal info for your Company  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)
    * @param legal  
    * @return PlatformCompany
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateCompanyLegal(legal: PlatformCompanyUpdateLegal) : PlatformCompany {
        val localVariableConfig = updateCompanyLegalRequestConfig(legal = legal)

        val localVarResponse = request<Map<String, Any?>, PlatformCompany>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlatformCompany
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
    * To obtain the request config of the operation updateCompanyLegal
    *
    * @param legal  
    * @return RequestConfig
    */
    fun updateCompanyLegalRequestConfig(legal: PlatformCompanyUpdateLegal) : RequestConfig<Map<String, Any?>> {
        val localVariableBody = mapOf("legal" to legal)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/rest/platform/company/legal",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Update selected topics for your Company
    * This method updates to which topics they can donate the vouchers of their campaigns  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)
    * @param sdg  
    * @return PlatformCompany
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateCompanyTopic(sdg: PlatformCompanyUpdateTopic) : PlatformCompany {
        val localVariableConfig = updateCompanyTopicRequestConfig(sdg = sdg)

        val localVarResponse = request<Map<String, Any?>, PlatformCompany>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlatformCompany
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
    * To obtain the request config of the operation updateCompanyTopic
    *
    * @param sdg  
    * @return RequestConfig
    */
    fun updateCompanyTopicRequestConfig(sdg: PlatformCompanyUpdateTopic) : RequestConfig<Map<String, Any?>> {
        val localVariableBody = mapOf("sdg" to sdg)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/rest/platform/company/topic",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
