package com.eyp.algorithms.hackerrank.algorithms.week2

fun countingValleys(steps: Int, path: String): Int {

    var level = 0
    var previousLevel = 0
    var result = 0

    for (i in 0..<steps) {
        if (path[i] == 'U') level++ else level--

        if (level == 0 && previousLevel < 0) {
            result++
        }

        previousLevel = level
    }

    return result
}