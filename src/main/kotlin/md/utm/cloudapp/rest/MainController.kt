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
    fun healthCheck(): ResponseEntity<String> {
        return if (Random.nextBoolean()) {
            ResponseEntity.ok("Healthy")
        } else {
            ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Unhealthy")
        }
    }
    
}
