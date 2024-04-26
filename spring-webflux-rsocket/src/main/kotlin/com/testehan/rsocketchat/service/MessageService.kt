package com.testehan.rsocketchat.service

import com.testehan.rsocketchat.model.MessageVM

interface MessageService {

    fun latest(): List<MessageVM>

    fun after(messageId: String): List<MessageVM>

    fun post(message: MessageVM)
}