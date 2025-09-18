package com.eyp.algorithms.hackerrank.algorithms.week3

fun maximumPerimeterTriangle(sticks: Array<Int>): Array<Int> {
    val sortedSticks = sticks.sortedDescending()
    for (i in 0 until sortedSticks.size - 2) {
        val x = sortedSticks[i]
        val y = sortedSticks[i + 1]
        val z = sortedSticks[i + 2]

        if (x + y > z && y + z > x && x + z > y) return arrayOf(z,y,x)
    }

    return arrayOf(-1)
}