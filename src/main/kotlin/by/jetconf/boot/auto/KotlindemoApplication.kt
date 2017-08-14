package by.jetconf.boot.auto

import by.jetconf.boot.beans
import org.springframework.beans.factory.annotation.*
import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.context.support.*

@SpringBootApplication
class KotlindemoApplication

fun main(args: Array<String>) {
    runApplication<KotlindemoApplication>(*args) {
        addInitializers(beans())
    }
}
