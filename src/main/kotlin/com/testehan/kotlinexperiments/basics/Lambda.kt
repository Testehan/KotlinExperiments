package com.testehan.kotlinexperiments.basics

fun main() {
    println(uppercaseString("hello"))       // HELLO

    // lambda
    println({ string: String -> string.uppercase() }("hello"))      // HELLO

    // assign lambda to variable
    val upperCaseString = { string: String -> string.uppercase() }
    println(upperCaseString("hello"))

    // Pass lambda to another function..The .filter() function accepts a lambda expression as a predicate:
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)
    println(negatives)
    // Another good example, is using the .map() function to transform items in a collection
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { x -> x * 3 }
    println(doubled)
    println(tripled)

    totalTimeInSeconds()
}

// normal function call
fun uppercaseString(string: String): String {
    return string.uppercase()
}

// Dan: see notes to understand what "function type" means...basically the type/signature of the lambda
// In the following example, the toSeconds() function has function type (Int) -> Int because it always returns
// a lambda expression that takes a parameter of type Int and returns an Int value.
// This example uses a when expression to determine which lambda expression is returned when toSeconds() is
// called
fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun totalTimeInSeconds(){
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")       // above
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
}