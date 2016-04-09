package by.jetconf.boot.auto

import org.springframework.data.repository.*
import javax.persistence.*

interface WelcomeRepository : CrudRepository<Welcome, String> {
    fun findByWho(who: String): Welcome
}

@Entity
class Welcome(@Id val who: String, val what: String = "Welcome")