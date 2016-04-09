package ch.frankel.bootkotlin

import org.springframework.data.annotation.Id
import org.springframework.data.repository.CrudRepository
import org.springframework.web.bind.annotation.*
import java.io.Serializable

@RestController
class WelcomeController(private val service: WelcomeService) {

    @RequestMapping("/welcome")
    fun welcome() = service.getAll()

    @RequestMapping("/welcome/{who}")
    fun welcome(@PathVariable who: String) = service.get(who)
}

class WelcomeService(private val repository: WelcomeRepository) {

    fun getAll(): Collection<EnhancedWelcome> {
        var i = 1
        return repository.findAll()
            .map { EnhancedWelcome(it, i++) }
            .sortedBy { it.who }
    }

    fun get(who: String) = repository.findByWho(who)
}

interface WelcomeRepository : CrudRepository<Welcome, String> {
    fun findByWho(who: String): Welcome
}

class Welcome(@Id val who: String, val what: String = "Welcome") : Serializable

class EnhancedWelcome(welcome: Welcome, val index: Int) {
    val who = welcome.who
    val what = welcome.what
}
