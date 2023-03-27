package com.example.bootcamphomework2

fun toFindA(word: String): Int {
    var count = 0
    for (i in word) {
        if (i == 'A' || i == 'a') {
            count++
        }
    }
    return count
}


fun main(){
    val result = toFindA("Zamanakarış")
    println(result)
}