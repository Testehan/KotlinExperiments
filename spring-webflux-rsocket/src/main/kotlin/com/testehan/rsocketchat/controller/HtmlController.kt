package com.testehan.rsocketchat.controller

import com.testehan.rsocketchat.model.MessageVM
import com.testehan.rsocketchat.service.MessageService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController(val messageService: MessageService) {

    @GetMapping("/")
    suspend fun index(model: Model): String {
        val messages: List<MessageVM> = messageService.latest()

        model["messages"] = messages
        model["lastMessageId"] = messages.lastOrNull()?.id ?: ""

        return "chat"
    }
}