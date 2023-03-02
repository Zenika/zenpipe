package com.zenika.zenpipe.interfaceadapters.controllers.webhook

import com.fasterxml.jackson.annotation.JsonProperty

data class WebhookRequest(@JsonProperty("meta")val meta : Meta)