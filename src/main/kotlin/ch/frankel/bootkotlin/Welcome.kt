package ch.frankel.bootkotlin

import org.springframework.data.annotation.Id
import org.springframework.data.repository.CrudRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.Serializable

@RestController
class WelcomeController(private val service: WelcomeService) {

    @RequestMapping("/welcome")
    fun welcome() = service.getAll()
}

class WelcomeService(private val repository: WelcomeRepository) {
    fun getAll(): Iterable<Welcome> = repository.findAll()
}

interface WelcomeRepository : CrudRepository<Welcome, String>

class Welcome(@Id val who: String, val what: String = "Welcome") : Serializable
