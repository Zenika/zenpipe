package com.zenika.zenpipe.interfaceadapters.controllers.webhook

import com.zenika.zenpipe.decoder.DealDecoderConfig
import com.zenika.zenpipe.decoder.OrganizationDecoderConfig
import com.zenika.zenpipe.interfaceadapters.gateways.DealRepositoryImpl
import com.zenika.zenpipe.interfaceadapters.gateways.OrganizationRepositoryImpl
import com.zenika.zenpipe.usecase.UpdateDealUseCase
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
open class AppConfig {

    @Bean
    open fun dealDecoderConfig(
        @Value("\${accountmanager.deal.key}") customFieldAccountManagerKey: String,
        @Value("\${commercialtrainig.deal.key}") customFieldACommercialTrainingKey: String,
        @Value("\${portfolio.deal.key}") customFieldPortfolioKey: String
    ): DealDecoderConfig {
        return DealDecoderConfig(
            customFieldAccountManagerKey,
            customFieldACommercialTrainingKey,
            customFieldPortfolioKey
        )
    }

    @Bean
    open fun orgDecoderConfig(

        @Value("\${accountmanager.org.key}") customFieldAccountManagerKey: String,
        @Value("\${commercialtrainig.org.key}") customFieldACommercialTrainingKey: String,
        @Value("\${portfolio.org.key}") customFieldPortfolioKey: String
    ): OrganizationDecoderConfig {
        return OrganizationDecoderConfig(
            customFieldAccountManagerKey,
            customFieldACommercialTrainingKey,
            customFieldPortfolioKey
        )
    }

    @Bean
    open fun dealRepository(dealDecoderConfig: DealDecoderConfig): DealRepositoryImpl {
        return DealRepositoryImpl(dealDecoderConfig)
    }

    @Bean
    open fun orgRepository(orgDecoderConfig: OrganizationDecoderConfig): OrganizationRepositoryImpl {
        return OrganizationRepositoryImpl(orgDecoderConfig)
    }

    @Bean
    open fun usecaseUpadteDeal(
        dealRepository: DealRepositoryImpl,
        orgRepository: OrganizationRepositoryImpl,
        dealDecoderConfig: DealDecoderConfig
    ): UpdateDealUseCase {
        return UpdateDealUseCase(dealRepository, orgRepository, dealDecoderConfig)
    }

}