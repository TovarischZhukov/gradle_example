repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm") version "1.4.31"
    `kotlin-dsl`
    application
    id("ru.mail.my-plugin")  apply true
}

val myFirstTask: TaskProvider<Task> by tasks.registering {
    doFirst {
        println("Hello, Gradle!")
    }
}

val myFirstTask2: TaskProvider<Task> by tasks.registering {
    dependsOn(myFirstTask)
    doFirst {
        println("Hello, Gradle 2!")
    }
}

tasks.named("myFirstTask").configure {
    doLast {
        println("Hello, Gradle extended!")
    }
}

task<Copy>("copyTask") {
    from ("src/main/java")
    into("src/test/java")
}

task<Delete>("deleteTask") {
    delete("src/test/java/gradle")
}

tasks.register<JavaExec>("startMainClass") {
    group = "launch"

    mainClass.set( "gradle.example.Main")

    classpath = sourceSets["main"].runtimeClasspath
}