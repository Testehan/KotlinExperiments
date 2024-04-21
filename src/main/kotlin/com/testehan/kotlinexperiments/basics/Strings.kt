package com.testehan.kotlinexperiments.basics

fun main() {
    val name = "Dan"
    println(name.uppercase())
    println(name.lowercase())
    println(name.length)
    println(name[0])
    println(name.drop(1))       // removes first x chars

    val message = "my name is ${name}"
    val message2 = "my name is $name"       // seems like you can remove {}
    println(message)
    println(message2)

    var email = """
        Hi $name,
        How are you ? I've been thinking of Michael's birthday. Do you 
        have any suggestions?
        
               BR
    """.trimIndent()
    println(email)
}