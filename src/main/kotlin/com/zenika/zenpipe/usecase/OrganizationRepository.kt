package com.zenika.zenpipe.usecase

import com.zenika.zenpipe.domain.Organization

interface OrganizationRepository {
    fun getOrganizationById(orgId : Int) : Organization
}

/*
commande de MAJ contient map<string,Any>  :
 */