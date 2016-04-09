package by.jetconf.boot

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

@RestController
class WelcomeController {

    @RequestMapping("/welcome/{who}")
    fun welcome(@PathVariable who: String) = Welcome(who)
}

class Welcome(val who: String, val what: String = "Welcome")