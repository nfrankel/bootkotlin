package by.jetconf.boot

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.*
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@SpringBootTest(classes = arrayOf(KotlindemoApplication::class))
class KotlindemoApplicationTests {

	@Test
	fun contextLoads() {
	}
}
