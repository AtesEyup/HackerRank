package com.eyp.algorithms.hackerrank.algorithms.week1

fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    // Write your code here
    val result = arrayListOf<Int>()
    var count = 0
    queries.forEach { word ->
        strings.forEach { string ->
            if (string == word) count++
        }
        result.add(count)
        count = 0
    }

    return result.toTypedArray()
}