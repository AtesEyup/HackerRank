package com.eyp.algorithms.hackerrank.algorithms.week3

fun zigZagSequence(args: Array<String>) {
    val lsSort = args.sorted()
    var lsFirst = mutableListOf<String>()
    var lsSecond = mutableListOf<String>()

    val paging = lsSort.size / 2

    lsFirst = lsSort.subList(0, paging).toMutableList()
    lsSecond = lsSort.subList(paging, lsSort.size).reversed().toMutableList()

    val lsNew = lsFirst + lsSecond

    println(lsNew)
}