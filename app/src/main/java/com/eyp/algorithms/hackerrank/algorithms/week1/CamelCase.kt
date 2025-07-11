package com.eyp.algorithms.hackerrank.algorithms.week1

import java.util.Locale

private fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    //STDIN dediği readLine ile gerçekleşti, STDOUT dediği println ile gerçekleşti

    var firsString = ""

    args.forEach { word ->
        var char = word.split(";")
        if (word.startsWith("S")) {
            when (char[1]) {
                "V" -> {
                    char[2].forEach {
                        if (it.toString() in "A".."Z") {
                            firsString += " " + it.lowercase(Locale.ROOT)
                        } else
                            firsString += it
                    }

                    println(firsString)
                    firsString = ""
                }

                "C" -> {
                    char[2].forEach {
                        if (it.toString() in "A".."Z") {
                            firsString += " " + it.lowercase(Locale.ROOT)
                        } else
                            firsString += it
                    }

                    println(firsString.trim())
                    firsString = ""
                }

                "M" -> {
                    char[2].forEach {
                        if (it.toString() in "A".."Z") {
                            firsString += " " + it.lowercase(Locale.ROOT)
                        } else
                            firsString += it
                    }
                    firsString = firsString.replace("()", "")
                    println(firsString)
                    firsString = ""
                }
            }
        } else {
            val newValue = char[2].split(" ")
            when (char[1]) {
                "V" -> {
                    firsString = newValue[0].lowercase()
                    for (word in newValue.drop(1)) {
                        firsString += word.replaceFirstChar { it.uppercase() }
                    }
                    println(firsString)
                    firsString = ""
                }

                "C" -> {
                    firsString = newValue[0].replaceFirstChar { it.uppercase() }
                    for (word in newValue.drop(1)) {
                        firsString += word.replaceFirstChar { it.uppercase() }
                    }
                    println(firsString)
                    firsString = ""
                }

                "M" -> {
                    firsString = newValue[0].lowercase()
                    for (word in newValue.drop(1)) {
                        firsString += word.replaceFirstChar { it.uppercase() }
                    }
                    firsString += "()"
                    println(firsString)
                    firsString = ""
                }
            }
        }
    }
}