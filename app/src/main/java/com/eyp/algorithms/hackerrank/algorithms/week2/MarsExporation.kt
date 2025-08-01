package com.eyp.algorithms.hackerrank.algorithms.week2

fun marsExploration(s: String): Int {
    // Write your code here
    var result = 0
    val pattern = "SOS"
    for (i in s.indices) {
        if (s[i] != pattern[i % 3])
            result++
    }
    return result
}
