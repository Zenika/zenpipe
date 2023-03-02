package com.zenika.zenpipe.entities

data class Organization(val id: OrganizationId? = null, val portfolio: Portfolio? = null,
                        val commercialTraining: CommercialTraining? = null,
                        val accountManagerTraining: AccountManagerTraining? = null)
