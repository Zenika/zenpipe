package com.zenika.zenpipe.interfaceadapters.gateways.jackson.decoder

interface DecoderConfig {
    fun createConfig() : Map<String, SetCustomFields>
}