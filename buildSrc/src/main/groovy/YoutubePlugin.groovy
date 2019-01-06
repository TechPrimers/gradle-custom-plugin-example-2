import org.apache.commons.io.FileUtils
import org.gradle.api.Plugin
import org.gradle.api.Project

class YoutubePlugin implements Plugin<Project> {

    @Override
    void apply(Project target) {

        def extension = target.extensions.create("youtube", YoutubeTaskExtension)
        def task = target.task('youtubeTask', type: YoutubeTask)
        task.doFirst {
            message = extension.message
            greeting = extension.greeting
        }

        println "Size of plugin file: " + FileUtils.sizeOf(new File("/Users/apple/Downloads/gradle-custom-plugin/buildSrc/src/main/groovy/YoutubePlugin.groovy"))

    }
}
