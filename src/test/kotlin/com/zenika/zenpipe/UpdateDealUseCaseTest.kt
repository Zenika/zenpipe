package com.zenika.zenpipe

import com.zenika.zenpipe.domain.*
import com.zenika.zenpipe.usecase.DealRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class UpdateDealUseCaseTest : DealRepository {

  private val updateDealUseCase : UpdateDealUseCase = UpdateDealUseCase()
  private val portfolio = Portfolio("portFolio", 1, mapOf())
  private val commercialTraining = CommercialTraining("CT", 2, mapOf())
  private val accountManagerTraining = AccountManagerTraining("AM", 3, mapOf())

  @Test
  fun givenDealAndDealUpdatedEvent_WhenUpdateEventWithoutOrganization_ThenDoNothing(){
    // given
    val current = Deal()
    val dealUpdatedEvent = DealUpdatedEvent(current)
    val expected: Deal = Deal()

    //when
    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent)

    //then
    Assertions.assertEquals(expected, actual)

  }

  @Test
  fun givenDealAndDealUpdatedEvent_WhenUpdateEventWithOrganizationAndPortfolioIsPresent_ThenDoNotUpDatePortfolio(){
    //given
    val current = Deal(OrganizationId("123"), portfolio)
    val dealUpdatedEvent = DealUpdatedEvent(current)
    val expected = Deal(OrganizationId("123"), portfolio)

    //when

    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent)

    //then
    Assertions.assertEquals(expected, actual)

  }

  @Test
  fun givenDealAndDealUpdatedEvent_WhenUpdateEventWithOrganizationAndPortfolioIsMissing_ThenUpDatePortfolio(){
    //given
    val organization = Organization(OrganizationId("123"))
    val current = Deal(organization.id)
    val dealUpdatedEvent = DealUpdatedEvent(current)
    val expected = Deal(organization.id, portfolio)

    //when
    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent, organization = getOrganizationFromDeal(current))

    //then
    Assertions.assertEquals(expected, actual)

  }

  @Test
  fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualOne_ThenDoNothing(){
    //given
    val organization = Organization(OrganizationId("123"))
    val current = Deal(organization.id,null, PipelineId("1"))
    val dealUpdatedEvent = DealUpdatedEvent(current)
    val expected = Deal(organization.id, null, PipelineId("1"))

    //when
    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent)

    //then
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndCommercialTrainingIsPresent_ThenDoNothing(){
    //given
    val organization = Organization(OrganizationId("123"))
    val current = Deal(organization.id,null, PipelineId("2"),commercialTraining)
    val dealUpdatedEvent = DealUpdatedEvent(current)
    val expected = Deal(organization.id, null, PipelineId("2"), commercialTraining)

    //when
    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent, organization = getOrganizationFromDeal(current))

    //then
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndCommercialTrainingIsMissing_ThenUpdateDeal(){
    //given
    val organization = Organization(OrganizationId("123"))
    val current = Deal(organization.id,null, PipelineId("2"))
    val dealUpdatedEvent = DealUpdatedEvent(current)
    val expected = Deal(organization.id, null, PipelineId("2"), commercialTraining, accountManagerTraining)

    //when
    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent, organization = getOrganizationFromDeal(current))

    //then
    Assertions.assertEquals(expected, actual)
  }

 @Test
  fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndAccountManagerTrainingIsPresent_ThenDoNothing(){
    //given
    val organization = Organization(OrganizationId("123"))
    val current = Deal(organization.id,null, PipelineId("2"),
            null, accountManagerTraining)
    val dealUpdatedEvent = DealUpdatedEvent(current)
    val expected = Deal(organization.id, null, PipelineId("2"),
            commercialTraining, accountManagerTraining)

    //when
    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent, organization = getOrganizationFromDeal(current))

    //then
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndAccountManagerTrainingIsMissing_ThenUpdateDeal(){
    //given
    val organization = Organization(OrganizationId("123"))
    val current = Deal(organization.id,null, PipelineId("2"),
            null)
    val dealUpdatedEvent = DealUpdatedEvent(current)
    val expected = Deal(organization.id, null, PipelineId("2"),
           commercialTraining, accountManagerTraining)

    //when
    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent, organization = getOrganizationFromDeal(current))

    //then
    Assertions.assertEquals(expected, actual)
  }

  override fun getOrganizationFromDeal(deal: Deal): Organization {
    return Organization(OrganizationId("123"), portfolio, commercialTraining, accountManagerTraining)

  }

  override fun getDealById(dealId: Int): Deal {
    TODO("Not yet implemented")
  }

}