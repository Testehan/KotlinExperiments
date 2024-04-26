package com.testehan.rsocketchat.service

import com.testehan.rsocketchat.model.MessageVM

interface MessageService {

    suspend fun latest(): List<MessageVM>

    suspend fun after(messageId: String): List<MessageVM>

    suspend fun post(message: MessageVM)
}