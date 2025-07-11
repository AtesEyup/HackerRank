package com.eyp.algorithms.hackerrank.algorithms.week2

fun flippingBits(n: Long): Long {
    // Write your code here

    val binaryValue = n.toString(2)
    val bits = binaryValue.padStart(32, '0')

    val result = bits.map { if (it == '0') '1' else '0' }.joinToString("")

    val newValue = result.toLong(2)

    return newValue
}