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
 * @param title 
 * @param description 
 * @param startdate 
 * @param enddate 
 * @param primaryImageToken 
 * @param secondaryImageToken 
 * @param videoUrl 
 * @param status 
 */

data class PlatformCampaign (

    @field:JsonProperty("token")
    val token: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("title")
    val title: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("startdate")
    val startdate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("enddate")
    val enddate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("primaryImageToken")
    val primaryImageToken: kotlin.String? = null,

    @field:JsonProperty("secondaryImageToken")
    val secondaryImageToken: kotlin.String? = null,

    @field:JsonProperty("videoUrl")
    val videoUrl: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: kotlin.String? = null

)

