import org.gradle.api.Plugin
import org.gradle.api.Project

class SamplePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        println("SAMPLE")
    }
}