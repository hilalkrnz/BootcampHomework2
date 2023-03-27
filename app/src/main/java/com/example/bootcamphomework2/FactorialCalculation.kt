package com.example.bootcamphomework2

fun factorialCalculation(number: Int): Int {
    var factorial = 1
    for (i in 1..number) {
        factorial *= i
    }
    return factorial
}

fun main() {
    val result = factorialCalculation(5)
    println(result)
}