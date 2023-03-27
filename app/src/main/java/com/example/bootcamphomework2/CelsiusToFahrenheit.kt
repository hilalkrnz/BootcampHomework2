package com.example.bootcamphomework2

fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 1.8 + 32)

}

fun main() {
    val result = celsiusToFahrenheit(20.5)
    println(result)
}