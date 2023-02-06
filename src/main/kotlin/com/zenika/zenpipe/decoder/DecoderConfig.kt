package com.zenika.zenpipe.decoder

interface DecoderConfig {
    fun createConfig() : Map<String, SetCustomFields>
}