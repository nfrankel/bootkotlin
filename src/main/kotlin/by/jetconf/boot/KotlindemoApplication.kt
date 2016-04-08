package by.jetconf.boot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KotlindemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlindemoApplication::class.java, *args)
}
