# UtilsApi

All URIs are relative to *http://localhost:8080/backend*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCountries**](UtilsApi.md#getCountries) | **GET** /rest/platform/utils/country | Get countries
[**getCurrencies**](UtilsApi.md#getCurrencies) | **GET** /rest/platform/utils/currency | Get currencies
[**getLanguages**](UtilsApi.md#getLanguages) | **GET** /rest/platform/utils/language | Get languages
[**getRoles**](UtilsApi.md#getRoles) | **GET** /rest/platform/utils/roles | Get roles
[**getZones**](UtilsApi.md#getZones) | **GET** /rest/platform/utils/zone | Get zones


<a name="getCountries"></a>
# **getCountries**
> kotlin.collections.List&lt;PlatformCountry&gt; getCountries(language)

Get countries

This method returns all the countries available, you can indicate a locale to do the search

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UtilsApi()
val language : kotlin.String = language_example // kotlin.String | List of countries
try {
    val result : kotlin.collections.List<PlatformCountry> = apiInstance.getCountries(language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UtilsApi#getCountries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UtilsApi#getCountries")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **kotlin.String**| List of countries | [enum: ab, aa, af, ak, sq, am, ar, an, hy, as, av, ae, ay, az, bm, ba, eu, be, bn, bh, bi, bs, br, bg, my, ca, ch, ce, zh, cu, cv, kw, co, cr, hr, cs, da, dv, nl, dz, en, eo, et, ee, fo, fj, fi, fr, fy, ff, gl, lg, ka, de, el, kl, gn, gu, ht, ha, he, hz, hi, ho, hu, is, io, ig, id, ia, ie, iu, ik, ga, it, ja, jv, kn, kr, ks, kk, km, ki, rw, ky, kv, kg, ko, ku, kj, lo, la, lv, li, ln, lt, lu, lb, mk, mg, ms, ml, mt, gv, mi, mr, mh, mo, mn, na, nv, ng, ne, nd, se, no, nb, nn, ny, oc, oj, or, om, os, pi, pa, fa, pl, pt, ps, qu, rm, ro, rn, ru, sm, sg, sa, sc, gd, sr, sn, ii, sd, si, sk, sl, so, nr, st, es, su, sw, ss, sv, tl, ty, tg, ta, tt, te, th, bo, ti, to, ts, tn, tr, tk, tw, ug, uk, ur, uz, ve, vi, vo, wa, cy, wo, xh, ji, yo, za, zu]

### Return type

[**kotlin.collections.List&lt;PlatformCountry&gt;**](PlatformCountry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencies"></a>
# **getCurrencies**
> kotlin.collections.List&lt;PlatformCurrency&gt; getCurrencies(language)

Get currencies

This method returns all the currencies available, you can indicate a locale to do the search

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UtilsApi()
val language : kotlin.String = language_example // kotlin.String | List of currencies
try {
    val result : kotlin.collections.List<PlatformCurrency> = apiInstance.getCurrencies(language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UtilsApi#getCurrencies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UtilsApi#getCurrencies")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **kotlin.String**| List of currencies | [enum: ab, aa, af, ak, sq, am, ar, an, hy, as, av, ae, ay, az, bm, ba, eu, be, bn, bh, bi, bs, br, bg, my, ca, ch, ce, zh, cu, cv, kw, co, cr, hr, cs, da, dv, nl, dz, en, eo, et, ee, fo, fj, fi, fr, fy, ff, gl, lg, ka, de, el, kl, gn, gu, ht, ha, he, hz, hi, ho, hu, is, io, ig, id, ia, ie, iu, ik, ga, it, ja, jv, kn, kr, ks, kk, km, ki, rw, ky, kv, kg, ko, ku, kj, lo, la, lv, li, ln, lt, lu, lb, mk, mg, ms, ml, mt, gv, mi, mr, mh, mo, mn, na, nv, ng, ne, nd, se, no, nb, nn, ny, oc, oj, or, om, os, pi, pa, fa, pl, pt, ps, qu, rm, ro, rn, ru, sm, sg, sa, sc, gd, sr, sn, ii, sd, si, sk, sl, so, nr, st, es, su, sw, ss, sv, tl, ty, tg, ta, tt, te, th, bo, ti, to, ts, tn, tr, tk, tw, ug, uk, ur, uz, ve, vi, vo, wa, cy, wo, xh, ji, yo, za, zu]

### Return type

[**kotlin.collections.List&lt;PlatformCurrency&gt;**](PlatformCurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLanguages"></a>
# **getLanguages**
> kotlin.collections.List&lt;PlatformLanguage&gt; getLanguages(language)

Get languages

This method returns all the languages available, you can indicate a locale to do the search

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UtilsApi()
val language : kotlin.String = language_example // kotlin.String | List of languages
try {
    val result : kotlin.collections.List<PlatformLanguage> = apiInstance.getLanguages(language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UtilsApi#getLanguages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UtilsApi#getLanguages")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **kotlin.String**| List of languages | [enum: ab, aa, af, ak, sq, am, ar, an, hy, as, av, ae, ay, az, bm, ba, eu, be, bn, bh, bi, bs, br, bg, my, ca, ch, ce, zh, cu, cv, kw, co, cr, hr, cs, da, dv, nl, dz, en, eo, et, ee, fo, fj, fi, fr, fy, ff, gl, lg, ka, de, el, kl, gn, gu, ht, ha, he, hz, hi, ho, hu, is, io, ig, id, ia, ie, iu, ik, ga, it, ja, jv, kn, kr, ks, kk, km, ki, rw, ky, kv, kg, ko, ku, kj, lo, la, lv, li, ln, lt, lu, lb, mk, mg, ms, ml, mt, gv, mi, mr, mh, mo, mn, na, nv, ng, ne, nd, se, no, nb, nn, ny, oc, oj, or, om, os, pi, pa, fa, pl, pt, ps, qu, rm, ro, rn, ru, sm, sg, sa, sc, gd, sr, sn, ii, sd, si, sk, sl, so, nr, st, es, su, sw, ss, sv, tl, ty, tg, ta, tt, te, th, bo, ti, to, ts, tn, tr, tk, tw, ug, uk, ur, uz, ve, vi, vo, wa, cy, wo, xh, ji, yo, za, zu]

### Return type

[**kotlin.collections.List&lt;PlatformLanguage&gt;**](PlatformLanguage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRoles"></a>
# **getRoles**
> kotlin.collections.List&lt;PlatformRole&gt; getRoles()

Get roles

This method returns all the roles available, you can indicate a locale to do the search

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UtilsApi()
try {
    val result : kotlin.collections.List<PlatformRole> = apiInstance.getRoles()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UtilsApi#getRoles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UtilsApi#getRoles")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;PlatformRole&gt;**](PlatformRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getZones"></a>
# **getZones**
> kotlin.collections.List&lt;PlatformZone&gt; getZones(language)

Get zones

This method returns all the zones available, you can indicate a locale to do the search

### Example
```kotlin
// Import classes:
//import com.brand4impact.client.infrastructure.*
//import com.brand4impact.client.models.*

val apiInstance = UtilsApi()
val language : kotlin.String = language_example // kotlin.String | List of zones
try {
    val result : kotlin.collections.List<PlatformZone> = apiInstance.getZones(language)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UtilsApi#getZones")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UtilsApi#getZones")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **kotlin.String**| List of zones | [enum: ab, aa, af, ak, sq, am, ar, an, hy, as, av, ae, ay, az, bm, ba, eu, be, bn, bh, bi, bs, br, bg, my, ca, ch, ce, zh, cu, cv, kw, co, cr, hr, cs, da, dv, nl, dz, en, eo, et, ee, fo, fj, fi, fr, fy, ff, gl, lg, ka, de, el, kl, gn, gu, ht, ha, he, hz, hi, ho, hu, is, io, ig, id, ia, ie, iu, ik, ga, it, ja, jv, kn, kr, ks, kk, km, ki, rw, ky, kv, kg, ko, ku, kj, lo, la, lv, li, ln, lt, lu, lb, mk, mg, ms, ml, mt, gv, mi, mr, mh, mo, mn, na, nv, ng, ne, nd, se, no, nb, nn, ny, oc, oj, or, om, os, pi, pa, fa, pl, pt, ps, qu, rm, ro, rn, ru, sm, sg, sa, sc, gd, sr, sn, ii, sd, si, sk, sl, so, nr, st, es, su, sw, ss, sv, tl, ty, tg, ta, tt, te, th, bo, ti, to, ts, tn, tr, tk, tw, ug, uk, ur, uz, ve, vi, vo, wa, cy, wo, xh, ji, yo, za, zu]

### Return type

[**kotlin.collections.List&lt;PlatformZone&gt;**](PlatformZone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

