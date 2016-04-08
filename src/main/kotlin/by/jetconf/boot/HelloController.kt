package by.jetconf.boot

import org.springframework.web.bind.annotation.*

@RestController
class HelloController {

    @RequestMapping("/hello")
    fun sayHello(): String {
        return "Hello JetConf"
    }
}