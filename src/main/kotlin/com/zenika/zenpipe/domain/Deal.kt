package com.zenika.zenpipe.domain

data class Deal(val organizationId: OrganizationId? = null, var portfolio: Portfolio? = null,
                val pipelineId: PipelineId? = null, val commercialTraining: CommercialTraining? = null,
                val accountManagerTraining: AccountManagerTraining? = null)

