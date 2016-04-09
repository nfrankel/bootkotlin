package by.jetconf.boot.auto

import org.springframework.web.bind.annotation.*

@RestController
class HelloController {

    @RequestMapping("/hello")
    fun sayHello() = "Hello JetConf"
}

@RestController
class GreetingController {

    @RequestMapping("/greet/{who}")
    fun greet(@PathVariable who:String) = "Hello ${who}"
}