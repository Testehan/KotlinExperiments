package com.testehan.kotlinexperiments.basics

fun main() {
    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
// [apple, banana, cherry]          the duplicate cherry is not added to the set

    // To prevent unwanted modifications, obtain read-only views of mutable sets by casting them to Set
    val fruitLocked: Set<String> = fruit
    fruit.add("watermelon")
    println(fruit)
    println(fruitLocked)

}