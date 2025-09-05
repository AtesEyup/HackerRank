package com.eyp.algorithms.hackerrank.algorithms.week3

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var result = 0

    var ss = mutableMapOf<Int, Boolean>()

    var sockMap = mutableMapOf<Int, Int>()

    for (sock in ar) {
        sockMap[sock] = sockMap.getOrDefault(sock, 0) + 1
    }

    for (sock in sockMap) {
        result += sock.value / 2
    }

    return result
}