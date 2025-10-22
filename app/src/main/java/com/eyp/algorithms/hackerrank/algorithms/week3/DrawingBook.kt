package com.eyp.algorithms.hackerrank.algorithms.week3

fun drawingBook(n: Int, p: Int): Int {
    var startLength = 0
    var endLength = 0
    var front = 0
    var back = 0

    val pageMapOf = mutableMapOf<Int, Int>()

    for (i in 0..n step 2) {
        pageMapOf[i] = i + 1
    }

    pageMapOf.forEach { pageMap ->
        if (pageMap.key == p || pageMap.value == p) {
            front = startLength
        }

        startLength++
    }

    pageMapOf.toList().asReversed().forEach { pageMap ->
        if (pageMap.first == p || pageMap.second == p) {
            back = endLength
        }
        endLength++
    }

    return minOf(front, back)
}