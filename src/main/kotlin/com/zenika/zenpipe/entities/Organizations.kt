package com.zenika.zenpipe.entities

import com.zenika.pipedrive.api.OrganizationsApi

interface Organizations {
    val organizationsApi : OrganizationsApi
    fun findById(orgId: OrganizationId): Organization
}