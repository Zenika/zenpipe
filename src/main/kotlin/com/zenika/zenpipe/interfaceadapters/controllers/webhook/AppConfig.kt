package com.zenika.zenpipe.interfaceadapters.controllers.webhook

import com.zenika.pipedrive.api.DealFieldsApi
import com.zenika.pipedrive.api.DealsApi
import com.zenika.pipedrive.api.OrganizationFieldsApi
import com.zenika.pipedrive.api.OrganizationsApi
import com.zenika.pipedrive.invoker.ApiClient
import com.zenika.zenpipe.entities.CustomField
import com.zenika.zenpipe.entities.Organizations
import com.zenika.zenpipe.interfaceadapters.gateways.api.rest.DealPipedriveRestApi
import com.zenika.zenpipe.interfaceadapters.gateways.api.rest.OrganizationPipedriveRestApi
import com.zenika.zenpipe.interfaceadapters.gateways.jackson.decoder.CustomFieldsDecoder
import com.zenika.zenpipe.interfaceadapters.gateways.jackson.decoder.DealDecoderConfig
import com.zenika.zenpipe.interfaceadapters.gateways.jackson.decoder.DealUpdateDecoderConfig
import com.zenika.zenpipe.interfaceadapters.gateways.jackson.decoder.OrganizationDecoderConfig
import com.zenika.zenpipe.usecase.UpdateDealUseCase
import feign.Logger
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
open class AppConfig {

    @Bean
    open fun dealDecoderConfig(
        dealCustomFieldAccountManger: CustomField,
        dealCustomFieldCommercialTraining: CustomField,
        dealCustomFieldPortfolio: CustomField
    ): DealDecoderConfig {
        return DealDecoderConfig(
            dealCustomFieldAccountManger,
            dealCustomFieldCommercialTraining,
            dealCustomFieldPortfolio
        )
    }

    @Bean
    open fun orgDecoderConfig(
        orgCustomFieldAccountManger: CustomField,
        orgCustomFieldCommercialTraining: CustomField,
        orgCustomFieldPortfolio: CustomField
    ): OrganizationDecoderConfig {
        return OrganizationDecoderConfig(
            orgCustomFieldAccountManger,
            orgCustomFieldCommercialTraining,
            orgCustomFieldPortfolio
        )
    }

    @Bean
    open fun dealUpdateDecoderConfig(
        dealCustomFieldAccountManger: CustomField,
        dealCustomFieldCommercialTraining: CustomField,
        dealCustomFieldPortfolio: CustomField
    ): DealUpdateDecoderConfig {
        return DealUpdateDecoderConfig(
            dealCustomFieldAccountManger,
            dealCustomFieldCommercialTraining,
            dealCustomFieldPortfolio
        )
    }

    @Bean
    open fun dealsApi(
        @Value("\${api-client}") apiKey: String,
        @Value("\${uri-pipedrive}") urlPipedrive: String,
        dealDecoderConfig: DealDecoderConfig
    ): DealsApi {
        return ApiClient("api_key", apiKey)
            .feignBuilder
            .decoder(
                CustomFieldsDecoder(
                    dealDecoderConfig
                )
            )
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(DealsApi::class.java, urlPipedrive)
    }

    @Bean
    open fun organizationsApi(
        @Value("\${api-client}") apiKey: String,
        @Value("\${uri-pipedrive}") urlPipedrive: String,
        orgDecoderConfig: OrganizationDecoderConfig,

        ): OrganizationsApi {
        return ApiClient("api_key", apiKey)
            .feignBuilder
            .decoder(
                CustomFieldsDecoder(orgDecoderConfig)
            )
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(OrganizationsApi::class.java, urlPipedrive)
    }

    @Bean
    open fun dealsFieldsApi(
        @Value("\${api-client}") apiKey: String,
        @Value("\${uri-pipedrive}") urlPipedrive: String
    ): DealFieldsApi {
        return ApiClient("api_key", apiKey)
            .feignBuilder
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(DealFieldsApi::class.java, urlPipedrive)
    }

    @Bean
    open fun organizationsFieldsApi(
        @Value("\${api-client}") apiKey: String,
        @Value("\${uri-pipedrive}") urlPipedrive: String
    ): OrganizationFieldsApi {
        return ApiClient("api_key", apiKey)
            .feignBuilder
            .logger(Logger.ErrorLogger())
            .logLevel(Logger.Level.FULL)
            .target(OrganizationFieldsApi::class.java, urlPipedrive)
    }
    @Bean
    open fun dealCustomFieldAccountManger(
        @Value("\${deal.account-manager.id}") accountManagerId: Int,
        dealsFieldsApi: DealFieldsApi
    ): CustomField {
        val customFieldAccountManger =
            dealsFieldsApi.getDealField(accountManagerId).data?.let { CustomField(it.id!!, it.name!!, it.key!!) }
        return customFieldAccountManger!!
    }

