package by.jetconf.boot

import org.springframework.web.bind.annotation.*

@RestController
class WelcomeController {

    @RequestMapping("/welcome/{who}")
    fun welcome(@PathVariable who: String) = Welcome(who)
}

class Welcome(val who: String, val what: String = "Welcome")