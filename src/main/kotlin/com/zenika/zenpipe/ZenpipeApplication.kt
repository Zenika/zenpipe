package com.zenika.zenpipe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ZenpipeApplication

fun main(args: Array<String>) {
	runApplication<ZenpipeApplication>(*args)
}