    @Bean
    open fun dealCustomFieldCommercialTraining(
        @Value("\${deal.commercial-training.id}") commercialTrainingId: Int,
        dealsFieldsApi: DealFieldsApi
    ): CustomField {
        val customFieldCommercialTraining =
            dealsFieldsApi.getDealField(commercialTrainingId).data?.let { CustomField(it.id!!, it.name!!, it.key!!) }
        return customFieldCommercialTraining!!
    }

    @Bean
    open fun dealCustomFieldPortfolio(
        @Value("\${deal.portfolio.id}") portfolioId: Int,
        dealsFieldsApi: DealFieldsApi
    ): CustomField {
        val customFieldPortfolio =
            dealsFieldsApi.getDealField(portfolioId).data?.let { CustomField(it.id!!, it.name!!, it.key!!) }

        return customFieldPortfolio!!
    }

    @Bean
    open fun orgCustomFieldAccountManger(
        @Value("\${org.account-manager.id}") accountManagerId: Int,
        organizationsFieldsApi: OrganizationFieldsApi
    ): CustomField {
        val customFieldAccountManger =
            organizationsFieldsApi.getOrganizationField(accountManagerId).data?.let {
                CustomField(
                    it.id!!,
                    it.name!!,
                    it.key!!
                )
            }
        return customFieldAccountManger!!
    }

    @Bean
    open fun orgCustomFieldCommercialTraining(
        @Value("\${org.commercial-training.id}") commercialTrainingId: Int,
        organizationsFieldsApi: OrganizationFieldsApi
    ): CustomField {
        val customFieldCommercialTraining =
            organizationsFieldsApi.getOrganizationField(commercialTrainingId).data?.let {
                CustomField(
                    it.id!!,
                    it.name!!,
                    it.key!!
                )
            }
        return customFieldCommercialTraining!!
    }

    @Bean
    open fun orgCustomFieldPortfolio(
        @Value("\${org.portfolio.id}") portfolioId: Int,
        organizationsFieldsApi: OrganizationFieldsApi
    ): CustomField {
        val customFieldPortfolio =
            organizationsFieldsApi.getOrganizationField(portfolioId).data?.let {
                CustomField(
                    it.id!!,
                    it.name!!,
                    it.key!!
                )
            }

        return customFieldPortfolio!!
    }



    @Bean
    open fun orgRepository(
        orgDecoderConfig: OrganizationDecoderConfig,
        organizationsApi: OrganizationsApi
    ): OrganizationPipedriveRestApi {
        return OrganizationPipedriveRestApi(orgDecoderConfig, organizationsApi)
    }

    @Bean
    open fun dealRepository(
        dealDecoderConfig: DealDecoderConfig,
        dealUpdateDecoderConfig: DealUpdateDecoderConfig,
        @Value("\${api-client}") apiKey: String,
        @Value("\${uri-pipedrive}") uriPipedrive: String, dealsApi: DealsApi,
        organizations: Organizations
    ): DealPipedriveRestApi {
        return DealPipedriveRestApi(dealDecoderConfig, dealUpdateDecoderConfig, apiKey, uriPipedrive, dealsApi, organizations)
    }

    @Bean
    open fun useCaseUpdateDeal(
        dealRepository: DealPipedriveRestApi,
        dealDecoderConfig: DealDecoderConfig): UpdateDealUseCase {
        return UpdateDealUseCase(dealRepository, dealDecoderConfig)
    }

    @Bean
    open fun customFieldsKeyChecker(
        dealCustomFieldAccountManger: CustomField,
        dealCustomFieldCommercialTraining: CustomField,
        dealCustomFieldPortfolio: CustomField,
        orgCustomFieldAccountManger: CustomField,
        orgCustomFieldCommercialTraining: CustomField,
        orgCustomFieldPortfolio: CustomField,
        @Value("\${deal.account-manager.name}") dealCustomFieldAccountMangerName: String,
        @Value("\${deal.commercial-training.name}") dealCustomFieldCommercialTrainingName: String,
        @Value("\${deal.portfolio.name}") dealCustomFieldPortfolioName: String,
        @Value("\${org.account-manager.name}") orgCustomFieldAccountMangerName: String,
        @Value("\${org.commercial-training.name}") orgCustomFieldCommercialTrainingName: String,
        @Value("\${org.portfolio.name}") orgCustomFieldPortfolioName: String
    ): CustomFieldsKeyChecker {
        return CustomFieldsKeyChecker(
            dealCustomFieldAccountManger,
            dealCustomFieldCommercialTraining,
            dealCustomFieldPortfolio,
            orgCustomFieldAccountManger,
            orgCustomFieldCommercialTraining,
            orgCustomFieldPortfolio,
            dealCustomFieldAccountMangerName,
            dealCustomFieldCommercialTrainingName,
            dealCustomFieldPortfolioName,
            orgCustomFieldAccountMangerName,
            orgCustomFieldCommercialTrainingName,
            orgCustomFieldPortfolioName
        )
    }


}