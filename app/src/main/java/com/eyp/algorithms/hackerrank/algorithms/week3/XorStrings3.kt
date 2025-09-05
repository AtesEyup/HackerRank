package com.eyp.algorithms.hackerrank.algorithms.week3

// Type of hackerrank
fun xorStrings3(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val s = readLine()!!
    val t = readLine()!!

    val result = StringBuilder()
    for (i in s.indices) {
        result.append(
            if (s[i] == t[i]) '0' else '1'
        )
    }

    println(result)
}

// Type of android studio
//fun xorStrings3(args: Array<String>) {
//    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
//    val s = args[0]
//    val t = args[1]
//
//    var result = ""
//
//    for (i in s.indices) {
//        val newValue = if (s[i] == t[i]) "0" else "1"
//        result += newValue
//    }
//
//    println(result)
//}