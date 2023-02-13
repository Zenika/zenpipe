package com.zenika.zenpipe

import com.zenika.zenpipe.interfaceadapters.controllers.webhook.CustomFieldsKeyChecker
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
open class ZenpipeApplication


fun main(args: Array<String>) {

	val context = runApplication<ZenpipeApplication>(*args)
	val customFieldsKeyChecker = context.beanFactory.getBean(CustomFieldsKeyChecker::class.java)
	if(customFieldsKeyChecker.isKeyUnvalid()) context.close()


}
