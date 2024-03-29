package com.example.webflux.WebFluxSample

import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class GreetingService {
    fun greetingFor(name: String): Mono<Greeting> {
        return Mono.just(Greeting("Welcome $name"))
    }
}