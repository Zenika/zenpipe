plugins {
    id("java")
    id("org.openapi.generator") version "6.2.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    implementation("io.springfox:springfox-boot-starter:3.0.0")
    implementation("javax.validation:validation-api:2.0.1.Final")
    implementation("javax.annotation:javax.annotation-api:1.3.2")

    implementation(platform("io.github.openfeign:feign-bom:12.1"))
    implementation("io.github.openfeign:feign-okhttp")
    implementation("io.github.openfeign:feign-jackson")
    implementation("io.github.openfeign:feign-slf4j")
    implementation("io.github.openfeign.form:feign-form:3.8.0")

    // define a BOM and its version
    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.10.0"))
    // define any required OkHttp artifacts without version
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")

    implementation("org.openapitools:jackson-databind-nullable:0.2.4")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.1")

    implementation("com.github.scribejava:scribejava-core:8.3.3")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.register<Delete>("cleanSource") {
    delete("$projectDir/src/main/java")
}

tasks.register<Delete>("generateSource") {
    delete("$buildDir/generated")
    dependsOn("copySource")
}

tasks.register<Copy>("copySource") {
    from(layout.buildDirectory.dir("generated/src/main/java"))
    into(layout.projectDirectory.dir("src/main/java"))
    dependsOn("cleanSource")
}

openApiGenerate {
    generatorName.set("java")
    library.set("feign")
    inputSpec.set("$projectDir/src/main/resources/openapi.yml")
    outputDir.set("$buildDir/generated")
    apiPackage.set("com.zenika.pipedrive.api")
    modelPackage.set("com.zenika.pipedrive.model")
    invokerPackage.set("com.zenika.pipedrive.invoker")
}

//sourceSets {
//    main {
//        java.srcDir("$buildDir/generated/src/main/java")
//    }
//}