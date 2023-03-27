package com.example.bootcamphomework2

fun calculatingInteriorAngles(number: Int): Int {
    var result = 1
    if (number > 2) {
        result = ((number - 2) * 180)
    } else {
        println("The number of sides must be at least 3!!")
    }
    return result
}

fun main() {
    val result = calculatingInteriorAngles(2)
    println(result)
}