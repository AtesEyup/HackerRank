package com.eyp.algorithms.hackerrank.algorithms.week2

import android.util.Log

fun pangrams(s: String): String {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    return if (alphabet.all { s.contains(it, ignoreCase = true) }) "pangram" else "not pangram"
}