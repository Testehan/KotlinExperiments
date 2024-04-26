package com.testehan.rsocketchat.service

import com.testehan.rsocketchat.extensions.asDomainObject
import com.testehan.rsocketchat.extensions.asViewModel
import com.testehan.rsocketchat.extensions.mapToViewModel
import com.testehan.rsocketchat.model.MessageVM
import com.testehan.rsocketchat.model.UserVM
import com.testehan.rsocketchat.repository.ContentType
import com.testehan.rsocketchat.repository.Message
import com.testehan.rsocketchat.repository.MessageRepository
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service
import java.net.URL

@Service
@Primary
class PersistentMessageService(val messageRepository: MessageRepository) : MessageService {

    override fun latest(): List<MessageVM> =
        messageRepository.findLatest().mapToViewModel()

    override fun after(lastMessageId: String): List<MessageVM> =
        messageRepository.findLatest(lastMessageId).mapToViewModel()

    override fun post(message: MessageVM) {
        messageRepository.save( message.asDomainObject())
    }
}