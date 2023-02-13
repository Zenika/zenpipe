package com.zenika.zenpipe.interfaceadapters.controllers.webhook

import com.zenika.pipedrive.api.DealsApi
import com.zenika.pipedrive.api.OrganizationsApi
import com.zenika.pipedrive.invoker.ApiClient
import com.zenika.zenpipe.decoder.CustomFieldsDecoder
import com.zenika.zenpipe.decoder.DealDecoderConfig
import com.zenika.zenpipe.decoder.OrganizationDecoderConfig
import com.zenika.zenpipe.interfaceadapters.gateways.DealRepositoryImpl
import com.zenika.zenpipe.interfaceadapters.gateways.OrganizationRepositoryImpl
import com.zenika.zenpipe.usecase.UpdateDealUseCase
import feign.Logger
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
open class AppConfig {

    @Bean
    open fun dealDecoderConfig(
        @Value("\${key.deal.account-manager}") customFieldAccountManagerKey: String,
        @Value("\${key.deal.commercial-training}") customFieldACommercialTrainingKey: String,
        @Value("\${key.deal.portfolio}") customFieldPortfolioKey: String
    ): DealDecoderConfig {
        return DealDecoderConfig(
            customFieldAccountManagerKey,
            customFieldACommercialTrainingKey,
            customFieldPortfolioKey
        )
    }

    @Bean
    open fun orgDecoderConfig(
        @Value("\${key.org.account-manager}") customFieldAccountManagerKey: String,
        @Value("\${key.org.commercial-training}") customFieldACommercialTrainingKey: String,
        @Value("\${key.org.portfolio}") customFieldPortfolioKey: String
    ): OrganizationDecoderConfig {
        return OrganizationDecoderConfig(
            customFieldAccountManagerKey,
            customFieldACommercialTrainingKey,
            customFieldPortfolioKey
        )
    }

    @Bean
    open fun orgRepository(
        orgDecoderConfig: OrganizationDecoderConfig,
        organizationsApi: OrganizationsApi
    ): OrganizationRepositoryImpl {
        return OrganizationRepositoryImpl(orgDecoderConfig, organizationsApi)
    }

    @Bean
    open fun useCaseUpdateDeal(
        dealRepository: DealRepositoryImpl,
        orgRepository: OrganizationRepositoryImpl,
        dealDecoderConfig: DealDecoderConfig
    ): UpdateDealUseCase {
        return UpdateDealUseCase(dealRepository, orgRepository, dealDecoderConfig)
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
    open fun dealRepository(dealDecoderConfig: DealDecoderConfig, dealsApi: DealsApi): DealRepositoryImpl {
        return DealRepositoryImpl(dealDecoderConfig, dealsApi)
    }

}