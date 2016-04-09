package by.jetconf.boot

import by.jetconf.boot.auto.WelcomeRepository
import org.springframework.web.bind.annotation.*

@RestController
class WelcomeController(private val service: WelcomeService) {

    @RequestMapping("/welcome")
    fun welcome() = service.getAll()
}

class WelcomeService(private val repository: WelcomeRepository) {
    fun getAll() = repository.findAll()
}