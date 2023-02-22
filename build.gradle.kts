
plugins {
    kotlin("jvm") version "1.8.0" // Kotlin version to use
    id("org.springframework.boot") version "3.0.2"
    application // Application plugin. Also see 1️⃣ below the code
}

apply(plugin = "io.spring.dependency-management")

group = "org.example" // A company name, for example, `org.jetbrains`
version = "1.0-SNAPSHOT" // Version to assign to the built artifact

repositories { // Sources of dependencies. See 2️⃣
    mavenCentral() // Maven Central Repository. See 3️⃣
}

dependencies { // All the libraries you want to use. See 4️⃣
    // Copy dependencies' names after you find them in a repository
    implementation(project("pipedrive-api"))


    implementation(platform("io.github.openfeign:feign-bom:12.1"))
    implementation("io.github.openfeign:feign-core")

    implementation("io.github.openfeign:feign-jackson:9.3.1")
    implementation("org.openapitools:jackson-databind-nullable:0.2.4")


    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-config-server:4.0.1")
    implementation("org.springframework.cloud:spring-cloud-starter-config:4.0.1")
    implementation("org.springframework.cloud:spring-cloud-starter-bootstrap:4.0.1")

    testImplementation(kotlin("test")) // The Kotlin test library
}

kotlin { // Extension to make an easy setup
    jvmToolchain(17) // Target version of generated JVM bytecode. See 7️⃣
}

tasks.jar {
    enabled = true
    // Remove `plain` postfix from jar file name
    archiveClassifier.set("")
}

// tout les fichier qui termine par integrationtest, ne dois pas etre mancer via la cmd gradle test


sourceSets {
    create("integrationTest") {
        kotlin.srcDir("src/test/kotlin")
        resources.srcDir("src/test/resources")
        compileClasspath += sourceSets["main"].output + configurations["testRuntimeClasspath"]
        runtimeClasspath += output + compileClasspath + sourceSets["test"].runtimeClasspath
    }
}

task<Test>("integrationTest") {
    description = "Runs the integration tests"
    group = "verification"
    testClassesDirs = sourceSets["integrationTest"].output.classesDirs
    classpath = sourceSets["integrationTest"].runtimeClasspath
    useJUnitPlatform()
    filter {
        includeTestsMatching("*IntegrationTest")
    }
}


tasks.test { // See 5️⃣
    useJUnitPlatform() // JUnitPlatform for tests. See 6️⃣
    filter {
        excludeTestsMatching("*IntegrationTest")
    }
}
