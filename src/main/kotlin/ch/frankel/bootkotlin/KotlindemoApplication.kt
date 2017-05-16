package ch.frankel.bootkotlin

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.hazelcast.repository.config.EnableHazelcastRepositories

@SpringBootApplication
@EnableHazelcastRepositories
class KotlindemoApplication {

    @Bean
    fun service(repository: WelcomeRepository) = WelcomeService(repository)

    @Bean
    fun initialize(repository: WelcomeRepository) = CommandLineRunner {
        repository.saveAll(
            listOf(
                Welcome("Joe", "Hello"),
                Welcome("Jack", "Greet"),
                Welcome("William", "Welcome"),
                Welcome("Averell", "Hi")
            )
        )
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlindemoApplication::class.java, *args)
}
