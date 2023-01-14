package com.example.webflux.WebFluxSample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebFluxSampleApplication

fun main(args: Array<String>) {
	runApplication<WebFluxSampleApplication>(*args)
}
