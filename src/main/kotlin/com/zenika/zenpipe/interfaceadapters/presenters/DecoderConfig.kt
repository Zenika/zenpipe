package com.zenika.zenpipe.interfaceadapters.presenters

interface DecoderConfig {
    fun createConfig() : Map<String, SetCustomFields>
}