package com.zenika.zenpipe

import com.zenika.zenpipe.entities.Deal
import com.zenika.zenpipe.entities.DealId
import com.zenika.zenpipe.entities.Deals

class DealsImpl constructor(val deal : Deal? = null) : Deals {
    override fun findById(dealId: DealId): Deal {
        return deal!!
    }
}