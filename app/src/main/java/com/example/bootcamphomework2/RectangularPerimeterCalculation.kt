package com.example.bootcamphomework2

fun rectangularPerimeter(shortSide: Int, longSide: Int): Int {
    return (2 * (shortSide + longSide))
}

fun main() {
   val result = rectangularPerimeter(10,30)
    println(result)

}