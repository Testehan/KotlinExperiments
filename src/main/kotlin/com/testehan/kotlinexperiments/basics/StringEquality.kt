package com.testehan.kotlinexperiments.basics

// dan see "01 - String Pool and Heap.png"

fun main() {
    val name1 = "Sally"
    val name2 = "Dana"
    val name3 = "Dana"
    val name4 = String("Dana".toByteArray())

    println(name1 == name2)
    println(name1.equals(name2))
    println(name2 == name3)
    println(name2.equals(name3))

    println(name3 == name4)             // compares content
    println(name3 === name4)            // === compares memory location
    println(name3.equals(name4))        // compares content
}