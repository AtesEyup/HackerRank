package com.eyp.algorithms.hackerrank.algorithms.week1

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

private fun main(args: Array<String>) {
    val scores = args.map { it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    var isFirstScore = true

    var min = 0
    var max = 0

    var minScoreCount = 0
    var maxScoreCount = 0

    scores.forEach { score ->
        if (isFirstScore) {
            min = score
            max = score
            isFirstScore = false
        } else {
            if (min < score) {
                min = score
                minScoreCount++
            } else if (max > score) {
                max = score
                maxScoreCount++
            }
        }
    }

    return arrayOf(minScoreCount, maxScoreCount)
}

//fun breakingRecords(scores: Array<Int>): Array<Int> {
//    var minScore = scores[0]
//    var maxScore = scores[0]
//
//    var minBreaks = 0
//    var maxBreaks = 0
//
//    for (score in scores.drop(1)) {
//        if (score < minScore) {
//            minScore = score
//            minBreaks++
//        } else if (score > maxScore) {
//            maxScore = score
//            maxBreaks++
//        }
//    }
//
//    return arrayOf(maxBreaks, minBreaks)
//}
