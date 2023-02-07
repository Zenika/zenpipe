package com.zenika.zenpipe

import com.zenika.zenpipe.entities.*
import com.zenika.zenpipe.entities.Deals
import com.zenika.zenpipe.usecase.UpdateDealUseCase
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class UpdateDealUseCaseTest {

    private val portfolio = Portfolio("portFolio", 1, mapOf())
    private val commercialTraining = CommercialTraining("CT", 2, mapOf())
    private val accountManagerTraining = AccountManagerTraining("AM", 3, mapOf())

    @Test
    fun givenDealAndDealUpdatedEvent_WhenUpdateEventWithoutOrganization_ThenDoNothing() {

        // given
        val expected = Deal(DealId(1))
        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(expected), organizations = OrganizationsImpl())

        //when
        val actual: Deal? = updateDealUseCase.updateDealProperties(DealId(1))

        //then
        Assertions.assertEquals(expected, actual)

    }

    @Test
    fun givenDealAndDealUpdatedEvent_WhenUpdateEventWithOrganizationAndPortfolioIsPresent_ThenDoNotUpDatePortfolio() {

        //given
        val current = Deal(DealId(1), OrganizationId(123), portfolio)
        val expected = Deal(DealId(1), OrganizationId(123), portfolio)
        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current), organizations = OrganizationsImpl())


        //when
        val actual: Deal? = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)

    }


    @Test
    fun givenDealAndDealUpdatedEvent_WhenUpdateEventWithOrganizationAndPortfolioIsMissing_ThenUpDatePortfolio() {
        //given
        val organization = Organization(OrganizationId(123))
        val current = Deal(DealId(1), organization.id)
        val expected = Deal(DealId(1), organization.id, portfolio.copy(key = "portFolio2", id = 11))
        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current), organizations = OrganizationsImpl())


        //when
        val actual: Deal? = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)

    }

    @Test
    fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualOne_ThenDoNothing() {
        //given
        val current = Deal(DealId(1), OrganizationId(123), null, PipelineId(1))
        val expected = Deal(DealId(1), OrganizationId(123), portfolio.copy(key = "portFolio2", id = 11), PipelineId(1))
        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current), organizations = OrganizationsImpl())

        //when
        val actual: Deal? = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndCommercialTrainingIsPresent_ThenDoNothing() {
        //given
        val current =
            Deal(DealId(1), OrganizationId(123), portfolio, PipelineId(2), commercialTraining, accountManagerTraining)
        val expected =
            Deal(DealId(1), OrganizationId(123), portfolio, PipelineId(2), commercialTraining, accountManagerTraining)
        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current), organizations = OrganizationsImpl())

        //when
        val actual: Deal? = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)
    }


    @Test
    fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndCommercialTrainingIsMissing_ThenUpdateDeal() {
        //given
        val current = Deal(DealId(1), OrganizationId(123), portfolio, PipelineId(2), null, accountManagerTraining)
        val expected = Deal(
            DealId(1), OrganizationId(123), portfolio, PipelineId(2),
            commercialTraining.copy(key = "CT2", id = 22), accountManagerTraining
        )
        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current), organizations = OrganizationsImpl())

        //when
        val actual: Deal? = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)
    }

    @Test
    fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndAccountManagerTrainingIsPresent_ThenDoNothing() {

        //given
        val current = Deal(
            DealId(1), OrganizationId(123), portfolio, PipelineId(2),
            commercialTraining, accountManagerTraining
        )
        val expected = Deal(
            DealId(1), OrganizationId(123), portfolio, PipelineId(2),
            commercialTraining, accountManagerTraining
        )

        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current), organizations = OrganizationsImpl())

        //when
        val actual: Deal? = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)
    }


    @Test
    fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndAccountManagerTrainingIsMissing_ThenUpdateDeal() {
        //given
        val current = Deal(
            DealId(1), OrganizationId(123), portfolio, PipelineId(2),
            commercialTraining, null
        )
        val expected = Deal(
            DealId(1), OrganizationId(123), portfolio, PipelineId(2),
            commercialTraining, accountManagerTraining.copy(key = "AM2", id = 33)
        )

        val updateDealUseCase = UpdateDealUseCase(deals = DealsImpl(current), organizations = OrganizationsImpl())

        //when
        val actual: Deal? = updateDealUseCase.updateDealProperties(current.dealId)

        //then
        Assertions.assertEquals(expected, actual)
    }


}