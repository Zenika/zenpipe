package com.zenika.zenpipe.entities

interface Organizations {
    fun findById(orgId: OrganizationId): Organization
}