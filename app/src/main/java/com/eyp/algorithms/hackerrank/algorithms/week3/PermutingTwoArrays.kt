package com.eyp.algorithms.hackerrank.algorithms.week3

fun permutingTwoArrays(k: Int, a: Array<Int>, b: Array<Int>): String {

    var result = ""
    a.sortBy { it }
    b.sortByDescending { it }

    for (i in a.indices) {
        if (a[i] + b[i] >= k) result = "YES"
        else {
            result = "NO"
            break
        }
    }

    return result
}