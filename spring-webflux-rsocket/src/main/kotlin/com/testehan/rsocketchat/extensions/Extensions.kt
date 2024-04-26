package com.testehan.rsocketchat.extensions

import com.testehan.rsocketchat.model.MessageVM
import com.testehan.rsocketchat.model.UserVM
import com.testehan.rsocketchat.repository.ContentType
import com.testehan.rsocketchat.repository.Message
import java.net.URL

// https://kotlinlang.org/docs/reference/extensions.html
// these functions are all extensions

fun MessageVM.asDomainObject(contentType: ContentType = ContentType.PLAIN): Message = Message(
    content,
    contentType,
    sent,
    user.name,
    user.avatarImageLink.toString(),
    id
)

fun Message.asViewModel(): MessageVM = MessageVM(
    content,
    UserVM(username, URL(userAvatarImageLink)),
    sent,
    id
)

fun List<Message>.mapToViewModel(): List<MessageVM> = map { it.asViewModel() }