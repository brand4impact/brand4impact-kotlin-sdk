# com.brand4impact.client - Kotlin client library for Total API Reference

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/backend*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetApi* | [**getAsset**](docs/AssetApi.md#getasset) | **GET** /rest/platform/asset/{token} | Get a single asset
*AssetApi* | [**getAssets**](docs/AssetApi.md#getassets) | **GET** /rest/platform/asset | Get a set of assets
*CampaignApi* | [**createCampaign**](docs/CampaignApi.md#createcampaign) | **POST** /rest/platform/campaign | Create a new campaign
*CampaignApi* | [**getCampaign**](docs/CampaignApi.md#getcampaign) | **GET** /rest/platform/campaign/{token} | Get a single campaign
*CampaignApi* | [**getCampaigns**](docs/CampaignApi.md#getcampaigns) | **GET** /rest/platform/campaign | Get a set of campaigns
*CampaignApi* | [**switchCampaign**](docs/CampaignApi.md#switchcampaign) | **PUT** /rest/platform/campaign/{token}/switch | Switch campaign status
*CampaignApi* | [**updateCampaign**](docs/CampaignApi.md#updatecampaign) | **PUT** /rest/platform/campaign/{token} | Update a campaign
*CompanyApi* | [**createCompany**](docs/CompanyApi.md#createcompany) | **POST** /rest/platform/company | Create a new Company
*CompanyApi* | [**getCompany**](docs/CompanyApi.md#getcompany) | **GET** /rest/platform/company | Get your Company
*CompanyApi* | [**updateCompany**](docs/CompanyApi.md#updatecompany) | **PUT** /rest/platform/company | Update Company data
*CompanyApi* | [**updateCompanyLegal**](docs/CompanyApi.md#updatecompanylegal) | **PUT** /rest/platform/company/legal | Update legal Company info
*CompanyApi* | [**updateCompanyTopic**](docs/CompanyApi.md#updatecompanytopic) | **PUT** /rest/platform/company/topic | Update selected topics for your Company
*InvoiceApi* | [**getInvoice**](docs/InvoiceApi.md#getinvoice) | **GET** /rest/platform/invoice/{token} | Get a single invoice
*InvoiceApi* | [**getInvoices**](docs/InvoiceApi.md#getinvoices) | **GET** /rest/platform/invoice | Get a set of invoices
*NgoApi* | [**createNgo**](docs/NgoApi.md#createngo) | **POST** /rest/platform/ngo | Create a new NGO
*NgoApi* | [**getNgo**](docs/NgoApi.md#getngo) | **GET** /rest/platform/ngo | Get your NGO
*NgoApi* | [**updateNgo**](docs/NgoApi.md#updatengo) | **PUT** /rest/platform/ngo | Update NGO data
*NgoApi* | [**updateNgoBank**](docs/NgoApi.md#updatengobank) | **PUT** /rest/platform/ngo/bank | Update bank NGO info
*NgoApi* | [**updateNgoLegal**](docs/NgoApi.md#updatengolegal) | **PUT** /rest/platform/ngo/legal | Update legal NGO info
*NgoApi* | [**uploadNgoFiles**](docs/NgoApi.md#uploadngofiles) | **PUT** /rest/platform/ngo/upload | Upload NGO files
*ProjectApi* | [**createProject**](docs/ProjectApi.md#createproject) | **POST** /rest/platform/project | Create a new project
*ProjectApi* | [**getProject**](docs/ProjectApi.md#getproject) | **GET** /rest/platform/project/{token} | Get a single project
*ProjectApi* | [**getProjects**](docs/ProjectApi.md#getprojects) | **GET** /rest/platform/project | Get a set of projects
*ProjectApi* | [**switchProject**](docs/ProjectApi.md#switchproject) | **PUT** /rest/platform/project/{token}/switch | Switch project status
*ProjectApi* | [**updateProject**](docs/ProjectApi.md#updateproject) | **PUT** /rest/platform/project/{token} | Update a project
*SectorApi* | [**getSector**](docs/SectorApi.md#getsector) | **GET** /rest/platform/sector/{token} | Get a single sector
*SectorApi* | [**getSectors**](docs/SectorApi.md#getsectors) | **GET** /rest/platform/sector | Get a set of sectors
*SecurityApi* | [**getJWTToken**](docs/SecurityApi.md#getjwttoken) | **GET** /security/jwt | get JWT token
*TopicApi* | [**getTopic**](docs/TopicApi.md#gettopic) | **GET** /rest/platform/topic/{token} | Get a single topic
*TopicApi* | [**getTopics**](docs/TopicApi.md#gettopics) | **GET** /rest/platform/topic | Get a set of topics
*UserApi* | [**changeUserPassword**](docs/UserApi.md#changeuserpassword) | **PUT** /rest/platform/user/{token}/changepassword | Change user's password
*UserApi* | [**confirmUser**](docs/UserApi.md#confirmuser) | **POST** /rest/platform/user/{token} | Activate a user
*UserApi* | [**getUser**](docs/UserApi.md#getuser) | **GET** /rest/platform/user/{token} | Get a single user
*UserApi* | [**getUsers**](docs/UserApi.md#getusers) | **GET** /rest/platform/user | Get a set of users
*UserApi* | [**inviteUser**](docs/UserApi.md#inviteuser) | **POST** /rest/platform/user/invite | Invite a new user
*UserApi* | [**resetUserPassword**](docs/UserApi.md#resetuserpassword) | **PUT** /rest/platform/user/resetpassword | Reset user's password
*UserApi* | [**switchUser**](docs/UserApi.md#switchuser) | **PUT** /rest/platform/user/{token}/switch | Switch user's status
*UserApi* | [**updateUser**](docs/UserApi.md#updateuser) | **PUT** /rest/platform/user/{token} | Update user data
*UserApi* | [**updateUserExt**](docs/UserApi.md#updateuserext) | **PUT** /rest/platform/user/{token}/ext | Update sensitive user data
*UtilsApi* | [**getCountries**](docs/UtilsApi.md#getcountries) | **GET** /rest/platform/utils/country | Get countries
*UtilsApi* | [**getCurrencies**](docs/UtilsApi.md#getcurrencies) | **GET** /rest/platform/utils/currency | Get currencies
*UtilsApi* | [**getLanguages**](docs/UtilsApi.md#getlanguages) | **GET** /rest/platform/utils/language | Get languages
*UtilsApi* | [**getRoles**](docs/UtilsApi.md#getroles) | **GET** /rest/platform/utils/roles | Get roles
*UtilsApi* | [**getZones**](docs/UtilsApi.md#getzones) | **GET** /rest/platform/utils/zone | Get zones
*VoucherApi* | [**downloadVoucherQr**](docs/VoucherApi.md#downloadvoucherqr) | **GET** /rest/platform/voucher/{token}/qr | Download the voucher QR image
*VoucherApi* | [**downloadVouchersFile**](docs/VoucherApi.md#downloadvouchersfile) | **GET** /rest/platform/voucher/campaign/{campaignToken}/file | Download a set of voucher's links file
*VoucherApi* | [**downloadVouchersQr**](docs/VoucherApi.md#downloadvouchersqr) | **GET** /rest/platform/voucher/campaign/{campaignToken}/qr | Download a set of voucher QR images
*VoucherApi* | [**getVoucher**](docs/VoucherApi.md#getvoucher) | **GET** /rest/platform/voucher/{token} | Get a single voucher
*VoucherApi* | [**getVouchers**](docs/VoucherApi.md#getvouchers) | **GET** /rest/platform/voucher/campaign/{campaignToken} | Get a set of vouchers


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.brand4impact.client.models.ApiSort](docs/ApiSort.md)
 - [com.brand4impact.client.models.Pagination](docs/Pagination.md)
 - [com.brand4impact.client.models.PlatformAsset](docs/PlatformAsset.md)
 - [com.brand4impact.client.models.PlatformAssetItem](docs/PlatformAssetItem.md)
 - [com.brand4impact.client.models.PlatformAssetItemWrapper](docs/PlatformAssetItemWrapper.md)
 - [com.brand4impact.client.models.PlatformCampaign](docs/PlatformCampaign.md)
 - [com.brand4impact.client.models.PlatformCampaignItem](docs/PlatformCampaignItem.md)
 - [com.brand4impact.client.models.PlatformCampaignItemWrapper](docs/PlatformCampaignItemWrapper.md)
 - [com.brand4impact.client.models.PlatformCompany](docs/PlatformCompany.md)
 - [com.brand4impact.client.models.PlatformCompanyAddress](docs/PlatformCompanyAddress.md)
 - [com.brand4impact.client.models.PlatformCompanyLegal](docs/PlatformCompanyLegal.md)
 - [com.brand4impact.client.models.PlatformCompanyLegalAddress](docs/PlatformCompanyLegalAddress.md)
 - [com.brand4impact.client.models.PlatformCountry](docs/PlatformCountry.md)
 - [com.brand4impact.client.models.PlatformCurrency](docs/PlatformCurrency.md)
 - [com.brand4impact.client.models.PlatformInvoice](docs/PlatformInvoice.md)
 - [com.brand4impact.client.models.PlatformInvoiceEntry](docs/PlatformInvoiceEntry.md)
 - [com.brand4impact.client.models.PlatformInvoiceEntryBase](docs/PlatformInvoiceEntryBase.md)
 - [com.brand4impact.client.models.PlatformInvoiceItem](docs/PlatformInvoiceItem.md)
 - [com.brand4impact.client.models.PlatformInvoiceItemWrapper](docs/PlatformInvoiceItemWrapper.md)
 - [com.brand4impact.client.models.PlatformLanguage](docs/PlatformLanguage.md)
 - [com.brand4impact.client.models.PlatformNgo](docs/PlatformNgo.md)
 - [com.brand4impact.client.models.PlatformNgoAddress](docs/PlatformNgoAddress.md)
 - [com.brand4impact.client.models.PlatformNgoLegal](docs/PlatformNgoLegal.md)
 - [com.brand4impact.client.models.PlatformNgoLegalAddress](docs/PlatformNgoLegalAddress.md)
 - [com.brand4impact.client.models.PlatformProject](docs/PlatformProject.md)
 - [com.brand4impact.client.models.PlatformProjectItem](docs/PlatformProjectItem.md)
 - [com.brand4impact.client.models.PlatformProjectItemWrapper](docs/PlatformProjectItemWrapper.md)
 - [com.brand4impact.client.models.PlatformRole](docs/PlatformRole.md)
 - [com.brand4impact.client.models.PlatformSector](docs/PlatformSector.md)
 - [com.brand4impact.client.models.PlatformSectorItem](docs/PlatformSectorItem.md)
 - [com.brand4impact.client.models.PlatformSectorItemWrapper](docs/PlatformSectorItemWrapper.md)
 - [com.brand4impact.client.models.PlatformTopic](docs/PlatformTopic.md)
 - [com.brand4impact.client.models.PlatformTopicItem](docs/PlatformTopicItem.md)
 - [com.brand4impact.client.models.PlatformTopicItemWrapper](docs/PlatformTopicItemWrapper.md)
 - [com.brand4impact.client.models.PlatformUser](docs/PlatformUser.md)
 - [com.brand4impact.client.models.PlatformUserItem](docs/PlatformUserItem.md)
 - [com.brand4impact.client.models.PlatformUserItemWrapper](docs/PlatformUserItemWrapper.md)
 - [com.brand4impact.client.models.PlatformVoucher](docs/PlatformVoucher.md)
 - [com.brand4impact.client.models.PlatformVoucherItem](docs/PlatformVoucherItem.md)
 - [com.brand4impact.client.models.PlatformVoucherItemWrapper](docs/PlatformVoucherItemWrapper.md)
 - [com.brand4impact.client.models.PlatformZone](docs/PlatformZone.md)
 - [com.brand4impact.client.models.RestError](docs/RestError.md)
 - [com.brand4impact.client.models.SecurityUser](docs/SecurityUser.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="BasicAuthentication"></a>
### BasicAuthentication

- **Type**: HTTP basic authentication

<a name="BearerAuthentication"></a>
### BearerAuthentication

- **Type**: HTTP basic authentication

