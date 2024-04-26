package com.testehan.rsocketchat.model

import java.net.URL
import java.time.Instant

// VM suffix stands for View Model

data class MessageVM(val content: String, val user: UserVM, val sent: Instant, val id: String? = null)

data class UserVM(val name: String, val avatarImageLink: URL)