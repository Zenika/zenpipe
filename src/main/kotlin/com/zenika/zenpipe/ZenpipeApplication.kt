package com.zenika.zenpipe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
open class ZenpipeApplication

fun main(args: Array<String>) {
	runApplication<ZenpipeApplication>(*args)
}
