package com.testehan.kotlinexperiments.basics

fun main() {
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100}

    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")

    // To check that a key or value is in a map, use the in operator
    println("orange" in readOnlyJuiceMenu.keys)
    // true
    println(200 in readOnlyJuiceMenu.values)
    // false

}