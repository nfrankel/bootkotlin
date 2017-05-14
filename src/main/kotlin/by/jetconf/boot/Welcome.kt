package by.jetconf.boot

import by.jetconf.boot.auto.Welcome
import by.jetconf.boot.auto.WelcomeRepository
import org.springframework.web.bind.annotation.*

@RestController
class WelcomeController(private val service: WelcomeService) {

    @RequestMapping("/welcome")
    fun welcome() = service.getAll()

    @RequestMapping("/welcome/{who}")
    fun welcome(@PathVariable who: String) = service.get(who)
}

class WelcomeService(private val repository: WelcomeRepository) {
    fun getAll() = repository.findAll().mapIndexed{ index, welcome -> EnhancedWelcome(welcome, index + 1) }.sortedBy { it.who }

    fun get(who: String) = repository.findByWho(who)
}

class EnhancedWelcome(private val welcome: Welcome, val index: Int) {
    val who = welcome.who
    val what = welcome.what
}