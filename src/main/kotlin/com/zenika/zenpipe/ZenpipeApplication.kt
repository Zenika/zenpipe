package com.zenika.zenpipe

import com.zenika.zenpipe.interfaceadapters.controllers.webhook.CustomFieldsKeyChecker
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import java.lang.RuntimeException

@SpringBootApplication
@EnableConfigServer
open class ZenpipeApplication


fun main(args: Array<String>) {

	val context = runApplication<ZenpipeApplication>(*args)
	val customFieldsKeyChecker = context.beanFactory.getBean(CustomFieldsKeyChecker::class.java)
	if(customFieldsKeyChecker.isKeyInvalid()) {
		context.close()
		throw RuntimeException("invalid data used in *application.yml")
	}


}
