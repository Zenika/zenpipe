package com.zenika.zenpipe

import com.zenika.zenpipe.decoder.DealDecoderConfig
import com.zenika.zenpipe.entities.*
import com.zenika.zenpipe.usecase.UpdateDealUseCase
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class UpdateDealUseCaseTest {

    private val customFieldAccountManger = CustomField(0, "AM", "AM key")
    private val customFieldACommercialTraining = CustomField(0, "CT", "CT key")
    private val customFieldPortfolio = CustomField(0, "PF", "PF key")

    private val decoderConfig =   DealDecoderConfig(customFieldAccountManger,
        customFieldACommercialTraining, customFieldPortfolio )

    private val dealPortfolio = Portfolio(decoderConfig.customFieldPortfolio.key, 1, mapOf())
    private val dealCommercialTraining = CommercialTraining(decoderConfig.customFieldCommercialTraining.key, 2, mapOf())
    private val dealAccountManagerTraining = AccountManagerTraining(decoderConfig.customFieldAccountManger.key, 3, mapOf())

    private val orgPortfolio = Portfolio("", 11, mapOf())
    private val orgCommercialTraining = CommercialTraining("", 22, mapOf())
    private val orgAccountManagerTraining = AccountManagerTraining("", 33, mapOf())

    @Test
    fun givenDealAndDealUpdatedEvent_WhenUpdateEventWithoutOrganization_ThenDoNothing() {

        // given
        val current = Deal(DealId(1))
        val expected = Deal(DealId(1))
        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current, decoderConfig), organizations = OrganizationsImpl(),
            decoderConfig)

        //when
        val actual: Deal = updateDealUseCase.updateDealProperties(DealId(1))

        //then
        Assertions.assertEquals(expected, actual)

    }


    @Test
    fun givenDealAndDealUpdatedEvent_WhenUpdateEventWithOrganizationAndPortfolioIsPresent_ThenDoNotUpDatePortfolio() {

        //given

        val organizations = OrganizationsImpl()
        val organization = organizations.findById(OrganizationId(123))
        val expectPortfolio = organization.portfolio?.copy(key = dealPortfolio.key)
        val current = Deal(DealId(1), organization.id, expectPortfolio, PipelineId(1))
        val expected = Deal(DealId(1), organization.id, expectPortfolio, PipelineId(1))
        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current, decoderConfig), organizations = OrganizationsImpl(),
            decoderConfig)


        //when
        val actual: Deal = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)

    }


    @Test
    fun givenDealAndDealUpdatedEvent_WhenUpdateEventWithOrganizationAndPortfolioIsMissing_ThenUpDatePortfolio() {
        //given
        val organization = Organization(OrganizationId(123))
        val current = Deal(DealId(1), organization.id)
        val expected = Deal(DealId(1), organization.id, orgPortfolio.copy(key = decoderConfig.customFieldPortfolio.key))
        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current, decoderConfig), organizations = OrganizationsImpl(),
            decoderConfig)

        //when
        val actual: Deal = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)

    }

    @Test
    fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualOne_ThenDoNothing() {
        //given
        val current = Deal(DealId(1), OrganizationId(123), null, PipelineId(1))
        val expected = Deal(DealId(1), OrganizationId(123), orgPortfolio.copy(key = decoderConfig.customFieldPortfolio.key),
            PipelineId(1))
        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current, decoderConfig), organizations = OrganizationsImpl(),
            decoderConfig)

        //when
        val actual: Deal = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndCommercialTrainingIsPresent_ThenDoNothing() {
        //given
        val current =
            Deal(DealId(1), OrganizationId(123), orgPortfolio, PipelineId(2), orgCommercialTraining, orgAccountManagerTraining)
        val expected =
            Deal(DealId(1), OrganizationId(123), orgPortfolio, PipelineId(2), orgCommercialTraining, orgAccountManagerTraining)
        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current, decoderConfig), organizations = OrganizationsImpl(),
            decoderConfig)

        //when
        val actual: Deal = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)
    }


    @Test
    fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndCommercialTrainingIsMissing_ThenUpdateDeal() {
        //given
        val current = Deal(DealId(1), OrganizationId(123), orgPortfolio, PipelineId(2), null, orgAccountManagerTraining)
        val expected = Deal(
            DealId(1), OrganizationId(123), orgPortfolio,
            PipelineId(2),
            orgCommercialTraining.copy(key = decoderConfig.customFieldCommercialTraining.key),
            orgAccountManagerTraining
        )
        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current, decoderConfig), organizations = OrganizationsImpl(),
            decoderConfig)

        //when
        val actual: Deal = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndAccountManagerTrainingIsPresent_ThenDoNothing() {

        //given
        val current = Deal(
            DealId(1), OrganizationId(123), orgPortfolio, PipelineId(2),
            orgCommercialTraining, dealAccountManagerTraining
        )
        val expected = Deal(
            DealId(1), OrganizationId(123), orgPortfolio, PipelineId(2),
            orgCommercialTraining,
            dealAccountManagerTraining
        )

        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current, decoderConfig), organizations = OrganizationsImpl(),
            decoderConfig)

        //when
        val actual: Deal = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)
    }


    @Test
    fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndAccountManagerTrainingIsMissing_ThenUpdateDeal() {
        //given
        val current = Deal(
            DealId(1), OrganizationId(123), dealPortfolio, PipelineId(2),
            dealCommercialTraining, null
        )
        val expected = Deal(
            DealId(1), OrganizationId(123), dealPortfolio, PipelineId(2), dealCommercialTraining,
            orgAccountManagerTraining.copy(key = decoderConfig.customFieldAccountManger.key)
        )

        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current, decoderConfig), organizations = OrganizationsImpl(),
            decoderConfig)

        //when
        val actual: Deal = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)
    }

}
