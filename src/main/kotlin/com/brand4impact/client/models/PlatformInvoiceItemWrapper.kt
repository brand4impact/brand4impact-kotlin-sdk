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

import com.brand4impact.client.models.Pagination
import com.brand4impact.client.models.PlatformInvoiceItem

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param items 
 * @param pagination 
 */

data class PlatformInvoiceItemWrapper (

    @field:JsonProperty("items")
    val items: kotlin.collections.List<PlatformInvoiceItem>? = null,

    @field:JsonProperty("pagination")
    val pagination: Pagination? = null

)

