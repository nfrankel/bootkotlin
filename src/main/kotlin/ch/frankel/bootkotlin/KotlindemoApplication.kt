package ch.frankel.bootkotlin

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.beans
import org.springframework.data.hazelcast.repository.config.EnableHazelcastRepositories

@SpringBootApplication
@EnableHazelcastRepositories
class KotlindemoApplication

private fun beans() = beans {
    bean<WelcomeService>()
    bean {
        CommandLineRunner {
            ref<WelcomeRepository>().saveAll(
                listOf(
                    Welcome("Joe", "Hello"),
                    Welcome("Jack", "Greet"),
                    Welcome("William", "Welcome"),
                    Welcome("Averell", "Hi")
                )
            )
        }
    }
}

fun main(args: Array<String>) {
    runApplication<KotlindemoApplication>(*args) {
        addInitializers(beans())
    }
}
