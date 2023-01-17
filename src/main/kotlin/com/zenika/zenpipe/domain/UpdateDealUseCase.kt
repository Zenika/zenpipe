package com.zenika.zenpipe.domain


class UpdateDealUseCase(){

    fun updateDealProperties(dealUpdated: DealUpdatedEvent): Deal?{
        if(dealUpdated.current.organizationId == null){
            return Deal()
        }else{
            if(dealUpdated.current.pipelineId?.value == "1"){
                return Deal(OrganizationId("123"), null, PipelineId("1") );
            }
            if(dealUpdated.current.pipelineId?.value == "2" && dealUpdated.current.commercialTraining != null){
                return Deal(OrganizationId("123"), null, PipelineId("2"), CommercialTraining("toto") );
            }

            if(dealUpdated.current.pipelineId?.value == "2" && dealUpdated.current.commercialTraining == null){
                return Deal(OrganizationId("123"), null, PipelineId("2"), CommercialTraining("titi") );
            }
        }
        return Deal(OrganizationId("123"), Portfolio("toto"));
    }
}
