import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class YoutubeTask extends DefaultTask {

    def greeting
    def message

    @TaskAction
    def action () {
        println greeting + " " + message
    }
}
