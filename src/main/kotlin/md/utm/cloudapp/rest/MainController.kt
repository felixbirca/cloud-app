package md.utm.cloudapp.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping("/")
    fun main(): String {
        return "Hello World by team Irina, Felix and Nichita!"
    }

    @GetMapping("/health-check")
    fun healthCheck(): ResponseEntity<String> {
        // Randomly decide whether the service is healthy or not
        return if (Random.nextBoolean()) {
            ResponseEntity.ok("Healthy")
        } else {
            ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Unhealthy")
        }
    }
    
}
