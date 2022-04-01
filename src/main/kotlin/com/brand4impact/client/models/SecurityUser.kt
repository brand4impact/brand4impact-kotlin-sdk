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
 * @param jwtToken 
 * @param platform 
 * @param roles 
 */

data class SecurityUser (

    @field:JsonProperty("jwtToken")
    val jwtToken: kotlin.String? = null,

    @field:JsonProperty("platform")
    val platform: kotlin.String? = null,

    @field:JsonProperty("roles")
    val roles: kotlin.collections.List<kotlin.String>? = null

)
