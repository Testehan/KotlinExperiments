package com.testehan.kotlinexperiments.basics

fun main() {
    val gender = "f"

    //Note that all branch conditions are checked sequentially until one of them is satisfied.
    // So only the first suitable branch is executed.
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