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

import com.brand4impact.client.models.PlatformNgo
import com.brand4impact.client.models.PlatformNgoCreate
import com.brand4impact.client.models.PlatformNgoCreateAdmin
import com.brand4impact.client.models.PlatformNgoCreateLegal
import com.brand4impact.client.models.PlatformNgoUpdate
import com.brand4impact.client.models.PlatformNgoUpdateBank
import com.brand4impact.client.models.PlatformNgoUpdateLegal
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

class NgoApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.brand4impact.client.baseUrl", "http://localhost:8080/backend")
        }
    }

    /**
    * Create a new NGO
    * Register a new NGO allows you to have visibiliy that your NGO deserves, being visible to brand4impact users, and opting for their donations
    * @param ngo  
    * @param legal  
    * @param admin  
    * @return PlatformNgo
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createNgo(ngo: PlatformNgoCreate, legal: PlatformNgoCreateLegal, admin: PlatformNgoCreateAdmin) : PlatformNgo {
        val localVariableConfig = createNgoRequestConfig(ngo = ngo, legal = legal, admin = admin)

        val localVarResponse = request<Map<String, Any?>, PlatformNgo>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlatformNgo
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
    * To obtain the request config of the operation createNgo
    *
    * @param ngo  
    * @param legal  
    * @param admin  
    * @return RequestConfig
    */
    fun createNgoRequestConfig(ngo: PlatformNgoCreate, legal: PlatformNgoCreateLegal, admin: PlatformNgoCreateAdmin) : RequestConfig<Map<String, Any?>> {
        val localVariableBody = mapOf("ngo" to ngo, "legal" to legal, "admin" to admin)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/rest/platform/ngo",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Get your NGO
    * This method returns the NGO inside your tenant (theres no need to know the NGO token)  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)
    * @return PlatformNgo
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getNgo() : PlatformNgo {
        val localVariableConfig = getNgoRequestConfig()

        val localVarResponse = request<Unit, PlatformNgo>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlatformNgo
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
    * To obtain the request config of the operation getNgo
    *
    * @return RequestConfig
    */
    fun getNgoRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/rest/platform/ngo",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Update NGO data
    * This method updates any data for the NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)
    * @param ngo  
    * @param logo  
    * @return PlatformNgo
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateNgo(ngo: PlatformNgoUpdate, logo: java.io.File) : PlatformNgo {
        val localVariableConfig = updateNgoRequestConfig(ngo = ngo, logo = logo)

        val localVarResponse = request<Map<String, Any?>, PlatformNgo>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlatformNgo
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
    * To obtain the request config of the operation updateNgo
    *
    * @param ngo  
    * @param logo  
    * @return RequestConfig
    */
    fun updateNgoRequestConfig(ngo: PlatformNgoUpdate, logo: java.io.File) : RequestConfig<Map<String, Any?>> {
        val localVariableBody = mapOf("ngo" to ngo, "logo" to logo)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/rest/platform/ngo",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Update bank NGO info
    * This method updates the bank info for your NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)
    * @param bank  
    * @return PlatformNgo
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateNgoBank(bank: PlatformNgoUpdateBank) : PlatformNgo {
        val localVariableConfig = updateNgoBankRequestConfig(bank = bank)

        val localVarResponse = request<Map<String, Any?>, PlatformNgo>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlatformNgo
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
    * To obtain the request config of the operation updateNgoBank
    *
    * @param bank  
    * @return RequestConfig
    */
    fun updateNgoBankRequestConfig(bank: PlatformNgoUpdateBank) : RequestConfig<Map<String, Any?>> {
        val localVariableBody = mapOf("bank" to bank)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/rest/platform/ngo/bank",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Update legal NGO info
    * This method updates the legal info for your NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)
    * @param legal  
    * @return PlatformNgo
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updateNgoLegal(legal: PlatformNgoUpdateLegal) : PlatformNgo {
        val localVariableConfig = updateNgoLegalRequestConfig(legal = legal)

        val localVarResponse = request<Map<String, Any?>, PlatformNgo>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlatformNgo
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
    * To obtain the request config of the operation updateNgoLegal
    *
    * @param legal  
    * @return RequestConfig
    */
    fun updateNgoLegalRequestConfig(legal: PlatformNgoUpdateLegal) : RequestConfig<Map<String, Any?>> {
        val localVariableBody = mapOf("legal" to legal)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/rest/platform/ngo/legal",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Upload NGO files
    * This method uploads documentation (files, images, ...) of a NGO  [![security](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/shield-check.png &#39;security&#39;)](http://localhost:8080/backend/blog/home#seguridad)[![multi-tenant](https://b4i.ams3.digitaloceanspaces.com/statics/swagger/users.png &#39;multi-tenant&#39;)](http://localhost:8080/backend/blog/home#multitenant)
    * @param file  
    * @return PlatformNgo
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun uploadNgoFiles(file: java.io.File) : PlatformNgo {
        val localVariableConfig = uploadNgoFilesRequestConfig(file = file)

        val localVarResponse = request<Map<String, Any?>, PlatformNgo>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PlatformNgo
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
    * To obtain the request config of the operation uploadNgoFiles
    *
    * @param file  
    * @return RequestConfig
    */
    fun uploadNgoFilesRequestConfig(file: java.io.File) : RequestConfig<Map<String, Any?>> {
        val localVariableBody = mapOf("file" to file)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/rest/platform/ngo/upload",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}