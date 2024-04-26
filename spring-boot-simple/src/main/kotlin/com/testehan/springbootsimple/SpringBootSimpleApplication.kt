package com.testehan.springbootsimple

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
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
	fun allMessages(): List<Message> = service.findMessages()
//	fun index() = listOf(
//		Message("1", "Hello!"),
//		Message("2", "Bonjour!"),
//		Message("3", "Privet!"),
//	)

	@GetMapping("/{id}")
	fun getMessageById(@PathVariable id: String): List<Message> = service.findMessageById(id)

	@PostMapping("/")
	fun postMessage(@RequestBody message: Message) {
		service.save(message)
	}
}

@RestController
class UserController(val service: UserService) {

	@GetMapping("/users")
	fun allUsers(): List<User> = service.findUsers()

	@PostMapping("/user")
	fun postUser(@RequestBody user: User) {
		service.save(user)
	}
}

data class Message(val id: String?, val text: String)

@Table("USERR")
data class User(@Id var id: String?, val username: String)