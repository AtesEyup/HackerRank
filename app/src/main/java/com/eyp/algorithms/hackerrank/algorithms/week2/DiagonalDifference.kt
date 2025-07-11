package com.eyp.algorithms.hackerrank.algorithms.week2

import android.util.Log
import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here

    var firstNumber = 0
    var secondNumber = 0

    for (i in arr.indices) {
        firstNumber += arr[i][i]
        secondNumber += arr[i][arr.size - 1 - i]
    }

    return abs(firstNumber - secondNumber)
}