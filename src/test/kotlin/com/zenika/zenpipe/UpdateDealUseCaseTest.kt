package com.zenika.zenpipe

import com.zenika.zenpipe.domain.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class UpdateDealUseCaseTest {

  val updateDealUseCase : UpdateDealUseCase = UpdateDealUseCase()

  @Test
  fun givenDealAndDealUpdatedEvent_WhenUpdateEventWithoutOrganization_ThenDoNothing(){
    // given
    val current: Deal = Deal()
    val dealUpdatedEvent : DealUpdatedEvent = DealUpdatedEvent(current)
    val expected: Deal = Deal()

    //when
    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent)

    //then
    Assertions.assertEquals(expected, actual)

  }

  @Test
  fun givenDealAndDealUpdatedEvent_WhenUpdateEventWithOrganizationAndPortfolioIsPresent_ThenDoNotUpDatePortfolio(){
    //given
    val organization: Organization = Organization(OrganizationId("123"))
    val current: Deal = Deal(organization.id, Portfolio("toto"))
    val dealUpdatedEvent : DealUpdatedEvent = DealUpdatedEvent(current)
    val expected: Deal = Deal(organization.id, Portfolio("toto"))

    //when

    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent)

    //then
    Assertions.assertEquals(expected, actual)

  }

  @Test
  fun givenDealAndDealUpdatedEvent_WhenUpdateEventWithOrganizationAndPortfolioIsMissing_ThenUpDatePortfolio(){
    //given
    val organization: Organization = Organization(OrganizationId("123"))
    val current: Deal = Deal(organization.id)
    val dealUpdatedEvent : DealUpdatedEvent = DealUpdatedEvent(current)
    val expected: Deal = Deal(organization.id, Portfolio("toto"))

    //when
    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent)

    //then
    Assertions.assertEquals(expected, actual)

  }

  @Test
  fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualOne_ThenDoNothing(){
    //given
    val organization: Organization = Organization(OrganizationId("123"))
    val current: Deal = Deal(organization.id,null, PipelineId("1"))
    val dealUpdatedEvent : DealUpdatedEvent = DealUpdatedEvent(current)
    val expected: Deal = Deal(organization.id, null, PipelineId("1"))

    //when
    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent)

    //then
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndCommercialTrainingIsPresent_ThenDoNothing(){
    //given
    val organization: Organization = Organization(OrganizationId("123"))
    val current: Deal = Deal(organization.id,null, PipelineId("2"), CommercialTraining("toto"))
    val dealUpdatedEvent : DealUpdatedEvent = DealUpdatedEvent(current)
    val expected: Deal = Deal(organization.id, null, PipelineId("2"), CommercialTraining("toto"))

    //when
    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent)

    //then
    Assertions.assertEquals(expected, actual)
  }

  @Test
  fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndCommercialTrainingIsMissing_ThenUpdateDeal(){
    //given
    val organization: Organization = Organization(OrganizationId("123"))
    val current: Deal = Deal(organization.id,null, PipelineId("2"))
    val dealUpdatedEvent : DealUpdatedEvent = DealUpdatedEvent(current)
    val expected: Deal = Deal(organization.id, null, PipelineId("2"), CommercialTraining("titi"))

    //when
    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent)

    //then
    Assertions.assertEquals(expected, actual)
  }
/*
 @Test
  fun givenDealAndDealUpdateEvent_WhenUpdateEventWithOrganizationAndPipeLineIdEqualTwoAndAccountManagerTrainingIsPresent_ThenDoNothing(){
    //given
    val organization: Organization = Organization(OrganizationId("123"))
    val current: Deal = Deal(organization.id,null, PipelineId("2"),
            null, AccountManagerTraining("account manager"))
    val dealUpdatedEvent : DealUpdatedEvent = DealUpdatedEvent(current)
    val expected: Deal = Deal(organization.id, null, PipelineId("2"),
            CommercialTraining("titi get from org"), AccountManagerTraining("account manager"))

    //when
    val actual : Deal? = updateDealUseCase.updateDealProperties(dealUpdatedEvent)

    //then
    Assertions.assertEquals(expected, actual)
  }
 */

//TODO :
  /*
  est ce que on peut avoir un tableau de pipeline vide
  ou il faut chercher le pipeline_id dans le stage ou dans le pipeline
   */


}