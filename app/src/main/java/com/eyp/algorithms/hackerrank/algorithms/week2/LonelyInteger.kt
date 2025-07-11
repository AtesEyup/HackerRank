package com.eyp.algorithms.hackerrank.algorithms.week2

fun lonelyInteger(a: Array<Int>): Int {
    // Write your code here
    var result = 0
    for (num in a) {
        result = result xor num
    }
    return result
}