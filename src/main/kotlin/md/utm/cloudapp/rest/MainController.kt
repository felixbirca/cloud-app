package md.utm.cloudapp.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class MainController {

    @GetMapping("/")
    fun main(): String {
        return "Hello World by team Irina, Felix and Nichita!"
    }

    @GetMapping("/health-check")
    fun healthCheck(): String {
        if (Random.nextBoolean()) {
            return "Healthy"
        } else {
            throw Exception("Not Healthy")
            return "Not Healthy"
        }
    }
}
