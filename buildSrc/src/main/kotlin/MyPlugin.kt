import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.create

class MyPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        println("My plugin apply")

        project.tasks.create<DefaultTask>("MyPluginTask") {
            doFirst {
                println("My plugin run task")
            }
        }
    }
}