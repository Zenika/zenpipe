package com.zenika.zenpipe.entities

data class Deal(val dealId: DealId, val organizationId: OrganizationId? = null, var portfolio: Portfolio? = null,
                val pipelineId: PipelineId? = null, val commercialTraining: CommercialTraining? = null,
                val accountManagerTraining: AccountManagerTraining? = null)

