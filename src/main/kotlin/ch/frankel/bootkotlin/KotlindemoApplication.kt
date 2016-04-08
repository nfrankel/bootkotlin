package ch.frankel.bootkotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.hazelcast.repository.config.EnableHazelcastRepositories

@SpringBootApplication
@EnableHazelcastRepositories
open class KotlindemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlindemoApplication::class.java, *args)
}
