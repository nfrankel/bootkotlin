package by.jetconf.boot

import org.springframework.web.bind.annotation.*

@RestController
class GreetingController {

    @RequestMapping("/greet/{who}")
    fun greet(@PathVariable who:String) = "Hello ${who}"
}