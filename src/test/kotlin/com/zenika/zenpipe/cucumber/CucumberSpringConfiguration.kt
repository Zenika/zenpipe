package com.zenika.zenpipe.cucumber

import com.zenika.zenpipe.ZenpipeApplication
import io.cucumber.spring.CucumberContextConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.ActiveProfiles

@CucumberContextConfiguration
@SpringBootTest(
    classes = [ZenpipeApplication::class], webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    properties = [
        "spring.config.location=classpath:application-integration.yml",
        "spring.cloud.config.server.bootstrap=true"
    ]
)
@DirtiesContext
@ActiveProfiles("native")
class CucumberSpringConfiguration {
}