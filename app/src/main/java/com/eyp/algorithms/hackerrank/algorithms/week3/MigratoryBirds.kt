package com.eyp.algorithms.hackerrank.algorithms.week3

fun migratoryBirds(arr: Array<Int>): Int {

    val birdMap = mutableMapOf<Int, Int>()
    for (bird in arr) {
        birdMap[bird] = birdMap.getOrDefault(bird, 0) + 1
    }

    val value = birdMap.map { it.value }.max()
    val id = birdMap.filterValues { it == value }.keys.min()

    return id

}