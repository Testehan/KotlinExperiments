import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.1.10"
    id("io.spring.dependency-management") version "1.1.4"
    kotlin("jvm") version "1.8.22"
    kotlin("plugin.spring") version "1.8.22"
}

group = "com.testehan"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    runtimeOnly("com.h2database:h2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation(kotlin("stdlib-jdk8"))

    implementation("com.github.javafaker:javafaker:1.0.2")
}

tasks.withType<KotlinCompile> {		// Settings for `KotlinCompile` tasks
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"		// `-Xjsr305=strict` enables the strict mode for JSR-305 annotations
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.bootBuildImage {
    builder.set("paketobuildpacks/builder-jammy-base:latest")
}
kotlin {
    jvmToolchain(17)
}