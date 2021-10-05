repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm") version "1.4.31"
    `java-gradle-plugin`
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        create("my-plugin") {
            id = "ru.mail.my-plugin"
            implementationClass = "MyPlugin"
        }
    }
}