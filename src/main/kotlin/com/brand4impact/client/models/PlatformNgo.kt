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

import com.brand4impact.client.models.PlatformNgoAddress
import com.brand4impact.client.models.PlatformNgoLegal

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param token 
 * @param id 
 * @param name 
 * @param vat 
 * @param address 
 * @param status 
 * @param establishment 
 * @param website 
 * @param legal 
 * @param files 
 */

data class PlatformNgo (

    @field:JsonProperty("token")
    val token: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("vat")
    val vat: kotlin.String? = null,

    @field:JsonProperty("address")
    val address: PlatformNgoAddress? = null,

    @field:JsonProperty("status")
    val status: kotlin.String? = null,

    @field:JsonProperty("establishment")
    val establishment: java.time.OffsetDateTime? = null,

    @field:JsonProperty("website")
    val website: kotlin.String? = null,

    @field:JsonProperty("legal")
    val legal: PlatformNgoLegal? = null,

    @field:JsonProperty("files")
    val files: kotlin.collections.List<kotlin.String>? = null

)
