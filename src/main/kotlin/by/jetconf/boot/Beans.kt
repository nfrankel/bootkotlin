package by.jetconf.boot

import org.springframework.context.support.*

fun beans() = beans {
    bean {
        WelcomeController(WelcomeService(ref()))
    }
}