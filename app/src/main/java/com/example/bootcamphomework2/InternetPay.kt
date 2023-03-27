package com.example.bootcamphomework2

fun internetPay(quota: Int): Int {
    val limitQuota = 50
    val quotaPrice = 100
    val extra = 4

    val pay = if (quota > limitQuota) {
        quotaPrice + (quota - limitQuota) * extra
    } else {
        quotaPrice
    }

    return pay

}

fun main() {
    val result = internetPay(100)
    println(result)
}