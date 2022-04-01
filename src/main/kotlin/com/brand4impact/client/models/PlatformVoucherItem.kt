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
 * @param amount 
 * @param currency 
 */

data class PlatformVoucherItem (

    @field:JsonProperty("token")
    val token: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("amount")
    val amount: kotlin.Double? = null,

    @field:JsonProperty("currency")
    val currency: kotlin.String? = null

)

