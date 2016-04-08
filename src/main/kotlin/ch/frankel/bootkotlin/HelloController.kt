package ch.frankel.bootkotlin

import org.springframework.web.bind.annotation.*

@RestController
class HelloController {

    @RequestMapping("/hello")
    fun sayHello(): String {
        return "Hello World"
    }
}
