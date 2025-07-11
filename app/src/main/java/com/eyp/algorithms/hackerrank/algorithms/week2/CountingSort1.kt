package com.eyp.algorithms.hackerrank.algorithms.week2

fun countingSort(arr: Array<Int>): Array<Int> {
    // Write your code here

    val result = Array(100) { 0 }

    for (i in 0..<arr.size) {
        result[arr[i]]++
    }

    return result
}