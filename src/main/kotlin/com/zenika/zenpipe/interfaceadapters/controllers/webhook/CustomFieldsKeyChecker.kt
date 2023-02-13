package com.zenika.zenpipe.interfaceadapters.controllers.webhook

import com.zenika.zenpipe.entities.CustomField

class CustomFieldsKeyChecker(
    val dealCustomFieldAccountManger: CustomField,
    val dealCustomFieldCommercialTraining: CustomField,
    val dealCustomFieldPortfolio: CustomField,
    val orgCustomFieldAccountManger: CustomField,
    val orgCustomFieldCommercialTraining: CustomField,
    val orgCustomFieldPortfolio: CustomField,
    val dealCustomFieldAccountMangerName: String,
    val dealCustomFieldCommercialTrainingName: String,
    val dealCustomFieldPortfolioName: String,
    val orgCustomFieldAccountMangerName: String,
    val orgCustomFieldCommercialTrainingName: String,
    val orgCustomFieldPortfolioName: String
) {

    fun isKeyUnvalid(): Boolean {
        return !(dealCustomFieldAccountManger.name.equals(dealCustomFieldAccountMangerName) &&
                dealCustomFieldCommercialTraining.name.equals(dealCustomFieldCommercialTrainingName) &&
                dealCustomFieldPortfolio.name.equals(dealCustomFieldPortfolioName) &&
                orgCustomFieldAccountManger.name.equals(orgCustomFieldAccountMangerName) &&
                orgCustomFieldCommercialTraining.name.equals(orgCustomFieldCommercialTrainingName) &&
                orgCustomFieldPortfolio.name.equals(orgCustomFieldPortfolioName))
    }
}