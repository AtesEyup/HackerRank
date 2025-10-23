package com.eyp.algorithms.hackerrank.algorithms.week4

fun leftRotation(d: Int, arr: Array<Int>): Array<Int> {
    val result = arr.toMutableList()

    for (i in 0 until d) {
        val first  = result.first()
        result.removeAt(0)
        result.add(first)
    }

    return result.toTypedArray()
}