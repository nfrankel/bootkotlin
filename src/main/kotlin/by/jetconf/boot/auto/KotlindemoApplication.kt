package by.jetconf.boot.auto

import by.jetconf.boot.WelcomeController
import by.jetconf.boot.WelcomeService
import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.context.annotation.*

@SpringBootApplication
class KotlindemoApplication {

    @Bean
    fun controller(repository: WelcomeRepository) = WelcomeController(WelcomeService(repository))
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlindemoApplication::class.java, *args)
}
