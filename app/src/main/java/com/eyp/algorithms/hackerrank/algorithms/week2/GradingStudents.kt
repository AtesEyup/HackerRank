package com.eyp.algorithms.hackerrank.algorithms.week2

private fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here

    val result = arrayListOf<Int>()

    grades.forEach { grade ->
        if (grade < 38) {
            result.add(grade)
            return@forEach
        }
        if (grade % 5 == 0) {
            result.add(grade)
        } else {
            when (val lastNum = grade.toString().takeLast(1).toInt()) {
                in 8..9 -> {
                    result.add((10 - lastNum) + grade)
                }

                in 3..4 -> {
                    result.add((5 - lastNum) + grade)
                }

                else -> {
                    result.add(grade)
                }
            }
        }
    }

    return result.toTypedArray()
}