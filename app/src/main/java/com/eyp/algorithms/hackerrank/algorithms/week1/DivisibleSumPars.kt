package com.eyp.algorithms.hackerrank.algorithms.week1

private fun main(args: Array<String>) {
    val n = args[0].toInt()
    val k = args[1].toInt()
    val ar = args.slice(2 until args.size).map { it.toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    // Write your code here

    var matchCount = 0

    for (i in ar.indices) {
        for (j in ar.indices) {
            if (i < j && (ar[i] + ar[j]) % k == 0) {
                matchCount++
            }
        }
    }

    return matchCount
}