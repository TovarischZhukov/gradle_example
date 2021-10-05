repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm") version "1.4.31"
    `kotlin-dsl`
    application
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
        println("Hello, Gradle 3!")
    }
}

task<Copy>("copyTask") {
    from ("path1")
    into("path2")
}

tasks.register<JavaExec>("startMainClass") {
    group = "launch"
    mainClass.set( "gradle.example.Main")
    classpath = sourceSets["main"].runtimeClasspath
}