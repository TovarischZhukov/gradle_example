plugins {
    id 'java'
    kotlin("jvm") version "1.4.31"
    `kotlin-dsl`
    application
}

group 'org.example'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
    gradlePluginPortal()
    maven {
        url = uri("https://maven.restlet.com")
    }
}

dependencies {
    compileOnly(group = "org.projectlombok", name = "lombok", version = "1.18.4")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
}