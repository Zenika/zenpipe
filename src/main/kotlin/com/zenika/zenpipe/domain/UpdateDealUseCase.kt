package com.zenika.zenpipe.domain


class UpdateDealUseCase(){


    fun updateDealProperties(dealUpdated: DealUpdatedEvent, organization: Organization? = null): Deal?{

        var dealUpdate = Deal()

        if(dealUpdated.current.organizationId == null){
            dealUpdate = dealUpdated.current
        }else{

            if(dealUpdated.current.portfolio == null){
               dealUpdate = dealUpdated.current
                dealUpdate.portfolio = organization?.portfolio
            }else{
                dealUpdate = dealUpdated.current
            }

            if(dealUpdated.current.pipelineId?.value == "1"){
                dealUpdate = Deal(dealUpdated.current.organizationId, dealUpdated.current.portfolio, dealUpdated.current.pipelineId)
            }

            if(dealUpdated.current.pipelineId?.value == "2") {

                if(dealUpdated.current.commercialTraining != null){

                  if(dealUpdated.current.accountManagerTraining != null){
                      dealUpdate = dealUpdated.current
                  }else {
                      dealUpdate = Deal(dealUpdated.current.organizationId, null, dealUpdated.current.pipelineId,
                          dealUpdated.current.commercialTraining, dealUpdated.current.accountManagerTraining)
                  }

                }else{

                    if(dealUpdated.current.accountManagerTraining != null){
                        dealUpdate = Deal(dealUpdated.current.organizationId, null, dealUpdated.current.pipelineId,
                            organization?.commercialTraining, dealUpdated.current.accountManagerTraining )
                    } else {
                        dealUpdate = Deal(dealUpdated.current.organizationId, null, dealUpdated.current.pipelineId,
                            organization?.commercialTraining, organization?.accountManagerTraining)
                    }

                }
            }

        }

        return dealUpdate
    }
}
