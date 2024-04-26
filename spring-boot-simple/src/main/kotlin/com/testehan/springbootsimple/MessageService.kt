package com.testehan.springbootsimple

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import java.util.*
import org.springframework.jdbc.core.query

@Service
class MessageService(val db: JdbcTemplate) {
    // For a lambda with multiple parameters, you can use the underscore _ character to replace
    // the names of the parameters you don't use.
    // Dan: yes..the IDE complains that the expression below can be simplified...however, for a
    // beginner in Kotlin...i find it easier to read as it is right now
    fun findMessages(): List<Message> = db.query("select * from messages", { response, _ ->
        Message(response.getString("id"), response.getString("text"))
    })

    // Dan: above function can be simplified as the one from below is...i find the below one tricky to read right now
    fun findMessageById(id: String): List<Message> = db.query("select * from messages where id = ?", id) { response, _ ->
        Message(response.getString("id"), response.getString("text"))
    }

    fun save(message: Message) {
        val id = message.id ?: UUID.randomUUID().toString()
        db.update("insert into messages values ( ?, ? )", id, message.text)
    }

}