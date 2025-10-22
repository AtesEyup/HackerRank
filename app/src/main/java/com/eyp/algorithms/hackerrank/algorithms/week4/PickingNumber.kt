package com.eyp.algorithms.hackerrank.algorithms.week4

import kotlin.math.absoluteValue

fun pickingNumbers(a: Array<Int>): Int {

    val lsSort = a.sorted()

    var currentSize = 0
    var isFirst = false
    val lsNew = mutableListOf<Int>()

    for (i in lsSort.indices) {
        val abs = (lsSort[i] - lsSort[i + 1]).absoluteValue
        if (abs == 1 || abs == 0) {
            if (!isFirst) lsNew.add(lsSort[i])
            lsNew.add(lsSort[i + 1])
            if (!isFirst) isFirst = true
        } else {
            if (lsNew.size > currentSize) {
                currentSize = lsNew.size
                isFirst = false
            }

            lsNew.clear()
        }
    }

    return currentSize
}