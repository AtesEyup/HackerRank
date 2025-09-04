package com.eyp.algorithms.hackerrank.algorithms.week3

fun subArrayDivision(s: Array<Int>, d: Int, m: Int): Int {

    var result = 0

    if (s.size == 1 && s[0] == d) {
        return 1
    }

    for (i in 0..s.size - m) {
        var total = 0
        for (j in i until i + m) {
            total += s[j]
        }
        if (total == d) result++
    }

    return result
}