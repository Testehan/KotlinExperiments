package com.testehan.springbootsimple

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class SpringBootSimpleApplication

fun main(args: Array<String>) {
	runApplication<SpringBootSimpleApplication>(*args)
}

@RestController
class MessageController(val service: MessageService) {
	@GetMapping("/hello")
	fun index(@RequestParam("name") name: String) = "Hello, $name!"

	@GetMapping("/messages")
	fun index() = listOf(
		Message("1", "Hello!"),
		Message("2", "Bonjour!"),
		Message("3", "Privet!"),
	)

	@PostMapping("/")
	fun post(@RequestBody message: Message) {
		service.save(message)
	}
}

data class Message(val id: String?, val text: String)