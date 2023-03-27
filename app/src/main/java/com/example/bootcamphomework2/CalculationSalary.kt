package com.example.bootcamphomework2

fun calculationSalary(day: Int): Int {
    val hours = day * 8
    val overTime = 20
    val onTime = 10

    val salary = if (hours > 160) {
        ((hours - 160) * overTime + (160 * onTime))
    } else {
        hours * onTime
    }

    return salary
}

fun main() {
    val result = calculationSalary(45)
    println(result)
}