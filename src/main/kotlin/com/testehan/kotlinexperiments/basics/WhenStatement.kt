package com.testehan.kotlinexperiments.basics

fun main() {
    val gender = "f"

    when(gender){                       // the "switch" from java is "when" in kotlin
        "f" -> println("female")
        "m" -> println("male")
        else -> {
            println("unknown")
        }
    }

    when {
        (1>2) -> println("WTF")
        (12<2) -> println("Math is doing ok")
        else -> println("no valid in this universe")
    }

    val age = 18;
    when (age) {
        in 13..18 -> println("teenager")
        !in 13..18 -> println("adult or kid")
    }
}