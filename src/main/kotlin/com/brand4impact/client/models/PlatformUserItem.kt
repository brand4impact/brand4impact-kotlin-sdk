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

package com.brand4impact.client.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param token 
 * @param id 
 * @param firstname 
 * @param lastname 
 * @param email 
 * @param status 
 * @param roles 
 */

data class PlatformUserItem (

    @field:JsonProperty("token")
    val token: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("firstname")
    val firstname: kotlin.String? = null,

    @field:JsonProperty("lastname")
    val lastname: kotlin.String? = null,

    @field:JsonProperty("email")
    val email: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: kotlin.String? = null,

    @field:JsonProperty("roles")
    val roles: kotlin.collections.List<kotlin.String>? = null

)

